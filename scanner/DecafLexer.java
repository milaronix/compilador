// Generated from scanner/DecafLexer.g by ANTLR 4.0

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
public class DecafLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, ASSIGN_OP=2, ARITH_OP=3, REL_OP=4, EQ_OP=5, COND_OP=6, RESERVADA=7, 
		LITERAL=8, ID=9, ALPHA_NUM=10, ALPHA=11, DIGIT=12, HEX_DIGIT=13, INT_LITERAL=14, 
		DECIMAL_LITERAL=15, HEX_LITERAL=16, BOOL_LITERAL=17, CHAR_LITERAL=18, 
		STRING_LITERAL=19, CHAR=20, CLASE=21, SIMBOLOS=22, DIAG_INV=23, PUNTO=24, 
		COMILLAS=25, A_LLAVE=26, C_LLAVE=27, A_PARENTESIS=28, C_PARENTESIS=29, 
		A_CORCHETE=30, C_CORCHETE=31, COMA=32, PYCOMA=33, IGUAL=34, MENOS=35, 
		ADMIRACION=36, WS=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"TYPE", "ASSIGN_OP", "ARITH_OP", "REL_OP", "EQ_OP", "COND_OP", "RESERVADA", 
		"LITERAL", "ID", "ALPHA_NUM", "ALPHA", "DIGIT", "HEX_DIGIT", "INT_LITERAL", 
		"DECIMAL_LITERAL", "HEX_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
		"CHAR", "CLASE", "SIMBOLOS", "'\\'", "'.'", "'\"'", "A_LLAVE", "C_LLAVE", 
		"A_PARENTESIS", "C_PARENTESIS", "A_CORCHETE", "C_CORCHETE", "COMA", "PYCOMA", 
		"IGUAL", "MENOS", "ADMIRACION", "WS"
	};
	public static final String[] ruleNames = {
		"TYPE", "ASSIGN_OP", "ARITH_OP", "REL_OP", "EQ_OP", "COND_OP", "RESERVADA", 
		"LITERAL", "ID", "ALPHA_NUM", "ALPHA", "DIGIT", "HEX_DIGIT", "INT_LITERAL", 
		"DECIMAL_LITERAL", "HEX_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
		"CHAR", "CLASE", "SIMBOLOS", "DIAG_INV", "PUNTO", "COMILLAS", "A_LLAVE", 
		"C_LLAVE", "A_PARENTESIS", "C_PARENTESIS", "A_CORCHETE", "C_CORCHETE", 
		"COMA", "PYCOMA", "IGUAL", "MENOS", "ADMIRACION", "WS"
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
		case 36: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip(); break;
		}
	}

	public static final String _serializedATN =
		"\2\4\'\u012d\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2X\n\2\3\3\3\3\3\3\3\3\3\3\5\3_\n\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5h\n\5\3\6\3\6\3\6\3\6\5\6n\n\6\3\7\3\7\3"+
		"\7\3\7\5\7t\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b3\n\b\3\t\3"+
		"\t\3\t\5\t\u00b8\n\t\3\n\3\n\7\n\u00bc\n\n\f\n\16\n\u00bf\13\n\3\13\3"+
		"\13\5\13\u00c3\n\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u00cb\n\16\3\17\3\17"+
		"\5\17\u00cf\n\17\3\20\3\20\7\20\u00d3\n\20\f\20\16\20\u00d6\13\20\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u00dd\n\21\f\21\16\21\u00e0\13\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00eb\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u00f8\n\24\f\24\16\24\u00fb\13"+
		"\24\3\24\3\24\3\25\3\25\5\25\u0101\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\6&\u0128"+
		"\n&\r&\16&\u0129\3&\3&\2\'\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1"+
		"\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23"+
		"\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35"+
		"\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\2\3\2\t\6\'\',-//\61\61"+
		"\4>>@@\5C\\aac|\4CHch\4C\\c|\7##&(AA\u00a3\u00a3\u00c1\u00c1\5\13\f\17"+
		"\17\"\"\u014b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3W\3\2\2\2\5^\3\2\2\2\7`\3\2\2\2\t"+
		"g\3\2\2\2\13m\3\2\2\2\rs\3\2\2\2\17\u00b2\3\2\2\2\21\u00b7\3\2\2\2\23"+
		"\u00b9\3\2\2\2\25\u00c2\3\2\2\2\27\u00c4\3\2\2\2\31\u00c6\3\2\2\2\33\u00ca"+
		"\3\2\2\2\35\u00ce\3\2\2\2\37\u00d0\3\2\2\2!\u00d7\3\2\2\2#\u00ea\3\2\2"+
		"\2%\u00ec\3\2\2\2\'\u00f5\3\2\2\2)\u0100\3\2\2\2+\u0102\3\2\2\2-\u0108"+
		"\3\2\2\2/\u010a\3\2\2\2\61\u010c\3\2\2\2\63\u010e\3\2\2\2\65\u0110\3\2"+
		"\2\2\67\u0112\3\2\2\29\u0114\3\2\2\2;\u0116\3\2\2\2=\u0118\3\2\2\2?\u011a"+
		"\3\2\2\2A\u011c\3\2\2\2C\u011e\3\2\2\2E\u0120\3\2\2\2G\u0122\3\2\2\2I"+
		"\u0124\3\2\2\2K\u0127\3\2\2\2MN\7k\2\2NO\7p\2\2OX\7v\2\2PQ\7d\2\2QR\7"+
		"q\2\2RS\7q\2\2ST\7n\2\2TU\7g\2\2UV\7c\2\2VX\7p\2\2WM\3\2\2\2WP\3\2\2\2"+
		"X\4\3\2\2\2Y_\7?\2\2Z[\7-\2\2[_\7?\2\2\\]\7/\2\2]_\7?\2\2^Y\3\2\2\2^Z"+
		"\3\2\2\2^\\\3\2\2\2_\6\3\2\2\2`a\t\2\2\2a\b\3\2\2\2bh\t\3\2\2cd\7>\2\2"+
		"dh\7?\2\2ef\7@\2\2fh\7?\2\2gb\3\2\2\2gc\3\2\2\2ge\3\2\2\2h\n\3\2\2\2i"+
		"j\7?\2\2jn\7?\2\2kl\7#\2\2ln\7?\2\2mi\3\2\2\2mk\3\2\2\2n\f\3\2\2\2op\7"+
		"(\2\2pt\7(\2\2qr\7~\2\2rt\7~\2\2so\3\2\2\2sq\3\2\2\2t\16\3\2\2\2u\u00b3"+
		"\5\3\2\2vw\7d\2\2wx\7t\2\2xy\7g\2\2yz\7c\2\2z\u00b3\7m\2\2{|\7e\2\2|}"+
		"\7c\2\2}~\7u\2\2~\u00b3\7g\2\2\177\u0080\7e\2\2\u0080\u0081\7c\2\2\u0081"+
		"\u0082\7n\2\2\u0082\u0083\7n\2\2\u0083\u0084\7q\2\2\u0084\u0085\7w\2\2"+
		"\u0085\u00b3\7v\2\2\u0086\u0087\7e\2\2\u0087\u0088\7q\2\2\u0088\u0089"+
		"\7p\2\2\u0089\u008a\7v\2\2\u008a\u008b\7k\2\2\u008b\u008c\7p\2\2\u008c"+
		"\u008d\7w\2\2\u008d\u00b3\7g\2\2\u008e\u008f\7e\2\2\u008f\u0090\7n\2\2"+
		"\u0090\u0091\7c\2\2\u0091\u0092\7u\2\2\u0092\u00b3\7u\2\2\u0093\u0094"+
		"\7g\2\2\u0094\u0095\7n\2\2\u0095\u0096\7u\2\2\u0096\u00b3\7g\2\2\u0097"+
		"\u0098\7h\2\2\u0098\u0099\7c\2\2\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2"+
		"\u009b\u00b3\7g\2\2\u009c\u009d\7h\2\2\u009d\u009e\7q\2\2\u009e\u00b3"+
		"\7t\2\2\u009f\u00a0\7k\2\2\u00a0\u00b3\7h\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		"\u00a3\7p\2\2\u00a3\u00b3\7v\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7g\2\2"+
		"\u00a6\u00a7\7v\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7t\2\2\u00a9\u00b3"+
		"\7p\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7w\2\2\u00ad"+
		"\u00b3\7g\2\2\u00ae\u00af\7x\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7k\2\2"+
		"\u00b1\u00b3\7f\2\2\u00b2u\3\2\2\2\u00b2v\3\2\2\2\u00b2{\3\2\2\2\u00b2"+
		"\177\3\2\2\2\u00b2\u0086\3\2\2\2\u00b2\u008e\3\2\2\2\u00b2\u0093\3\2\2"+
		"\2\u00b2\u0097\3\2\2\2\u00b2\u009c\3\2\2\2\u00b2\u009f\3\2\2\2\u00b2\u00a1"+
		"\3\2\2\2\u00b2\u00a4\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3"+
		"\20\3\2\2\2\u00b4\u00b8\5\35\17\2\u00b5\u00b8\5%\23\2\u00b6\u00b8\5#\22"+
		"\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\22"+
		"\3\2\2\2\u00b9\u00bd\5\27\f\2\u00ba\u00bc\5\25\13\2\u00bb\u00ba\3\2\2"+
		"\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\24"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\5\27\f\2\u00c1\u00c3\5\31\r\2"+
		"\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\26\3\2\2\2\u00c4\u00c5"+
		"\t\4\2\2\u00c5\30\3\2\2\2\u00c6\u00c7\4\62;\2\u00c7\32\3\2\2\2\u00c8\u00cb"+
		"\5\31\r\2\u00c9\u00cb\t\5\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2"+
		"\u00cb\34\3\2\2\2\u00cc\u00cf\5\37\20\2\u00cd\u00cf\5!\21\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\36\3\2\2\2\u00d0\u00d4\5\31\r\2\u00d1"+
		"\u00d3\5\31\r\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3"+
		"\2\2\2\u00d4\u00d5\3\2\2\2\u00d5 \3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8"+
		"\7\62\2\2\u00d8\u00d9\7z\2\2\u00d9\u00da\3\2\2\2\u00da\u00de\5\33\16\2"+
		"\u00db\u00dd\5\33\16\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e2\7v\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7w\2\2\u00e4\u00eb\7g\2\2"+
		"\u00e5\u00e6\7h\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9"+
		"\7u\2\2\u00e9\u00eb\7g\2\2\u00ea\u00e1\3\2\2\2\u00ea\u00e5\3\2\2\2\u00eb"+
		"$\3\2\2\2\u00ec\u00ed\7\61\2\2\u00ed\u00ee\7\"\2\2\u00ee\u00ef\7E\2\2"+
		"\u00ef\u00f0\7J\2\2\u00f0\u00f1\7C\2\2\u00f1\u00f2\7T\2\2\u00f2\u00f3"+
		"\7\"\2\2\u00f3\u00f4\3\2\2\2\u00f5\u00f9\7$\2\2\u00f6\u00f8\5)\25\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7$\2\2\u00fd"+
		"(\3\2\2\2\u00fe\u0101\t\6\2\2\u00ff\u0101\5\31\r\2\u0100\u00fe\3\2\2\2"+
		"\u0100\u00ff\3\2\2\2\u0101*\3\2\2\2\u0102\u0103\7e\2\2\u0103\u0104\7n"+
		"\2\2\u0104\u0105\7c\2\2\u0105\u0106\7u\2\2\u0106\u0107\7u\2\2\u0107,\3"+
		"\2\2\2\u0108\u0109\t\7\2\2\u0109.\3\2\2\2\u010a\u010b\7^\2\2\u010b\60"+
		"\3\2\2\2\u010c\u010d\7\60\2\2\u010d\62\3\2\2\2\u010e\u010f\7$\2\2\u010f"+
		"\64\3\2\2\2\u0110\u0111\7}\2\2\u0111\66\3\2\2\2\u0112\u0113\7\177\2\2"+
		"\u01138\3\2\2\2\u0114\u0115\7*\2\2\u0115:\3\2\2\2\u0116\u0117\7+\2\2\u0117"+
		"<\3\2\2\2\u0118\u0119\7]\2\2\u0119>\3\2\2\2\u011a\u011b\7_\2\2\u011b@"+
		"\3\2\2\2\u011c\u011d\7.\2\2\u011dB\3\2\2\2\u011e\u011f\7=\2\2\u011fD\3"+
		"\2\2\2\u0120\u0121\7?\2\2\u0121F\3\2\2\2\u0122\u0123\7/\2\2\u0123H\3\2"+
		"\2\2\u0124\u0125\7#\2\2\u0125J\3\2\2\2\u0126\u0128\t\b\2\2\u0127\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\b&\2\2\u012cL\3\2\2\2\24\2W^gms\u00b2\u00b7"+
		"\u00bd\u00c2\u00ca\u00ce\u00d4\u00de\u00ea\u00f9\u0100\u0129";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}