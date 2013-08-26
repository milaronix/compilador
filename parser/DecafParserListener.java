// Generated from compiler/parser/DecafParser.g by ANTLR 4.0

	package compiler.parser;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface DecafParserListener extends ParseTreeListener {
	void enterStatement(DecafParser.StatementContext ctx);
	void exitStatement(DecafParser.StatementContext ctx);

	void enterCallout_arg(DecafParser.Callout_argContext ctx);
	void exitCallout_arg(DecafParser.Callout_argContext ctx);

	void enterLocation(DecafParser.LocationContext ctx);
	void exitLocation(DecafParser.LocationContext ctx);

	void enterProgram(DecafParser.ProgramContext ctx);
	void exitProgram(DecafParser.ProgramContext ctx);

	void enterMethod_call(DecafParser.Method_callContext ctx);
	void exitMethod_call(DecafParser.Method_callContext ctx);

	void enterBlock(DecafParser.BlockContext ctx);
	void exitBlock(DecafParser.BlockContext ctx);

	void enterExpr(DecafParser.ExprContext ctx);
	void exitExpr(DecafParser.ExprContext ctx);

	void enterField_decl(DecafParser.Field_declContext ctx);
	void exitField_decl(DecafParser.Field_declContext ctx);

	void enterBin_op(DecafParser.Bin_opContext ctx);
	void exitBin_op(DecafParser.Bin_opContext ctx);

	void enterVar_decl(DecafParser.Var_declContext ctx);
	void exitVar_decl(DecafParser.Var_declContext ctx);

	void enterMethod_decl(DecafParser.Method_declContext ctx);
	void exitMethod_decl(DecafParser.Method_declContext ctx);
}