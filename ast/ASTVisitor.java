package compiler.ast;
 
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
import compiler.parser.DecafParser;
import compiler.parser.DecafParserBaseVisitor;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

 
public class ASTVisitor extends DecafParserBaseVisitor<Node>{

	@Override public Node visitLocation_(DecafParser.Location_Context ctx) { return visitChildren(ctx); }

	@Override public Node visitCon_parametros(DecafParser.Con_parametrosContext ctx) { return visitChildren(ctx); }

	@Override public Node visitLo_assop_ex_pyc(DecafParser.Lo_assop_ex_pycContext ctx) { return visitChildren(ctx); }

	@Override public Node visitId_ac_exp_cc(DecafParser.Id_ac_exp_ccContext ctx) { return visitChildren(ctx); }

	@Override public Node visitAd_ex(DecafParser.Ad_exContext ctx) { return visitChildren(ctx); }

	@Override public Node visitStr_lit(DecafParser.Str_litContext ctx) { return visitChildren(ctx); }

	@Override public Node visitBlock(DecafParser.BlockContext ctx) { return visitChildren(ctx); }

	@Override public Node visitRe(DecafParser.ReContext ctx) { return visitChildren(ctx); }

	@Override public Node visitRe_ap_ex_cp_blo(DecafParser.Re_ap_ex_cp_bloContext ctx) { return visitChildren(ctx); }

	@Override public Node visitRel_op(DecafParser.Rel_opContext ctx) { return visitChildren(ctx); }

	@Override public Node visitId(DecafParser.IdContext ctx) { return visitChildren(ctx); }

	@Override public Node visitAp_ex_cp(DecafParser.Ap_ex_cpContext ctx) { return visitChildren(ctx); }

	@Override public Node visitRe_ac_ex_cc(DecafParser.Re_ac_ex_ccContext ctx) { return visitChildren(ctx); }

	@Override public Node visitEx_bo_ex(DecafParser.Ex_bo_exContext ctx) { return visitChildren(ctx); }

	@Override public Node visitCond_op(DecafParser.Cond_opContext ctx) { return visitChildren(ctx); }

	@Override public Node visitBlo(DecafParser.BloContext ctx) { return visitChildren(ctx); }

	@Override public Node visitEx(DecafParser.ExContext ctx) { return visitChildren(ctx); }

	@Override public Node visitMethod_call_(DecafParser.Method_call_Context ctx) { return visitChildren(ctx); }

	@Override public Node visitVar_decl(DecafParser.Var_declContext ctx) { return visitChildren(ctx); }

	@Override public Node visitComentario(DecafParser.ComentarioContext ctx) { return visitChildren(ctx); }

	@Override public Node visitMeca_pyc(DecafParser.Meca_pycContext ctx) { return visitChildren(ctx); }

	@Override public Node visitAlgo(DecafParser.AlgoContext ctx) { return visitChildren(ctx); }

	@Override public Node visitMe_ex(DecafParser.Me_exContext ctx) { return visitChildren(ctx); }

	@Override public Node visitArith_op(DecafParser.Arith_opContext ctx) { return visitChildren(ctx); }

	@Override public Node visitEq_op(DecafParser.Eq_opContext ctx) { return visitChildren(ctx); }

	@Override public Node visitField_decl(DecafParser.Field_declContext ctx) { return visitChildren(ctx); }

	@Override public Node visitRe_id_ig_ex_co_ex_blo(DecafParser.Re_id_ig_ex_co_ex_bloContext ctx) { return visitChildren(ctx); }

	@Override public Node visitMethod_decl(DecafParser.Method_declContext ctx) { return visitChildren(ctx); }

	@Override public Node visitLiteral(DecafParser.LiteralContext ctx) { return visitChildren(ctx); }

}
