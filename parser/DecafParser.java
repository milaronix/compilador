// Generated from parser/DecafParser.g by ANTLR 4.0

	package compiler.parser;
	import org.antlr.v4.runtime.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALPHA_NUM=10, DIAG_INV=23, INT_LITERAL=14, A_PARENTESIS=28, EQ_OP=5, MENOS=35, 
		ARITH_OP=3, A_CORCHETE=30, CHAR=20, CLASE=21, HEX_DIGIT=13, C_CORCHETE=31, 
		LITERAL=8, BOOL_LITERAL=17, COND_OP=6, ID=9, COMA=32, ALPHA=11, TYPE=1, 
		ASSIGN_OP=2, PUNTO=24, SIMBOLOS=22, WS=37, STRING_LITERAL=19, RESERVADA=7, 
		CHAR_LITERAL=18, REL_OP=4, COMILLAS=25, PYCOMA=33, HEX_LITERAL=16, ADMIRACION=36, 
		IGUAL=34, A_LLAVE=26, DIGIT=12, C_LLAVE=27, DECIMAL_LITERAL=15, C_PARENTESIS=29;
	public static final String[] tokenNames = {
		"<INVALID>", "TYPE", "ASSIGN_OP", "ARITH_OP", "REL_OP", "EQ_OP", "COND_OP", 
		"RESERVADA", "LITERAL", "ID", "ALPHA_NUM", "ALPHA", "DIGIT", "HEX_DIGIT", 
		"INT_LITERAL", "DECIMAL_LITERAL", "HEX_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", 
		"STRING_LITERAL", "CHAR", "CLASE", "SIMBOLOS", "'\\'", "'.'", "'\"'", 
		"A_LLAVE", "C_LLAVE", "A_PARENTESIS", "C_PARENTESIS", "A_CORCHETE", "C_CORCHETE", 
		"COMA", "PYCOMA", "IGUAL", "MENOS", "ADMIRACION", "WS"
	};
	public static final int
		RULE_program = 0, RULE_field_decl = 1, RULE_method_decl = 2, RULE_block = 3, 
		RULE_var_decl = 4, RULE_statement = 5, RULE_method_call = 6, RULE_location = 7, 
		RULE_expr = 8, RULE_callout_arg = 9, RULE_bin_op = 10;
	public static final String[] ruleNames = {
		"program", "field_decl", "method_decl", "block", "var_decl", "statement", 
		"method_call", "location", "expr", "callout_arg", "bin_op"
	};

	@Override
	public String getGrammarFileName() { return "DecafParser.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public TerminalNode A_LLAVE() { return getToken(DecafParser.A_LLAVE, 0); }
		public TerminalNode RESERVADA() { return getToken(DecafParser.RESERVADA, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode C_LLAVE() { return getToken(DecafParser.C_LLAVE, 0); }
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(22); match(RESERVADA);
			setState(23); match(ID);
			setState(24); match(A_LLAVE);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE || _la==RESERVADA) {
				{
				setState(27);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(25); field_decl();
					}
					break;

				case 2:
					{
					setState(26); method_decl();
					}
					break;
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32); match(C_LLAVE);
			}
			System.out.println("program");
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

	public static class Field_declContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL(int i) {
			return getToken(DecafParser.INT_LITERAL, i);
		}
		public List<TerminalNode> C_CORCHETE() { return getTokens(DecafParser.C_CORCHETE); }
		public List<TerminalNode> INT_LITERAL() { return getTokens(DecafParser.INT_LITERAL); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public TerminalNode COMA(int i) {
			return getToken(DecafParser.COMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public List<TerminalNode> COMA() { return getTokens(DecafParser.COMA); }
		public TerminalNode A_CORCHETE(int i) {
			return getToken(DecafParser.A_CORCHETE, i);
		}
		public TerminalNode PYCOMA() { return getToken(DecafParser.PYCOMA, 0); }
		public TerminalNode C_CORCHETE(int i) {
			return getToken(DecafParser.C_CORCHETE, i);
		}
		public List<TerminalNode> A_CORCHETE() { return getTokens(DecafParser.A_CORCHETE); }
		public TerminalNode TYPE() { return getToken(DecafParser.TYPE, 0); }
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(36); match(TYPE);
			setState(42);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(37); match(ID);
				}
				break;

			case 2:
				{
				setState(38); match(ID);
				setState(39); match(A_CORCHETE);
				setState(40); match(INT_LITERAL);
				setState(41); match(C_CORCHETE);
				}
				break;
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(49);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(44); match(ID);
					}
					break;

				case 2:
					{
					setState(45); match(ID);
					setState(46); match(A_CORCHETE);
					setState(47); match(INT_LITERAL);
					setState(48); match(C_CORCHETE);
					}
					break;
				}
				setState(51); match(COMA);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57); match(PYCOMA);
			}
			System.out.println("field_decl");
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

	public static class Method_declContext extends ParserRuleContext {
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public TerminalNode A_PARENTESIS() { return getToken(DecafParser.A_PARENTESIS, 0); }
		public TerminalNode RESERVADA() { return getToken(DecafParser.RESERVADA, 0); }
		public TerminalNode COMA(int i) {
			return getToken(DecafParser.COMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public List<TerminalNode> COMA() { return getTokens(DecafParser.COMA); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TYPE(int i) {
			return getToken(DecafParser.TYPE, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(DecafParser.TYPE); }
		public TerminalNode C_PARENTESIS() { return getToken(DecafParser.C_PARENTESIS, 0); }
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==RESERVADA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(62); match(ID);
			setState(63); match(A_PARENTESIS);
			setState(66); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(64); match(TYPE);
					setState(65); match(ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(68); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(70); match(TYPE);
				setState(71); match(ID);
				setState(72); match(COMA);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78); match(C_PARENTESIS);
			setState(79); block();
			System.out.println("method_decl");
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode A_LLAVE() { return getToken(DecafParser.A_LLAVE, 0); }
		public TerminalNode C_LLAVE() { return getToken(DecafParser.C_LLAVE, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(A_LLAVE);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(83); var_decl();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVADA) | (1L << ID) | (1L << A_LLAVE))) != 0)) {
				{
				{
				setState(89); statement();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95); match(C_LLAVE);
			System.out.println("block");
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public TerminalNode COMA(int i) {
			return getToken(DecafParser.COMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public List<TerminalNode> COMA() { return getTokens(DecafParser.COMA); }
		public TerminalNode PYCOMA() { return getToken(DecafParser.PYCOMA, 0); }
		public TerminalNode TYPE() { return getToken(DecafParser.TYPE, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(TYPE);
			setState(99); match(ID);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(100); match(COMA);
				setState(101); match(ID);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107); match(PYCOMA);
			System.out.println("var_decl");
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ASSIGN_OP() { return getToken(DecafParser.ASSIGN_OP, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode A_PARENTESIS() { return getToken(DecafParser.A_PARENTESIS, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public List<TerminalNode> RESERVADA() { return getTokens(DecafParser.RESERVADA); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode RESERVADA(int i) {
			return getToken(DecafParser.RESERVADA, i);
		}
		public TerminalNode PYCOMA() { return getToken(DecafParser.PYCOMA, 0); }
		public TerminalNode A_CORCHETE() { return getToken(DecafParser.A_CORCHETE, 0); }
		public TerminalNode C_CORCHETE() { return getToken(DecafParser.C_CORCHETE, 0); }
		public TerminalNode IGUAL() { return getToken(DecafParser.IGUAL, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMA() { return getToken(DecafParser.COMA, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode C_PARENTESIS() { return getToken(DecafParser.C_PARENTESIS, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110); location();
				setState(111); match(ASSIGN_OP);
				setState(112); expr(0);
				setState(113); match(PYCOMA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); method_call();
				setState(116); match(PYCOMA);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118); match(RESERVADA);
				setState(119); match(A_PARENTESIS);
				setState(120); expr(0);
				setState(121); match(C_PARENTESIS);
				setState(122); block();
				{
				setState(123); match(RESERVADA);
				setState(124); block();
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126); match(RESERVADA);
				setState(127); match(ID);
				setState(128); match(IGUAL);
				setState(129); expr(0);
				setState(130); match(COMA);
				setState(131); expr(0);
				setState(132); block();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134); match(RESERVADA);
				setState(135); match(A_CORCHETE);
				setState(136); expr(0);
				setState(137); match(C_CORCHETE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(139); match(RESERVADA);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(140); match(RESERVADA);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(141); block();
				System.out.println("statement");
				}
				break;
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

	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(DecafParser.STRING_LITERAL, 0); }
		public TerminalNode A_PARENTESIS() { return getToken(DecafParser.A_PARENTESIS, 0); }
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public TerminalNode RESERVADA() { return getToken(DecafParser.RESERVADA, 0); }
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMA(int i) {
			return getToken(DecafParser.COMA, i);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public List<TerminalNode> COMA() { return getTokens(DecafParser.COMA); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode C_PARENTESIS() { return getToken(DecafParser.C_PARENTESIS, 0); }
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_method_call);
		int _la;
		try {
			setState(169);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(146); match(ID);
				setState(147); match(A_PARENTESIS);
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(149);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVADA) | (1L << LITERAL) | (1L << ID) | (1L << A_PARENTESIS) | (1L << MENOS) | (1L << ADMIRACION))) != 0)) {
						{
						setState(148); expr(0);
						}
					}

					setState(151); match(COMA);
					}
					}
					setState(154); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVADA) | (1L << LITERAL) | (1L << ID) | (1L << A_PARENTESIS) | (1L << COMA) | (1L << MENOS) | (1L << ADMIRACION))) != 0) );
				setState(156); match(C_PARENTESIS);
				}
				break;
			case RESERVADA:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); match(RESERVADA);
				setState(158); match(A_PARENTESIS);
				setState(159); match(STRING_LITERAL);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(160); match(COMA);
					{
					setState(161); callout_arg();
					}
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167); match(C_PARENTESIS);
				System.out.println("method_call");
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode C_CORCHETE() { return getToken(DecafParser.C_CORCHETE, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode A_CORCHETE() { return getToken(DecafParser.A_CORCHETE, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_location);
		try {
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172); match(ID);
				setState(173); match(A_CORCHETE);
				setState(174); expr(0);
				setState(175); match(C_CORCHETE);
				System.out.println("location");
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public TerminalNode LITERAL() { return getToken(DecafParser.LITERAL, 0); }
		public TerminalNode A_PARENTESIS() { return getToken(DecafParser.A_PARENTESIS, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode ADMIRACION() { return getToken(DecafParser.ADMIRACION, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode MENOS() { return getToken(DecafParser.MENOS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public TerminalNode C_PARENTESIS() { return getToken(DecafParser.C_PARENTESIS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(181); match(MENOS);
				setState(182); expr(3);
				}
				break;

			case 2:
				{
				setState(183); match(ADMIRACION);
				setState(184); expr(2);
				}
				break;

			case 3:
				{
				setState(185); location();
				}
				break;

			case 4:
				{
				setState(186); method_call();
				}
				break;

			case 5:
				{
				setState(187); match(LITERAL);
				}
				break;

			case 6:
				{
				setState(188); match(A_PARENTESIS);
				setState(189); expr(0);
				setState(190); match(C_PARENTESIS);
				System.out.println("expr");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(195);
					if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
					setState(196); bin_op();
					setState(197); expr(0);
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Callout_argContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(DecafParser.STRING_LITERAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCallout_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCallout_arg(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_callout_arg);
		try {
			setState(207);
			switch (_input.LA(1)) {
			case RESERVADA:
			case LITERAL:
			case ID:
			case A_PARENTESIS:
			case MENOS:
			case ADMIRACION:
				enterOuterAlt(_localctx, 1);
				{
				setState(204); expr(0);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); match(STRING_LITERAL);
				System.out.println("callout_arg");
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Bin_opContext extends ParserRuleContext {
		public TerminalNode EQ_OP() { return getToken(DecafParser.EQ_OP, 0); }
		public TerminalNode COND_OP() { return getToken(DecafParser.COND_OP, 0); }
		public TerminalNode REL_OP() { return getToken(DecafParser.REL_OP, 0); }
		public TerminalNode ARITH_OP() { return getToken(DecafParser.ARITH_OP, 0); }
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBin_op(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bin_op);
		try {
			setState(214);
			switch (_input.LA(1)) {
			case ARITH_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(209); match(ARITH_OP);
				}
				break;
			case REL_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(210); match(REL_OP);
				}
				break;
			case EQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(211); match(EQ_OP);
				}
				break;
			case COND_OP:
				enterOuterAlt(_localctx, 4);
				{
				setState(212); match(COND_OP);
				System.out.println("bin_op");
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 4 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3\'\u00db\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\7\2\36\n\2\f\2\16"+
		"\2!\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\64\n\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\6\4E\n\4\r\4\16\4F\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\7\5]\n\5\f\5\16"+
		"\5`\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u0093\n\7\3\b\3\b\3\b\5\b\u0098\n\b\3\b\6\b\u009b\n\b\r\b\16\b\u009c"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a5\n\b\f\b\16\b\u00a8\13\b\3\b\3\b\5\b"+
		"\u00ac\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b5\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c4\n\n\3\n\3\n\3\n\3\n\7\n\u00ca"+
		"\n\n\f\n\16\n\u00cd\13\n\3\13\3\13\3\13\5\13\u00d2\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00d9\n\f\3\f\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\4\3\3\t\t"+
		"\u00ef\2\30\3\2\2\2\4&\3\2\2\2\6?\3\2\2\2\bT\3\2\2\2\nd\3\2\2\2\f\u0092"+
		"\3\2\2\2\16\u00ab\3\2\2\2\20\u00b4\3\2\2\2\22\u00c3\3\2\2\2\24\u00d1\3"+
		"\2\2\2\26\u00d8\3\2\2\2\30\31\7\t\2\2\31\32\7\13\2\2\32\37\7\34\2\2\33"+
		"\36\5\4\3\2\34\36\5\6\4\2\35\33\3\2\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\35\2\2#$\3\2\2\2$%\b"+
		"\2\1\2%\3\3\2\2\2&,\7\3\2\2\'-\7\13\2\2()\7\13\2\2)*\7 \2\2*+\7\20\2\2"+
		"+-\7!\2\2,\'\3\2\2\2,(\3\2\2\2-8\3\2\2\2.\64\7\13\2\2/\60\7\13\2\2\60"+
		"\61\7 \2\2\61\62\7\20\2\2\62\64\7!\2\2\63.\3\2\2\2\63/\3\2\2\2\64\65\3"+
		"\2\2\2\65\67\7\"\2\2\66\63\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29"+
		";\3\2\2\2:8\3\2\2\2;<\7#\2\2<=\3\2\2\2=>\b\3\1\2>\5\3\2\2\2?@\t\2\2\2"+
		"@A\7\13\2\2AD\7\36\2\2BC\7\3\2\2CE\7\13\2\2DB\3\2\2\2EF\3\2\2\2FD\3\2"+
		"\2\2FG\3\2\2\2GM\3\2\2\2HI\7\3\2\2IJ\7\13\2\2JL\7\"\2\2KH\3\2\2\2LO\3"+
		"\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\37\2\2QR\5\b\5\2RS"+
		"\b\4\1\2S\7\3\2\2\2TX\7\34\2\2UW\5\n\6\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2Y^\3\2\2\2ZX\3\2\2\2[]\5\f\7\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2"+
		"\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\35\2\2bc\b\5\1\2c\t\3\2\2\2de\7\3"+
		"\2\2ej\7\13\2\2fg\7\"\2\2gi\7\13\2\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3"+
		"\2\2\2km\3\2\2\2lj\3\2\2\2mn\7#\2\2no\b\6\1\2o\13\3\2\2\2pq\5\20\t\2q"+
		"r\7\4\2\2rs\5\22\n\2st\7#\2\2t\u0093\3\2\2\2uv\5\16\b\2vw\7#\2\2w\u0093"+
		"\3\2\2\2xy\7\t\2\2yz\7\36\2\2z{\5\22\n\2{|\7\37\2\2|}\5\b\5\2}~\7\t\2"+
		"\2~\177\5\b\5\2\177\u0093\3\2\2\2\u0080\u0081\7\t\2\2\u0081\u0082\7\13"+
		"\2\2\u0082\u0083\7$\2\2\u0083\u0084\5\22\n\2\u0084\u0085\7\"\2\2\u0085"+
		"\u0086\5\22\n\2\u0086\u0087\5\b\5\2\u0087\u0093\3\2\2\2\u0088\u0089\7"+
		"\t\2\2\u0089\u008a\7 \2\2\u008a\u008b\5\22\n\2\u008b\u008c\7!\2\2\u008c"+
		"\u0093\3\2\2\2\u008d\u0093\7\t\2\2\u008e\u0093\7\t\2\2\u008f\u0090\5\b"+
		"\5\2\u0090\u0091\b\7\1\2\u0091\u0093\3\2\2\2\u0092p\3\2\2\2\u0092u\3\2"+
		"\2\2\u0092x\3\2\2\2\u0092\u0080\3\2\2\2\u0092\u0088\3\2\2\2\u0092\u008d"+
		"\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0093\r\3\2\2\2\u0094"+
		"\u0095\7\13\2\2\u0095\u009a\7\36\2\2\u0096\u0098\5\22\n\2\u0097\u0096"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\7\"\2\2\u009a"+
		"\u0097\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u00ac\7\37\2\2\u009f\u00a0\7\t\2\2\u00a0"+
		"\u00a1\7\36\2\2\u00a1\u00a6\7\25\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a5\5"+
		"\24\13\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\37"+
		"\2\2\u00aa\u00ac\b\b\1\2\u00ab\u0094\3\2\2\2\u00ab\u009f\3\2\2\2\u00ac"+
		"\17\3\2\2\2\u00ad\u00b5\7\13\2\2\u00ae\u00af\7\13\2\2\u00af\u00b0\7 \2"+
		"\2\u00b0\u00b1\5\22\n\2\u00b1\u00b2\7!\2\2\u00b2\u00b3\b\t\1\2\u00b3\u00b5"+
		"\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b5\21\3\2\2\2\u00b6"+
		"\u00b7\b\n\1\2\u00b7\u00b8\7%\2\2\u00b8\u00c4\5\22\n\2\u00b9\u00ba\7&"+
		"\2\2\u00ba\u00c4\5\22\n\2\u00bb\u00c4\5\20\t\2\u00bc\u00c4\5\16\b\2\u00bd"+
		"\u00c4\7\n\2\2\u00be\u00bf\7\36\2\2\u00bf\u00c0\5\22\n\2\u00c0\u00c1\7"+
		"\37\2\2\u00c1\u00c2\b\n\1\2\u00c2\u00c4\3\2\2\2\u00c3\u00b6\3\2\2\2\u00c3"+
		"\u00b9\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c3\u00bd\3\2"+
		"\2\2\u00c3\u00be\3\2\2\2\u00c4\u00cb\3\2\2\2\u00c5\u00c6\6\n\2\3\u00c6"+
		"\u00c7\5\26\f\2\u00c7\u00c8\5\22\n\2\u00c8\u00ca\3\2\2\2\u00c9\u00c5\3"+
		"\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\23\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d2\5\22\n\2\u00cf\u00d0\7\25"+
		"\2\2\u00d0\u00d2\b\13\1\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\25\3\2\2\2\u00d3\u00d9\7\5\2\2\u00d4\u00d9\7\6\2\2\u00d5\u00d9\7\7\2"+
		"\2\u00d6\u00d7\7\b\2\2\u00d7\u00d9\b\f\1\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4"+
		"\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\27\3\2\2\2\26\35"+
		"\37,\638FMX^j\u0092\u0097\u009c\u00a6\u00ab\u00b4\u00c3\u00cb\u00d1\u00d8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}