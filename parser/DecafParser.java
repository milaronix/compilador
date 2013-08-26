// Generated from compiler/parser/DecafParser.g by ANTLR 4.0

	package compiler.parser;

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
		public TerminalNode CLASE() { return getToken(DecafParser.CLASE, 0); }
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public TerminalNode A_LLAVE() { return getToken(DecafParser.A_LLAVE, 0); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(22); match(CLASE);
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
			_la = _input.LA(1);
			while (_la==TYPE || _la==RESERVADA) {
				{
				{
				setState(31); method_decl();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37); match(C_LLAVE);
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
			setState(39); match(TYPE);
			setState(45);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(40); match(ID);
				}
				break;

			case 2:
				{
				setState(41); match(ID);
				setState(42); match(A_CORCHETE);
				setState(43); match(INT_LITERAL);
				setState(44); match(A_CORCHETE);
				}
				break;
			}
			setState(47); match(COMA);
			}
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
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==RESERVADA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(50); match(ID);
			setState(51); match(A_PARENTESIS);
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52); match(TYPE);
				setState(54);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(53); match(ID);
					}
				}

				setState(56); match(COMA);
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE );
			setState(61); match(C_PARENTESIS);
			setState(62); match(A_LLAVE);
			setState(63); block();
			setState(64); match(C_LLAVE);
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
			setState(66); match(A_LLAVE);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(67); var_decl();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVADA) | (1L << ID) | (1L << A_LLAVE))) != 0)) {
				{
				{
				setState(73); statement();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79); match(C_LLAVE);
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
			setState(81); match(TYPE);
			setState(82); match(ID);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(83); match(COMA);
				setState(84); match(ID);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90); match(PYCOMA);
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
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); location();
				setState(93); match(ASSIGN_OP);
				setState(94); expr(0);
				setState(95); match(PYCOMA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); method_call();
				setState(98); match(PYCOMA);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100); match(RESERVADA);
				setState(101); match(A_PARENTESIS);
				setState(102); expr(0);
				setState(103); match(C_PARENTESIS);
				setState(104); block();
				{
				setState(105); match(RESERVADA);
				setState(106); block();
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108); match(RESERVADA);
				setState(109); match(ID);
				setState(110); match(IGUAL);
				setState(111); expr(0);
				setState(112); match(COMA);
				setState(113); expr(0);
				setState(114); block();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116); match(RESERVADA);
				setState(117); match(A_CORCHETE);
				setState(118); expr(0);
				setState(119); match(C_CORCHETE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(121); match(RESERVADA);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(122); match(RESERVADA);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(123); block();
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
			setState(148);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); match(ID);
				setState(127); match(A_PARENTESIS);
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVADA) | (1L << LITERAL) | (1L << ID) | (1L << A_PARENTESIS) | (1L << MENOS) | (1L << ADMIRACION))) != 0)) {
						{
						setState(128); expr(0);
						}
					}

					setState(131); match(COMA);
					}
					}
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVADA) | (1L << LITERAL) | (1L << ID) | (1L << A_PARENTESIS) | (1L << COMA) | (1L << MENOS) | (1L << ADMIRACION))) != 0) );
				setState(136); match(C_PARENTESIS);
				}
				break;
			case RESERVADA:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); match(RESERVADA);
				setState(138); match(A_PARENTESIS);
				setState(139); match(STRING_LITERAL);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(140); match(COMA);
					{
					setState(141); callout_arg();
					}
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147); match(C_PARENTESIS);
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
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151); match(ID);
				setState(152); match(A_CORCHETE);
				setState(153); expr(0);
				setState(154); match(C_CORCHETE);
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
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(159); match(MENOS);
				setState(160); expr(3);
				}
				break;

			case 2:
				{
				setState(161); match(ADMIRACION);
				setState(162); expr(2);
				}
				break;

			case 3:
				{
				setState(163); location();
				}
				break;

			case 4:
				{
				setState(164); method_call();
				}
				break;

			case 5:
				{
				setState(165); match(LITERAL);
				}
				break;

			case 6:
				{
				setState(166); match(A_PARENTESIS);
				setState(167); expr(0);
				setState(168); match(C_PARENTESIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
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
					setState(172);
					if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
					setState(173); bin_op();
					setState(174); expr(0);
					}
					} 
				}
				setState(180);
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
			setState(183);
			switch (_input.LA(1)) {
			case RESERVADA:
			case LITERAL:
			case ID:
			case A_PARENTESIS:
			case MENOS:
			case ADMIRACION:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); expr(0);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(182); match(STRING_LITERAL);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARITH_OP) | (1L << REL_OP) | (1L << EQ_OP) | (1L << COND_OP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\2\3\'\u00be\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 "+
		"\13\2\3\2\7\2#\n\2\f\2\16\2&\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\60\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\49\n\4\3\4\6\4<\n\4\r\4\16\4=\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\7\5M\n\5\f\5\16"+
		"\5P\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\177\n\7\3\b\3"+
		"\b\3\b\5\b\u0084\n\b\3\b\6\b\u0087\n\b\r\b\16\b\u0088\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\b\u0091\n\b\f\b\16\b\u0094\13\b\3\b\5\b\u0097\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u009f\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00ad\n\n\3\n\3\n\3\n\3\n\7\n\u00b3\n\n\f\n\16\n\u00b6\13\n"+
		"\3\13\3\13\5\13\u00ba\n\13\3\f\3\f\3\f\2\r\2\4\6\b\n\f\16\20\22\24\26"+
		"\2\4\4\3\3\t\t\3\5\b\u00ce\2\30\3\2\2\2\4)\3\2\2\2\6\63\3\2\2\2\bD\3\2"+
		"\2\2\nS\3\2\2\2\f~\3\2\2\2\16\u0096\3\2\2\2\20\u009e\3\2\2\2\22\u00ac"+
		"\3\2\2\2\24\u00b9\3\2\2\2\26\u00bb\3\2\2\2\30\31\7\27\2\2\31\32\7\13\2"+
		"\2\32\36\7\34\2\2\33\35\5\4\3\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2"+
		"\2\36\37\3\2\2\2\37$\3\2\2\2 \36\3\2\2\2!#\5\6\4\2\"!\3\2\2\2#&\3\2\2"+
		"\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7\35\2\2(\3\3\2\2\2)/"+
		"\7\3\2\2*\60\7\13\2\2+,\7\13\2\2,-\7 \2\2-.\7\20\2\2.\60\7 \2\2/*\3\2"+
		"\2\2/+\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\"\2\2\62\5\3\2\2\2\63"+
		"\64\t\2\2\2\64\65\7\13\2\2\65;\7\36\2\2\668\7\3\2\2\679\7\13\2\28\67\3"+
		"\2\2\289\3\2\2\29:\3\2\2\2:<\7\"\2\2;\66\3\2\2\2<=\3\2\2\2=;\3\2\2\2="+
		">\3\2\2\2>?\3\2\2\2?@\7\37\2\2@A\7\34\2\2AB\5\b\5\2BC\7\35\2\2C\7\3\2"+
		"\2\2DH\7\34\2\2EG\5\n\6\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IN\3"+
		"\2\2\2JH\3\2\2\2KM\5\f\7\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3"+
		"\2\2\2PN\3\2\2\2QR\7\35\2\2R\t\3\2\2\2ST\7\3\2\2TY\7\13\2\2UV\7\"\2\2"+
		"VX\7\13\2\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2"+
		"\2\\]\7#\2\2]\13\3\2\2\2^_\5\20\t\2_`\7\4\2\2`a\5\22\n\2ab\7#\2\2b\177"+
		"\3\2\2\2cd\5\16\b\2de\7#\2\2e\177\3\2\2\2fg\7\t\2\2gh\7\36\2\2hi\5\22"+
		"\n\2ij\7\37\2\2jk\5\b\5\2kl\7\t\2\2lm\5\b\5\2m\177\3\2\2\2no\7\t\2\2o"+
		"p\7\13\2\2pq\7$\2\2qr\5\22\n\2rs\7\"\2\2st\5\22\n\2tu\5\b\5\2u\177\3\2"+
		"\2\2vw\7\t\2\2wx\7 \2\2xy\5\22\n\2yz\7!\2\2z\177\3\2\2\2{\177\7\t\2\2"+
		"|\177\7\t\2\2}\177\5\b\5\2~^\3\2\2\2~c\3\2\2\2~f\3\2\2\2~n\3\2\2\2~v\3"+
		"\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\r\3\2\2\2\u0080\u0081\7\13\2"+
		"\2\u0081\u0086\7\36\2\2\u0082\u0084\5\22\n\2\u0083\u0082\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\7\"\2\2\u0086\u0083\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u0097\7\37\2\2\u008b\u008c\7\t\2\2\u008c\u008d\7"+
		"\36\2\2\u008d\u0092\7\25\2\2\u008e\u008f\7\"\2\2\u008f\u0091\5\24\13\2"+
		"\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\7\37\2\2"+
		"\u0096\u0080\3\2\2\2\u0096\u008b\3\2\2\2\u0097\17\3\2\2\2\u0098\u009f"+
		"\7\13\2\2\u0099\u009a\7\13\2\2\u009a\u009b\7 \2\2\u009b\u009c\5\22\n\2"+
		"\u009c\u009d\7!\2\2\u009d\u009f\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u0099"+
		"\3\2\2\2\u009f\21\3\2\2\2\u00a0\u00a1\b\n\1\2\u00a1\u00a2\7%\2\2\u00a2"+
		"\u00ad\5\22\n\2\u00a3\u00a4\7&\2\2\u00a4\u00ad\5\22\n\2\u00a5\u00ad\5"+
		"\20\t\2\u00a6\u00ad\5\16\b\2\u00a7\u00ad\7\n\2\2\u00a8\u00a9\7\36\2\2"+
		"\u00a9\u00aa\5\22\n\2\u00aa\u00ab\7\37\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a0"+
		"\3\2\2\2\u00ac\u00a3\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac"+
		"\u00a7\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad\u00b4\3\2\2\2\u00ae\u00af\6\n"+
		"\2\3\u00af\u00b0\5\26\f\2\u00b0\u00b1\5\22\n\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00ae\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\23\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\5\22\n\2\u00b8\u00ba"+
		"\7\25\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\25\3\2\2\2\u00bb"+
		"\u00bc\t\3\2\2\u00bc\27\3\2\2\2\23\36$/8=HNY~\u0083\u0088\u0092\u0096"+
		"\u009e\u00ac\u00b4\u00b9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}