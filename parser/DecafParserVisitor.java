// Generated from parser/DecafParser.g by ANTLR 4.0

	package compiler.parser;
	import org.antlr.v4.runtime.*;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface DecafParserVisitor<T> extends ParseTreeVisitor<T> {
	T visitStatement(DecafParser.StatementContext ctx);

	T visitCallout_arg(DecafParser.Callout_argContext ctx);

	T visitLocation(DecafParser.LocationContext ctx);

	T visitProgram(DecafParser.ProgramContext ctx);

	T visitMethod_call(DecafParser.Method_callContext ctx);

	T visitBlock(DecafParser.BlockContext ctx);

	T visitExpr(DecafParser.ExprContext ctx);

	T visitField_decl(DecafParser.Field_declContext ctx);

	T visitBin_op(DecafParser.Bin_opContext ctx);

	T visitVar_decl(DecafParser.Var_declContext ctx);

	T visitComentario(DecafParser.ComentarioContext ctx);

	T visitMethod_decl(DecafParser.Method_declContext ctx);
}