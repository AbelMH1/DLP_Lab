grammar Pmm;
@header{
    import ast.*;
    import ast.definition.*;
    import ast.expression.*;
    import ast.statement.*;
    import ast.type.*;
    import java.util.HashSet;
}
// TODAS LAS REGLAS TIENEN QUE MODIFICAR AST, SINO MALO. PONER NO TERMINALES EN MINUSCULA Y TERMINALES EN MAYUSCULA.
// $<alias>.ast   o   $ID.getLine(), $ID.getCharPositionInLine(), $ID.text
// returns [] Locals[List<String> temp = new... , aquí variables temporales]

program returns [Program ast] locals[List<Definition> progBody = new ArrayList<>()]:
    (definition {$progBody.addAll($definition.list); })* main {$progBody.add($main.ast); } EOF    {$ast = new Program(0, 0, $progBody); }
;

main returns [FunctionDefinition ast] locals[List<Statement> funcBody = new ArrayList<>()]:
    'def' OP='main' '(' ')' ':' '{' (varDefinition {$funcBody.addAll($varDefinition.list); })* (statement {$funcBody.addAll($statement.list); })* '}' {$ast = new FunctionDefinition($OP.getLine(), $OP.getCharPositionInLine()+1, new FunctionType(new VoidType(), new ArrayList<VariableDefinition>()), $OP.text, $funcBody); }
;

definition returns [List<Definition> list = new ArrayList<>()]:
            varDefinition       {$list.addAll($varDefinition.list); }
            | funcDefinition    {$list.add($funcDefinition.ast); }
;

varDefinition returns [List<VariableDefinition> list = new ArrayList<>()]:
    idents OP=':' type ';' {
        HashSet<String> e = new HashSet<>();
        for(String name : $idents.list) {
            if(e.contains(name)){
                $list.add(new VariableDefinition($OP.getLine(), $OP.getCharPositionInLine()+1, new ErrorType($OP.getLine(), $OP.getCharPositionInLine()+1, "No se pueden definir dos variables con el mismo nombre en el mismo ámbito"), name));
            }
            else {
                e.add(name);
                $list.add(new VariableDefinition($OP.getLine(), $OP.getCharPositionInLine()+1, $type.ast, name));
            }
        }
    }
;

idents returns [List<String> list = new ArrayList<>()]:
        ID      {$list.add($ID.text); }
        | idents1 = idents ',' ID     {$list.addAll($idents1.list); $list.add($ID.text); }
;

funcDefinition returns [FunctionDefinition ast] locals[List<Statement> funcBody = new ArrayList<>()]:
    'def' ID '(' paramDefinition? ')' ':' simpleType? '{' (varDefinition {$funcBody.addAll($varDefinition.list); })* (statement {$funcBody.addAll($statement.list); })* '}' {$ast = new FunctionDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, new FunctionType($simpleType.ctx != null ? $simpleType.ast : new VoidType(), $paramDefinition.ctx != null ? $paramDefinition.list : new ArrayList<VariableDefinition>()), $ID.text, $funcBody); }
;

paramDefinition returns [List<VariableDefinition> list = new ArrayList<>()]:
            ID ':' simpleType       {$list.add(new VariableDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $simpleType.ast, $ID.text)); }
            | paramDefinition1 = paramDefinition ',' ID ':' simpleType     {$list.addAll($paramDefinition1.list); $list.add(new VariableDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $simpleType.ast, $ID.text)); }
;

type returns [Type ast] locals[List<VariableDefinition> recordFields = new ArrayList<>()]:
    simpleType                          {$ast = $simpleType.ast; }
    | '[' INT_CONSTANT ']' type         {$ast = new ArrayType(LexerHelper.lexemeToInt($INT_CONSTANT.text), $type.ast); }
    | 'struct' '{' (varDefinition {$recordFields.addAll($varDefinition.list); })+ '}' {
        List<RecordField> list = new ArrayList<>();
        HashSet<String> e = new HashSet<>();
        for(VariableDefinition var : $recordFields) {
            if(e.contains(var.getName())){
                list.add(new RecordField(var.getLine(), var.getColumn(), var.getName(), new ErrorType(var.getLine(), var.getColumn(), "No se pueden definir dos campos con el mismo nombre dentro de un struct")));
            }
            else {
                e.add(var.getName());
                list.add(new RecordField(var.getLine(), var.getColumn(), var.getName(), var.getType()));
            }
        }
        $ast = new StructType(list);
    }
;

simpleType returns [Type ast]:
            'int'       {$ast = new IntType(); }
            | 'double'  {$ast = new DoubleType(); }
            | 'char'    {$ast = new CharType(); }
;

statement returns [List<Statement> list = new ArrayList<>()]:
            OP='print' params ';'           {$list.add(new Print($OP.getLine(), $OP.getCharPositionInLine()+1, $params.list)); }
            | OP='input' params ';'         {$params.list.forEach((statement -> $list.add(new Input(statement.getLine(), statement.getColumn(), statement)))); }
            | OP='return' expression ';'    {$list.add(new Return($OP.getLine(), $OP.getCharPositionInLine()+1, $expression.ast)); }
            | ID '(' params? ')' ';'        {$list.add(new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1, new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text), $params.ctx != null ? $params.list : new ArrayList<Expression>())); }
            | expression1 = expression OP='=' expression2 = expression ';'  {$list.add(new Assignment($OP.getLine(), $OP.getCharPositionInLine()+1, $expression1.ast, $expression2.ast)); }
            | OP='if' expression ':' body1 = body ('else' ':' body2 = body)?    {$list.add(new If($OP.getLine(), $OP.getCharPositionInLine()+1, $expression.ast, $body1.list, $body2.ctx != null ? $body2.list : new ArrayList<Statement>())); }
            | OP='while' expression ':' body    {$list.add(new While($OP.getLine(), $OP.getCharPositionInLine()+1, $expression.ast, $body.list)); }
;

body returns [List<Statement> list = new ArrayList<>()]:
    '{'? statement '}'? {$list.addAll($statement.list); }
    | '{' (statement {$list.addAll($statement.list); })+ '}'
;


expression returns [Expression ast]:
            INT_CONSTANT            {$ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
            | REAL_CONSTANT         {$ast = new DoubleLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal($REAL_CONSTANT.text)); }
            | CHAR_CONSTANT         {$ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text)); }
            | ID                    {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text); }
            | ID '(' params? ')'    {$ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1, new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text), $params.ctx != null ? $params.list : new ArrayList<Expression>()); }
            |'(' expression1 = expression ')'   {$ast = $expression1.ast; }
            | expression1 = expression OP='[' expression2 = expression ']' {$ast = new ArrayAccess($OP.getLine(), $OP.getCharPositionInLine()+1, $expression1.ast, $expression2.ast); }
            | expression1 = expression OP='.' ID   {$ast = new StructAccess($OP.getLine(), $OP.getCharPositionInLine()+1, $expression1.ast, $ID.text); }
            | OP='(' simpleType ')' expression1 = expression    {$ast = new Cast($OP.getLine(), $OP.getCharPositionInLine()+1, $expression1.ast, $simpleType.ast); }
            | OP='-' expression1 = expression   {$ast = new UnaryMinus($OP.getLine(), $OP.getCharPositionInLine()+1, $expression1.ast); }
            |'!' expression1 = expression       {$ast = new LogicalNot($OP.getLine(), $OP.getCharPositionInLine()+1, $expression1.ast); }
            |/* <assoc=left> */ expression1 = expression OP=('*'|'/'|'%') expression2 = expression  {$ast = new Arithmetic($OP.getLine(), $OP.getCharPositionInLine()+1, $OP.text, $expression1.ast, $expression2.ast); }
            | expression1 = expression OP=('+'|'-') expression2 = expression                        {$ast = new Arithmetic($OP.getLine(), $OP.getCharPositionInLine()+1, $OP.text, $expression1.ast, $expression2.ast); }
            | expression1 = expression OP=('>'|'>='|'<'|'<='|'!='|'==') expression2 = expression    {$ast = new Comparison($OP.getLine(), $OP.getCharPositionInLine()+1, $OP.text, $expression1.ast, $expression2.ast); }
            | expression1 = expression OP='&&' expression2 = expression    {$ast = new Logical($OP.getLine(), $OP.getCharPositionInLine()+1, $OP.text, $expression1.ast, $expression2.ast); }
            | expression1 = expression OP='||' expression2 = expression    {$ast = new Logical($OP.getLine(), $OP.getCharPositionInLine()+1, $OP.text, $expression1.ast, $expression2.ast); }
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