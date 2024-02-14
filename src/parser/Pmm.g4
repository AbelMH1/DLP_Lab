grammar Pmm;	

program: 
       ;



/* LEXER PATTERNS */
TRASH: [ \n\r\t\f]+ -> skip;

fragment
LETRA: [a-zA-Z];
fragment
DIGITO: [0-9];

INT_CONSTANT: '0'|[1-9][0-9]*;
REAL_CONSTANT:

COMENTARIO: ('#' .*? '\n' | '"""' .*? '"""') -> skip;
IDENT: (LETRA|'_') (LETRA|DIGITO|'_')*;
