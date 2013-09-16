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
		ALPHA_NUM=11, DIAG_INV=24, INT_LITERAL=15, A_PARENTESIS=30, EQ_OP=5, MENOS=37, 
		ARITH_OP=3, A_CORCHETE=32, D_DIAG=23, CHAR=20, CLASE=21, HEX_DIGIT=14, 
		C_CORCHETE=33, LITERAL=9, BOOL_LITERAL=17, COND_OP=6, ID=10, COMA=34, 
		ALPHA=12, TYPE=1, PUNTO=25, ASSIGN_OP=2, SIMBOLOS=22, WS=39, STRING_LITERAL=19, 
		RESERVADA=7, CHAR_LITERAL=18, REL_OP=4, COMILLAS=26, PYCOMA=35, COMILLA=27, 
		HEX_LITERAL=8, ADMIRACION=38, IGUAL=36, A_LLAVE=28, DIGIT=13, C_LLAVE=29, 
		DECIMAL_LITERAL=16, C_PARENTESIS=31;
	public static final String[] tokenNames = {
		"<INVALID>", "TYPE", "ASSIGN_OP", "ARITH_OP", "REL_OP", "EQ_OP", "COND_OP", 
		"RESERVADA", "HEX_LITERAL", "LITERAL", "ID", "ALPHA_NUM", "ALPHA", "DIGIT", 
		"HEX_DIGIT", "INT_LITERAL", "DECIMAL_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", 
		"STRING_LITERAL", "CHAR", "CLASE", "SIMBOLOS", "'//'", "'\\'", "'.'", 
		"'\"'", "'''", "A_LLAVE", "C_LLAVE", "A_PARENTESIS", "C_PARENTESIS", "A_CORCHETE", 
		"C_CORCHETE", "COMA", "PYCOMA", "IGUAL", "MENOS", "ADMIRACION", "WS"
	};
	public static final int
		RULE_program = 0, RULE_field_decl = 1, RULE_method_decl = 2, RULE_block = 3, 
		RULE_var_decl = 4, RULE_statement = 5, RULE_method_call = 6, RULE_location = 7, 
		RULE_expr = 8, RULE_callout_arg = 9, RULE_bin_op = 10, RULE_comentario = 11;
	public static final String[] ruleNames = {
		"program", "field_decl", "method_decl", "block", "var_decl", "statement", 
		"method_call", "location", "expr", "callout_arg", "bin_op", "comentario"
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
		public List<TerminalNode> CHAR() { return getTokens(DecafParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(DecafParser.CHAR, i);
		}
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
		public TerminalNode D_DIAG(int i) {
			return getToken(DecafParser.D_DIAG, i);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public List<TerminalNode> D_DIAG() { return getTokens(DecafParser.D_DIAG); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==D_DIAG) {
				{
				{
				setState(24); match(D_DIAG);
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CHAR) {
					{
					{
					setState(25); match(CHAR);
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(36); match(RESERVADA);
			setState(37); match(ID);
			setState(38); match(A_LLAVE);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE || _la==RESERVADA) {
				{
				setState(41);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(39); field_decl();
					}
					break;

				case 2:
					{
					setState(40); method_decl();
					}
					break;
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46); match(C_LLAVE);
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

	public static class Field_declContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(DecafParser.INT_LITERAL, 0); }
		public TerminalNode C_CORCHETE() { return getToken(DecafParser.C_CORCHETE, 0); }
		public TerminalNode LITERAL() { return getToken(DecafParser.LITERAL, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode COMA() { return getToken(DecafParser.COMA, 0); }
		public TerminalNode PYCOMA() { return getToken(DecafParser.PYCOMA, 0); }
		public TerminalNode A_CORCHETE() { return getToken(DecafParser.A_CORCHETE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitField_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(48); match(TYPE);
			setState(59);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(49); match(ID);
				}
				break;

			case 2:
				{
				{
				setState(50); match(ID);
				setState(51); match(A_CORCHETE);
				setState(52); match(LITERAL);
				setState(53); match(C_CORCHETE);
				}
				}
				break;

			case 3:
				{
				{
				setState(54); match(ID);
				setState(55); match(A_CORCHETE);
				setState(56); match(INT_LITERAL);
				setState(57); match(C_CORCHETE);
				setState(58); match(COMA);
				}
				}
				break;
			}
			setState(61); match(PYCOMA);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMethod_decl(this);
			else return visitor.visitChildren(this);
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
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==RESERVADA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(64); match(ID);
			setState(65); match(A_PARENTESIS);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(68); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(66); match(TYPE);
						setState(67); match(ID);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(70); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(72); match(TYPE);
						setState(73); match(ID);
						setState(74); match(COMA);
						}
						} 
					}
					setState(79);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85); match(C_PARENTESIS);
			setState(86); block();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(A_LLAVE);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(89); var_decl();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVADA) | (1L << ID) | (1L << A_LLAVE))) != 0)) {
				{
				{
				setState(95); statement();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101); match(C_LLAVE);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(TYPE);
			setState(104); match(ID);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(105); match(COMA);
				setState(106); match(ID);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112); match(PYCOMA);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Lo_assop_ex_pycContext extends StatementContext {
		public TerminalNode ASSIGN_OP() { return getToken(DecafParser.ASSIGN_OP, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PYCOMA() { return getToken(DecafParser.PYCOMA, 0); }
		public Lo_assop_ex_pycContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLo_assop_ex_pyc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLo_assop_ex_pyc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitLo_assop_ex_pyc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Meca_pycContext extends StatementContext {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode PYCOMA() { return getToken(DecafParser.PYCOMA, 0); }
		public Meca_pycContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMeca_pyc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMeca_pyc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMeca_pyc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Re_ac_ex_ccContext extends StatementContext {
		public TerminalNode C_CORCHETE() { return getToken(DecafParser.C_CORCHETE, 0); }
		public TerminalNode RESERVADA() { return getToken(DecafParser.RESERVADA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode A_CORCHETE() { return getToken(DecafParser.A_CORCHETE, 0); }
		public Re_ac_ex_ccContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterRe_ac_ex_cc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitRe_ac_ex_cc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitRe_ac_ex_cc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Re_ap_ex_cp_bloContext extends StatementContext {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode A_PARENTESIS() { return getToken(DecafParser.A_PARENTESIS, 0); }
		public List<TerminalNode> RESERVADA() { return getTokens(DecafParser.RESERVADA); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RESERVADA(int i) {
			return getToken(DecafParser.RESERVADA, i);
		}
		public TerminalNode C_PARENTESIS() { return getToken(DecafParser.C_PARENTESIS, 0); }
		public Re_ap_ex_cp_bloContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterRe_ap_ex_cp_blo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitRe_ap_ex_cp_blo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitRe_ap_ex_cp_blo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReContext extends StatementContext {
		public TerminalNode RESERVADA() { return getToken(DecafParser.RESERVADA, 0); }
		public ReContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterRe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitRe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitRe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Re_id_ig_ex_co_ex_bloContext extends StatementContext {
		public TerminalNode IGUAL() { return getToken(DecafParser.IGUAL, 0); }
		public TerminalNode RESERVADA() { return getToken(DecafParser.RESERVADA, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode COMA() { return getToken(DecafParser.COMA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public Re_id_ig_ex_co_ex_bloContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterRe_id_ig_ex_co_ex_blo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitRe_id_ig_ex_co_ex_blo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitRe_id_ig_ex_co_ex_blo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BloContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BloContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBlo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBlo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitBlo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			int _alt;
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new Lo_assop_ex_pycContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114); location();
				setState(115); match(ASSIGN_OP);
				setState(116); expr(0);
				setState(117); match(PYCOMA);
				}
				break;

			case 2:
				_localctx = new Meca_pycContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119); method_call();
				setState(120); match(PYCOMA);
				}
				break;

			case 3:
				_localctx = new Re_ap_ex_cp_bloContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(122); match(RESERVADA);
				setState(123); match(A_PARENTESIS);
				setState(124); expr(0);
				setState(125); match(C_PARENTESIS);
				setState(126); block();
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(127); match(RESERVADA);
						setState(128); block();
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;

			case 4:
				_localctx = new Re_id_ig_ex_co_ex_bloContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(134); match(RESERVADA);
				setState(135); match(ID);
				setState(136); match(IGUAL);
				setState(137); expr(0);
				setState(138); match(COMA);
				setState(139); expr(0);
				setState(140); block();
				}
				break;

			case 5:
				_localctx = new Re_ac_ex_ccContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(142); match(RESERVADA);
				setState(143); match(A_CORCHETE);
				setState(144); expr(0);
				setState(145); match(C_CORCHETE);
				}
				break;

			case 6:
				_localctx = new ReContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(147); match(RESERVADA);
				}
				break;

			case 7:
				_localctx = new BloContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(148); block();
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
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
	 
		public Method_callContext() { }
		public void copyFrom(Method_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Con_parametrosContext extends Method_callContext {
		public TerminalNode A_PARENTESIS() { return getToken(DecafParser.A_PARENTESIS, 0); }
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
		public Con_parametrosContext(Method_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCon_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCon_parametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitCon_parametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_method_call);
		int _la;
		try {
			_localctx = new Con_parametrosContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(151); match(ID);
			setState(152); match(A_PARENTESIS);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERAL) | (1L << ID) | (1L << A_PARENTESIS) | (1L << COMA) | (1L << MENOS) | (1L << ADMIRACION))) != 0)) {
				{
				{
				setState(154);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERAL) | (1L << ID) | (1L << A_PARENTESIS) | (1L << MENOS) | (1L << ADMIRACION))) != 0)) {
					{
					setState(153); expr(0);
					}
				}

				setState(156); match(COMA);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162); match(C_PARENTESIS);
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

	public static class LocationContext extends ParserRuleContext {
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
	 
		public LocationContext() { }
		public void copyFrom(LocationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdContext extends LocationContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public IdContext(LocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Id_ac_exp_ccContext extends LocationContext {
		public TerminalNode C_CORCHETE() { return getToken(DecafParser.C_CORCHETE, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode A_CORCHETE() { return getToken(DecafParser.A_CORCHETE, 0); }
		public Id_ac_exp_ccContext(LocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterId_ac_exp_cc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitId_ac_exp_cc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitId_ac_exp_cc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_location);
		try {
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164); match(ID);
				}
				break;

			case 2:
				_localctx = new Id_ac_exp_ccContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165); match(ID);
				setState(166); match(A_CORCHETE);
				setState(167); expr(0);
				setState(168); match(C_CORCHETE);
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
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class Location_Context extends ExprContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Location_Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocation_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocation_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitLocation_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ap_ex_cpContext extends ExprContext {
		public TerminalNode A_PARENTESIS() { return getToken(DecafParser.A_PARENTESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode C_PARENTESIS() { return getToken(DecafParser.C_PARENTESIS, 0); }
		public Ap_ex_cpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAp_ex_cp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAp_ex_cp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitAp_ex_cp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Me_exContext extends ExprContext {
		public TerminalNode MENOS() { return getToken(DecafParser.MENOS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Me_exContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMe_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMe_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMe_ex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ad_exContext extends ExprContext {
		public TerminalNode ADMIRACION() { return getToken(DecafParser.ADMIRACION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Ad_exContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAd_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAd_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitAd_ex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_call_Context extends ExprContext {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Method_call_Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_call_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_call_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMethod_call_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ex_bo_exContext extends ExprContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public Ex_bo_exContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterEx_bo_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitEx_bo_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitEx_bo_ex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralContext extends ExprContext {
		public TerminalNode LITERAL() { return getToken(DecafParser.LITERAL, 0); }
		public LiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
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
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new Me_exContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(173); match(MENOS);
				setState(174); expr(3);
				}
				break;

			case 2:
				{
				_localctx = new Ad_exContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175); match(ADMIRACION);
				setState(176); expr(2);
				}
				break;

			case 3:
				{
				_localctx = new Location_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177); location();
				}
				break;

			case 4:
				{
				_localctx = new Method_call_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178); method_call();
				}
				break;

			case 5:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179); match(LITERAL);
				}
				break;

			case 6:
				{
				_localctx = new Ap_ex_cpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180); match(A_PARENTESIS);
				setState(181); expr(0);
				setState(182); match(C_PARENTESIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Ex_bo_exContext(new ExprContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(186);
					if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
					setState(187); bin_op();
					setState(188); expr(0);
					}
					} 
				}
				setState(194);
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
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
	 
		public Callout_argContext() { }
		public void copyFrom(Callout_argContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExContext extends Callout_argContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExContext(Callout_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitEx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitEx(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Str_litContext extends Callout_argContext {
		public TerminalNode STRING_LITERAL() { return getToken(DecafParser.STRING_LITERAL, 0); }
		public Str_litContext(Callout_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterStr_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitStr_lit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitStr_lit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_callout_arg);
		try {
			setState(197);
			switch (_input.LA(1)) {
			case LITERAL:
			case ID:
			case A_PARENTESIS:
			case MENOS:
			case ADMIRACION:
				_localctx = new ExContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195); expr(0);
				}
				break;
			case STRING_LITERAL:
				_localctx = new Str_litContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196); match(STRING_LITERAL);
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
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
	 
		public Bin_opContext() { }
		public void copyFrom(Bin_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Arith_opContext extends Bin_opContext {
		public TerminalNode ARITH_OP() { return getToken(DecafParser.ARITH_OP, 0); }
		public Arith_opContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterArith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitArith_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitArith_op(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eq_opContext extends Bin_opContext {
		public TerminalNode EQ_OP() { return getToken(DecafParser.EQ_OP, 0); }
		public Eq_opContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitEq_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitEq_op(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_opContext extends Bin_opContext {
		public TerminalNode COND_OP() { return getToken(DecafParser.COND_OP, 0); }
		public Cond_opContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCond_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitCond_op(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rel_opContext extends Bin_opContext {
		public TerminalNode REL_OP() { return getToken(DecafParser.REL_OP, 0); }
		public Rel_opContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitRel_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bin_op);
		try {
			setState(203);
			switch (_input.LA(1)) {
			case ARITH_OP:
				_localctx = new Arith_opContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199); match(ARITH_OP);
				}
				break;
			case REL_OP:
				_localctx = new Rel_opContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200); match(REL_OP);
				}
				break;
			case EQ_OP:
				_localctx = new Eq_opContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(201); match(EQ_OP);
				}
				break;
			case COND_OP:
				_localctx = new Cond_opContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(202); match(COND_OP);
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

	public static class ComentarioContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(DecafParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(DecafParser.CHAR, i);
		}
		public TerminalNode D_DIAG() { return getToken(DecafParser.D_DIAG, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitComentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(D_DIAG);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHAR) {
				{
				{
				setState(206); match(CHAR);
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			System.out.println("comentario");
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
		"\2\3)\u00d9\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2 "+
		"\13\2\7\2\"\n\2\f\2\16\2%\13\2\3\2\3\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\6\4G\n\4\r\4\16\4H\3\4\3\4\3\4\7\4N\n\4\f\4\16"+
		"\4Q\13\4\7\4S\n\4\f\4\16\4V\13\4\3\4\3\4\3\4\3\5\3\5\7\5]\n\5\f\5\16\5"+
		"`\13\5\3\5\7\5c\n\5\f\5\16\5f\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6n\n\6\f"+
		"\6\16\6q\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7\u0084\n\7\f\7\16\7\u0087\13\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0098\n\7\3\b\3\b\3\b\5\b\u009d"+
		"\n\b\3\b\7\b\u00a0\n\b\f\b\16\b\u00a3\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00ad\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00bb\n\n\3\n\3\n\3\n\3\n\7\n\u00c1\n\n\f\n\16\n\u00c4\13\n\3\13\3\13"+
		"\5\13\u00c8\n\13\3\f\3\f\3\f\3\f\5\f\u00ce\n\f\3\r\3\r\7\r\u00d2\n\r\f"+
		"\r\16\r\u00d5\13\r\3\r\3\r\3\r\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3"+
		"\4\3\3\t\t\u00ed\2#\3\2\2\2\4\62\3\2\2\2\6A\3\2\2\2\bZ\3\2\2\2\ni\3\2"+
		"\2\2\f\u0097\3\2\2\2\16\u0099\3\2\2\2\20\u00ac\3\2\2\2\22\u00ba\3\2\2"+
		"\2\24\u00c7\3\2\2\2\26\u00cd\3\2\2\2\30\u00cf\3\2\2\2\32\36\7\31\2\2\33"+
		"\35\7\26\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37"+
		"\"\3\2\2\2 \36\3\2\2\2!\32\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3"+
		"\2\2\2%#\3\2\2\2&\'\7\t\2\2\'(\7\f\2\2(-\7\36\2\2),\5\4\3\2*,\5\6\4\2"+
		"+)\3\2\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2"+
		"\2\60\61\7\37\2\2\61\3\3\2\2\2\62=\7\3\2\2\63>\7\f\2\2\64\65\7\f\2\2\65"+
		"\66\7\"\2\2\66\67\7\13\2\2\67>\7#\2\289\7\f\2\29:\7\"\2\2:;\7\21\2\2;"+
		"<\7#\2\2<>\7$\2\2=\63\3\2\2\2=\64\3\2\2\2=8\3\2\2\2>?\3\2\2\2?@\7%\2\2"+
		"@\5\3\2\2\2AB\t\2\2\2BC\7\f\2\2CT\7 \2\2DE\7\3\2\2EG\7\f\2\2FD\3\2\2\2"+
		"GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IO\3\2\2\2JK\7\3\2\2KL\7\f\2\2LN\7$\2\2"+
		"MJ\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2QO\3\2\2\2RF\3\2\2\2"+
		"SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7!\2\2XY\5\b\5\2"+
		"Y\7\3\2\2\2Z^\7\36\2\2[]\5\n\6\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2"+
		"\2\2_d\3\2\2\2`^\3\2\2\2ac\5\f\7\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2"+
		"\2\2eg\3\2\2\2fd\3\2\2\2gh\7\37\2\2h\t\3\2\2\2ij\7\3\2\2jo\7\f\2\2kl\7"+
		"$\2\2ln\7\f\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3"+
		"\2\2\2rs\7%\2\2s\13\3\2\2\2tu\5\20\t\2uv\7\4\2\2vw\5\22\n\2wx\7%\2\2x"+
		"\u0098\3\2\2\2yz\5\16\b\2z{\7%\2\2{\u0098\3\2\2\2|}\7\t\2\2}~\7 \2\2~"+
		"\177\5\22\n\2\177\u0080\7!\2\2\u0080\u0085\5\b\5\2\u0081\u0082\7\t\2\2"+
		"\u0082\u0084\5\b\5\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0098\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\7\t\2\2\u0089\u008a\7\f\2\2\u008a\u008b\7&\2\2\u008b\u008c\5\22"+
		"\n\2\u008c\u008d\7$\2\2\u008d\u008e\5\22\n\2\u008e\u008f\5\b\5\2\u008f"+
		"\u0098\3\2\2\2\u0090\u0091\7\t\2\2\u0091\u0092\7\"\2\2\u0092\u0093\5\22"+
		"\n\2\u0093\u0094\7#\2\2\u0094\u0098\3\2\2\2\u0095\u0098\7\t\2\2\u0096"+
		"\u0098\5\b\5\2\u0097t\3\2\2\2\u0097y\3\2\2\2\u0097|\3\2\2\2\u0097\u0088"+
		"\3\2\2\2\u0097\u0090\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\r\3\2\2\2\u0099\u009a\7\f\2\2\u009a\u00a1\7 \2\2\u009b\u009d\5\22\n\2"+
		"\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0"+
		"\7$\2\2\u009f\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7!"+
		"\2\2\u00a5\17\3\2\2\2\u00a6\u00ad\7\f\2\2\u00a7\u00a8\7\f\2\2\u00a8\u00a9"+
		"\7\"\2\2\u00a9\u00aa\5\22\n\2\u00aa\u00ab\7#\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00a6\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ad\21\3\2\2\2\u00ae\u00af\b\n\1"+
		"\2\u00af\u00b0\7\'\2\2\u00b0\u00bb\5\22\n\2\u00b1\u00b2\7(\2\2\u00b2\u00bb"+
		"\5\22\n\2\u00b3\u00bb\5\20\t\2\u00b4\u00bb\5\16\b\2\u00b5\u00bb\7\13\2"+
		"\2\u00b6\u00b7\7 \2\2\u00b7\u00b8\5\22\n\2\u00b8\u00b9\7!\2\2\u00b9\u00bb"+
		"\3\2\2\2\u00ba\u00ae\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b3\3\2\2\2\u00ba"+
		"\u00b4\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb\u00c2\3\2"+
		"\2\2\u00bc\u00bd\6\n\2\3\u00bd\u00be\5\26\f\2\u00be\u00bf\5\22\n\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\23\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8"+
		"\5\22\n\2\u00c6\u00c8\7\25\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c8\25\3\2\2\2\u00c9\u00ce\7\5\2\2\u00ca\u00ce\7\6\2\2\u00cb\u00ce"+
		"\7\7\2\2\u00cc\u00ce\7\b\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\27\3\2\2\2\u00cf\u00d3\7\31\2"+
		"\2\u00d0\u00d2\7\26\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00d7\b\r\1\2\u00d7\31\3\2\2\2\27\36#+-=HOT^do\u0085\u0097"+
		"\u009c\u00a1\u00ac\u00ba\u00c2\u00c7\u00cd\u00d3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}