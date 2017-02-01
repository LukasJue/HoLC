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
		RULE_state_body = 9, RULE_state_body_element = 10, RULE_transition = 11, 
		RULE_condition_block = 12, RULE_condition_line = 13, RULE_condition = 14, 
		RULE_conjunction = 15, RULE_boolean_expression = 16, RULE_assignment = 17, 
		RULE_name = 18, RULE_type = 19;
	public static final String[] ruleNames = {
		"document", "empty_lines", "signal_declaration", "signal_modifier", "signal_value_list", 
		"signal_value", "automat_block", "state_block_list", "state_block", "state_body", 
		"state_body_element", "transition", "condition_block", "condition_line", 
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
		public List<TerminalNode> NEWLINE() { return getTokens(HopperlangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HopperlangParser.NEWLINE, i);
		}
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
			int _alt;
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(45); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(44);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(47); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(50); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(49);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(52); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(54);
				empty_lines();
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(SIGNAL);
				setState(59);
				signal_modifier();
				setState(60);
				signal_value();
				setState(61);
				empty_lines();
				setState(62);
				signal_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(SIGNAL);
				setState(65);
				signal_modifier();
				setState(66);
				match(OPEN_BRACKET);
				setState(67);
				empty_lines();
				setState(68);
				signal_value_list(0);
				setState(69);
				match(CLOSE_BRACKET);
				setState(70);
				empty_lines();
				setState(71);
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
			setState(76);
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
			setState(79);
			signal_value();
			setState(80);
			empty_lines();
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Signal_value_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_signal_value_list);
					setState(82);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(83);
					signal_value();
					setState(84);
					empty_lines();
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			setState(91);
			name();
			setState(92);
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
			setState(94);
			match(AUTOMAT);
			setState(95);
			name();
			setState(96);
			match(OPEN_BLOCK);
			setState(97);
			empty_lines();
			setState(98);
			state_block_list();
			setState(99);
			match(CLOSE_BLOCK);
			setState(100);
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
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(102);
					state_block();
					setState(103);
					empty_lines();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(110);
			match(STATE);
			setState(111);
			name();
			setState(112);
			match(OPEN_BLOCK);
			setState(113);
			empty_lines();
			setState(114);
			state_body();
			setState(115);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(117);
					state_body_element();
					setState(118);
					empty_lines();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TransitionContext transition() {
			return getRuleContext(TransitionContext.class,0);
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
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				assignment();
				}
				break;
			case CONDITION:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				transition();
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

	public static class TransitionContext extends ParserRuleContext {
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public TransitionContext transition() {
			return getRuleContext(TransitionContext.class,0);
		}
		public Condition_lineContext condition_line() {
			return getRuleContext(Condition_lineContext.class,0);
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
		enterRule(_localctx, 22, RULE_transition);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				condition_block();
				setState(130);
				transition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				condition_line();
				setState(133);
				transition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				condition_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				condition_line();
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

	public static class Condition_blockContext extends ParserRuleContext {
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
		public TerminalNode CLOSE_BLOCK() { return getToken(HopperlangParser.CLOSE_BLOCK, 0); }
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
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
		enterRule(_localctx, 24, RULE_condition_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(CONDITION);
			setState(140);
			condition();
			setState(141);
			match(OPEN_BLOCK);
			setState(142);
			empty_lines();
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				transition();
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONDITION );
			setState(148);
			match(CLOSE_BLOCK);
			setState(149);
			empty_lines();
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(150);
				condition_block();
				}
				break;
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

	public static class Condition_lineContext extends ParserRuleContext {
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
		public Condition_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).enterCondition_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HopperlangListener ) ((HopperlangListener)listener).exitCondition_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HopperlangVisitor ) return ((HopperlangVisitor<? extends T>)visitor).visitCondition_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_lineContext condition_line() throws RecognitionException {
		Condition_lineContext _localctx = new Condition_lineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(CONDITION);
			setState(154);
			condition();
			setState(155);
			match(TRANSITION);
			setState(156);
			name();
			setState(157);
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
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				boolean_expression();
				setState(160);
				conjunction();
				setState(161);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
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
			setState(166);
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
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(NEGATION);
				setState(169);
				boolean_expression();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(OPEN_BRACKET);
				setState(171);
				assignment();
				setState(172);
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				name();
				setState(177);
				match(ASSIGNMENT);
				setState(178);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				name();
				setState(181);
				match(ASSIGNMENT);
				setState(182);
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
			setState(186);
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
			setState(188);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00c1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\6\3\60\n\3\r\3\16\3"+
		"\61\3\3\6\3\65\n\3\r\3\16\3\66\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13{\n\13\f\13\16\13~\13\13\3\f\3\f\5"+
		"\f\u0082\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\6\16\u0093\n\16\r\16\16\16\u0094\3\16\3\16\3\16\5\16\u009a"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00a7"+
		"\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b1\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00bb\n\23\3\24\3\24\3\25\3\25\3\25"+
		"\4m|\3\n\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\4\3\2\t\13"+
		"\3\2\21\23\u00be\2*\3\2\2\2\4:\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nP\3\2\2"+
		"\2\f]\3\2\2\2\16`\3\2\2\2\20m\3\2\2\2\22p\3\2\2\2\24|\3\2\2\2\26\u0081"+
		"\3\2\2\2\30\u008b\3\2\2\2\32\u008d\3\2\2\2\34\u009b\3\2\2\2\36\u00a6\3"+
		"\2\2\2 \u00a8\3\2\2\2\"\u00b0\3\2\2\2$\u00ba\3\2\2\2&\u00bc\3\2\2\2(\u00be"+
		"\3\2\2\2*+\5\6\4\2+,\5\16\b\2,-\7\2\2\3-\3\3\2\2\2.\60\7\4\2\2/.\3\2\2"+
		"\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62;\3\2\2\2\63\65\7\4\2\2\64"+
		"\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\28;\5"+
		"\4\3\29;\3\2\2\2:/\3\2\2\2:\64\3\2\2\2:9\3\2\2\2;\5\3\2\2\2<=\7\b\2\2"+
		"=>\5\b\5\2>?\5\f\7\2?@\5\4\3\2@A\5\6\4\2AM\3\2\2\2BC\7\b\2\2CD\5\b\5\2"+
		"DE\7\26\2\2EF\5\4\3\2FG\5\n\6\2GH\7\27\2\2HI\5\4\3\2IJ\5\6\4\2JM\3\2\2"+
		"\2KM\3\2\2\2L<\3\2\2\2LB\3\2\2\2LK\3\2\2\2M\7\3\2\2\2NO\t\2\2\2O\t\3\2"+
		"\2\2PQ\b\6\1\2QR\5\f\7\2RS\5\4\3\2SZ\3\2\2\2TU\f\4\2\2UV\5\f\7\2VW\5\4"+
		"\3\2WY\3\2\2\2XT\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\13\3\2\2\2\\"+
		"Z\3\2\2\2]^\5&\24\2^_\5(\25\2_\r\3\2\2\2`a\7\f\2\2ab\5&\24\2bc\7\6\2\2"+
		"cd\5\4\3\2de\5\20\t\2ef\7\7\2\2fg\5\4\3\2g\17\3\2\2\2hi\5\22\n\2ij\5\4"+
		"\3\2jl\3\2\2\2kh\3\2\2\2lo\3\2\2\2mn\3\2\2\2mk\3\2\2\2n\21\3\2\2\2om\3"+
		"\2\2\2pq\7\r\2\2qr\5&\24\2rs\7\6\2\2st\5\4\3\2tu\5\24\13\2uv\7\7\2\2v"+
		"\23\3\2\2\2wx\5\26\f\2xy\5\4\3\2y{\3\2\2\2zw\3\2\2\2{~\3\2\2\2|}\3\2\2"+
		"\2|z\3\2\2\2}\25\3\2\2\2~|\3\2\2\2\177\u0082\5$\23\2\u0080\u0082\5\30"+
		"\r\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\27\3\2\2\2\u0083\u0084"+
		"\5\32\16\2\u0084\u0085\5\30\r\2\u0085\u008c\3\2\2\2\u0086\u0087\5\34\17"+
		"\2\u0087\u0088\5\30\r\2\u0088\u008c\3\2\2\2\u0089\u008c\5\32\16\2\u008a"+
		"\u008c\5\34\17\2\u008b\u0083\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008a\3\2\2\2\u008c\31\3\2\2\2\u008d\u008e\7\16\2\2\u008e"+
		"\u008f\5\36\20\2\u008f\u0090\7\6\2\2\u0090\u0092\5\4\3\2\u0091\u0093\5"+
		"\30\r\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\7\2\2\u0097\u0099\5\4"+
		"\3\2\u0098\u009a\5\32\16\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\33\3\2\2\2\u009b\u009c\7\16\2\2\u009c\u009d\5\36\20\2\u009d\u009e\7\20"+
		"\2\2\u009e\u009f\5&\24\2\u009f\u00a0\5\4\3\2\u00a0\35\3\2\2\2\u00a1\u00a2"+
		"\5\"\22\2\u00a2\u00a3\5 \21\2\u00a3\u00a4\5\36\20\2\u00a4\u00a7\3\2\2"+
		"\2\u00a5\u00a7\5\"\22\2\u00a6\u00a1\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\37\3\2\2\2\u00a8\u00a9\t\3\2\2\u00a9!\3\2\2\2\u00aa\u00ab\7\17\2\2\u00ab"+
		"\u00b1\5\"\22\2\u00ac\u00ad\7\26\2\2\u00ad\u00ae\5$\23\2\u00ae\u00af\7"+
		"\27\2\2\u00af\u00b1\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1"+
		"#\3\2\2\2\u00b2\u00b3\5&\24\2\u00b3\u00b4\7\25\2\2\u00b4\u00b5\7\5\2\2"+
		"\u00b5\u00bb\3\2\2\2\u00b6\u00b7\5&\24\2\u00b7\u00b8\7\25\2\2\u00b8\u00b9"+
		"\5&\24\2\u00b9\u00bb\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb"+
		"%\3\2\2\2\u00bc\u00bd\7\24\2\2\u00bd\'\3\2\2\2\u00be\u00bf\7\24\2\2\u00bf"+
		")\3\2\2\2\20\61\66:LZm|\u0081\u008b\u0094\u0099\u00a6\u00b0\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}