parser grammar DecafParser;

@header{
	package compiler.parser;
	import org.antlr.v4.runtime.*;
}


options{
	tokenVocab = DecafLexer;
}

program:	(D_DIAG CHAR*)*(RESERVADA ID A_LLAVE (field_decl | method_decl)* C_LLAVE){System.out.println("program");};
field_decl:	(TYPE (ID | ID A_CORCHETE LITERAL C_CORCHETE) ((ID | ID A_CORCHETE INT_LITERAL C_CORCHETE) COMA)* PYCOMA){System.out.println("field_decl");};
method_decl:	(TYPE | RESERVADA) ID A_PARENTESIS ((TYPE ID)+ (TYPE ID COMA)*)* C_PARENTESIS block {System.out.println("method_decl");};
block:		A_LLAVE var_decl* statement* C_LLAVE {System.out.println("block");};
var_decl:	TYPE ID (COMA ID)* PYCOMA{System.out.println("var_decl");};
statement:	location ASSIGN_OP expr PYCOMA | method_call PYCOMA | RESERVADA A_PARENTESIS expr C_PARENTESIS block (RESERVADA block) | RESERVADA ID IGUAL expr COMA expr block | RESERVADA A_CORCHETE expr C_CORCHETE | RESERVADA | RESERVADA | block {System.out.println("statement");};
method_call:	(ID A_PARENTESIS (expr ?COMA)* C_PARENTESIS) | (RESERVADA A_PARENTESIS STRING_LITERAL (COMA (callout_arg))* C_PARENTESIS) {System.out.println("method_call");};
location:	ID | ID A_CORCHETE expr C_CORCHETE {System.out.println("location");};
expr:		location|method_call|LITERAL|expr bin_op expr|MENOS expr|ADMIRACION expr|A_PARENTESIS expr C_PARENTESIS {System.out.println("expr");};
callout_arg:	expr | STRING_LITERAL {System.out.println("callout_arg");};
bin_op:		ARITH_OP | REL_OP | EQ_OP | COND_OP {System.out.println("bin_op");};
comentario:	D_DIAG CHAR*{System.out.println("comentario");};
