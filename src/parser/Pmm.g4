grammar Pmm;
@header{
    import ast.*;
    import ast.definition.*;
    import ast.expression.*;
    import ast.statement.*;
    import ast.type.*;
}
// TODAS LAS REGLAS TIENEN QUE MODIFICAR AST, SINO MALO. PONER NO TERMINALES EN MINUSCULA Y TERMINALES EN MAYUSCULA.
// $<alias>.ast   o   $ID.getLine(), $ID.getCharPositionInLine(), $ID.text
// returns [] Locals[List<String> temp = new... , aquí variables temporales]

program returns [Program ast]:
    definition* main EOF
       ;
main: 'def' 'main' '(' ')' ':' '{' varDefinition* statement* '}'
;

definition: varDefinition
            | funcDefinition
;

varDefinition: idents ':' type ';'
;

idents: ID
        | idents ',' ID
;

funcDefinition: 'def' ID '(' paramDefinition? ')' ':' simpleType? '{' varDefinition* statement* '}'
;

paramDefinition: ID ':' simpleType
                | paramDefinition ',' ID ':' simpleType
;

type: simpleType
    | '[' INT_CONSTANT ']' type
    | 'struct' '{' varDefinition+ '}'
;

simpleType: 'int'
            | 'double'
            | 'char'
;

statement: 'print' params ';'
            | 'input' params ';'
            | 'return' expression ';'
            | ID '(' params? ')' ';'
            | expression '=' expression ';'
            | 'if' expression ':' body ('else' ':' body)?
            | 'while' expression ':' body
;

body: '{'? statement '}'?
    | '{' statement+ '}'
;


expression returns [Expression ast] locals[Variable v1]:
            INT_CONSTANT            {$ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
            | REAL_CONSTANT         {$ast = new DoubleLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal($REAL_CONSTANT.text)); }
            | CHAR_CONSTANT         {$ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text)); }
            | ID                    {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text); }
            | ID '(' params? ')'    /* REVISAR */{$ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1, new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text), $params.list); }
            |'(' expression1 = expression ')'   {$ast = $expression1.ast}
            | expression1 = expression OP='[' expression2 = expression ']' {$ast = new ArrayAccess($OP.getLine(), $OP.getCharPositionInLine()+1, $expression1.ast, $expression2.ast); }
            | expression1 = expression OP='.' ID   {$ast = new StructAccess($OP.getLine(), $OP.getCharPositionInLine()+1, &expression1.ast, $ID.text); }
            | OP='(' simpleType ')' expression1 = expression    {$ast = new Cast($OP.getLine(), $OP.getCharPositionInLine()+1, $expression1.ast, $simpleType.ast); }
            |'-' expression1 = expression   {$ast = new }
            |'!' expression1 = expression   {$ast = new }
            |/* <assoc=left> */ expression1 = expression ('*'|'/'|'%') expression2 = expression {$ast = new }
            | expression1 = expression ('+'|'-') expression2 = expression   {$ast = new }
            | expression1 = expression ('>'|'>='|'<'|'<='|'!='|'==') expression2 = expression   {$ast = new }
            | expression1 = expression '&&' expression2 = expression    {$ast = new }
            | expression1 = expression '||' expression2 = expression    {$ast = new }
            ;

params returns [List<Expression> list = new ArrayList<>()]:
        expression {$list.add($expression.ast); }
        | params1 = params ',' expression {$list.addAll($params1.list); $list.add($expression.ast); }
;


/* LEXER PATTERNS */
TRASH: [ \n\r\t\f]+ -> skip;

COMENTARIO: (COMENTARIO_1LINEA
          | COMENTARIO_NLINEAS) -> skip;

ID: (LETRA|'_') (LETRA|DIGITO|'_')*;

INT_CONSTANT: '0'|[1-9] DIGITO*;

REAL_CONSTANT: REAL_CONSTANT_P
             | REAL_CONSTANT_E;

CHAR_CONSTANT: '\'\\' INT_CONSTANT '\''
             | '\'\\' [nt] '\''
             | '\'' . '\'';

fragment
LETRA: [a-zA-Z];
fragment
DIGITO: [0-9];
fragment
REAL_CONSTANT_P: INT_CONSTANT? '.' DIGITO+
                | INT_CONSTANT '.' DIGITO*;
fragment
REAL_CONSTANT_E: (INT_CONSTANT|REAL_CONSTANT_P) [eE] [-+]? INT_CONSTANT;
fragment
//COMENTARIO_1LINEA: '#' (~'\n')* '\n'?;
COMENTARIO_1LINEA: '#' .*? ('\n'|EOF);
fragment
COMENTARIO_NLINEAS: '"""' .*? '"""';