// Generated from /home/laokoon/Git/hopperlang/Hopperlang/src/main/res/Hopperlang.g4 by ANTLR 4.6
package de.htwb.hopperlang.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HopperlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NEWLINE=2, NUMBER=3, OPEN_BLOCK=4, CLOSE_BLOCK=5, SIGNAL=6, SIG_INPUT=7, 
		SIG_OUTPUT=8, SIG_LOCAL=9, AUTOMAT=10, STATE=11, CONDITION=12, NEGATION=13, 
		TRANSITION=14, AND=15, OR=16, XOR=17, LOWER=18, LOWER_EQUAL=19, EQUAL=20, 
		GREATER_EQUAL=21, GREATER=22, OPEN_BRACKET=23, CLOSE_BRACKET=24, PLUS=25, 
		MINUS=26, BIT=27, BUS=28, HILO=29, INT=30, NAME=31, COMMENT=32, MULTILINE_COMMENT=33;
	public static final int
		RULE_document = 0, RULE_empty_lines = 1, RULE_signal_declaration = 2, 
		RULE_signal_modifier = 3, RULE_signal_value_list = 4, RULE_signal_value = 5, 
		RULE_automat_block = 6, RULE_state_block_list = 7, RULE_state_block = 8, 
		RULE_state_body = 9, RULE_state_body_element = 10, RULE_condition_block = 11, 
		RULE_transition_block = 12, RULE_transition = 13, RULE_condition = 14, 
		RULE_conjunction = 15, RULE_boolean_expression = 16, RULE_comparison = 17, 
		RULE_assignment = 18, RULE_assignment_left = 19, RULE_assignment_right = 20, 
		RULE_assignment_operator = 21, RULE_unary_operator = 22, RULE_type = 23, 
		RULE_number = 24, RULE_name = 25;
	public static final String[] ruleNames = {
		"document", "empty_lines", "signal_declaration", "signal_modifier", "signal_value_list", 
		"signal_value", "automat_block", "state_block_list", "state_block", "state_body", 
		"state_body_element", "condition_block", "transition_block", "transition", 
		"condition", "conjunction", "boolean_expression", "comparison", "assignment", 
		"assignment_left", "assignment_right", "assignment_operator", "unary_operator", 
		"type", "number", "name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'do'", "'end'", "'signal'", "'input'", "'output'", 
		"'local'", "'automat'", "'state'", "'when'", "'not'", "'goto'", "'and'", 
		"'or'", "'xor'", "'<'", "'<='", "'='", "'>='", "'>'", "'('", "')'", "'+'", 
		"'-'", "'bit'", null, "'hilo'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "NEWLINE", "NUMBER", "OPEN_BLOCK", "CLOSE_BLOCK", "SIGNAL", 
		"SIG_INPUT", "SIG_OUTPUT", "SIG_LOCAL", "AUTOMAT", "STATE", "CONDITION", 
		"NEGATION", "TRANSITION", "AND", "OR", "XOR", "LOWER", "LOWER_EQUAL", 
		"EQUAL", "GREATER_EQUAL", "GREATER", "OPEN_BRACKET", "CLOSE_BRACKET", 
		"PLUS", "MINUS", "BIT", "BUS", "HILO", "INT", "NAME", "COMMENT", "MULTILINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Hopperlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HopperlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public Signal_declarationContext signal_declaration() {
			return getRuleContext(Signal_declarationContext.class,0);
		}
		public Automat_blockContext automat_block() {
			return getRuleContext(Automat_blockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HopperlangParser.EOF, 0); }
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			signal_declaration();
			setState(53);
			automat_block();
			setState(54);
			match(EOF);
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

	public static class Empty_linesContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(HopperlangParser.NEWLINE, 0); }
		public Empty_linesContext empty_lines() {
			return getRuleContext(Empty_linesContext.class,0);
		}
		public Empty_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterEmpty_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitEmpty_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitEmpty_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_linesContext empty_lines() throws RecognitionException {
		Empty_linesContext _localctx = new Empty_linesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_empty_lines);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(NEWLINE);
				setState(57);
				empty_lines();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Signal_declarationContext extends ParserRuleContext {
		public TerminalNode SIGNAL() { return getToken(HopperlangParser.SIGNAL, 0); }
		public Signal_modifierContext signal_modifier() {
			return getRuleContext(Signal_modifierContext.class,0);
		}
		public Signal_valueContext signal_value() {
			return getRuleContext(Signal_valueContext.class,0);
		}
		public List<Empty_linesContext> empty_lines() {
			return getRuleContexts(Empty_linesContext.class);
		}
		public Empty_linesContext empty_lines(int i) {
			return getRuleContext(Empty_linesContext.class,i);
		}
		public Signal_declarationContext signal_declaration() {
			return getRuleContext(Signal_declarationContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(HopperlangParser.OPEN_BRACKET, 0); }
		public Signal_value_listContext signal_value_list() {
			return getRuleContext(Signal_value_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(HopperlangParser.CLOSE_BRACKET, 0); }
		public Signal_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterSignal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitSignal_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitSignal_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_declarationContext signal_declaration() throws RecognitionException {
		Signal_declarationContext _localctx = new Signal_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_signal_declaration);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(SIGNAL);
				setState(62);
				signal_modifier();
				setState(63);
				signal_value();
				setState(64);
				empty_lines();
				setState(65);
				signal_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(SIGNAL);
				setState(68);
				signal_modifier();
				setState(69);
				match(OPEN_BRACKET);
				setState(70);
				empty_lines();
				setState(71);
				signal_value_list(0);
				setState(72);
				match(CLOSE_BRACKET);
				setState(73);
				empty_lines();
				setState(74);
				signal_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Signal_modifierContext extends ParserRuleContext {
		public TerminalNode SIG_INPUT() { return getToken(HopperlangParser.SIG_INPUT, 0); }
		public TerminalNode SIG_OUTPUT() { return getToken(HopperlangParser.SIG_OUTPUT, 0); }
		public TerminalNode SIG_LOCAL() { return getToken(HopperlangParser.SIG_LOCAL, 0); }
		public Signal_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterSignal_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitSignal_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitSignal_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_modifierContext signal_modifier() throws RecognitionException {
		Signal_modifierContext _localctx = new Signal_modifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_signal_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIG_INPUT) | (1L << SIG_OUTPUT) | (1L << SIG_LOCAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Signal_value_listContext extends ParserRuleContext {
		public Signal_valueContext signal_value() {
			return getRuleContext(Signal_valueContext.class,0);
		}
		public Empty_linesContext empty_lines() {
			return getRuleContext(Empty_linesContext.class,0);
		}
		public Signal_value_listContext signal_value_list() {
			return getRuleContext(Signal_value_listContext.class,0);
		}
		public Signal_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterSignal_value_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitSignal_value_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitSignal_value_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_value_listContext signal_value_list() throws RecognitionException {
		return signal_value_list(0);
	}

	private Signal_value_listContext signal_value_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Signal_value_listContext _localctx = new Signal_value_listContext(_ctx, _parentState);
		Signal_value_listContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_signal_value_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(82);
			signal_value();
			setState(83);
			empty_lines();
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Signal_value_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_signal_value_list);
					setState(85);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(86);
					signal_value();
					setState(87);
					empty_lines();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Signal_valueContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Signal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterSignal_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitSignal_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitSignal_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_valueContext signal_value() throws RecognitionException {
		Signal_valueContext _localctx = new Signal_valueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_signal_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			name();
			setState(95);
			type();
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

	public static class Automat_blockContext extends ParserRuleContext {
		public TerminalNode AUTOMAT() { return getToken(HopperlangParser.AUTOMAT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(HopperlangParser.OPEN_BLOCK, 0); }
		public List<Empty_linesContext> empty_lines() {
			return getRuleContexts(Empty_linesContext.class);
		}
		public Empty_linesContext empty_lines(int i) {
			return getRuleContext(Empty_linesContext.class,i);
		}
		public State_block_listContext state_block_list() {
			return getRuleContext(State_block_listContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(HopperlangParser.CLOSE_BLOCK, 0); }
		public Automat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterAutomat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitAutomat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitAutomat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Automat_blockContext automat_block() throws RecognitionException {
		Automat_blockContext _localctx = new Automat_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_automat_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(AUTOMAT);
			setState(98);
			name();
			setState(99);
			match(OPEN_BLOCK);
			setState(100);
			empty_lines();
			setState(101);
			state_block_list();
			setState(102);
			match(CLOSE_BLOCK);
			setState(103);
			empty_lines();
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

	public static class State_block_listContext extends ParserRuleContext {
		public List<State_blockContext> state_block() {
			return getRuleContexts(State_blockContext.class);
		}
		public State_blockContext state_block(int i) {
			return getRuleContext(State_blockContext.class,i);
		}
		public List<Empty_linesContext> empty_lines() {
			return getRuleContexts(Empty_linesContext.class);
		}
		public Empty_linesContext empty_lines(int i) {
			return getRuleContext(Empty_linesContext.class,i);
		}
		public State_block_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_block_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterState_block_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitState_block_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitState_block_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_block_listContext state_block_list() throws RecognitionException {
		State_block_listContext _localctx = new State_block_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_state_block_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(105);
					state_block();
					setState(106);
					empty_lines();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class State_blockContext extends ParserRuleContext {
		public TerminalNode STATE() { return getToken(HopperlangParser.STATE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(HopperlangParser.OPEN_BLOCK, 0); }
		public Empty_linesContext empty_lines() {
			return getRuleContext(Empty_linesContext.class,0);
		}
		public State_bodyContext state_body() {
			return getRuleContext(State_bodyContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(HopperlangParser.CLOSE_BLOCK, 0); }
		public State_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterState_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitState_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitState_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_blockContext state_block() throws RecognitionException {
		State_blockContext _localctx = new State_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_state_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(STATE);
			setState(114);
			name();
			setState(115);
			match(OPEN_BLOCK);
			setState(116);
			empty_lines();
			setState(117);
			state_body();
			setState(118);
			match(CLOSE_BLOCK);
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

	public static class State_bodyContext extends ParserRuleContext {
		public List<State_body_elementContext> state_body_element() {
			return getRuleContexts(State_body_elementContext.class);
		}
		public State_body_elementContext state_body_element(int i) {
			return getRuleContext(State_body_elementContext.class,i);
		}
		public List<Empty_linesContext> empty_lines() {
			return getRuleContexts(Empty_linesContext.class);
		}
		public Empty_linesContext empty_lines(int i) {
			return getRuleContext(Empty_linesContext.class,i);
		}
		public State_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterState_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitState_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitState_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_bodyContext state_body() throws RecognitionException {
		State_bodyContext _localctx = new State_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_state_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONDITION || _la==NAME) {
				{
				{
				setState(120);
				state_body_element();
				setState(121);
				empty_lines();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class State_body_elementContext extends ParserRuleContext {
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public State_body_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_body_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterState_body_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitState_body_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitState_body_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_body_elementContext state_body_element() throws RecognitionException {
		State_body_elementContext _localctx = new State_body_elementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_state_body_element);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONDITION:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				condition_block();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				assignment();
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TransitionContext transition() {
			return getRuleContext(TransitionContext.class,0);
		}
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public Transition_blockContext transition_block() {
			return getRuleContext(Transition_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition_block);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				transition();
				setState(133);
				condition_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				transition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				transition_block();
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(137);
					condition_block();
					}
					break;
				}
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

	public static class Transition_blockContext extends ParserRuleContext {
		public TerminalNode CONDITION() { return getToken(HopperlangParser.CONDITION, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(HopperlangParser.OPEN_BLOCK, 0); }
		public List<Empty_linesContext> empty_lines() {
			return getRuleContexts(Empty_linesContext.class);
		}
		public Empty_linesContext empty_lines(int i) {
			return getRuleContext(Empty_linesContext.class,i);
		}
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(HopperlangParser.CLOSE_BLOCK, 0); }
		public Transition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterTransition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitTransition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitTransition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transition_blockContext transition_block() throws RecognitionException {
		Transition_blockContext _localctx = new Transition_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_transition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(CONDITION);
			setState(143);
			condition();
			setState(144);
			match(OPEN_BLOCK);
			setState(145);
			empty_lines();
			setState(146);
			condition_block();
			setState(147);
			match(CLOSE_BLOCK);
			setState(148);
			empty_lines();
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

	public static class TransitionContext extends ParserRuleContext {
		public TerminalNode CONDITION() { return getToken(HopperlangParser.CONDITION, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode TRANSITION() { return getToken(HopperlangParser.TRANSITION, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Empty_linesContext empty_lines() {
			return getRuleContext(Empty_linesContext.class,0);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_transition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(CONDITION);
			setState(151);
			condition();
			setState(152);
			match(TRANSITION);
			setState(153);
			name();
			setState(154);
			empty_lines();
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

	public static class ConditionContext extends ParserRuleContext {
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				boolean_expression();
				setState(157);
				conjunction();
				setState(158);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				boolean_expression();
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

	public static class ConjunctionContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(HopperlangParser.AND, 0); }
		public TerminalNode OR() { return getToken(HopperlangParser.OR, 0); }
		public TerminalNode XOR() { return getToken(HopperlangParser.XOR, 0); }
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Boolean_expressionContext extends ParserRuleContext {
		public TerminalNode NEGATION() { return getToken(HopperlangParser.NEGATION, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(HopperlangParser.OPEN_BRACKET, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(HopperlangParser.CLOSE_BRACKET, 0); }
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterBoolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitBoolean_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitBoolean_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_boolean_expression);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(NEGATION);
				setState(166);
				boolean_expression();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(OPEN_BRACKET);
				setState(168);
				comparison();
				setState(169);
				match(CLOSE_BRACKET);
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

	public static class ComparisonContext extends ParserRuleContext {
		public Assignment_leftContext assignment_left() {
			return getRuleContext(Assignment_leftContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Assignment_rightContext assignment_right() {
			return getRuleContext(Assignment_rightContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			assignment_left();
			setState(174);
			unary_operator();
			setState(175);
			assignment_right();
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

	public static class AssignmentContext extends ParserRuleContext {
		public Assignment_leftContext assignment_left() {
			return getRuleContext(Assignment_leftContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(HopperlangParser.EQUAL, 0); }
		public Assignment_rightContext assignment_right() {
			return getRuleContext(Assignment_rightContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			assignment_left();
			setState(178);
			match(EQUAL);
			setState(179);
			assignment_right();
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

	public static class Assignment_leftContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Assignment_leftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterAssignment_left(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitAssignment_left(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitAssignment_left(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_leftContext assignment_left() throws RecognitionException {
		Assignment_leftContext _localctx = new Assignment_leftContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignment_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			name();
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

	public static class Assignment_rightContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Assignment_rightContext assignment_right() {
			return getRuleContext(Assignment_rightContext.class,0);
		}
		public Assignment_rightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterAssignment_right(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitAssignment_right(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitAssignment_right(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_rightContext assignment_right() throws RecognitionException {
		Assignment_rightContext _localctx = new Assignment_rightContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment_right);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				name();
				setState(186);
				assignment_operator();
				setState(187);
				assignment_right();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				number();
				setState(190);
				assignment_operator();
				setState(191);
				assignment_right();
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(HopperlangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HopperlangParser.MINUS, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode LOWER() { return getToken(HopperlangParser.LOWER, 0); }
		public TerminalNode LOWER_EQUAL() { return getToken(HopperlangParser.LOWER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(HopperlangParser.EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(HopperlangParser.GREATER_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(HopperlangParser.GREATER, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWER) | (1L << LOWER_EQUAL) | (1L << EQUAL) | (1L << GREATER_EQUAL) | (1L << GREATER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BIT() { return getToken(HopperlangParser.BIT, 0); }
		public TerminalNode BUS() { return getToken(HopperlangParser.BUS, 0); }
		public TerminalNode HILO() { return getToken(HopperlangParser.HILO, 0); }
		public TerminalNode INT() { return getToken(HopperlangParser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIT) | (1L << BUS) | (1L << HILO) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(HopperlangParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(NUMBER);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HopperlangParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(NAME);
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
		case 4:
			return signal_value_list_sempred((Signal_value_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean signal_value_list_sempred(Signal_value_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u00d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\to\n\t\f\t\16\tr\13\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13~\n\13\f\13\16\13\u0081"+
		"\13\13\3\f\3\f\5\f\u0085\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008d\n\r\5\r"+
		"\u008f\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00a4\n\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00ae\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00c4\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3p"+
		"\3\n\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\7\3"+
		"\2\t\13\3\2\21\23\3\2\33\34\3\2\24\30\3\2\35 \u00c4\2\66\3\2\2\2\4=\3"+
		"\2\2\2\6O\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2\f`\3\2\2\2\16c\3\2\2\2\20p\3\2"+
		"\2\2\22s\3\2\2\2\24\177\3\2\2\2\26\u0084\3\2\2\2\30\u008e\3\2\2\2\32\u0090"+
		"\3\2\2\2\34\u0098\3\2\2\2\36\u00a3\3\2\2\2 \u00a5\3\2\2\2\"\u00ad\3\2"+
		"\2\2$\u00af\3\2\2\2&\u00b3\3\2\2\2(\u00b7\3\2\2\2*\u00c3\3\2\2\2,\u00c5"+
		"\3\2\2\2.\u00c7\3\2\2\2\60\u00c9\3\2\2\2\62\u00cb\3\2\2\2\64\u00cd\3\2"+
		"\2\2\66\67\5\6\4\2\678\5\16\b\289\7\2\2\39\3\3\2\2\2:;\7\4\2\2;>\5\4\3"+
		"\2<>\3\2\2\2=:\3\2\2\2=<\3\2\2\2>\5\3\2\2\2?@\7\b\2\2@A\5\b\5\2AB\5\f"+
		"\7\2BC\5\4\3\2CD\5\6\4\2DP\3\2\2\2EF\7\b\2\2FG\5\b\5\2GH\7\31\2\2HI\5"+
		"\4\3\2IJ\5\n\6\2JK\7\32\2\2KL\5\4\3\2LM\5\6\4\2MP\3\2\2\2NP\3\2\2\2O?"+
		"\3\2\2\2OE\3\2\2\2ON\3\2\2\2P\7\3\2\2\2QR\t\2\2\2R\t\3\2\2\2ST\b\6\1\2"+
		"TU\5\f\7\2UV\5\4\3\2V]\3\2\2\2WX\f\4\2\2XY\5\f\7\2YZ\5\4\3\2Z\\\3\2\2"+
		"\2[W\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\13\3\2\2\2_]\3\2\2\2`a\5"+
		"\64\33\2ab\5\60\31\2b\r\3\2\2\2cd\7\f\2\2de\5\64\33\2ef\7\6\2\2fg\5\4"+
		"\3\2gh\5\20\t\2hi\7\7\2\2ij\5\4\3\2j\17\3\2\2\2kl\5\22\n\2lm\5\4\3\2m"+
		"o\3\2\2\2nk\3\2\2\2or\3\2\2\2pq\3\2\2\2pn\3\2\2\2q\21\3\2\2\2rp\3\2\2"+
		"\2st\7\r\2\2tu\5\64\33\2uv\7\6\2\2vw\5\4\3\2wx\5\24\13\2xy\7\7\2\2y\23"+
		"\3\2\2\2z{\5\26\f\2{|\5\4\3\2|~\3\2\2\2}z\3\2\2\2~\u0081\3\2\2\2\177}"+
		"\3\2\2\2\177\u0080\3\2\2\2\u0080\25\3\2\2\2\u0081\177\3\2\2\2\u0082\u0085"+
		"\5\30\r\2\u0083\u0085\5&\24\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2"+
		"\u0085\27\3\2\2\2\u0086\u0087\5\34\17\2\u0087\u0088\5\30\r\2\u0088\u008f"+
		"\3\2\2\2\u0089\u008f\5\34\17\2\u008a\u008c\5\32\16\2\u008b\u008d\5\30"+
		"\r\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u0086\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008a\3\2\2\2\u008f\31\3\2\2"+
		"\2\u0090\u0091\7\16\2\2\u0091\u0092\5\36\20\2\u0092\u0093\7\6\2\2\u0093"+
		"\u0094\5\4\3\2\u0094\u0095\5\30\r\2\u0095\u0096\7\7\2\2\u0096\u0097\5"+
		"\4\3\2\u0097\33\3\2\2\2\u0098\u0099\7\16\2\2\u0099\u009a\5\36\20\2\u009a"+
		"\u009b\7\20\2\2\u009b\u009c\5\64\33\2\u009c\u009d\5\4\3\2\u009d\35\3\2"+
		"\2\2\u009e\u009f\5\"\22\2\u009f\u00a0\5 \21\2\u00a0\u00a1\5\36\20\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a4\5\"\22\2\u00a3\u009e\3\2\2\2\u00a3\u00a2\3"+
		"\2\2\2\u00a4\37\3\2\2\2\u00a5\u00a6\t\3\2\2\u00a6!\3\2\2\2\u00a7\u00a8"+
		"\7\17\2\2\u00a8\u00ae\5\"\22\2\u00a9\u00aa\7\31\2\2\u00aa\u00ab\5$\23"+
		"\2\u00ab\u00ac\7\32\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad"+
		"\u00a9\3\2\2\2\u00ae#\3\2\2\2\u00af\u00b0\5(\25\2\u00b0\u00b1\5.\30\2"+
		"\u00b1\u00b2\5*\26\2\u00b2%\3\2\2\2\u00b3\u00b4\5(\25\2\u00b4\u00b5\7"+
		"\26\2\2\u00b5\u00b6\5*\26\2\u00b6\'\3\2\2\2\u00b7\u00b8\5\64\33\2\u00b8"+
		")\3\2\2\2\u00b9\u00c4\5\64\33\2\u00ba\u00c4\5\62\32\2\u00bb\u00bc\5\64"+
		"\33\2\u00bc\u00bd\5,\27\2\u00bd\u00be\5*\26\2\u00be\u00c4\3\2\2\2\u00bf"+
		"\u00c0\5\62\32\2\u00c0\u00c1\5,\27\2\u00c1\u00c2\5*\26\2\u00c2\u00c4\3"+
		"\2\2\2\u00c3\u00b9\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3"+
		"\u00bf\3\2\2\2\u00c4+\3\2\2\2\u00c5\u00c6\t\4\2\2\u00c6-\3\2\2\2\u00c7"+
		"\u00c8\t\5\2\2\u00c8/\3\2\2\2\u00c9\u00ca\t\6\2\2\u00ca\61\3\2\2\2\u00cb"+
		"\u00cc\7\5\2\2\u00cc\63\3\2\2\2\u00cd\u00ce\7!\2\2\u00ce\65\3\2\2\2\r"+
		"=O]p\177\u0084\u008c\u008e\u00a3\u00ad\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}