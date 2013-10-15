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
		TYPE=1, ASSIGN_OP=2, ARITH_OP_2=3, ARITH_OP_1=4, REL_OP=5, EQ_OP=6, COND_OP=7, 
		RESERVADA=8, HEX_LITERAL=9, LITERAL=10, ID=11, ALPHA_NUM=12, ALPHA=13, 
		DIGIT=14, HEX_DIGIT=15, INT_LITERAL=16, DECIMAL_LITERAL=17, BOOL_LITERAL=18, 
		CHAR_LITERAL=19, STRING_LITERAL=20, CHAR=21, CLASE=22, SIMBOLOS=23, D_DIAG=24, 
		DIAG_INV=25, PUNTO=26, COMILLAS=27, COMILLA=28, A_LLAVE=29, C_LLAVE=30, 
		A_PARENTESIS=31, C_PARENTESIS=32, A_CORCHETE=33, C_CORCHETE=34, COMA=35, 
		PYCOMA=36, IGUAL=37, MENOS=38, ADMIRACION=39, WS=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"TYPE", "ASSIGN_OP", "ARITH_OP_2", "ARITH_OP_1", "REL_OP", "EQ_OP", "COND_OP", 
		"RESERVADA", "HEX_LITERAL", "LITERAL", "ID", "ALPHA_NUM", "ALPHA", "DIGIT", 
		"HEX_DIGIT", "INT_LITERAL", "DECIMAL_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", 
		"STRING_LITERAL", "CHAR", "CLASE", "SIMBOLOS", "'//'", "'\\'", "'.'", 
		"'\"'", "'''", "A_LLAVE", "C_LLAVE", "A_PARENTESIS", "C_PARENTESIS", "A_CORCHETE", 
		"C_CORCHETE", "COMA", "PYCOMA", "IGUAL", "MENOS", "ADMIRACION", "WS"
	};
	public static final String[] ruleNames = {
		"TYPE", "ASSIGN_OP", "ARITH_OP_2", "ARITH_OP_1", "REL_OP", "EQ_OP", "COND_OP", 
		"RESERVADA", "HEX_LITERAL", "LITERAL", "ID", "ALPHA_NUM", "ALPHA", "DIGIT", 
		"HEX_DIGIT", "INT_LITERAL", "DECIMAL_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", 
		"STRING_LITERAL", "CHAR", "CLASE", "SIMBOLOS", "D_DIAG", "DIAG_INV", "PUNTO", 
		"COMILLAS", "COMILLA", "A_LLAVE", "C_LLAVE", "A_PARENTESIS", "C_PARENTESIS", 
		"A_CORCHETE", "C_CORCHETE", "COMA", "PYCOMA", "IGUAL", "MENOS", "ADMIRACION", 
		"WS"
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
		case 39: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip(); break;
		}
	}

	public static final String _serializedATN =
		"\2\4*\u013e\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2^\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\5\3e\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6p\n\6\3\7\3"+
		"\7\3\7\3\7\5\7v\n\7\3\b\3\b\3\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c2\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u00c9\n\n\f\n\16\n\u00cc\13\n\3\13\3\13\3\13\5\13\u00d1\n\13\3\f"+
		"\3\f\7\f\u00d5\n\f\f\f\16\f\u00d8\13\f\3\r\3\r\5\r\u00dc\n\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\5\20\u00e4\n\20\3\21\3\21\3\21\3\21\5\21\u00ea\n"+
		"\21\3\22\6\22\u00ed\n\22\r\22\16\22\u00ee\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00fa\n\23\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u0102"+
		"\n\25\f\25\16\25\u0105\13\25\3\25\3\25\3\26\3\26\5\26\u010b\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\6)\u0139\n)\r)\16)\u013a\3)\3)"+
		"\2*\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1"+
		"\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1"+
		"+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1"+
		"A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\2\3\2\n\5\'\'--//\4,,\61\61\4>>@"+
		"@\5C\\aac|\4CHch\4C\\c|\7##&(AA\u00a3\u00a3\u00c1\u00c1\5\13\f\17\17\""+
		"\"\u0160\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3]"+
		"\3\2\2\2\5d\3\2\2\2\7f\3\2\2\2\th\3\2\2\2\13o\3\2\2\2\ru\3\2\2\2\17{\3"+
		"\2\2\2\21\u00c1\3\2\2\2\23\u00c3\3\2\2\2\25\u00d0\3\2\2\2\27\u00d2\3\2"+
		"\2\2\31\u00db\3\2\2\2\33\u00dd\3\2\2\2\35\u00df\3\2\2\2\37\u00e3\3\2\2"+
		"\2!\u00e9\3\2\2\2#\u00ec\3\2\2\2%\u00f9\3\2\2\2\'\u00fb\3\2\2\2)\u00ff"+
		"\3\2\2\2+\u010a\3\2\2\2-\u010c\3\2\2\2/\u0112\3\2\2\2\61\u0114\3\2\2\2"+
		"\63\u0117\3\2\2\2\65\u0119\3\2\2\2\67\u011b\3\2\2\29\u011d\3\2\2\2;\u011f"+
		"\3\2\2\2=\u0121\3\2\2\2?\u0123\3\2\2\2A\u0125\3\2\2\2C\u0127\3\2\2\2E"+
		"\u0129\3\2\2\2G\u012b\3\2\2\2I\u012d\3\2\2\2K\u012f\3\2\2\2M\u0131\3\2"+
		"\2\2O\u0133\3\2\2\2Q\u0138\3\2\2\2ST\7k\2\2TU\7p\2\2U^\7v\2\2VW\7d\2\2"+
		"WX\7q\2\2XY\7q\2\2YZ\7n\2\2Z[\7g\2\2[\\\7c\2\2\\^\7p\2\2]S\3\2\2\2]V\3"+
		"\2\2\2^\4\3\2\2\2_e\7?\2\2`a\7-\2\2ae\7?\2\2bc\7/\2\2ce\7?\2\2d_\3\2\2"+
		"\2d`\3\2\2\2db\3\2\2\2e\6\3\2\2\2fg\t\2\2\2g\b\3\2\2\2hi\t\3\2\2i\n\3"+
		"\2\2\2jp\t\4\2\2kl\7>\2\2lp\7?\2\2mn\7@\2\2np\7?\2\2oj\3\2\2\2ok\3\2\2"+
		"\2om\3\2\2\2p\f\3\2\2\2qr\7?\2\2rv\7?\2\2st\7#\2\2tv\7?\2\2uq\3\2\2\2"+
		"us\3\2\2\2v\16\3\2\2\2wx\7(\2\2x|\7(\2\2yz\7~\2\2z|\7~\2\2{w\3\2\2\2{"+
		"y\3\2\2\2|\20\3\2\2\2}\u00c2\5\3\2\2~\177\7d\2\2\177\u0080\7t\2\2\u0080"+
		"\u0081\7g\2\2\u0081\u0082\7c\2\2\u0082\u00c2\7m\2\2\u0083\u0084\7e\2\2"+
		"\u0084\u0085\7c\2\2\u0085\u0086\7u\2\2\u0086\u00c2\7g\2\2\u0087\u0088"+
		"\7e\2\2\u0088\u0089\7c\2\2\u0089\u008a\7n\2\2\u008a\u008b\7n\2\2\u008b"+
		"\u008c\7q\2\2\u008c\u008d\7w\2\2\u008d\u00c2\7v\2\2\u008e\u008f\7e\2\2"+
		"\u008f\u0090\7q\2\2\u0090\u0091\7p\2\2\u0091\u0092\7v\2\2\u0092\u0093"+
		"\7k\2\2\u0093\u0094\7p\2\2\u0094\u0095\7w\2\2\u0095\u00c2\7g\2\2\u0096"+
		"\u0097\7e\2\2\u0097\u0098\7n\2\2\u0098\u0099\7c\2\2\u0099\u009a\7u\2\2"+
		"\u009a\u00c2\7u\2\2\u009b\u009c\7g\2\2\u009c\u009d\7n\2\2\u009d\u009e"+
		"\7u\2\2\u009e\u00c2\7g\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7c\2\2\u00a1"+
		"\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3\u00c2\7g\2\2\u00a4\u00a5\7h\2\2"+
		"\u00a5\u00a6\7q\2\2\u00a6\u00c2\7t\2\2\u00a7\u00a8\7k\2\2\u00a8\u00c2"+
		"\7h\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab\u00c2\7v\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7w\2\2"+
		"\u00b0\u00b1\7t\2\2\u00b1\u00c2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4"+
		"\7t\2\2\u00b4\u00b5\7w\2\2\u00b5\u00c2\7g\2\2\u00b6\u00b7\7x\2\2\u00b7"+
		"\u00b8\7q\2\2\u00b8\u00b9\7k\2\2\u00b9\u00c2\7f\2\2\u00ba\u00bb\7r\2\2"+
		"\u00bb\u00bc\7t\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7i\2\2\u00be\u00bf"+
		"\7t\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c2\7o\2\2\u00c1}\3\2\2\2\u00c1~\3"+
		"\2\2\2\u00c1\u0083\3\2\2\2\u00c1\u0087\3\2\2\2\u00c1\u008e\3\2\2\2\u00c1"+
		"\u0096\3\2\2\2\u00c1\u009b\3\2\2\2\u00c1\u009f\3\2\2\2\u00c1\u00a4\3\2"+
		"\2\2\u00c1\u00a7\3\2\2\2\u00c1\u00a9\3\2\2\2\u00c1\u00ac\3\2\2\2\u00c1"+
		"\u00b2\3\2\2\2\u00c1\u00b6\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c2\22\3\2\2"+
		"\2\u00c3\u00c4\7\62\2\2\u00c4\u00c5\7z\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00ca"+
		"\5\37\20\2\u00c7\u00c9\5\37\20\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2"+
		"\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\24\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cd\u00d1\5!\21\2\u00ce\u00d1\5\'\24\2\u00cf\u00d1\5%\23\2"+
		"\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\26"+
		"\3\2\2\2\u00d2\u00d6\5\33\16\2\u00d3\u00d5\5\31\r\2\u00d4\u00d3\3\2\2"+
		"\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\30"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\5\33\16\2\u00da\u00dc\5\35\17"+
		"\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\32\3\2\2\2\u00dd\u00de"+
		"\t\5\2\2\u00de\34\3\2\2\2\u00df\u00e0\4\62;\2\u00e0\36\3\2\2\2\u00e1\u00e4"+
		"\5\35\17\2\u00e2\u00e4\t\6\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2"+
		"\u00e4 \3\2\2\2\u00e5\u00ea\5#\22\2\u00e6\u00ea\5\23\n\2\u00e7\u00e8\7"+
		"/\2\2\u00e8\u00ea\5#\22\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\"\3\2\2\2\u00eb\u00ed\5\35\17\2\u00ec\u00eb\3\2\2"+
		"\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef$"+
		"\3\2\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7w\2\2\u00f3"+
		"\u00fa\7g\2\2\u00f4\u00f5\7h\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7n\2\2"+
		"\u00f7\u00f8\7u\2\2\u00f8\u00fa\7g\2\2\u00f9\u00f0\3\2\2\2\u00f9\u00f4"+
		"\3\2\2\2\u00fa&\3\2\2\2\u00fb\u00fc\7)\2\2\u00fc\u00fd\5+\26\2\u00fd\u00fe"+
		"\7)\2\2\u00fe(\3\2\2\2\u00ff\u0103\7$\2\2\u0100\u0102\5+\26\2\u0101\u0100"+
		"\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7$\2\2\u0107*\3\2\2\2\u0108"+
		"\u010b\t\7\2\2\u0109\u010b\5\35\17\2\u010a\u0108\3\2\2\2\u010a\u0109\3"+
		"\2\2\2\u010b,\3\2\2\2\u010c\u010d\7e\2\2\u010d\u010e\7n\2\2\u010e\u010f"+
		"\7c\2\2\u010f\u0110\7u\2\2\u0110\u0111\7u\2\2\u0111.\3\2\2\2\u0112\u0113"+
		"\t\b\2\2\u0113\60\3\2\2\2\u0114\u0115\7\61\2\2\u0115\u0116\7\61\2\2\u0116"+
		"\62\3\2\2\2\u0117\u0118\7^\2\2\u0118\64\3\2\2\2\u0119\u011a\7\60\2\2\u011a"+
		"\66\3\2\2\2\u011b\u011c\7$\2\2\u011c8\3\2\2\2\u011d\u011e\7)\2\2\u011e"+
		":\3\2\2\2\u011f\u0120\7}\2\2\u0120<\3\2\2\2\u0121\u0122\7\177\2\2\u0122"+
		">\3\2\2\2\u0123\u0124\7*\2\2\u0124@\3\2\2\2\u0125\u0126\7+\2\2\u0126B"+
		"\3\2\2\2\u0127\u0128\7]\2\2\u0128D\3\2\2\2\u0129\u012a\7_\2\2\u012aF\3"+
		"\2\2\2\u012b\u012c\7.\2\2\u012cH\3\2\2\2\u012d\u012e\7=\2\2\u012eJ\3\2"+
		"\2\2\u012f\u0130\7?\2\2\u0130L\3\2\2\2\u0131\u0132\7/\2\2\u0132N\3\2\2"+
		"\2\u0133\u0134\7#\2\2\u0134P\3\2\2\2\u0135\u0139\t\t\2\2\u0136\u0137\7"+
		"\62\2\2\u0137\u0139\7z\2\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013d\b)\2\2\u013dR\3\2\2\2\25\2]dou{\u00c1\u00ca\u00d0\u00d6"+
		"\u00db\u00e3\u00e9\u00ee\u00f9\u0103\u010a\u0138\u013a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}