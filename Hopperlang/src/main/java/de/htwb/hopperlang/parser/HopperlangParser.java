// Generated from C:/Users/juene/IdeaProjects/Hopperlang/src/main/res\Hopperlang.g4 by ANTLR 4.6
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
		RULE_signal_value_list = 3, RULE_signal_value = 4, RULE_automat_block = 5, 
		RULE_state_block_list = 6, RULE_state_block = 7, RULE_state_body = 8, 
		RULE_state_body_element = 9, RULE_condition_block = 10, RULE_condition = 11, 
		RULE_conjunction = 12, RULE_boolean_expression = 13, RULE_assignment = 14, 
		RULE_name = 15, RULE_type = 16;
	public static final String[] ruleNames = {
		"document", "empty_lines", "signal_declaration", "signal_value_list", 
		"signal_value", "automat_block", "state_block_list", "state_block", "state_body", 
		"state_body_element", "condition_block", "condition", "conjunction", "boolean_expression", 
		"assignment", "name", "type"
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
			setState(34);
			signal_declaration();
			setState(35);
			automat_block();
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
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(38); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(37);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(40); 
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
				setState(43); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(42);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(45); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(47);
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
		public TerminalNode SIG_INPUT() { return getToken(HopperlangParser.SIG_INPUT, 0); }
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
		public TerminalNode SIG_OUTPUT() { return getToken(HopperlangParser.SIG_OUTPUT, 0); }
		public TerminalNode SIG_LOCAL() { return getToken(HopperlangParser.SIG_LOCAL, 0); }
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
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(SIGNAL);
				setState(52);
				match(SIG_INPUT);
				setState(53);
				signal_value();
				setState(54);
				empty_lines();
				setState(55);
				signal_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(SIGNAL);
				setState(58);
				match(SIG_OUTPUT);
				setState(59);
				signal_value();
				setState(60);
				empty_lines();
				setState(61);
				signal_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(SIGNAL);
				setState(64);
				match(SIG_LOCAL);
				setState(65);
				signal_value();
				setState(66);
				empty_lines();
				setState(67);
				signal_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				match(SIGNAL);
				setState(70);
				match(SIG_INPUT);
				setState(71);
				match(OPEN_BRACKET);
				setState(72);
				empty_lines();
				setState(73);
				signal_value_list(0);
				setState(74);
				match(CLOSE_BRACKET);
				setState(75);
				empty_lines();
				setState(76);
				signal_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				match(SIGNAL);
				setState(79);
				match(SIG_OUTPUT);
				setState(80);
				match(OPEN_BRACKET);
				setState(81);
				empty_lines();
				setState(82);
				signal_value_list(0);
				setState(83);
				match(CLOSE_BRACKET);
				setState(84);
				empty_lines();
				setState(85);
				signal_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				match(SIGNAL);
				setState(88);
				match(SIG_LOCAL);
				setState(89);
				match(OPEN_BRACKET);
				setState(90);
				empty_lines();
				setState(91);
				signal_value_list(0);
				setState(92);
				match(CLOSE_BRACKET);
				setState(93);
				empty_lines();
				setState(94);
				signal_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_signal_value_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(100);
			signal_value();
			setState(101);
			empty_lines();
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
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
					setState(103);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(104);
					signal_value();
					setState(105);
					empty_lines();
					}
					} 
				}
				setState(111);
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
		enterRule(_localctx, 8, RULE_signal_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			name();
			setState(113);
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
		enterRule(_localctx, 10, RULE_automat_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(AUTOMAT);
			setState(116);
			name();
			setState(117);
			match(OPEN_BLOCK);
			setState(118);
			empty_lines();
			setState(119);
			state_block_list();
			setState(120);
			match(CLOSE_BLOCK);
			setState(121);
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
		enterRule(_localctx, 12, RULE_state_block_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STATE) {
				{
				{
				setState(123);
				state_block();
				setState(124);
				empty_lines();
				}
				}
				setState(130);
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
		enterRule(_localctx, 14, RULE_state_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(STATE);
			setState(132);
			name();
			setState(133);
			match(OPEN_BLOCK);
			setState(134);
			empty_lines();
			setState(135);
			state_body();
			setState(136);
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
		enterRule(_localctx, 16, RULE_state_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(138);
					state_body_element();
					setState(139);
					empty_lines();
					}
					} 
				}
				setState(145);
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
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
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
		enterRule(_localctx, 18, RULE_state_body_element);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				assignment();
				}
				break;
			case CONDITION:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				condition_block();
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
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(HopperlangParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(HopperlangParser.CLOSE_BLOCK, 0); }
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
		enterRule(_localctx, 20, RULE_condition_block);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
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
				setState(155);
				condition_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(CONDITION);
				setState(158);
				condition();
				setState(159);
				match(TRANSITION);
				setState(160);
				name();
				setState(161);
				empty_lines();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(CONDITION);
				setState(164);
				condition();
				setState(165);
				match(OPEN_BLOCK);
				setState(166);
				empty_lines();
				setState(167);
				condition_block();
				setState(168);
				match(CLOSE_BLOCK);
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
		enterRule(_localctx, 22, RULE_condition);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				boolean_expression();
				setState(173);
				conjunction();
				setState(174);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
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
		enterRule(_localctx, 24, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		enterRule(_localctx, 26, RULE_boolean_expression);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(NEGATION);
				setState(182);
				boolean_expression();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(OPEN_BRACKET);
				setState(184);
				assignment();
				setState(185);
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
		enterRule(_localctx, 28, RULE_assignment);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				name();
				setState(190);
				match(ASSIGNMENT);
				setState(191);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				name();
				setState(194);
				match(ASSIGNMENT);
				setState(195);
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
		enterRule(_localctx, 30, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		enterRule(_localctx, 32, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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
		case 3:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00ce\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\6\3)\n\3\r\3\16\3*\3\3\6\3.\n\3\r\3\16\3/\3\3\3\3\5\3"+
		"\64\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4d\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5n\n\5\f\5\16\5q\13\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b\u0081\n\b\f\b\16\b\u0084\13\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u0090\n\n\f\n\16\n\u0093\13"+
		"\n\3\13\3\13\5\13\u0097\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ad\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00b4\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00be\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c8\n\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\u0091\3\b\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"\2\3\3\2\21\23\u00cf\2$\3\2\2\2\4\63\3\2\2\2\6c\3\2\2\2\be\3\2\2\2"+
		"\nr\3\2\2\2\fu\3\2\2\2\16\u0082\3\2\2\2\20\u0085\3\2\2\2\22\u0091\3\2"+
		"\2\2\24\u0096\3\2\2\2\26\u00ac\3\2\2\2\30\u00b3\3\2\2\2\32\u00b5\3\2\2"+
		"\2\34\u00bd\3\2\2\2\36\u00c7\3\2\2\2 \u00c9\3\2\2\2\"\u00cb\3\2\2\2$%"+
		"\5\6\4\2%&\5\f\7\2&\3\3\2\2\2\')\7\4\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2"+
		"\2*+\3\2\2\2+\64\3\2\2\2,.\7\4\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3"+
		"\2\2\2\60\61\3\2\2\2\61\64\5\4\3\2\62\64\3\2\2\2\63(\3\2\2\2\63-\3\2\2"+
		"\2\63\62\3\2\2\2\64\5\3\2\2\2\65\66\7\b\2\2\66\67\7\t\2\2\678\5\n\6\2"+
		"89\5\4\3\29:\5\6\4\2:d\3\2\2\2;<\7\b\2\2<=\7\n\2\2=>\5\n\6\2>?\5\4\3\2"+
		"?@\5\6\4\2@d\3\2\2\2AB\7\b\2\2BC\7\13\2\2CD\5\n\6\2DE\5\4\3\2EF\5\6\4"+
		"\2Fd\3\2\2\2GH\7\b\2\2HI\7\t\2\2IJ\7\26\2\2JK\5\4\3\2KL\5\b\5\2LM\7\27"+
		"\2\2MN\5\4\3\2NO\5\6\4\2Od\3\2\2\2PQ\7\b\2\2QR\7\n\2\2RS\7\26\2\2ST\5"+
		"\4\3\2TU\5\b\5\2UV\7\27\2\2VW\5\4\3\2WX\5\6\4\2Xd\3\2\2\2YZ\7\b\2\2Z["+
		"\7\13\2\2[\\\7\26\2\2\\]\5\4\3\2]^\5\b\5\2^_\7\27\2\2_`\5\4\3\2`a\5\6"+
		"\4\2ad\3\2\2\2bd\3\2\2\2c\65\3\2\2\2c;\3\2\2\2cA\3\2\2\2cG\3\2\2\2cP\3"+
		"\2\2\2cY\3\2\2\2cb\3\2\2\2d\7\3\2\2\2ef\b\5\1\2fg\5\n\6\2gh\5\4\3\2ho"+
		"\3\2\2\2ij\f\4\2\2jk\5\n\6\2kl\5\4\3\2ln\3\2\2\2mi\3\2\2\2nq\3\2\2\2o"+
		"m\3\2\2\2op\3\2\2\2p\t\3\2\2\2qo\3\2\2\2rs\5 \21\2st\5\"\22\2t\13\3\2"+
		"\2\2uv\7\f\2\2vw\5 \21\2wx\7\6\2\2xy\5\4\3\2yz\5\16\b\2z{\7\7\2\2{|\5"+
		"\4\3\2|\r\3\2\2\2}~\5\20\t\2~\177\5\4\3\2\177\u0081\3\2\2\2\u0080}\3\2"+
		"\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\17\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\r\2\2\u0086\u0087\5 \21"+
		"\2\u0087\u0088\7\6\2\2\u0088\u0089\5\4\3\2\u0089\u008a\5\22\n\2\u008a"+
		"\u008b\7\7\2\2\u008b\21\3\2\2\2\u008c\u008d\5\24\13\2\u008d\u008e\5\4"+
		"\3\2\u008e\u0090\3\2\2\2\u008f\u008c\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\23\3\2\2\2\u0093\u0091\3\2\2"+
		"\2\u0094\u0097\5\36\20\2\u0095\u0097\5\26\f\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\25\3\2\2\2\u0098\u0099\7\16\2\2\u0099\u009a\5\30"+
		"\r\2\u009a\u009b\7\20\2\2\u009b\u009c\5 \21\2\u009c\u009d\5\4\3\2\u009d"+
		"\u009e\5\26\f\2\u009e\u00ad\3\2\2\2\u009f\u00a0\7\16\2\2\u00a0\u00a1\5"+
		"\30\r\2\u00a1\u00a2\7\20\2\2\u00a2\u00a3\5 \21\2\u00a3\u00a4\5\4\3\2\u00a4"+
		"\u00ad\3\2\2\2\u00a5\u00a6\7\16\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\7"+
		"\6\2\2\u00a8\u00a9\5\4\3\2\u00a9\u00aa\5\26\f\2\u00aa\u00ab\7\7\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u0098\3\2\2\2\u00ac\u009f\3\2\2\2\u00ac\u00a5\3\2"+
		"\2\2\u00ad\27\3\2\2\2\u00ae\u00af\5\34\17\2\u00af\u00b0\5\32\16\2\u00b0"+
		"\u00b1\5\30\r\2\u00b1\u00b4\3\2\2\2\u00b2\u00b4\5\34\17\2\u00b3\u00ae"+
		"\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\31\3\2\2\2\u00b5\u00b6\t\2\2\2\u00b6"+
		"\33\3\2\2\2\u00b7\u00b8\7\17\2\2\u00b8\u00be\5\34\17\2\u00b9\u00ba\7\26"+
		"\2\2\u00ba\u00bb\5\36\20\2\u00bb\u00bc\7\27\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00b7\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be\35\3\2\2\2\u00bf\u00c0\5 \21"+
		"\2\u00c0\u00c1\7\25\2\2\u00c1\u00c2\7\5\2\2\u00c2\u00c8\3\2\2\2\u00c3"+
		"\u00c4\5 \21\2\u00c4\u00c5\7\25\2\2\u00c5\u00c6\5 \21\2\u00c6\u00c8\3"+
		"\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8\37\3\2\2\2\u00c9"+
		"\u00ca\7\24\2\2\u00ca!\3\2\2\2\u00cb\u00cc\7\24\2\2\u00cc#\3\2\2\2\16"+
		"*/\63co\u0082\u0091\u0096\u00ac\u00b3\u00bd\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}