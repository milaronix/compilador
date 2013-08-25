// Generated from compiler/scanner/DecafLexer.g by ANTLR 4.1

	package compiler.scanner;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexerParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, ASSIGN_OP=2, ARITH_OP=3, REL_OP=4, EQ_OP=5, COND_OP=6, ID=7, ALPHA_NUM=8, 
		ALPHA=9, DIGIT=10, HEX_DIGIT=11, INT_LITERAL=12, DECIMAL_LITERAL=13, HEX_LITERAL=14, 
		BOOL_LITERAL=15, CHAR_LITERAL=16, STRING_LITERAL=17, CHAR=18, SIMBOLOS=19, 
		DIAG_INV=20, PUNTO=21, COMILLAS=22, A_LLAVE=23, C_LLAVE=24, A_PARENTESIS=25, 
		C_PARENTESIS=26, A_CORCHETE=27, C_CORCHETE=28, COMA=29, PYCOMA=30, WS=31;
	public static final String[] tokenNames = {
		"<INVALID>", "TYPE", "ASSIGN_OP", "ARITH_OP", "REL_OP", "EQ_OP", "COND_OP", 
		"ID", "ALPHA_NUM", "ALPHA", "DIGIT", "HEX_DIGIT", "INT_LITERAL", "DECIMAL_LITERAL", 
		"HEX_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "CHAR", 
		"SIMBOLOS", "'\\'", "'.'", "'\"'", "A_LLAVE", "C_LLAVE", "A_PARENTESIS", 
		"C_PARENTESIS", "A_CORCHETE", "C_CORCHETE", "COMA", "PYCOMA", "WS"
	};
	public static final int
		RULE_mensaje = 0;
	public static final String[] ruleNames = {
		"mensaje"
	};

	@Override
	public String getGrammarFileName() { return "DecafLexer.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafLexerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MensajeContext extends ParserRuleContext {
		public TerminalNode COMILLAS(int i) {
			return getToken(DecafLexerParser.COMILLAS, i);
		}
		public List<TerminalNode> COMILLAS() { return getTokens(DecafLexerParser.COMILLAS); }
		public List<TerminalNode> ALPHA() { return getTokens(DecafLexerParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(DecafLexerParser.ALPHA, i);
		}
		public MensajeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mensaje; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafLexerListener ) ((DecafLexerListener)listener).enterMensaje(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafLexerListener ) ((DecafLexerListener)listener).exitMensaje(this);
		}
	}

	public final MensajeContext mensaje() throws RecognitionException {
		MensajeContext _localctx = new MensajeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mensaje);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2); match(COMILLAS);
			setState(4); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3); match(ALPHA);
				}
				}
				setState(6); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHA );
			setState(8); match(COMILLAS);
			System.out.println("MENSAJE");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3!\16\4\2\t\2\3\2\3"+
		"\2\6\2\7\n\2\r\2\16\2\b\3\2\3\2\3\2\3\2\2\3\2\2\2\r\2\4\3\2\2\2\4\6\7"+
		"\30\2\2\5\7\7\13\2\2\6\5\3\2\2\2\7\b\3\2\2\2\b\6\3\2\2\2\b\t\3\2\2\2\t"+
		"\n\3\2\2\2\n\13\7\30\2\2\13\f\b\2\1\2\f\3\3\2\2\2\3\b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}