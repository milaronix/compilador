lexer grammar DecafLexer;

@header{
	package compiler.scanner;
}

TYPE:		('int'|'boolean');
ASSIGN_OP:	('='|'+='|'-=');
ARITH_OP:	'+'|'-'|'*'|'/'|'%';
REL_OP:		'<'|'>'|'<='|'>=';
EQ_OP:		'=='|'!=';
COND_OP:	'&&'|'||';
RESERVADA:	(TYPE|'break'|'case'|'callout'|'continue'|'class'|'else'|'false'|'for'|'if'|'int'|'return'|'true'|'void'|'program') ;
LITERAL:	INT_LITERAL | CHAR_LITERAL | BOOL_LITERAL;
ID:		ALPHA ALPHA_NUM*;
ALPHA_NUM:	ALPHA | DIGIT;
ALPHA:		('a'..'z'|'A'..'Z'|'_') ;
DIGIT:		('0'..'9');
HEX_DIGIT:	DIGIT|'a'..'f'|'A'..'F';
INT_LITERAL:	DECIMAL_LITERAL|HEX_LITERAL;
DECIMAL_LITERAL:(DIGIT)+;
HEX_LITERAL:	'0x' HEX_DIGIT (HEX_DIGIT)*;
BOOL_LITERAL:	'true'|'false';
CHAR_LITERAL:	'/'' CHAR '/'';
STRING_LITERAL:	'"' CHAR* '"';
CHAR:		('a'..'z'|'A'..'Z'|DIGIT) ;
// lo que inventamos

CLASE:		('class');
SIMBOLOS:	('!'|'¡'|'?'|'¿'|'$'|'%'|'&');
DIAG_INV:	'\\';
PUNTO:		'.';
COMILLAS:	'"';
A_LLAVE:	('{');
C_LLAVE:	('}');
A_PARENTESIS:	('(');
C_PARENTESIS:	(')');
A_CORCHETE:	('[');
C_CORCHETE:	(']');
COMA:		(',');
PYCOMA:		(';');
IGUAL:		('=');
MENOS:		('-');
ADMIRACION:	('!');

WS:('\t'|'\n'|'\r'|' ')+ { skip();};
