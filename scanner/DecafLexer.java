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
		TYPE=1, ASSIGN_OP=2, ARITH_OP_2=3, ARITH_OP_1=4, REL_OP=5, EQ_OP=6, COND_OP_1=7, 
		COND_OP_2=8, RESERVADA=9, HEX_LITERAL=10, LITERAL=11, ID=12, ALPHA_NUM=13, 
		ALPHA=14, DIGIT=15, HEX_DIGIT=16, INT_LITERAL=17, DECIMAL_LITERAL=18, 
		BOOL_LITERAL=19, CHAR_LITERAL=20, STRING_LITERAL=21, CHAR=22, CLASE=23, 
		SIMBOLOS=24, D_DIAG=25, DIAG_INV=26, PUNTO=27, COMILLAS=28, COMILLA=29, 
		A_LLAVE=30, C_LLAVE=31, A_PARENTESIS=32, C_PARENTESIS=33, A_CORCHETE=34, 
		C_CORCHETE=35, COMA=36, PYCOMA=37, IGUAL=38, MENOS=39, ADMIRACION=40, 
		WS=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"TYPE", "ASSIGN_OP", "ARITH_OP_2", "ARITH_OP_1", "REL_OP", "EQ_OP", "'&&'", 
		"'||'", "RESERVADA", "HEX_LITERAL", "LITERAL", "ID", "ALPHA_NUM", "ALPHA", 
		"DIGIT", "HEX_DIGIT", "INT_LITERAL", "DECIMAL_LITERAL", "BOOL_LITERAL", 
		"CHAR_LITERAL", "STRING_LITERAL", "CHAR", "CLASE", "SIMBOLOS", "'//'", 
		"'\\'", "'.'", "'\"'", "'''", "A_LLAVE", "C_LLAVE", "A_PARENTESIS", "C_PARENTESIS", 
		"A_CORCHETE", "C_CORCHETE", "COMA", "PYCOMA", "IGUAL", "MENOS", "ADMIRACION", 
		"WS"
	};
	public static final String[] ruleNames = {
		"TYPE", "ASSIGN_OP", "ARITH_OP_2", "ARITH_OP_1", "REL_OP", "EQ_OP", "COND_OP_1", 
		"COND_OP_2", "RESERVADA", "HEX_LITERAL", "LITERAL", "ID", "ALPHA_NUM", 
		"ALPHA", "DIGIT", "HEX_DIGIT", "INT_LITERAL", "DECIMAL_LITERAL", "BOOL_LITERAL", 
		"CHAR_LITERAL", "STRING_LITERAL", "CHAR", "CLASE", "SIMBOLOS", "D_DIAG", 
		"DIAG_INV", "PUNTO", "COMILLAS", "COMILLA", "A_LLAVE", "C_LLAVE", "A_PARENTESIS", 
		"C_PARENTESIS", "A_CORCHETE", "C_CORCHETE", "COMA", "PYCOMA", "IGUAL", 
		"MENOS", "ADMIRACION", "WS"
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
		case 40: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip(); break;
		}
	}

	public static final String _serializedATN =
		"\2\4+\u0140\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2`\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\5\3g\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6r\n\6"+
		"\3\7\3\7\3\7\3\7\5\7x\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c4\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u00cb\n\13\f\13\16\13\u00ce\13\13\3\f\3\f\3\f\5\f\u00d3"+
		"\n\f\3\r\3\r\7\r\u00d7\n\r\f\r\16\r\u00da\13\r\3\16\3\16\5\16\u00de\n"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u00e6\n\21\3\22\3\22\3\22\3\22"+
		"\5\22\u00ec\n\22\3\23\6\23\u00ef\n\23\r\23\16\23\u00f0\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00fc\n\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\7\26\u0104\n\26\f\26\16\26\u0107\13\26\3\26\3\26\3\27\3\27\5\27"+
		"\u010d\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\6*\u013b\n*\r*\16*\u013c"+
		"\3*\3*\2+\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25"+
		"\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)"+
		"\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= "+
		"\1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\2\3\2\n\5\'\'--//\4,,\61"+
		"\61\4>>@@\5C\\aac|\4CHch\4C\\c|\7##&(AA\u00a3\u00a3\u00c1\u00c1\5\13\f"+
		"\17\17\"\"\u0161\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\3_\3\2\2\2\5f\3\2\2\2\7h\3\2\2\2\tj\3\2\2\2\13q\3\2\2"+
		"\2\rw\3\2\2\2\17y\3\2\2\2\21|\3\2\2\2\23\u00c3\3\2\2\2\25\u00c5\3\2\2"+
		"\2\27\u00d2\3\2\2\2\31\u00d4\3\2\2\2\33\u00dd\3\2\2\2\35\u00df\3\2\2\2"+
		"\37\u00e1\3\2\2\2!\u00e5\3\2\2\2#\u00eb\3\2\2\2%\u00ee\3\2\2\2\'\u00fb"+
		"\3\2\2\2)\u00fd\3\2\2\2+\u0101\3\2\2\2-\u010c\3\2\2\2/\u010e\3\2\2\2\61"+
		"\u0114\3\2\2\2\63\u0116\3\2\2\2\65\u0119\3\2\2\2\67\u011b\3\2\2\29\u011d"+
		"\3\2\2\2;\u011f\3\2\2\2=\u0121\3\2\2\2?\u0123\3\2\2\2A\u0125\3\2\2\2C"+
		"\u0127\3\2\2\2E\u0129\3\2\2\2G\u012b\3\2\2\2I\u012d\3\2\2\2K\u012f\3\2"+
		"\2\2M\u0131\3\2\2\2O\u0133\3\2\2\2Q\u0135\3\2\2\2S\u013a\3\2\2\2UV\7k"+
		"\2\2VW\7p\2\2W`\7v\2\2XY\7d\2\2YZ\7q\2\2Z[\7q\2\2[\\\7n\2\2\\]\7g\2\2"+
		"]^\7c\2\2^`\7p\2\2_U\3\2\2\2_X\3\2\2\2`\4\3\2\2\2ag\7?\2\2bc\7-\2\2cg"+
		"\7?\2\2de\7/\2\2eg\7?\2\2fa\3\2\2\2fb\3\2\2\2fd\3\2\2\2g\6\3\2\2\2hi\t"+
		"\2\2\2i\b\3\2\2\2jk\t\3\2\2k\n\3\2\2\2lr\t\4\2\2mn\7>\2\2nr\7?\2\2op\7"+
		"@\2\2pr\7?\2\2ql\3\2\2\2qm\3\2\2\2qo\3\2\2\2r\f\3\2\2\2st\7?\2\2tx\7?"+
		"\2\2uv\7#\2\2vx\7?\2\2ws\3\2\2\2wu\3\2\2\2x\16\3\2\2\2yz\7(\2\2z{\7(\2"+
		"\2{\20\3\2\2\2|}\7~\2\2}~\7~\2\2~\22\3\2\2\2\177\u00c4\5\3\2\2\u0080\u0081"+
		"\7d\2\2\u0081\u0082\7t\2\2\u0082\u0083\7g\2\2\u0083\u0084\7c\2\2\u0084"+
		"\u00c4\7m\2\2\u0085\u0086\7e\2\2\u0086\u0087\7c\2\2\u0087\u0088\7u\2\2"+
		"\u0088\u00c4\7g\2\2\u0089\u008a\7e\2\2\u008a\u008b\7c\2\2\u008b\u008c"+
		"\7n\2\2\u008c\u008d\7n\2\2\u008d\u008e\7q\2\2\u008e\u008f\7w\2\2\u008f"+
		"\u00c4\7v\2\2\u0090\u0091\7e\2\2\u0091\u0092\7q\2\2\u0092\u0093\7p\2\2"+
		"\u0093\u0094\7v\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096\u0097"+
		"\7w\2\2\u0097\u00c4\7g\2\2\u0098\u0099\7e\2\2\u0099\u009a\7n\2\2\u009a"+
		"\u009b\7c\2\2\u009b\u009c\7u\2\2\u009c\u00c4\7u\2\2\u009d\u009e\7g\2\2"+
		"\u009e\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0\u00c4\7g\2\2\u00a1\u00a2"+
		"\7h\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5"+
		"\u00c4\7g\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7q\2\2\u00a8\u00c4\7t\2\2"+
		"\u00a9\u00aa\7k\2\2\u00aa\u00c4\7h\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad"+
		"\7p\2\2\u00ad\u00c4\7v\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\u00b1\7v\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7t\2\2\u00b3\u00c4\7p\2\2"+
		"\u00b4\u00b5\7v\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7w\2\2\u00b7\u00c4"+
		"\7g\2\2\u00b8\u00b9\7x\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7k\2\2\u00bb"+
		"\u00c4\7f\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7q\2\2"+
		"\u00bf\u00c0\7i\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c4"+
		"\7o\2\2\u00c3\177\3\2\2\2\u00c3\u0080\3\2\2\2\u00c3\u0085\3\2\2\2\u00c3"+
		"\u0089\3\2\2\2\u00c3\u0090\3\2\2\2\u00c3\u0098\3\2\2\2\u00c3\u009d\3\2"+
		"\2\2\u00c3\u00a1\3\2\2\2\u00c3\u00a6\3\2\2\2\u00c3\u00a9\3\2\2\2\u00c3"+
		"\u00ab\3\2\2\2\u00c3\u00ae\3\2\2\2\u00c3\u00b4\3\2\2\2\u00c3\u00b8\3\2"+
		"\2\2\u00c3\u00bc\3\2\2\2\u00c4\24\3\2\2\2\u00c5\u00c6\7\62\2\2\u00c6\u00c7"+
		"\7z\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cc\5!\21\2\u00c9\u00cb\5!\21\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\26\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d3\5#\22\2\u00d0\u00d3"+
		"\5)\25\2\u00d1\u00d3\5\'\24\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2"+
		"\u00d2\u00d1\3\2\2\2\u00d3\30\3\2\2\2\u00d4\u00d8\5\35\17\2\u00d5\u00d7"+
		"\5\33\16\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2"+
		"\u00d8\u00d9\3\2\2\2\u00d9\32\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00de"+
		"\5\35\17\2\u00dc\u00de\5\37\20\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2"+
		"\2\u00de\34\3\2\2\2\u00df\u00e0\t\5\2\2\u00e0\36\3\2\2\2\u00e1\u00e2\4"+
		"\62;\2\u00e2 \3\2\2\2\u00e3\u00e6\5\37\20\2\u00e4\u00e6\t\6\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\"\3\2\2\2\u00e7\u00ec\5%\23\2"+
		"\u00e8\u00ec\5\25\13\2\u00e9\u00ea\7/\2\2\u00ea\u00ec\5%\23\2\u00eb\u00e7"+
		"\3\2\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec$\3\2\2\2\u00ed"+
		"\u00ef\5\37\20\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3"+
		"\2\2\2\u00f0\u00f1\3\2\2\2\u00f1&\3\2\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4"+
		"\7t\2\2\u00f4\u00f5\7w\2\2\u00f5\u00fc\7g\2\2\u00f6\u00f7\7h\2\2\u00f7"+
		"\u00f8\7c\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fc\7g\2\2"+
		"\u00fb\u00f2\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fc(\3\2\2\2\u00fd\u00fe\7"+
		")\2\2\u00fe\u00ff\5-\27\2\u00ff\u0100\7)\2\2\u0100*\3\2\2\2\u0101\u0105"+
		"\7$\2\2\u0102\u0104\5-\27\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u0109\7$\2\2\u0109,\3\2\2\2\u010a\u010d\t\7\2\2\u010b\u010d"+
		"\5\37\20\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d.\3\2\2\2\u010e"+
		"\u010f\7e\2\2\u010f\u0110\7n\2\2\u0110\u0111\7c\2\2\u0111\u0112\7u\2\2"+
		"\u0112\u0113\7u\2\2\u0113\60\3\2\2\2\u0114\u0115\t\b\2\2\u0115\62\3\2"+
		"\2\2\u0116\u0117\7\61\2\2\u0117\u0118\7\61\2\2\u0118\64\3\2\2\2\u0119"+
		"\u011a\7^\2\2\u011a\66\3\2\2\2\u011b\u011c\7\60\2\2\u011c8\3\2\2\2\u011d"+
		"\u011e\7$\2\2\u011e:\3\2\2\2\u011f\u0120\7)\2\2\u0120<\3\2\2\2\u0121\u0122"+
		"\7}\2\2\u0122>\3\2\2\2\u0123\u0124\7\177\2\2\u0124@\3\2\2\2\u0125\u0126"+
		"\7*\2\2\u0126B\3\2\2\2\u0127\u0128\7+\2\2\u0128D\3\2\2\2\u0129\u012a\7"+
		"]\2\2\u012aF\3\2\2\2\u012b\u012c\7_\2\2\u012cH\3\2\2\2\u012d\u012e\7."+
		"\2\2\u012eJ\3\2\2\2\u012f\u0130\7=\2\2\u0130L\3\2\2\2\u0131\u0132\7?\2"+
		"\2\u0132N\3\2\2\2\u0133\u0134\7/\2\2\u0134P\3\2\2\2\u0135\u0136\7#\2\2"+
		"\u0136R\3\2\2\2\u0137\u013b\t\t\2\2\u0138\u0139\7\62\2\2\u0139\u013b\7"+
		"z\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\b*"+
		"\2\2\u013fT\3\2\2\2\24\2_fqw\u00c3\u00cc\u00d2\u00d8\u00dd\u00e5\u00eb"+
		"\u00f0\u00fb\u0105\u010c\u013a\u013c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}