// Generated from C:/Users/juene/Git/hopperlang/Hopperlang/src/main/res\Hopperlang.g4 by ANTLR 4.6
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
		TRANSITION=14, AND=15, OR=16, XOR=17, NAME=18, ASSIGNMENT=19, OPEN_BRACKET=20, 
		CLOSE_BRACKET=21, COMMENT=22, MULTILINE_COMMENT=23;
	public static final int
		RULE_document = 0, RULE_empty_lines = 1, RULE_signal_declaration = 2, 
		RULE_signal_modifier = 3, RULE_signal_value_list = 4, RULE_signal_value = 5, 
		RULE_automat_block = 6, RULE_state_block_list = 7, RULE_state_block = 8, 
		RULE_state_body = 9, RULE_state_body_element = 10, RULE_condition_block = 11, 
		RULE_transition_block = 12, RULE_transition = 13, RULE_condition = 14, 
		RULE_conjunction = 15, RULE_boolean_expression = 16, RULE_assignment = 17, 
		RULE_name = 18, RULE_type = 19;
	public static final String[] ruleNames = {
		"document", "empty_lines", "signal_declaration", "signal_modifier", "signal_value_list", 
		"signal_value", "automat_block", "state_block_list", "state_block", "state_body", 
		"state_body_element", "condition_block", "transition_block", "transition", 
		"condition", "conjunction", "boolean_expression", "assignment", "name", 
		"type"
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
			setState(40);
			signal_declaration();
			setState(41);
			automat_block();
			setState(42);
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
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(NEWLINE);
				setState(45);
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
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(SIGNAL);
				setState(50);
				signal_modifier();
				setState(51);
				signal_value();
				setState(52);
				empty_lines();
				setState(53);
				signal_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(SIGNAL);
				setState(56);
				signal_modifier();
				setState(57);
				match(OPEN_BRACKET);
				setState(58);
				empty_lines();
				setState(59);
				signal_value_list(0);
				setState(60);
				match(CLOSE_BRACKET);
				setState(61);
				empty_lines();
				setState(62);
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
			setState(67);
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
			setState(70);
			signal_value();
			setState(71);
			empty_lines();
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
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
					setState(73);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(74);
					signal_value();
					setState(75);
					empty_lines();
					}
					} 
				}
				setState(81);
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
			setState(82);
			name();
			setState(83);
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
			setState(85);
			match(AUTOMAT);
			setState(86);
			name();
			setState(87);
			match(OPEN_BLOCK);
			setState(88);
			empty_lines();
			setState(89);
			state_block_list();
			setState(90);
			match(CLOSE_BLOCK);
			setState(91);
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
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(93);
					state_block();
					setState(94);
					empty_lines();
					}
					} 
				}
				setState(100);
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
			setState(101);
			match(STATE);
			setState(102);
			name();
			setState(103);
			match(OPEN_BLOCK);
			setState(104);
			empty_lines();
			setState(105);
			state_body();
			setState(106);
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
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONDITION || _la==NAME) {
				{
				{
				setState(108);
				state_body_element();
				setState(109);
				empty_lines();
				}
				}
				setState(115);
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
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONDITION:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				condition_block();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
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
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				transition();
				setState(121);
				condition_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				transition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				transition_block();
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(125);
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
			setState(130);
			match(CONDITION);
			setState(131);
			condition();
			setState(132);
			match(OPEN_BLOCK);
			setState(133);
			empty_lines();
			setState(134);
			condition_block();
			setState(135);
			match(CLOSE_BLOCK);
			setState(136);
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
			setState(138);
			match(CONDITION);
			setState(139);
			condition();
			setState(140);
			match(TRANSITION);
			setState(141);
			name();
			setState(142);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				boolean_expression();
				setState(145);
				conjunction();
				setState(146);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
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
			setState(151);
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
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(NEGATION);
				setState(154);
				boolean_expression();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(OPEN_BRACKET);
				setState(156);
				assignment();
				setState(157);
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
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(HopperlangParser.ASSIGNMENT, 0); }
		public TerminalNode NUMBER() { return getToken(HopperlangParser.NUMBER, 0); }
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				name();
				setState(162);
				match(ASSIGNMENT);
				setState(163);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				name();
				setState(166);
				match(ASSIGNMENT);
				setState(167);
				name();
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
		enterRule(_localctx, 36, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
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
		enterRule(_localctx, 38, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00b2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3\62\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4D"+
		"\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6P\n\6\f\6\16\6S\13\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\tc\n\t\f\t\16"+
		"\tf\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13r\n\13\f\13\16"+
		"\13u\13\13\3\f\3\f\5\fy\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0081\n\r\5\r"+
		"\u0083\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u0098\n\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00a2\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00ac\n\23\3\24\3\24\3\25\3\25\3\25\3d\3\n\26\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(\2\4\3\2\t\13\3\2\21\23\u00aa\2*\3\2\2\2"+
		"\4\61\3\2\2\2\6C\3\2\2\2\bE\3\2\2\2\nG\3\2\2\2\fT\3\2\2\2\16W\3\2\2\2"+
		"\20d\3\2\2\2\22g\3\2\2\2\24s\3\2\2\2\26x\3\2\2\2\30\u0082\3\2\2\2\32\u0084"+
		"\3\2\2\2\34\u008c\3\2\2\2\36\u0097\3\2\2\2 \u0099\3\2\2\2\"\u00a1\3\2"+
		"\2\2$\u00ab\3\2\2\2&\u00ad\3\2\2\2(\u00af\3\2\2\2*+\5\6\4\2+,\5\16\b\2"+
		",-\7\2\2\3-\3\3\2\2\2./\7\4\2\2/\62\5\4\3\2\60\62\3\2\2\2\61.\3\2\2\2"+
		"\61\60\3\2\2\2\62\5\3\2\2\2\63\64\7\b\2\2\64\65\5\b\5\2\65\66\5\f\7\2"+
		"\66\67\5\4\3\2\678\5\6\4\28D\3\2\2\29:\7\b\2\2:;\5\b\5\2;<\7\26\2\2<="+
		"\5\4\3\2=>\5\n\6\2>?\7\27\2\2?@\5\4\3\2@A\5\6\4\2AD\3\2\2\2BD\3\2\2\2"+
		"C\63\3\2\2\2C9\3\2\2\2CB\3\2\2\2D\7\3\2\2\2EF\t\2\2\2F\t\3\2\2\2GH\b\6"+
		"\1\2HI\5\f\7\2IJ\5\4\3\2JQ\3\2\2\2KL\f\4\2\2LM\5\f\7\2MN\5\4\3\2NP\3\2"+
		"\2\2OK\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\13\3\2\2\2SQ\3\2\2\2TU\5"+
		"&\24\2UV\5(\25\2V\r\3\2\2\2WX\7\f\2\2XY\5&\24\2YZ\7\6\2\2Z[\5\4\3\2[\\"+
		"\5\20\t\2\\]\7\7\2\2]^\5\4\3\2^\17\3\2\2\2_`\5\22\n\2`a\5\4\3\2ac\3\2"+
		"\2\2b_\3\2\2\2cf\3\2\2\2de\3\2\2\2db\3\2\2\2e\21\3\2\2\2fd\3\2\2\2gh\7"+
		"\r\2\2hi\5&\24\2ij\7\6\2\2jk\5\4\3\2kl\5\24\13\2lm\7\7\2\2m\23\3\2\2\2"+
		"no\5\26\f\2op\5\4\3\2pr\3\2\2\2qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2"+
		"\2t\25\3\2\2\2us\3\2\2\2vy\5\30\r\2wy\5$\23\2xv\3\2\2\2xw\3\2\2\2y\27"+
		"\3\2\2\2z{\5\34\17\2{|\5\30\r\2|\u0083\3\2\2\2}\u0083\5\34\17\2~\u0080"+
		"\5\32\16\2\177\u0081\5\30\r\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0083\3\2\2\2\u0082z\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0083\31\3"+
		"\2\2\2\u0084\u0085\7\16\2\2\u0085\u0086\5\36\20\2\u0086\u0087\7\6\2\2"+
		"\u0087\u0088\5\4\3\2\u0088\u0089\5\30\r\2\u0089\u008a\7\7\2\2\u008a\u008b"+
		"\5\4\3\2\u008b\33\3\2\2\2\u008c\u008d\7\16\2\2\u008d\u008e\5\36\20\2\u008e"+
		"\u008f\7\20\2\2\u008f\u0090\5&\24\2\u0090\u0091\5\4\3\2\u0091\35\3\2\2"+
		"\2\u0092\u0093\5\"\22\2\u0093\u0094\5 \21\2\u0094\u0095\5\36\20\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0098\5\"\22\2\u0097\u0092\3\2\2\2\u0097\u0096\3"+
		"\2\2\2\u0098\37\3\2\2\2\u0099\u009a\t\3\2\2\u009a!\3\2\2\2\u009b\u009c"+
		"\7\17\2\2\u009c\u00a2\5\"\22\2\u009d\u009e\7\26\2\2\u009e\u009f\5$\23"+
		"\2\u009f\u00a0\7\27\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1"+
		"\u009d\3\2\2\2\u00a2#\3\2\2\2\u00a3\u00a4\5&\24\2\u00a4\u00a5\7\25\2\2"+
		"\u00a5\u00a6\7\5\2\2\u00a6\u00ac\3\2\2\2\u00a7\u00a8\5&\24\2\u00a8\u00a9"+
		"\7\25\2\2\u00a9\u00aa\5&\24\2\u00aa\u00ac\3\2\2\2\u00ab\u00a3\3\2\2\2"+
		"\u00ab\u00a7\3\2\2\2\u00ac%\3\2\2\2\u00ad\u00ae\7\24\2\2\u00ae\'\3\2\2"+
		"\2\u00af\u00b0\7\24\2\2\u00b0)\3\2\2\2\r\61CQdsx\u0080\u0082\u0097\u00a1"+
		"\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}