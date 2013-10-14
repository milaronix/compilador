// Generated from parser/DecafParser.g by ANTLR 4.0

package compiler.parser;
import org.antlr.v4.runtime.*;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface DecafParserListener extends ParseTreeListener {
	void enterLocation_(DecafParser.Location_Context ctx);
	void exitLocation_(DecafParser.Location_Context ctx);

	void enterCon_parametros(DecafParser.Con_parametrosContext ctx);
	void exitCon_parametros(DecafParser.Con_parametrosContext ctx);

	void enterAssign(DecafParser.AssignContext ctx);
	void exitAssign(DecafParser.AssignContext ctx);

	void enterId_ac_exp_cc(DecafParser.Id_ac_exp_ccContext ctx);
	void exitId_ac_exp_cc(DecafParser.Id_ac_exp_ccContext ctx);

	void enterAd_ex(DecafParser.Ad_exContext ctx);
	void exitAd_ex(DecafParser.Ad_exContext ctx);

	void enterStr_lit(DecafParser.Str_litContext ctx);
	void exitStr_lit(DecafParser.Str_litContext ctx);

	void enterBlock(DecafParser.BlockContext ctx);
	void exitBlock(DecafParser.BlockContext ctx);

	void enterRe_ap_ex_cp_blo(DecafParser.Re_ap_ex_cp_bloContext ctx);
	void exitRe_ap_ex_cp_blo(DecafParser.Re_ap_ex_cp_bloContext ctx);

	void enterRel_op(DecafParser.Rel_opContext ctx);
	void exitRel_op(DecafParser.Rel_opContext ctx);

	void enterId(DecafParser.IdContext ctx);
	void exitId(DecafParser.IdContext ctx);

	void enterBlock_(DecafParser.Block_Context ctx);
	void exitBlock_(DecafParser.Block_Context ctx);

	void enterAp_ex_cp(DecafParser.Ap_ex_cpContext ctx);
	void exitAp_ex_cp(DecafParser.Ap_ex_cpContext ctx);

	void enterEx_bo_ex(DecafParser.Ex_bo_exContext ctx);
	void exitEx_bo_ex(DecafParser.Ex_bo_exContext ctx);

	void enterCond_op(DecafParser.Cond_opContext ctx);
	void exitCond_op(DecafParser.Cond_opContext ctx);

	void enterEx(DecafParser.ExContext ctx);
	void exitEx(DecafParser.ExContext ctx);

	void enterMethod_call_(DecafParser.Method_call_Context ctx);
	void exitMethod_call_(DecafParser.Method_call_Context ctx);

	void enterReturn(DecafParser.ReturnContext ctx);
	void exitReturn(DecafParser.ReturnContext ctx);

	void enterVar_decl(DecafParser.Var_declContext ctx);
	void exitVar_decl(DecafParser.Var_declContext ctx);

	void enterComentario(DecafParser.ComentarioContext ctx);
	void exitComentario(DecafParser.ComentarioContext ctx);

	void enterMeca_pyc(DecafParser.Meca_pycContext ctx);
	void exitMeca_pyc(DecafParser.Meca_pycContext ctx);

	void enterBreak_o_continue(DecafParser.Break_o_continueContext ctx);
	void exitBreak_o_continue(DecafParser.Break_o_continueContext ctx);

	void enterMe_ex(DecafParser.Me_exContext ctx);
	void exitMe_ex(DecafParser.Me_exContext ctx);

	void enterArith_op(DecafParser.Arith_opContext ctx);
	void exitArith_op(DecafParser.Arith_opContext ctx);

	void enterProgram(DecafParser.ProgramContext ctx);
	void exitProgram(DecafParser.ProgramContext ctx);

	void enterEq_op(DecafParser.Eq_opContext ctx);
	void exitEq_op(DecafParser.Eq_opContext ctx);

	void enterField_decl(DecafParser.Field_declContext ctx);
	void exitField_decl(DecafParser.Field_declContext ctx);

	void enterRe_id_ig_ex_co_ex_blo(DecafParser.Re_id_ig_ex_co_ex_bloContext ctx);
	void exitRe_id_ig_ex_co_ex_blo(DecafParser.Re_id_ig_ex_co_ex_bloContext ctx);

	void enterMethod_decl(DecafParser.Method_declContext ctx);
	void exitMethod_decl(DecafParser.Method_declContext ctx);

	void enterLiteral(DecafParser.LiteralContext ctx);
	void exitLiteral(DecafParser.LiteralContext ctx);
}