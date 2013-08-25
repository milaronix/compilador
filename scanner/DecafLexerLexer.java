// Generated from compiler/scanner/DecafLexer.g by ANTLR 4.1

	package compiler.scanner;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexerLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, ASSIGN_OP=2, ARITH_OP=3, REL_OP=4, EQ_OP=5, COND_OP=6, ID=7, ALPHA_NUM=8, 
		ALPHA=9, DIGIT=10, HEX_DIGIT=11, INT_LITERAL=12, DECIMAL_LITERAL=13, HEX_LITERAL=14, 
		BOOL_LITERAL=15, CHAR_LITERAL=16, STRING_LITERAL=17, CHAR=18, SIMBOLOS=19, 
		DIAG_INV=20, PUNTO=21, COMILLAS=22, A_LLAVE=23, C_LLAVE=24, A_PARENTESIS=25, 
		C_PARENTESIS=26, A_CORCHETE=27, C_CORCHETE=28, COMA=29, PYCOMA=30, WS=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"TYPE", "ASSIGN_OP", "ARITH_OP", "REL_OP", "EQ_OP", "COND_OP", "ID", "ALPHA_NUM", 
		"ALPHA", "DIGIT", "HEX_DIGIT", "INT_LITERAL", "DECIMAL_LITERAL", "HEX_LITERAL", 
		"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "CHAR", "SIMBOLOS", 
		"'\\'", "'.'", "'\"'", "A_LLAVE", "C_LLAVE", "A_PARENTESIS", "C_PARENTESIS", 
		"A_CORCHETE", "C_CORCHETE", "COMA", "PYCOMA", "WS"
	};
	public static final String[] ruleNames = {
		"TYPE", "ASSIGN_OP", "ARITH_OP", "REL_OP", "EQ_OP", "COND_OP", "ID", "ALPHA_NUM", 
		"ALPHA", "DIGIT", "HEX_DIGIT", "INT_LITERAL", "DECIMAL_LITERAL", "HEX_LITERAL", 
		"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "CHAR", "SIMBOLOS", 
		"DIAG_INV", "PUNTO", "COMILLAS", "A_LLAVE", "C_LLAVE", "A_PARENTESIS", 
		"C_PARENTESIS", "A_CORCHETE", "C_CORCHETE", "COMA", "PYCOMA", "WS"
	};


	public DecafLexerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DecafLexer.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6: ID_action((RuleContext)_localctx, actionIndex); break;

		case 8: ALPHA_action((RuleContext)_localctx, actionIndex); break;

		case 17: CHAR_action((RuleContext)_localctx, actionIndex); break;

		case 18: SIMBOLOS_action((RuleContext)_localctx, actionIndex); break;

		case 19: DIAG_INV_action((RuleContext)_localctx, actionIndex); break;

		case 20: PUNTO_action((RuleContext)_localctx, actionIndex); break;

		case 21: COMILLAS_action((RuleContext)_localctx, actionIndex); break;

		case 22: A_LLAVE_action((RuleContext)_localctx, actionIndex); break;

		case 23: C_LLAVE_action((RuleContext)_localctx, actionIndex); break;

		case 24: A_PARENTESIS_action((RuleContext)_localctx, actionIndex); break;

		case 25: C_PARENTESIS_action((RuleContext)_localctx, actionIndex); break;

		case 26: A_CORCHETE_action((RuleContext)_localctx, actionIndex); break;

		case 27: C_CORCHETE_action((RuleContext)_localctx, actionIndex); break;

		case 28: COMA_action((RuleContext)_localctx, actionIndex); break;

		case 29: PYCOMA_action((RuleContext)_localctx, actionIndex); break;

		case 30: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void PUNTO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: System.out.println("PUNTO"); break;
		}
	}
	private void DIAG_INV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: System.out.println("DIAG_INV"); break;
		}
	}
	private void SIMBOLOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: System.out.println("SIMBOLOS"); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:  skip(); break;
		}
	}
	private void A_PARENTESIS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: System.out.println("A_PARENTESIS"); break;
		}
	}
	private void COMILLAS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: System.out.println("COMILLAS"); break;
		}
	}
	private void PYCOMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14: System.out.println("PYCOMA"); break;
		}
	}
	private void A_CORCHETE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: System.out.println("A_CORCHETE"); break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: System.out.println("CHAR"); break;
		}
	}
	private void C_CORCHETE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: System.out.println("C_CORCHETE"); break;
		}
	}
	private void A_LLAVE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: System.out.println("A_LLAVE"); break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.println("ID"); break;
		}
	}
	private void COMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: System.out.println("COMA"); break;
		}
	}
	private void C_LLAVE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: System.out.println("C_LLAVE"); break;
		}
	}
	private void ALPHA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: System.out.println("ALPHA"); break;
		}
	}
	private void C_PARENTESIS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: System.out.println("C_PARENTESIS"); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2!\u00da\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2L\n\2\3\3\3\3\3\3\3\3\3\3\5\3"+
		"S\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\3\6\3\6\5\6b\n\6\3"+
		"\7\3\7\3\7\3\7\5\7h\n\7\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b\3\b\3\b\3\t\3"+
		"\t\5\tu\n\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\5\f~\n\f\3\r\3\r\5\r\u0082\n"+
		"\r\3\16\3\16\7\16\u0086\n\16\f\16\16\16\u0089\13\16\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u0090\n\17\f\17\16\17\u0093\13\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u009e\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3 \6 \u00d5\n \r \16 \u00d6\3 \3 \2!\3\3\1\5\4\1\7\5\1"+
		"\t\6\1\13\7\1\r\b\1\17\t\2\21\n\1\23\13\3\25\f\1\27\r\1\31\16\1\33\17"+
		"\1\35\20\1\37\21\1!\22\1#\23\1%\24\4\'\25\5)\26\6+\27\7-\30\b/\31\t\61"+
		"\32\n\63\33\13\65\34\f\67\35\r9\36\16;\37\17= \20?!\21\3\2\t\6\2\'\',"+
		"-//\61\61\4\2>>@@\5\2C\\aac|\4\2CHch\5\2\62;C\\c|\7\2##&(AA\u00a3\u00a3"+
		"\u00c1\u00c1\5\2\13\f\17\17\"\"\u00e7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3K\3"+
		"\2\2\2\5R\3\2\2\2\7T\3\2\2\2\t[\3\2\2\2\13a\3\2\2\2\rg\3\2\2\2\17i\3\2"+
		"\2\2\21t\3\2\2\2\23v\3\2\2\2\25y\3\2\2\2\27}\3\2\2\2\31\u0081\3\2\2\2"+
		"\33\u0083\3\2\2\2\35\u008a\3\2\2\2\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a8"+
		"\3\2\2\2%\u00ac\3\2\2\2\'\u00af\3\2\2\2)\u00b2\3\2\2\2+\u00b5\3\2\2\2"+
		"-\u00b8\3\2\2\2/\u00bb\3\2\2\2\61\u00be\3\2\2\2\63\u00c1\3\2\2\2\65\u00c4"+
		"\3\2\2\2\67\u00c7\3\2\2\29\u00ca\3\2\2\2;\u00cd\3\2\2\2=\u00d0\3\2\2\2"+
		"?\u00d4\3\2\2\2AB\7k\2\2BC\7p\2\2CL\7v\2\2DE\7d\2\2EF\7q\2\2FG\7q\2\2"+
		"GH\7n\2\2HI\7g\2\2IJ\7c\2\2JL\7p\2\2KA\3\2\2\2KD\3\2\2\2L\4\3\2\2\2MS"+
		"\7?\2\2NO\7-\2\2OS\7?\2\2PQ\7/\2\2QS\7?\2\2RM\3\2\2\2RN\3\2\2\2RP\3\2"+
		"\2\2S\6\3\2\2\2TU\t\2\2\2U\b\3\2\2\2V\\\t\3\2\2WX\7>\2\2X\\\7?\2\2YZ\7"+
		"@\2\2Z\\\7?\2\2[V\3\2\2\2[W\3\2\2\2[Y\3\2\2\2\\\n\3\2\2\2]^\7?\2\2^b\7"+
		"?\2\2_`\7#\2\2`b\7?\2\2a]\3\2\2\2a_\3\2\2\2b\f\3\2\2\2cd\7(\2\2dh\7(\2"+
		"\2ef\7~\2\2fh\7~\2\2gc\3\2\2\2ge\3\2\2\2h\16\3\2\2\2im\5\23\n\2jl\5\21"+
		"\t\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\b\b"+
		"\2\2q\20\3\2\2\2ru\5\23\n\2su\5\25\13\2tr\3\2\2\2ts\3\2\2\2u\22\3\2\2"+
		"\2vw\t\4\2\2wx\b\n\3\2x\24\3\2\2\2yz\4\62;\2z\26\3\2\2\2{~\5\25\13\2|"+
		"~\t\5\2\2}{\3\2\2\2}|\3\2\2\2~\30\3\2\2\2\177\u0082\5\33\16\2\u0080\u0082"+
		"\5\35\17\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\32\3\2\2\2\u0083"+
		"\u0087\5\25\13\2\u0084\u0086\5\25\13\2\u0085\u0084\3\2\2\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\34\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\7\62\2\2\u008b\u008c\7z\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u0091\5\27\f\2\u008e\u0090\5\27\f\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\36\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0094\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097"+
		"\7w\2\2\u0097\u009e\7g\2\2\u0098\u0099\7h\2\2\u0099\u009a\7c\2\2\u009a"+
		"\u009b\7n\2\2\u009b\u009c\7u\2\2\u009c\u009e\7g\2\2\u009d\u0094\3\2\2"+
		"\2\u009d\u0098\3\2\2\2\u009e \3\2\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1"+
		"\7\"\2\2\u00a1\u00a2\7E\2\2\u00a2\u00a3\7J\2\2\u00a3\u00a4\7C\2\2\u00a4"+
		"\u00a5\7T\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\3\2\2\2\u00a8\u00a9\7$\2"+
		"\2\u00a9\u00aa\5%\23\2\u00aa\u00ab\7$\2\2\u00ab$\3\2\2\2\u00ac\u00ad\t"+
		"\6\2\2\u00ad\u00ae\b\23\4\2\u00ae&\3\2\2\2\u00af\u00b0\t\7\2\2\u00b0\u00b1"+
		"\b\24\5\2\u00b1(\3\2\2\2\u00b2\u00b3\7^\2\2\u00b3\u00b4\b\25\6\2\u00b4"+
		"*\3\2\2\2\u00b5\u00b6\7\60\2\2\u00b6\u00b7\b\26\7\2\u00b7,\3\2\2\2\u00b8"+
		"\u00b9\7$\2\2\u00b9\u00ba\b\27\b\2\u00ba.\3\2\2\2\u00bb\u00bc\7}\2\2\u00bc"+
		"\u00bd\b\30\t\2\u00bd\60\3\2\2\2\u00be\u00bf\7\177\2\2\u00bf\u00c0\b\31"+
		"\n\2\u00c0\62\3\2\2\2\u00c1\u00c2\7*\2\2\u00c2\u00c3\b\32\13\2\u00c3\64"+
		"\3\2\2\2\u00c4\u00c5\7+\2\2\u00c5\u00c6\b\33\f\2\u00c6\66\3\2\2\2\u00c7"+
		"\u00c8\7]\2\2\u00c8\u00c9\b\34\r\2\u00c98\3\2\2\2\u00ca\u00cb\7_\2\2\u00cb"+
		"\u00cc\b\35\16\2\u00cc:\3\2\2\2\u00cd\u00ce\7.\2\2\u00ce\u00cf\b\36\17"+
		"\2\u00cf<\3\2\2\2\u00d0\u00d1\7=\2\2\u00d1\u00d2\b\37\20\2\u00d2>\3\2"+
		"\2\2\u00d3\u00d5\t\b\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b "+
		"\21\2\u00d9@\3\2\2\2\20\2KR[agmt}\u0081\u0087\u0091\u009d\u00d6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}