// Generated from compiler/parser/DecafParser.g by ANTLR 4.0

	package compiler.parser;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class DecafParserBaseListener implements DecafParserListener {
	@Override public void enterStatement(DecafParser.StatementContext ctx) { }
	@Override public void exitStatement(DecafParser.StatementContext ctx) { }

	@Override public void enterCallout_arg(DecafParser.Callout_argContext ctx) { }
	@Override public void exitCallout_arg(DecafParser.Callout_argContext ctx) { }

	@Override public void enterLocation(DecafParser.LocationContext ctx) { }
	@Override public void exitLocation(DecafParser.LocationContext ctx) { }

	@Override public void enterProgram(DecafParser.ProgramContext ctx) { }
	@Override public void exitProgram(DecafParser.ProgramContext ctx) { }

	@Override public void enterMethod_call(DecafParser.Method_callContext ctx) { }
	@Override public void exitMethod_call(DecafParser.Method_callContext ctx) { }

	@Override public void enterBlock(DecafParser.BlockContext ctx) { }
	@Override public void exitBlock(DecafParser.BlockContext ctx) { }

	@Override public void enterExpr(DecafParser.ExprContext ctx) { }
	@Override public void exitExpr(DecafParser.ExprContext ctx) { }

	@Override public void enterField_decl(DecafParser.Field_declContext ctx) { }
	@Override public void exitField_decl(DecafParser.Field_declContext ctx) { }

	@Override public void enterBin_op(DecafParser.Bin_opContext ctx) { }
	@Override public void exitBin_op(DecafParser.Bin_opContext ctx) { }

	@Override public void enterVar_decl(DecafParser.Var_declContext ctx) { }
	@Override public void exitVar_decl(DecafParser.Var_declContext ctx) { }

	@Override public void enterMethod_decl(DecafParser.Method_declContext ctx) { }
	@Override public void exitMethod_decl(DecafParser.Method_declContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}