// Generated from parser/DecafParser.g by ANTLR 4.0

	package compiler.parser;
	import org.antlr.v4.runtime.*;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class DecafParserBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements DecafParserVisitor<T> {
	@Override public T visitStatement(DecafParser.StatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitCallout_arg(DecafParser.Callout_argContext ctx) { return visitChildren(ctx); }

	@Override public T visitLocation(DecafParser.LocationContext ctx) { return visitChildren(ctx); }

	@Override public T visitProgram(DecafParser.ProgramContext ctx) { return visitChildren(ctx); }

	@Override public T visitMethod_call(DecafParser.Method_callContext ctx) { return visitChildren(ctx); }

	@Override public T visitBlock(DecafParser.BlockContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpr(DecafParser.ExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitField_decl(DecafParser.Field_declContext ctx) { return visitChildren(ctx); }

	@Override public T visitBin_op(DecafParser.Bin_opContext ctx) { return visitChildren(ctx); }

	@Override public T visitVar_decl(DecafParser.Var_declContext ctx) { return visitChildren(ctx); }

	@Override public T visitComentario(DecafParser.ComentarioContext ctx) { return visitChildren(ctx); }

	@Override public T visitMethod_decl(DecafParser.Method_declContext ctx) { return visitChildren(ctx); }
}