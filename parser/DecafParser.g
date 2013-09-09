parser grammar DecafParser;

@header{
	package compiler.parser;
	import org.antlr.v4.runtime.*;
}


options{
	tokenVocab = DecafLexer;
}

program:	(D_DIAG CHAR*)* (RESERVADA ID A_LLAVE (field_decl | method_decl)* C_LLAVE) #algo;

field_decl:	(TYPE (ID | ID A_CORCHETE LITERAL C_CORCHETE) ((ID | ID A_CORCHETE INT_LITERAL C_CORCHETE) COMA)* PYCOMA) ;

method_decl:	(TYPE | RESERVADA) ID A_PARENTESIS ((TYPE ID)+ (TYPE ID COMA)*)* C_PARENTESIS block; 

block:		A_LLAVE var_decl* statement* C_LLAVE ;
 
var_decl:	TYPE ID (COMA ID)* PYCOMA;

statement:	location ASSIGN_OP expr PYCOMA #lo_assop_ex_pyc
		|method_call PYCOMA #meca_pyc
		|RESERVADA A_PARENTESIS expr C_PARENTESIS block (RESERVADA block)* #re_ap_ex_cp_blo
		|RESERVADA ID IGUAL expr COMA expr block #re_id_ig_ex_co_ex_blo
		|RESERVADA A_CORCHETE expr C_CORCHETE #re_ac_ex_cc
		|RESERVADA #re
		|block #blo
		;

method_call:	(ID A_PARENTESIS (expr ?COMA)* C_PARENTESIS) #con_parametros 
		; 

location:	ID #id
		|ID A_CORCHETE expr C_CORCHETE #id_ac_exp_cc
		;
 
expr:		location #location_
		|method_call #method_call_
		|LITERAL #literal
		|expr bin_op expr #ex_bo_ex
		|MENOS expr #me_ex
		|ADMIRACION expr #ad_ex
		|A_PARENTESIS expr C_PARENTESIS #ap_ex_cp
		; 
callout_arg:	expr #ex
		|STRING_LITERAL# str_lit
		;

bin_op:		ARITH_OP #arith_op
		|REL_OP #rel_op
		|EQ_OP #eq_op 
		|COND_OP #cond_op
		; 
comentario:	D_DIAG CHAR*{System.out.println("comentario");};
