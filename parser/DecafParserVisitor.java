// Generated from parser/DecafParser.g by ANTLR 4.0

package compiler.parser;
import org.antlr.v4.runtime.*;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface DecafParserVisitor<T> extends ParseTreeVisitor<T> {
	T visitLocation_(DecafParser.Location_Context ctx);

	T visitCon_parametros(DecafParser.Con_parametrosContext ctx);

	T visitAssign(DecafParser.AssignContext ctx);

	T visitId_ac_exp_cc(DecafParser.Id_ac_exp_ccContext ctx);

	T visitAd_ex(DecafParser.Ad_exContext ctx);

	T visitStr_lit(DecafParser.Str_litContext ctx);

	T visitBlock(DecafParser.BlockContext ctx);

	T visitRe_ap_ex_cp_blo(DecafParser.Re_ap_ex_cp_bloContext ctx);

	T visitRel_op(DecafParser.Rel_opContext ctx);

	T visitId(DecafParser.IdContext ctx);

	T visitBlock_(DecafParser.Block_Context ctx);

	T visitAp_ex_cp(DecafParser.Ap_ex_cpContext ctx);

	T visitEx_bo_ex(DecafParser.Ex_bo_exContext ctx);

	T visitCond_op(DecafParser.Cond_opContext ctx);

	T visitEx(DecafParser.ExContext ctx);

	T visitMethod_call_(DecafParser.Method_call_Context ctx);

	T visitReturn(DecafParser.ReturnContext ctx);

	T visitVar_decl(DecafParser.Var_declContext ctx);

	T visitComentario(DecafParser.ComentarioContext ctx);

	T visitMeca_pyc(DecafParser.Meca_pycContext ctx);

	T visitBreak_o_continue(DecafParser.Break_o_continueContext ctx);

	T visitMe_ex(DecafParser.Me_exContext ctx);

	T visitArith_op(DecafParser.Arith_opContext ctx);

	T visitProgram(DecafParser.ProgramContext ctx);

	T visitEq_op(DecafParser.Eq_opContext ctx);

	T visitField_decl(DecafParser.Field_declContext ctx);

	T visitRe_id_ig_ex_co_ex_blo(DecafParser.Re_id_ig_ex_co_ex_bloContext ctx);

	T visitMethod_decl(DecafParser.Method_declContext ctx);

	T visitLiteral(DecafParser.LiteralContext ctx);
}