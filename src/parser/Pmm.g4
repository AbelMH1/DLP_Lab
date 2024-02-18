grammar Pmm;	

program: 
       ;



/* LEXER PATTERNS */
TRASH: [ \n\r\t\f]+ -> skip;

fragment
LETRA: [a-zA-Z];
fragment
DIGITO: [0-9];

INT_CONSTANT: '0'|[1-9] DIGITO*;

fragment
REAL_CONSTANT_P: INT_CONSTANT? '.' INT_CONSTANT
                | INT_CONSTANT '.' INT_CONSTANT?;
fragment
REAL_CONSTANT_E: (INT_CONSTANT|REAL_CONSTANT_P) [eE] '-'? INT_CONSTANT;

REAL_CONSTANT: REAL_CONSTANT_P
             | REAL_CONSTANT_E;

fragment
CHAR_CONSTANT_NUM: '\'\\' INT_CONSTANT '\'';
fragment
CHAR_CONSTANT_TEXT: '\'' . '\'';

CHAR_CONSTANT: CHAR_CONSTANT_NUM
             | CHAR_CONSTANT_TEXT;

CHAR_CONSTANT_N: '\'\\n\'';
CHAR_CONSTANT_T: '\'\\t\'';

//COMENTARIO_1LINEA: '#' .*? ('\n');
fragment
COMENTARIO_1LINEA: '#' (~'\n')* '\n'?;
fragment
COMENTARIO_NLINEAS: '"""' .*? '"""';

COMENTARIO: COMENTARIO_1LINEA
          | COMENTARIO_NLINEAS;

IDENT: (LETRA|'_') (LETRA|DIGITO|'_')*;
