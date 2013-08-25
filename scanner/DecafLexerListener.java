// Generated from compiler/scanner/DecafLexer.g by ANTLR 4.1

	package compiler.scanner;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafLexerParser}.
 */
public interface DecafLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecafLexerParser#mensaje}.
	 * @param ctx the parse tree
	 */
	void enterMensaje(@NotNull DecafLexerParser.MensajeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafLexerParser#mensaje}.
	 * @param ctx the parse tree
	 */
	void exitMensaje(@NotNull DecafLexerParser.MensajeContext ctx);
}