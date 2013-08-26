parser grammar DecafParser;

@header{
	package compiler.parser;
}

options{
	tokenVocab = DecafLexer;
}

program:	CLASE ID A_LLAVE field_decl* method_decl* C_LLAVE;
field_decl:	(TYPE (ID | ID A_CORCHETE INT_LITERAL A_CORCHETE) ?COMA);
method_decl:	(TYPE | RESERVADA) ID A_PARENTESIS (TYPE ID ?COMA)+ C_PARENTESIS A_LLAVE block C_LLAVE;
block:		A_LLAVE var_decl* statement* C_LLAVE;
var_decl:	TYPE ID (COMA ID)* PYCOMA;
statement:	location ASSIGN_OP expr PYCOMA | method_call PYCOMA | RESERVADA A_PARENTESIS expr C_PARENTESIS block (RESERVADA block) | RESERVADA ID IGUAL expr COMA expr block | RESERVADA A_CORCHETE expr C_CORCHETE | RESERVADA | RESERVADA | block;
method_call:	ID A_PARENTESIS (expr ?COMA)+ C_PARENTESIS | RESERVADA A_PARENTESIS STRING_LITERAL (COMA (callout_arg))* C_PARENTESIS;
location:	ID | ID A_CORCHETE expr C_CORCHETE;
expr:		location|method_call|LITERAL|expr bin_op expr|MENOS expr|ADMIRACION expr|A_PARENTESIS expr C_PARENTESIS;
callout_arg:	expr | STRING_LITERAL;
bin_op:		ARITH_OP | REL_OP | EQ_OP | COND_OP;


