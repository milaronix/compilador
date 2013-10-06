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
		HEX_LITERAL=8, LITERAL=9, ID=10, ALPHA_NUM=11, ALPHA=12, DIGIT=13, HEX_DIGIT=14, 
		INT_LITERAL=15, DECIMAL_LITERAL=16, BOOL_LITERAL=17, CHAR_LITERAL=18, 
		STRING_LITERAL=19, CHAR=20, CLASE=21, SIMBOLOS=22, D_DIAG=23, DIAG_INV=24, 
		PUNTO=25, COMILLAS=26, COMILLA=27, A_LLAVE=28, C_LLAVE=29, A_PARENTESIS=30, 
		C_PARENTESIS=31, A_CORCHETE=32, C_CORCHETE=33, COMA=34, PYCOMA=35, IGUAL=36, 
		MENOS=37, ADMIRACION=38, WS=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"TYPE", "ASSIGN_OP", "ARITH_OP", "REL_OP", "EQ_OP", "COND_OP", "RESERVADA", 
		"HEX_LITERAL", "LITERAL", "ID", "ALPHA_NUM", "ALPHA", "DIGIT", "HEX_DIGIT", 
		"INT_LITERAL", "DECIMAL_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
		"CHAR", "CLASE", "SIMBOLOS", "'//'", "'\\'", "'.'", "'\"'", "'''", "A_LLAVE", 
		"C_LLAVE", "A_PARENTESIS", "C_PARENTESIS", "A_CORCHETE", "C_CORCHETE", 
		"COMA", "PYCOMA", "IGUAL", "MENOS", "ADMIRACION", "WS"
	};
	public static final String[] ruleNames = {
		"TYPE", "ASSIGN_OP", "ARITH_OP", "REL_OP", "EQ_OP", "COND_OP", "RESERVADA", 
		"HEX_LITERAL", "LITERAL", "ID", "ALPHA_NUM", "ALPHA", "DIGIT", "HEX_DIGIT", 
		"INT_LITERAL", "DECIMAL_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
		"CHAR", "CLASE", "SIMBOLOS", "D_DIAG", "DIAG_INV", "PUNTO", "COMILLAS", 
		"COMILLA", "A_LLAVE", "C_LLAVE", "A_PARENTESIS", "C_PARENTESIS", "A_CORCHETE", 
		"C_CORCHETE", "COMA", "PYCOMA", "IGUAL", "MENOS", "ADMIRACION", "WS"
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
		case 38: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip(); break;
		}
	}

	public static final String _serializedATN =
		"\2\4)\u013a\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\\\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\5\3c\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5l\n\5\3\6\3\6\3\6\3\6\5\6"+
		"r\n\6\3\7\3\7\3\7\3\7\5\7x\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00be\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u00c5\n\t"+
		"\f\t\16\t\u00c8\13\t\3\n\3\n\3\n\5\n\u00cd\n\n\3\13\3\13\7\13\u00d1\n"+
		"\13\f\13\16\13\u00d4\13\13\3\f\3\f\5\f\u00d8\n\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\5\17\u00e0\n\17\3\20\3\20\3\20\3\20\5\20\u00e6\n\20\3\21\6\21\u00e9"+
		"\n\21\r\21\16\21\u00ea\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u00f6\n\22\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u00fe\n\24\f\24\16\24"+
		"\u0101\13\24\3\24\3\24\3\25\3\25\5\25\u0107\n\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\3(\6(\u0135\n(\r(\16(\u0136\3(\3(\2)\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1"+
		"\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31"+
		"\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%"+
		"\1I&\1K\'\1M(\1O)\2\3\2\t\6\'\',-//\61\61\4>>@@\5C\\aac|\4CHch\4C\\c|"+
		"\7##&(AA\u00a3\u00a3\u00c1\u00c1\5\13\f\17\17\"\"\u015c\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3[\3\2\2\2\5b\3\2\2\2\7d\3\2\2\2\tk\3"+
		"\2\2\2\13q\3\2\2\2\rw\3\2\2\2\17\u00bd\3\2\2\2\21\u00bf\3\2\2\2\23\u00cc"+
		"\3\2\2\2\25\u00ce\3\2\2\2\27\u00d7\3\2\2\2\31\u00d9\3\2\2\2\33\u00db\3"+
		"\2\2\2\35\u00df\3\2\2\2\37\u00e5\3\2\2\2!\u00e8\3\2\2\2#\u00f5\3\2\2\2"+
		"%\u00f7\3\2\2\2\'\u00fb\3\2\2\2)\u0106\3\2\2\2+\u0108\3\2\2\2-\u010e\3"+
		"\2\2\2/\u0110\3\2\2\2\61\u0113\3\2\2\2\63\u0115\3\2\2\2\65\u0117\3\2\2"+
		"\2\67\u0119\3\2\2\29\u011b\3\2\2\2;\u011d\3\2\2\2=\u011f\3\2\2\2?\u0121"+
		"\3\2\2\2A\u0123\3\2\2\2C\u0125\3\2\2\2E\u0127\3\2\2\2G\u0129\3\2\2\2I"+
		"\u012b\3\2\2\2K\u012d\3\2\2\2M\u012f\3\2\2\2O\u0134\3\2\2\2QR\7k\2\2R"+
		"S\7p\2\2S\\\7v\2\2TU\7d\2\2UV\7q\2\2VW\7q\2\2WX\7n\2\2XY\7g\2\2YZ\7c\2"+
		"\2Z\\\7p\2\2[Q\3\2\2\2[T\3\2\2\2\\\4\3\2\2\2]c\7?\2\2^_\7-\2\2_c\7?\2"+
		"\2`a\7/\2\2ac\7?\2\2b]\3\2\2\2b^\3\2\2\2b`\3\2\2\2c\6\3\2\2\2de\t\2\2"+
		"\2e\b\3\2\2\2fl\t\3\2\2gh\7>\2\2hl\7?\2\2ij\7@\2\2jl\7?\2\2kf\3\2\2\2"+
		"kg\3\2\2\2ki\3\2\2\2l\n\3\2\2\2mn\7?\2\2nr\7?\2\2op\7#\2\2pr\7?\2\2qm"+
		"\3\2\2\2qo\3\2\2\2r\f\3\2\2\2st\7(\2\2tx\7(\2\2uv\7~\2\2vx\7~\2\2ws\3"+
		"\2\2\2wu\3\2\2\2x\16\3\2\2\2y\u00be\5\3\2\2z{\7d\2\2{|\7t\2\2|}\7g\2\2"+
		"}~\7c\2\2~\u00be\7m\2\2\177\u0080\7e\2\2\u0080\u0081\7c\2\2\u0081\u0082"+
		"\7u\2\2\u0082\u00be\7g\2\2\u0083\u0084\7e\2\2\u0084\u0085\7c\2\2\u0085"+
		"\u0086\7n\2\2\u0086\u0087\7n\2\2\u0087\u0088\7q\2\2\u0088\u0089\7w\2\2"+
		"\u0089\u00be\7v\2\2\u008a\u008b\7e\2\2\u008b\u008c\7q\2\2\u008c\u008d"+
		"\7p\2\2\u008d\u008e\7v\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090"+
		"\u0091\7w\2\2\u0091\u00be\7g\2\2\u0092\u0093\7e\2\2\u0093\u0094\7n\2\2"+
		"\u0094\u0095\7c\2\2\u0095\u0096\7u\2\2\u0096\u00be\7u\2\2\u0097\u0098"+
		"\7g\2\2\u0098\u0099\7n\2\2\u0099\u009a\7u\2\2\u009a\u00be\7g\2\2\u009b"+
		"\u009c\7h\2\2\u009c\u009d\7c\2\2\u009d\u009e\7n\2\2\u009e\u009f\7u\2\2"+
		"\u009f\u00be\7g\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7q\2\2\u00a2\u00be"+
		"\7t\2\2\u00a3\u00a4\7k\2\2\u00a4\u00be\7h\2\2\u00a5\u00a6\7k\2\2\u00a6"+
		"\u00a7\7p\2\2\u00a7\u00be\7v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2"+
		"\u00aa\u00ab\7v\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7t\2\2\u00ad\u00be"+
		"\7p\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7w\2\2\u00b1"+
		"\u00be\7g\2\2\u00b2\u00b3\7x\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7k\2\2"+
		"\u00b5\u00be\7f\2\2\u00b6\u00b7\7r\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9"+
		"\7q\2\2\u00b9\u00ba\7i\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7c\2\2\u00bc"+
		"\u00be\7o\2\2\u00bdy\3\2\2\2\u00bdz\3\2\2\2\u00bd\177\3\2\2\2\u00bd\u0083"+
		"\3\2\2\2\u00bd\u008a\3\2\2\2\u00bd\u0092\3\2\2\2\u00bd\u0097\3\2\2\2\u00bd"+
		"\u009b\3\2\2\2\u00bd\u00a0\3\2\2\2\u00bd\u00a3\3\2\2\2\u00bd\u00a5\3\2"+
		"\2\2\u00bd\u00a8\3\2\2\2\u00bd\u00ae\3\2\2\2\u00bd\u00b2\3\2\2\2\u00bd"+
		"\u00b6\3\2\2\2\u00be\20\3\2\2\2\u00bf\u00c0\7\62\2\2\u00c0\u00c1\7z\2"+
		"\2\u00c1\u00c2\3\2\2\2\u00c2\u00c6\5\35\17\2\u00c3\u00c5\5\35\17\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\22\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cd\5\37\20\2\u00ca"+
		"\u00cd\5%\23\2\u00cb\u00cd\5#\22\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cb\3\2\2\2\u00cd\24\3\2\2\2\u00ce\u00d2\5\31\r\2\u00cf\u00d1"+
		"\5\27\f\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d3\26\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8"+
		"\5\31\r\2\u00d6\u00d8\5\33\16\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2"+
		"\2\u00d8\30\3\2\2\2\u00d9\u00da\t\4\2\2\u00da\32\3\2\2\2\u00db\u00dc\4"+
		"\62;\2\u00dc\34\3\2\2\2\u00dd\u00e0\5\33\16\2\u00de\u00e0\t\5\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\36\3\2\2\2\u00e1\u00e6\5!\21"+
		"\2\u00e2\u00e6\5\21\t\2\u00e3\u00e4\7/\2\2\u00e4\u00e6\5!\21\2\u00e5\u00e1"+
		"\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6 \3\2\2\2\u00e7"+
		"\u00e9\5\33\16\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\"\3\2\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee"+
		"\7t\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f6\7g\2\2\u00f0\u00f1\7h\2\2\u00f1"+
		"\u00f2\7c\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f6\7g\2\2"+
		"\u00f5\u00ec\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f6$\3\2\2\2\u00f7\u00f8\7"+
		")\2\2\u00f8\u00f9\5)\25\2\u00f9\u00fa\7)\2\2\u00fa&\3\2\2\2\u00fb\u00ff"+
		"\7$\2\2\u00fc\u00fe\5)\25\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0102\u0103\7$\2\2\u0103(\3\2\2\2\u0104\u0107\t\6\2\2\u0105\u0107"+
		"\5\33\16\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107*\3\2\2\2\u0108"+
		"\u0109\7e\2\2\u0109\u010a\7n\2\2\u010a\u010b\7c\2\2\u010b\u010c\7u\2\2"+
		"\u010c\u010d\7u\2\2\u010d,\3\2\2\2\u010e\u010f\t\7\2\2\u010f.\3\2\2\2"+
		"\u0110\u0111\7\61\2\2\u0111\u0112\7\61\2\2\u0112\60\3\2\2\2\u0113\u0114"+
		"\7^\2\2\u0114\62\3\2\2\2\u0115\u0116\7\60\2\2\u0116\64\3\2\2\2\u0117\u0118"+
		"\7$\2\2\u0118\66\3\2\2\2\u0119\u011a\7)\2\2\u011a8\3\2\2\2\u011b\u011c"+
		"\7}\2\2\u011c:\3\2\2\2\u011d\u011e\7\177\2\2\u011e<\3\2\2\2\u011f\u0120"+
		"\7*\2\2\u0120>\3\2\2\2\u0121\u0122\7+\2\2\u0122@\3\2\2\2\u0123\u0124\7"+
		"]\2\2\u0124B\3\2\2\2\u0125\u0126\7_\2\2\u0126D\3\2\2\2\u0127\u0128\7."+
		"\2\2\u0128F\3\2\2\2\u0129\u012a\7=\2\2\u012aH\3\2\2\2\u012b\u012c\7?\2"+
		"\2\u012cJ\3\2\2\2\u012d\u012e\7/\2\2\u012eL\3\2\2\2\u012f\u0130\7#\2\2"+
		"\u0130N\3\2\2\2\u0131\u0135\t\b\2\2\u0132\u0133\7\62\2\2\u0133\u0135\7"+
		"z\2\2\u0134\u0131\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\b("+
		"\2\2\u0139P\3\2\2\2\25\2[bkqw\u00bd\u00c6\u00cc\u00d2\u00d7\u00df\u00e5"+
		"\u00ea\u00f5\u00ff\u0106\u0134\u0136";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}