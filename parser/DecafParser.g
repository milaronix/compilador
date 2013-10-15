parser grammar DecafParser;

@header{
package compiler.parser;
import org.antlr.v4.runtime.*;
}


options{
tokenVocab = DecafLexer;
}

program: (D_DIAG CHAR*)* (RESERVADA ID A_LLAVE (var_decl | field_decl)* (method_decl)* C_LLAVE);

field_decl: TYPE ID A_CORCHETE LITERAL C_CORCHETE PYCOMA;

method_decl: (TYPE | RESERVADA) ID A_PARENTESIS ((TYPE ID) | (TYPE ID COMA))* C_PARENTESIS block;

block: A_LLAVE (var_decl | field_decl)* (statement | assign)* C_LLAVE ;
 
var_decl: TYPE ID (COMA ID)* PYCOMA;

assign: location ASSIGN_OP expr PYCOMA;

statement: method_call PYCOMA #meca_pyc
|RESERVADA A_PARENTESIS expr C_PARENTESIS block (RESERVADA block)* #re_ap_ex_cp_blo
|RESERVADA ID IGUAL expr COMA expr block #re_id_ig_ex_co_ex_blo
|RESERVADA (expr)* PYCOMA #return
|RESERVADA #break_o_continue
|block #block_
;

method_call: (ID A_PARENTESIS (expr ?COMA)* C_PARENTESIS) #con_parametros
;

location: ID #id
|ID A_CORCHETE expr C_CORCHETE #id_ac_exp_cc
;
 
expr: location #location_
|method_call #method_call_
|LITERAL #literal
|expr ARITH_OP_1 expr #bin_op_1
|expr ARITH_OP_2 expr #bin_op_2
|expr REL_OP expr #rel_op_
|expr EQ_OP expr #eq_op_
|expr COND_OP_1 expr #cond_op_1
|expr COND_OP_2 expr #cond_op_2
|expr bin_op expr #ex_bo_ex
|MENOS expr #me_ex
|ADMIRACION expr #ad_ex
|A_PARENTESIS expr C_PARENTESIS #ap_ex_cp
;
callout_arg: expr #ex
|STRING_LITERAL# str_lit
;

bin_op: ARITH_OP #arith_op
|REL_OP #rel_op
|EQ_OP #eq_op
|COND_OP #cond_op
;
comentario: D_DIAG CHAR*{System.out.println("comentario");};
