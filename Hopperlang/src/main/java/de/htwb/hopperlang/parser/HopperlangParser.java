// Generated from C:/Users/juene/Git/hopperlang/Hopperlang/src/main/res\Hopperlang.g4 by ANTLR 4.6
package de.htwb.hopperlang.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HopperlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NEWLINE=2, NUMBER=3, OPEN_BLOCK=4, CLOSE_BLOCK=5, SIGNAL=6, SIG_INPUT=7, 
		SIG_OUTPUT=8, SIG_LOCAL=9, AUTOMAT=10, STATE=11, CONDITION=12, NEGATION=13, 
		TRANSITION=14, AND=15, OR=16, XOR=17, NAME=18, ASSIGNMENT=19, OPEN_BRACKET=20, 
		CLOSE_BRACKET=21, COMMENT=22, MULTILINE_COMMENT=23;
	public static final int
		RULE_document = 0, RULE_empty_lines = 1, RULE_signal_declaration = 2, 
		RULE_signal_modifier = 3, RULE_signal_value_list = 4, RULE_signal_value = 5, 
		RULE_automat_block = 6, RULE_state_block_list = 7, RULE_state_block = 8, 
		RULE_state_body = 9, RULE_state_body_element = 10, RULE_condition_block = 11, 
		RULE_transition_block = 12, RULE_transition = 13, RULE_condition = 14, 
		RULE_conjunction = 15, RULE_boolean_expression = 16, RULE_assignment = 17, 
		RULE_assignment_left = 18, RULE_assignment_right = 19, RULE_name = 20, 
		RULE_type = 21;
	public static final String[] ruleNames = {
		"document", "empty_lines", "signal_declaration", "signal_modifier", "signal_value_list", 
		"signal_value", "automat_block", "state_block_list", "state_block", "state_body", 
		"state_body_element", "condition_block", "transition_block", "transition", 
		"condition", "conjunction", "boolean_expression", "assignment", "assignment_left", 
		"assignment_right", "name", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'do'", "'end'", "'signal'", "'input'", "'output'", 
		"'local'", "'automat'", "'state'", "'when'", "'not'", "'goto'", "'and'", 
		"'or'", "'xor'", null, "'='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "NEWLINE", "NUMBER", "OPEN_BLOCK", "CLOSE_BLOCK", "SIGNAL", 
		"SIG_INPUT", "SIG_OUTPUT", "SIG_LOCAL", "AUTOMAT", "STATE", "CONDITION", 
		"NEGATION", "TRANSITION", "AND", "OR", "XOR", "NAME", "ASSIGNMENT", "OPEN_BRACKET", 
		"CLOSE_BRACKET", "COMMENT", "MULTILINE_COMMENT"
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
			setState(44);
			signal_declaration();
			setState(45);
			automat_block();
			setState(46);
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
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(NEWLINE);
				setState(49);
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
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(SIGNAL);
				setState(54);
				signal_modifier();
				setState(55);
				signal_value();
				setState(56);
				empty_lines();
				setState(57);
				signal_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(SIGNAL);
				setState(60);
				signal_modifier();
				setState(61);
				match(OPEN_BRACKET);
				setState(62);
				empty_lines();
				setState(63);
				signal_value_list(0);
				setState(64);
				match(CLOSE_BRACKET);
				setState(65);
				empty_lines();
				setState(66);
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
			setState(71);
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
			setState(74);
			signal_value();
			setState(75);
			empty_lines();
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
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
					setState(77);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(78);
					signal_value();
					setState(79);
					empty_lines();
					}
					} 
				}
				setState(85);
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
			setState(86);
			name();
			setState(87);
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
			setState(89);
			match(AUTOMAT);
			setState(90);
			name();
			setState(91);
			match(OPEN_BLOCK);
			setState(92);
			empty_lines();
			setState(93);
			state_block_list();
			setState(94);
			match(CLOSE_BLOCK);
			setState(95);
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
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(97);
					state_block();
					setState(98);
					empty_lines();
					}
					} 
				}
				setState(104);
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
			setState(105);
			match(STATE);
			setState(106);
			name();
			setState(107);
			match(OPEN_BLOCK);
			setState(108);
			empty_lines();
			setState(109);
			state_body();
			setState(110);
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
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONDITION || _la==NAME) {
				{
				{
				setState(112);
				state_body_element();
				setState(113);
				empty_lines();
				}
				}
				setState(119);
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
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONDITION:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				condition_block();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				transition();
				setState(125);
				condition_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				transition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				transition_block();
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(129);
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
			setState(134);
			match(CONDITION);
			setState(135);
			condition();
			setState(136);
			match(OPEN_BLOCK);
			setState(137);
			empty_lines();
			setState(138);
			condition_block();
			setState(139);
			match(CLOSE_BLOCK);
			setState(140);
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
			setState(142);
			match(CONDITION);
			setState(143);
			condition();
			setState(144);
			match(TRANSITION);
			setState(145);
			name();
			setState(146);
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				boolean_expression();
				setState(149);
				conjunction();
				setState(150);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
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
			setState(155);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(NEGATION);
				setState(158);
				boolean_expression();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(OPEN_BRACKET);
				setState(160);
				assignment();
				setState(161);
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

	public static class AssignmentContext extends ParserRuleContext {
		public Assignment_leftContext assignment_left() {
			return getRuleContext(Assignment_leftContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(HopperlangParser.ASSIGNMENT, 0); }
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
		enterRule(_localctx, 34, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			assignment_left();
			setState(166);
			match(ASSIGNMENT);
			setState(167);
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
		enterRule(_localctx, 36, RULE_assignment_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
		public TerminalNode NUMBER() { return getToken(HopperlangParser.NUMBER, 0); }
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
		enterRule(_localctx, 38, RULE_assignment_right);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				name();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(NUMBER);
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
		enterRule(_localctx, 40, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HopperlangParser.NAME, 0); }
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
		enterRule(_localctx, 42, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00b6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6T\n"+
		"\6\f\6\16\6W\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\7\tg\n\t\f\t\16\tj\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\7\13v\n\13\f\13\16\13y\13\13\3\f\3\f\5\f}\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0085\n\r\5\r\u0087\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u009c\n\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a6\n\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\5\25\u00b0\n\25\3\26\3\26\3\27\3\27\3\27\3h"+
		"\3\n\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\4\3\2\t\13\3"+
		"\2\21\23\u00ac\2.\3\2\2\2\4\65\3\2\2\2\6G\3\2\2\2\bI\3\2\2\2\nK\3\2\2"+
		"\2\fX\3\2\2\2\16[\3\2\2\2\20h\3\2\2\2\22k\3\2\2\2\24w\3\2\2\2\26|\3\2"+
		"\2\2\30\u0086\3\2\2\2\32\u0088\3\2\2\2\34\u0090\3\2\2\2\36\u009b\3\2\2"+
		"\2 \u009d\3\2\2\2\"\u00a5\3\2\2\2$\u00a7\3\2\2\2&\u00ab\3\2\2\2(\u00af"+
		"\3\2\2\2*\u00b1\3\2\2\2,\u00b3\3\2\2\2./\5\6\4\2/\60\5\16\b\2\60\61\7"+
		"\2\2\3\61\3\3\2\2\2\62\63\7\4\2\2\63\66\5\4\3\2\64\66\3\2\2\2\65\62\3"+
		"\2\2\2\65\64\3\2\2\2\66\5\3\2\2\2\678\7\b\2\289\5\b\5\29:\5\f\7\2:;\5"+
		"\4\3\2;<\5\6\4\2<H\3\2\2\2=>\7\b\2\2>?\5\b\5\2?@\7\26\2\2@A\5\4\3\2AB"+
		"\5\n\6\2BC\7\27\2\2CD\5\4\3\2DE\5\6\4\2EH\3\2\2\2FH\3\2\2\2G\67\3\2\2"+
		"\2G=\3\2\2\2GF\3\2\2\2H\7\3\2\2\2IJ\t\2\2\2J\t\3\2\2\2KL\b\6\1\2LM\5\f"+
		"\7\2MN\5\4\3\2NU\3\2\2\2OP\f\4\2\2PQ\5\f\7\2QR\5\4\3\2RT\3\2\2\2SO\3\2"+
		"\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\13\3\2\2\2WU\3\2\2\2XY\5*\26\2YZ\5"+
		",\27\2Z\r\3\2\2\2[\\\7\f\2\2\\]\5*\26\2]^\7\6\2\2^_\5\4\3\2_`\5\20\t\2"+
		"`a\7\7\2\2ab\5\4\3\2b\17\3\2\2\2cd\5\22\n\2de\5\4\3\2eg\3\2\2\2fc\3\2"+
		"\2\2gj\3\2\2\2hi\3\2\2\2hf\3\2\2\2i\21\3\2\2\2jh\3\2\2\2kl\7\r\2\2lm\5"+
		"*\26\2mn\7\6\2\2no\5\4\3\2op\5\24\13\2pq\7\7\2\2q\23\3\2\2\2rs\5\26\f"+
		"\2st\5\4\3\2tv\3\2\2\2ur\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\25\3\2"+
		"\2\2yw\3\2\2\2z}\5\30\r\2{}\5$\23\2|z\3\2\2\2|{\3\2\2\2}\27\3\2\2\2~\177"+
		"\5\34\17\2\177\u0080\5\30\r\2\u0080\u0087\3\2\2\2\u0081\u0087\5\34\17"+
		"\2\u0082\u0084\5\32\16\2\u0083\u0085\5\30\r\2\u0084\u0083\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086~\3\2\2\2\u0086\u0081\3\2\2\2"+
		"\u0086\u0082\3\2\2\2\u0087\31\3\2\2\2\u0088\u0089\7\16\2\2\u0089\u008a"+
		"\5\36\20\2\u008a\u008b\7\6\2\2\u008b\u008c\5\4\3\2\u008c\u008d\5\30\r"+
		"\2\u008d\u008e\7\7\2\2\u008e\u008f\5\4\3\2\u008f\33\3\2\2\2\u0090\u0091"+
		"\7\16\2\2\u0091\u0092\5\36\20\2\u0092\u0093\7\20\2\2\u0093\u0094\5*\26"+
		"\2\u0094\u0095\5\4\3\2\u0095\35\3\2\2\2\u0096\u0097\5\"\22\2\u0097\u0098"+
		"\5 \21\2\u0098\u0099\5\36\20\2\u0099\u009c\3\2\2\2\u009a\u009c\5\"\22"+
		"\2\u009b\u0096\3\2\2\2\u009b\u009a\3\2\2\2\u009c\37\3\2\2\2\u009d\u009e"+
		"\t\3\2\2\u009e!\3\2\2\2\u009f\u00a0\7\17\2\2\u00a0\u00a6\5\"\22\2\u00a1"+
		"\u00a2\7\26\2\2\u00a2\u00a3\5$\23\2\u00a3\u00a4\7\27\2\2\u00a4\u00a6\3"+
		"\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6#\3\2\2\2\u00a7\u00a8"+
		"\5&\24\2\u00a8\u00a9\7\25\2\2\u00a9\u00aa\5(\25\2\u00aa%\3\2\2\2\u00ab"+
		"\u00ac\5*\26\2\u00ac\'\3\2\2\2\u00ad\u00b0\5*\26\2\u00ae\u00b0\7\5\2\2"+
		"\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0)\3\2\2\2\u00b1\u00b2\7"+
		"\24\2\2\u00b2+\3\2\2\2\u00b3\u00b4\7\24\2\2\u00b4-\3\2\2\2\r\65GUhw|\u0084"+
		"\u0086\u009b\u00a5\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}