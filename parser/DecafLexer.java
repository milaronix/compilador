// Generated from compiler/parser/DecafLexer.g by ANTLR 4.1

	package compiler.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, TYPE=2, A_LLAVE=3, C_LLAVE=4, A_CORCHETE=5, C_CORCHETE=6, COMA=7, 
		PYCOMA=8, FIELD_DECL=9, ID=10, INT_LITERAL=11, METHOD_DECL=12, ENTERO=13, 
		FLOTANTE=14, HEX=15, LETRA=16, CHARS=17, STRING=18, BOOL=19, SIMBOLO=20, 
		VARIABLE=21, OPERADOR=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"PROGRAM", "TYPE", "A_LLAVE", "C_LLAVE", "A_CORCHETE", "C_CORCHETE", "COMA", 
		"PYCOMA", "FIELD_DECL", "ID", "INT_LITERAL", "METHOD_DECL", "ENTERO", 
		"FLOTANTE", "HEX", "LETRA", "CHARS", "STRING", "BOOL", "SIMBOLO", "VARIABLE", 
		"OPERADOR", "WS"
	};
	public static final String[] ruleNames = {
		"PROGRAM", "TYPE", "A_LLAVE", "C_LLAVE", "A_CORCHETE", "C_CORCHETE", "COMA", 
		"PYCOMA", "FIELD_DECL", "ID", "INT_LITERAL", "METHOD_DECL", "ENTERO", 
		"FLOTANTE", "HEX", "LETRA", "CHARS", "STRING", "BOOL", "SIMBOLO", "VARIABLE", 
		"OPERADOR", "WS"
	};


	public DecafLexer(CharStream input) {
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
		case 0: PROGRAM_action((RuleContext)_localctx, actionIndex); break;

		case 1: TYPE_action((RuleContext)_localctx, actionIndex); break;

		case 2: A_LLAVE_action((RuleContext)_localctx, actionIndex); break;

		case 3: C_LLAVE_action((RuleContext)_localctx, actionIndex); break;

		case 4: A_CORCHETE_action((RuleContext)_localctx, actionIndex); break;

		case 5: C_CORCHETE_action((RuleContext)_localctx, actionIndex); break;

		case 6: COMA_action((RuleContext)_localctx, actionIndex); break;

		case 7: PYCOMA_action((RuleContext)_localctx, actionIndex); break;

		case 8: FIELD_DECL_action((RuleContext)_localctx, actionIndex); break;

		case 9: ID_action((RuleContext)_localctx, actionIndex); break;

		case 10: INT_LITERAL_action((RuleContext)_localctx, actionIndex); break;

		case 12: ENTERO_action((RuleContext)_localctx, actionIndex); break;

		case 13: FLOTANTE_action((RuleContext)_localctx, actionIndex); break;

		case 14: HEX_action((RuleContext)_localctx, actionIndex); break;

		case 16: CHARS_action((RuleContext)_localctx, actionIndex); break;

		case 17: STRING_action((RuleContext)_localctx, actionIndex); break;

		case 18: BOOL_action((RuleContext)_localctx, actionIndex); break;

		case 19: SIMBOLO_action((RuleContext)_localctx, actionIndex); break;

		case 20: VARIABLE_action((RuleContext)_localctx, actionIndex); break;

		case 21: OPERADOR_action((RuleContext)_localctx, actionIndex); break;

		case 22: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void INT_LITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: System.out.println("INT_LITERAL"); break;
		}
	}
	private void ENTERO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: System.out.println("Entero"); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:  skip(); break;
		}
	}
	private void VARIABLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18: System.out.println("Variable"); break;
		}
	}
	private void HEX_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: System.out.println("Hexadecimal"); break;
		}
	}
	private void PYCOMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: System.out.println("PYCOMA"); break;
		}
	}
	private void A_CORCHETE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: System.out.println("A_CORCHETE"); break;
		}
	}
	private void BOOL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16: System.out.println("Booleano"); break;
		}
	}
	private void OPERADOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19: System.out.println("operador"); break;
		}
	}
	private void CHARS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14: System.out.println("Caracteres"); break;
		}
	}
	private void FIELD_DECL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: System.out.println("FIELD_DECL"); break;
		}
	}
	private void PROGRAM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.println("PROGRAM"); break;
		}
	}
	private void C_CORCHETE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: System.out.println("C_CORCHETE"); break;
		}
	}
	private void A_LLAVE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: System.out.println("A_LLAVE"); break;
		}
	}
	private void FLOTANTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: System.out.println("Flotante"); break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: System.out.println("ID"); break;
		}
	}
	private void C_LLAVE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: System.out.println("C_LLAVE"); break;
		}
	}
	private void COMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: System.out.println("COMA"); break;
		}
	}
	private void SIMBOLO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17: System.out.println("Simbolo"); break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15: System.out.println("String"); break;
		}
	}
	private void TYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: System.out.println("TYPE"); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\31\u00e5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3C"+
		"\n\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n`\n\n\r\n\16\na\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13m\n\13\f\13\16\13p\13\13\3\13\3\13"+
		"\3\f\3\f\3\f\5\fw\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\6\16\u0086\n\16\r\16\16\16\u0087\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\5\20\u0095\n\20\3\20\3\20\5\20\u0099\n\20\6\20"+
		"\u009b\n\20\r\20\16\20\u009c\3\20\3\20\3\21\5\21\u00a2\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00ae\n\23\f\23\16\23\u00b1"+
		"\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00bf\n\24\3\24\3\24\3\25\6\25\u00c4\n\25\r\25\16\25\u00c5\3\25\3\25"+
		"\3\26\3\26\5\26\u00cc\n\26\3\26\3\26\3\26\7\26\u00d1\n\26\f\26\16\26\u00d4"+
		"\13\26\3\26\3\26\3\27\6\27\u00d9\n\27\r\27\16\27\u00da\3\27\3\27\3\30"+
		"\6\30\u00e0\n\30\r\30\16\30\u00e1\3\30\3\30\2\31\3\3\2\5\4\3\7\5\4\t\6"+
		"\5\13\7\6\r\b\7\17\t\b\21\n\t\23\13\n\25\f\13\27\r\f\31\16\1\33\17\r\35"+
		"\20\16\37\21\17!\22\1#\23\20%\24\21\'\25\22)\26\23+\27\24-\30\25/\31\26"+
		"\3\2\7\4\2CHch\4\2C\\c|\5\2*+..==\t\2((,-//\61\61>@``~~\5\2\13\f\17\17"+
		"\"\"\u00fb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\3\61\3\2\2\2\5B\3\2\2\2\7F\3\2\2\2\tI\3\2\2\2\13L\3\2\2\2"+
		"\rO\3\2\2\2\17R\3\2\2\2\21U\3\2\2\2\23X\3\2\2\2\25i\3\2\2\2\27v\3\2\2"+
		"\2\31z\3\2\2\2\33\u0085\3\2\2\2\35\u008b\3\2\2\2\37\u0094\3\2\2\2!\u00a1"+
		"\3\2\2\2#\u00a3\3\2\2\2%\u00a8\3\2\2\2\'\u00be\3\2\2\2)\u00c3\3\2\2\2"+
		"+\u00cb\3\2\2\2-\u00d8\3\2\2\2/\u00df\3\2\2\2\61\62\5\25\13\2\62\63\5"+
		"\25\13\2\63\64\5\7\4\2\64\65\5\t\5\2\65\66\3\2\2\2\66\67\b\2\2\2\67\4"+
		"\3\2\2\289\7k\2\29:\7p\2\2:C\7v\2\2;<\7d\2\2<=\7q\2\2=>\7q\2\2>?\7n\2"+
		"\2?@\7g\2\2@A\7c\2\2AC\7p\2\2B8\3\2\2\2B;\3\2\2\2CD\3\2\2\2DE\b\3\3\2"+
		"E\6\3\2\2\2FG\7}\2\2GH\b\4\4\2H\b\3\2\2\2IJ\7\177\2\2JK\b\5\5\2K\n\3\2"+
		"\2\2LM\7]\2\2MN\b\6\6\2N\f\3\2\2\2OP\7_\2\2PQ\b\7\7\2Q\16\3\2\2\2RS\7"+
		".\2\2ST\b\b\b\2T\20\3\2\2\2UV\7=\2\2VW\b\t\t\2W\22\3\2\2\2X_\5\5\3\2Y"+
		"`\5\25\13\2Z[\5\25\13\2[\\\7]\2\2\\]\5\27\f\2]^\7_\2\2^`\3\2\2\2_Y\3\2"+
		"\2\2_Z\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7.\2\2de\7\""+
		"\2\2ef\7=\2\2fg\3\2\2\2gh\b\n\n\2h\24\3\2\2\2in\5!\21\2jm\5!\21\2km\5"+
		"\33\16\2lj\3\2\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2p"+
		"n\3\2\2\2qr\b\13\13\2r\26\3\2\2\2sw\5\35\17\2tw\5\37\20\2uw\5\33\16\2"+
		"vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2wx\3\2\2\2xy\b\f\f\2y\30\3\2\2\2z{\7c\2"+
		"\2{|\7c\2\2|}\7c\2\2}~\7c\2\2~\177\7c\2\2\177\u0080\7c\2\2\u0080\u0081"+
		"\7c\2\2\u0081\u0082\7c\2\2\u0082\u0083\7c\2\2\u0083\32\3\2\2\2\u0084\u0086"+
		"\4\62;\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\16\r\2\u008a\34\3\2\2"+
		"\2\u008b\u008c\5\33\16\2\u008c\u008d\7\60\2\2\u008d\u008e\5\33\16\2\u008e"+
		"\u008f\b\17\16\2\u008f\36\3\2\2\2\u0090\u0091\7\62\2\2\u0091\u0095\7Z"+
		"\2\2\u0092\u0093\7\62\2\2\u0093\u0095\7z\2\2\u0094\u0090\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u009a\3\2\2\2\u0096\u009b\5\33\16\2\u0097\u0099\t"+
		"\2\2\2\u0098\u0097\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0096\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\20\17\2\u009f \3\2\2\2\u00a0\u00a2"+
		"\t\3\2\2\u00a1\u00a0\3\2\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7)\2\2\u00a4"+
		"\u00a5\5!\21\2\u00a5\u00a6\7)\2\2\u00a6\u00a7\b\22\20\2\u00a7$\3\2\2\2"+
		"\u00a8\u00af\7$\2\2\u00a9\u00ae\5!\21\2\u00aa\u00ae\5\33\16\2\u00ab\u00ae"+
		"\5)\25\2\u00ac\u00ae\5-\27\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b3\7$\2\2\u00b3\u00b4\b\23\21\2\u00b4&\3\2\2\2\u00b5\u00b6\7v\2\2"+
		"\u00b6\u00b7\7t\2\2\u00b7\u00b8\7w\2\2\u00b8\u00bf\7g\2\2\u00b9\u00ba"+
		"\7h\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7u\2\2\u00bd"+
		"\u00bf\7g\2\2\u00be\u00b5\3\2\2\2\u00be\u00b9\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\b\24\22\2\u00c1(\3\2\2\2\u00c2\u00c4\t\4\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\b\25\23\2\u00c8*\3\2\2\2\u00c9\u00cc\7a\2\2"+
		"\u00ca\u00cc\5!\21\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00d2"+
		"\3\2\2\2\u00cd\u00d1\5!\21\2\u00ce\u00d1\5\33\16\2\u00cf\u00d1\7a\2\2"+
		"\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\b\26\24\2\u00d6,\3\2\2\2\u00d7\u00d9\t\5\2"+
		"\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\27\25\2\u00dd.\3\2\2\2\u00de"+
		"\u00e0\t\6\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\b\30\26\2\u00e4"+
		"\60\3\2\2\2\30\2B_alnv\u0087\u0094\u0098\u009a\u009c\u00a1\u00ad\u00af"+
		"\u00be\u00c5\u00cb\u00d0\u00d2\u00da\u00e1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}