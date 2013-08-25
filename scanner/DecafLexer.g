grammar DecafLexer;

@header{
	package compiler.scanner;
}

//parser decaf


mensaje:	COMILLAS ALPHA+ COMILLAS {System.out.println("MENSAJE");};
block:		A_LLAVE VAR C_LLAVE;
program:	'class' ID A_LLAVE 
method_decl:	

//lexer decaf

VAR_DECL:	TYPE ID (',' ID)* ';'; 
TYPE:		('int'|'boolean');
ASSIGN_OP:	('='|'+='|'-=');

METHOD_CALL:	METHOD_NAME A_PARENTESIS 
METHOD_NAME:	ID
LOCATION:	ID | ID A_CORCHETE EXPR C_CORCHETE
EXPR:		LOCATION | METHOD_CALL | LITERAL |EXPR BIN_OP EXPR | '-' EXPR | '!' EXPR | A_PARENTESIS EXPR C_PARENTESIS
CALLOUT_ARG:	EXPR | STRING_LITERAL; 
BIN_OP:		ARITH_OP | REL_OP | EQ_OP | COND_OP;
ARITH_OP:	'+'|'-'|'*'|'/'|'%';
REL_OP:		'<'|'>'|'<='|'>=';
EQ_OP:		'=='|'!=';
COND_OP:	'&&'|'||';

LITERAL:	INT_LITERAL | CHAR_LITERAL | BOOL_LITERAL;
ID:		ALPHA ALPHA_NUM* {System.out.println("ID");};
ALPHA_NUM:	ALPHA | DIGIT;
ALPHA:		('a'..'z'|'A'..'Z'|'_') {System.out.println("ALPHA");};
DIGIT:		'0'..'9';
HEX_DIGIT:	DIGIT|'a'..'f'|'A'..'F';
INT_LITERAL:	DECIMAL_LITERAL|HEX_LITERAL;
DECIMAL_LITERAL:DIGIT (DIGIT)*;
HEX_LITERAL:	'0x' HEX_DIGIT (HEX_DIGIT)*;
BOOL_LITERAL:	'true'|'false';
CHAR_LITERAL:	'/'' CHAR '/'';
STRING_LITERAL:	'"' CHAR '"';
CHAR:		('a'..'z'|'A'..'Z'|'0'..'9') {System.out.println("CHAR");};

// lo que inventamos

SIMBOLOS:	('!'|'¡'|'?'|'¿'|'$'|'%'|'&') {System.out.println("SIMBOLOS");};
DIAG_INV:	'\\'{System.out.println("DIAG_INV");};
PUNTO:		'.'{System.out.println("PUNTO");};
COMILLAS:	'"'{System.out.println("COMILLAS");};
A_LLAVE:	('{'){System.out.println("A_LLAVE");};
C_LLAVE:	('}'){System.out.println("C_LLAVE");};
A_PARENTESIS:	('('){System.out.println("A_PARENTESIS");};
C_PARENTESIS:	(')'){System.out.println("C_PARENTESIS");};
A_CORCHETE:	('['){System.out.println("A_CORCHETE");};
C_CORCHETE:	(']'){System.out.println("C_CORCHETE");};
COMA:		(','){System.out.println("COMA");};
PYCOMA:		(';'){System.out.println("PYCOMA");};

WS:('\t'|'\n'|'\r'|' ')+ { skip();};
