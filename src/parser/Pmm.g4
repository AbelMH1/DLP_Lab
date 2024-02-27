grammar Pmm;	

program: definition* main EOF
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


expression: INT_CONSTANT
            | REAL_CONSTANT
            | CHAR_CONSTANT
            | ID
            | ID '(' params? ')'
            |'(' expression ')'
            |expression '[' expression ']'
            |expression '.' ID
            |'(' simpleType ')' expression
            |'-' expression
            |'!' expression
            |/* <assoc=left> */ expression ('*'|'/'|'%') expression
            |expression ('+'|'-') expression
            |expression ('>'|'>='|'<'|'<='|'!='|'==') expression
            |expression '&&' expression
            |expression '||' expression
            ;

params: expression
        | params ',' expression
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