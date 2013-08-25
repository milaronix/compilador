grammar DecafLexer;

@header{
	package compiler.parser;
}

/*--------------------------------------------*/
TYPE	:	'int'|'boolean';
ASSIGN_OP:	'='|'+='|'-=';
ARITH_OP:	'+'|'-'|'*'|'/'|'%';
REL_OP	:	'<'|'>'|'<='|'>=';
EQ_OP	:	'=='|'!=';
COND_OP	:	'&&'|'||';
ALPHA	:	'a'..'z'|'A'..'Z';
DIGIT	:	'0'..'9';
HEX_DIGIT:	DIGIT|'a'..'f'|'A'..'F';
INT_LITERAL:	DECIMAL_LITERAL|HEX_LITERAL;
DECIMAL_LITERAL:DIGIT (DIGIT)*;
HEX_LITERAL:	'0x' HEX_DIGIT (HEX_DIGIT)*;
BOOL_LITERAL:	'true'|'false';
CHAR_LITERAL:	''' CHAR ''';
STRING_LITERAL:	'"' CHAR '"';
A_LLAVE	:	('{'){System.out.println("A_LLAVE");};
C_LLAVE	:	('}'){System.out.println("C_LLAVE");};
A_CORCHETE:	('['){System.out.println("A_CORCHETE");};
C_CORCHETE:	(']'){System.out.println("C_CORCHETE");};
COMA	:	(','){System.out.println("COMA");};
PYCOMA	:	(';'){System.out.println("PYCOMA");};

WS   : ('\t'|'\n'|'\r'|' ')+ { skip();};



PROGRAM	: (ID ID A_LLAVE C_LLAVE) {System.out.println("PROGRAM");};
TYPE	: ('int' | 'boolean') {System.out.println("TYPE");};





FIELD_DECL: (TYPE) (ID | ID '[' INT_LITERAL ']')+ (', ;') {System.out.println("FIELD_DECL");};
ID: (LETRA (LETRA|ENTERO)* ) {System.out.println("ID");};
INT_LITERAL: (FLOTANTE | HEX | ENTERO) {System.out.println("INT_LITERAL");};
METHOD_DECL: ('aaaaaaaaa');
ENTERO : ('0'..'9')+ {System.out.println("Entero");};
FLOTANTE: ENTERO'.'ENTERO {System.out.println("Flotante");};
HEX: ('0X'|'0x')(ENTERO|(('a'..'f') | ('A'..'F')))+ {System.out.println("Hexadecimal");};
LETRA: (('a'..'z') | ('A'..'Z'));
CHARS: '\''LETRA'\'' {System.out.println("Caracteres");};
STRING: '"'(LETRA | ENTERO | SIMBOLO | OPERADOR)*'"' {System.out.println("String");};
BOOL: ('true'|'false') {System.out.println("Booleano");};
SIMBOLO: (','| ';'|'('|')')+ {System.out.println("Simbolo");};
VARIABLE: ('_'|LETRA)(LETRA | ENTERO | '_')* {System.out.println("Variable");};
OPERADOR: ('+' | '-' | '*' | '/' | '&' | '|' | '^' | '=' | '<' | '>')+ {System.out.println("operador");};







