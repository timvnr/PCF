grammar PCF;

// règles syntaxiques

//program : term EOF ;
term : LIT                                   # Lit
     | VAR                                   # Var
     | PARG term  PARD                       # Par
     | term OP_PRIO term                     # BinOp
     | LET VAR EQUAL term IN term            # Liaison
     | term OP term                          # BinOp
     | IFZ term THEN term ELSE term          # Cond
     ;

// règles lexicales
IFZ : 'ifz' ;
THEN : 'then' ;
ELSE : 'else' ;
LET : 'let' ;
IN : 'in' ;
EQUAL : '=' ;
PARD : ')' ;
PARG : '(' ;
VAR : [a-zA-Z]+;
OP  : '+' | '-' ;
OP_PRIO : '*' | '/' ;
LIT : '0' | [1-9][0-9]* ;
WS  : [ \t\n\r]+ -> channel(HIDDEN) ;
LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN) ;
