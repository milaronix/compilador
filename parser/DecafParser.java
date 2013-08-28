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
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(22); match(RESERVADA);
			setState(23); match(ID);
			setState(24); match(A_LLAVE);
			setState(28);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(25); field_decl();
					}
					} 
				}
				setState(30);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(31); method_decl();
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(37); var_decl();
			setState(38); match(C_LLAVE);
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
		public TerminalNode INT_LITERAL() { return getToken(DecafParser.INT_LITERAL, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode COMA() { return getToken(DecafParser.COMA, 0); }
		public TerminalNode A_CORCHETE(int i) {
			return getToken(DecafParser.A_CORCHETE, i);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(41); match(TYPE);
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(42); match(ID);
				}
				break;

			case 2:
				{
				setState(43); match(ID);
				setState(44); match(A_CORCHETE);
				setState(45); match(INT_LITERAL);
				setState(46); match(A_CORCHETE);
				}
				break;
			}
			setState(49); match(COMA);
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
		public TerminalNode A_LLAVE() { return getToken(DecafParser.A_LLAVE, 0); }
		public TerminalNode COMA(int i) {
			return getToken(DecafParser.COMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public List<TerminalNode> COMA() { return getTokens(DecafParser.COMA); }
		public TerminalNode C_LLAVE() { return getToken(DecafParser.C_LLAVE, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==RESERVADA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(54); match(ID);
			setState(55); match(A_PARENTESIS);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56); match(TYPE);
				setState(58);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(57); match(ID);
					}
				}

				setState(60); match(COMA);
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE );
			setState(65); match(C_PARENTESIS);
			setState(66); match(A_LLAVE);
			setState(67); block();
			setState(68); match(C_LLAVE);
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
			setState(71); match(A_LLAVE);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(72); var_decl();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVADA) | (1L << ID) | (1L << A_LLAVE))) != 0)) {
				{
				{
				setState(78); statement();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84); match(C_LLAVE);
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
			setState(87); match(TYPE);
			setState(88); match(ID);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(89); match(COMA);
				setState(90); match(ID);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96); match(PYCOMA);
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
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99); location();
				setState(100); match(ASSIGN_OP);
				setState(101); expr(0);
				setState(102); match(PYCOMA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); method_call();
				setState(105); match(PYCOMA);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); match(RESERVADA);
				setState(108); match(A_PARENTESIS);
				setState(109); expr(0);
				setState(110); match(C_PARENTESIS);
				setState(111); block();
				{
				setState(112); match(RESERVADA);
				setState(113); block();
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115); match(RESERVADA);
				setState(116); match(ID);
				setState(117); match(IGUAL);
				setState(118); expr(0);
				setState(119); match(COMA);
				setState(120); expr(0);
				setState(121); block();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123); match(RESERVADA);
				setState(124); match(A_CORCHETE);
				setState(125); expr(0);
				setState(126); match(C_CORCHETE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(128); match(RESERVADA);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(129); match(RESERVADA);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(130); block();
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
			setState(158);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(135); match(ID);
				setState(136); match(A_PARENTESIS);
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVADA) | (1L << LITERAL) | (1L << ID) | (1L << A_PARENTESIS) | (1L << MENOS) | (1L << ADMIRACION))) != 0)) {
						{
						setState(137); expr(0);
						}
					}

					setState(140); match(COMA);
					}
					}
					setState(143); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVADA) | (1L << LITERAL) | (1L << ID) | (1L << A_PARENTESIS) | (1L << COMA) | (1L << MENOS) | (1L << ADMIRACION))) != 0) );
				setState(145); match(C_PARENTESIS);
				}
				break;
			case RESERVADA:
				enterOuterAlt(_localctx, 2);
				{
				setState(146); match(RESERVADA);
				setState(147); match(A_PARENTESIS);
				setState(148); match(STRING_LITERAL);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(149); match(COMA);
					{
					setState(150); callout_arg();
					}
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156); match(C_PARENTESIS);
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
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161); match(ID);
				setState(162); match(A_CORCHETE);
				setState(163); expr(0);
				setState(164); match(C_CORCHETE);
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
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(170); match(MENOS);
				setState(171); expr(3);
				}
				break;

			case 2:
				{
				setState(172); match(ADMIRACION);
				setState(173); expr(2);
				}
				break;

			case 3:
				{
				setState(174); location();
				}
				break;

			case 4:
				{
				setState(175); method_call();
				}
				break;

			case 5:
				{
				setState(176); match(LITERAL);
				}
				break;

			case 6:
				{
				setState(177); match(A_PARENTESIS);
				setState(178); expr(0);
				setState(179); match(C_PARENTESIS);
				System.out.println("expr");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(184);
					if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
					setState(185); bin_op();
					setState(186); expr(0);
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(196);
			switch (_input.LA(1)) {
			case RESERVADA:
			case LITERAL:
			case ID:
			case A_PARENTESIS:
			case MENOS:
			case ADMIRACION:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); expr(0);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(194); match(STRING_LITERAL);
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
			setState(203);
			switch (_input.LA(1)) {
			case ARITH_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(198); match(ARITH_OP);
				}
				break;
			case REL_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(199); match(REL_OP);
				}
				break;
			case EQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(200); match(EQ_OP);
				}
				break;
			case COND_OP:
				enterOuterAlt(_localctx, 4);
				{
				setState(201); match(COND_OP);
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
		"\2\3\'\u00d0\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 "+
		"\13\2\3\2\7\2#\n\2\f\2\16\2&\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\62\n\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\4\6\4@"+
		"\n\4\r\4\16\4A\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5"+
		"\3\5\7\5R\n\5\f\5\16\5U\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6^\n\6\f\6"+
		"\16\6a\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u0088\n\7\3\b\3\b\3\b\5\b\u008d\n\b\3\b\6\b\u0090"+
		"\n\b\r\b\16\b\u0091\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009a\n\b\f\b\16\b\u009d"+
		"\13\b\3\b\3\b\5\b\u00a1\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00aa\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b9\n\n\3\n"+
		"\3\n\3\n\3\n\7\n\u00bf\n\n\f\n\16\n\u00c2\13\n\3\13\3\13\3\13\5\13\u00c7"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00ce\n\f\3\f\2\r\2\4\6\b\n\f\16\20\22\24"+
		"\26\2\3\4\3\3\t\t\u00e3\2\30\3\2\2\2\4+\3\2\2\2\6\67\3\2\2\2\bI\3\2\2"+
		"\2\nY\3\2\2\2\f\u0087\3\2\2\2\16\u00a0\3\2\2\2\20\u00a9\3\2\2\2\22\u00b8"+
		"\3\2\2\2\24\u00c6\3\2\2\2\26\u00cd\3\2\2\2\30\31\7\t\2\2\31\32\7\13\2"+
		"\2\32\36\7\34\2\2\33\35\5\4\3\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2"+
		"\2\36\37\3\2\2\2\37$\3\2\2\2 \36\3\2\2\2!#\5\6\4\2\"!\3\2\2\2#&\3\2\2"+
		"\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\5\n\6\2()\7\35\2\2)*\b"+
		"\2\1\2*\3\3\2\2\2+\61\7\3\2\2,\62\7\13\2\2-.\7\13\2\2./\7 \2\2/\60\7\20"+
		"\2\2\60\62\7 \2\2\61,\3\2\2\2\61-\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2"+
		"\63\64\7\"\2\2\64\65\3\2\2\2\65\66\b\3\1\2\66\5\3\2\2\2\678\t\2\2\289"+
		"\7\13\2\29?\7\36\2\2:<\7\3\2\2;=\7\13\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2"+
		"\2>@\7\"\2\2?:\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\37"+
		"\2\2DE\7\34\2\2EF\5\b\5\2FG\7\35\2\2GH\b\4\1\2H\7\3\2\2\2IM\7\34\2\2J"+
		"L\5\n\6\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NS\3\2\2\2OM\3\2\2\2"+
		"PR\5\f\7\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2"+
		"VW\7\35\2\2WX\b\5\1\2X\t\3\2\2\2YZ\7\3\2\2Z_\7\13\2\2[\\\7\"\2\2\\^\7"+
		"\13\2\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc"+
		"\7#\2\2cd\b\6\1\2d\13\3\2\2\2ef\5\20\t\2fg\7\4\2\2gh\5\22\n\2hi\7#\2\2"+
		"i\u0088\3\2\2\2jk\5\16\b\2kl\7#\2\2l\u0088\3\2\2\2mn\7\t\2\2no\7\36\2"+
		"\2op\5\22\n\2pq\7\37\2\2qr\5\b\5\2rs\7\t\2\2st\5\b\5\2t\u0088\3\2\2\2"+
		"uv\7\t\2\2vw\7\13\2\2wx\7$\2\2xy\5\22\n\2yz\7\"\2\2z{\5\22\n\2{|\5\b\5"+
		"\2|\u0088\3\2\2\2}~\7\t\2\2~\177\7 \2\2\177\u0080\5\22\n\2\u0080\u0081"+
		"\7!\2\2\u0081\u0088\3\2\2\2\u0082\u0088\7\t\2\2\u0083\u0088\7\t\2\2\u0084"+
		"\u0085\5\b\5\2\u0085\u0086\b\7\1\2\u0086\u0088\3\2\2\2\u0087e\3\2\2\2"+
		"\u0087j\3\2\2\2\u0087m\3\2\2\2\u0087u\3\2\2\2\u0087}\3\2\2\2\u0087\u0082"+
		"\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0088\r\3\2\2\2\u0089"+
		"\u008a\7\13\2\2\u008a\u008f\7\36\2\2\u008b\u008d\5\22\n\2\u008c\u008b"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\7\"\2\2\u008f"+
		"\u008c\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u00a1\7\37\2\2\u0094\u0095\7\t\2\2\u0095"+
		"\u0096\7\36\2\2\u0096\u009b\7\25\2\2\u0097\u0098\7\"\2\2\u0098\u009a\5"+
		"\24\13\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\37"+
		"\2\2\u009f\u00a1\b\b\1\2\u00a0\u0089\3\2\2\2\u00a0\u0094\3\2\2\2\u00a1"+
		"\17\3\2\2\2\u00a2\u00aa\7\13\2\2\u00a3\u00a4\7\13\2\2\u00a4\u00a5\7 \2"+
		"\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7\7!\2\2\u00a7\u00a8\b\t\1\2\u00a8\u00aa"+
		"\3\2\2\2\u00a9\u00a2\3\2\2\2\u00a9\u00a3\3\2\2\2\u00aa\21\3\2\2\2\u00ab"+
		"\u00ac\b\n\1\2\u00ac\u00ad\7%\2\2\u00ad\u00b9\5\22\n\2\u00ae\u00af\7&"+
		"\2\2\u00af\u00b9\5\22\n\2\u00b0\u00b9\5\20\t\2\u00b1\u00b9\5\16\b\2\u00b2"+
		"\u00b9\7\n\2\2\u00b3\u00b4\7\36\2\2\u00b4\u00b5\5\22\n\2\u00b5\u00b6\7"+
		"\37\2\2\u00b6\u00b7\b\n\1\2\u00b7\u00b9\3\2\2\2\u00b8\u00ab\3\2\2\2\u00b8"+
		"\u00ae\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b2\3\2"+
		"\2\2\u00b8\u00b3\3\2\2\2\u00b9\u00c0\3\2\2\2\u00ba\u00bb\6\n\2\3\u00bb"+
		"\u00bc\5\26\f\2\u00bc\u00bd\5\22\n\2\u00bd\u00bf\3\2\2\2\u00be\u00ba\3"+
		"\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\23\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c7\5\22\n\2\u00c4\u00c5\7\25"+
		"\2\2\u00c5\u00c7\b\13\1\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\25\3\2\2\2\u00c8\u00ce\7\5\2\2\u00c9\u00ce\7\6\2\2\u00ca\u00ce\7\7\2"+
		"\2\u00cb\u00cc\7\b\2\2\u00cc\u00ce\b\f\1\2\u00cd\u00c8\3\2\2\2\u00cd\u00c9"+
		"\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\27\3\2\2\2\24\36"+
		"$\61<AMS_\u0087\u008c\u0091\u009b\u00a0\u00a9\u00b8\u00c0\u00c6\u00cd";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}