// Generated from C:/Users/juene/Git/hopperlang/Hopperlang/src/main/res\Hopperlang.g4 by ANTLR 4.6
package de.htwb.hopperlang.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HopperlangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NEWLINE=2, NUMBER=3, OPEN_BLOCK=4, CLOSE_BLOCK=5, SIGNAL=6, SIG_INPUT=7, 
		SIG_OUTPUT=8, SIG_LOCAL=9, AUTOMAT=10, STATE=11, CONDITION=12, NEGATION=13, 
		TRANSITION=14, AND=15, OR=16, XOR=17, NAME=18, ASSIGNMENT=19, OPEN_BRACKET=20, 
		CLOSE_BRACKET=21, COMMENT=22, MULTILINE_COMMENT=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "NEWLINE", "NUMBER", "OPEN_BLOCK", "CLOSE_BLOCK", "SIGNAL", "SIG_INPUT", 
		"SIG_OUTPUT", "SIG_LOCAL", "AUTOMAT", "STATE", "CONDITION", "NEGATION", 
		"TRANSITION", "AND", "OR", "XOR", "NAME", "ASSIGNMENT", "OPEN_BRACKET", 
		"CLOSE_BRACKET", "COMMENT", "MULTILINE_COMMENT"
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


	public HopperlangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hopperlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\6\2\63\n\2\r\2\16\2\64\3\2\3\2\3\3\3\3\3\4\6\4<\n\4\r\4\16\4=\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u008a\n\23\f\23\16\23\u008d"+
		"\13\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\7\27\u0097\n\27\f\27\16"+
		"\27\u009a\13\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00a2\n\30\f\30\16"+
		"\30\u00a5\13\30\3\30\3\30\3\30\3\30\3\30\4\u0098\u00a3\2\31\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\3\2\7\5\2\13\13\17\17\"\"\3\2\f\f\3\2\62"+
		";\4\2C\\c|\5\2\62;C\\c|\u00af\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\62\3\2\2\2\58\3\2\2\2\7;\3\2\2\2\t?"+
		"\3\2\2\2\13B\3\2\2\2\rF\3\2\2\2\17M\3\2\2\2\21S\3\2\2\2\23Z\3\2\2\2\25"+
		"`\3\2\2\2\27h\3\2\2\2\31n\3\2\2\2\33s\3\2\2\2\35w\3\2\2\2\37|\3\2\2\2"+
		"!\u0080\3\2\2\2#\u0083\3\2\2\2%\u0087\3\2\2\2\'\u008e\3\2\2\2)\u0090\3"+
		"\2\2\2+\u0092\3\2\2\2-\u0094\3\2\2\2/\u009d\3\2\2\2\61\63\t\2\2\2\62\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67"+
		"\b\2\2\2\67\4\3\2\2\289\t\3\2\29\6\3\2\2\2:<\t\4\2\2;:\3\2\2\2<=\3\2\2"+
		"\2=;\3\2\2\2=>\3\2\2\2>\b\3\2\2\2?@\7f\2\2@A\7q\2\2A\n\3\2\2\2BC\7g\2"+
		"\2CD\7p\2\2DE\7f\2\2E\f\3\2\2\2FG\7u\2\2GH\7k\2\2HI\7i\2\2IJ\7p\2\2JK"+
		"\7c\2\2KL\7n\2\2L\16\3\2\2\2MN\7k\2\2NO\7p\2\2OP\7r\2\2PQ\7w\2\2QR\7v"+
		"\2\2R\20\3\2\2\2ST\7q\2\2TU\7w\2\2UV\7v\2\2VW\7r\2\2WX\7w\2\2XY\7v\2\2"+
		"Y\22\3\2\2\2Z[\7n\2\2[\\\7q\2\2\\]\7e\2\2]^\7c\2\2^_\7n\2\2_\24\3\2\2"+
		"\2`a\7c\2\2ab\7w\2\2bc\7v\2\2cd\7q\2\2de\7o\2\2ef\7c\2\2fg\7v\2\2g\26"+
		"\3\2\2\2hi\7u\2\2ij\7v\2\2jk\7c\2\2kl\7v\2\2lm\7g\2\2m\30\3\2\2\2no\7"+
		"y\2\2op\7j\2\2pq\7g\2\2qr\7p\2\2r\32\3\2\2\2st\7p\2\2tu\7q\2\2uv\7v\2"+
		"\2v\34\3\2\2\2wx\7i\2\2xy\7q\2\2yz\7v\2\2z{\7q\2\2{\36\3\2\2\2|}\7c\2"+
		"\2}~\7p\2\2~\177\7f\2\2\177 \3\2\2\2\u0080\u0081\7q\2\2\u0081\u0082\7"+
		"t\2\2\u0082\"\3\2\2\2\u0083\u0084\7z\2\2\u0084\u0085\7q\2\2\u0085\u0086"+
		"\7t\2\2\u0086$\3\2\2\2\u0087\u008b\t\5\2\2\u0088\u008a\t\6\2\2\u0089\u0088"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"&\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7?\2\2\u008f(\3\2\2\2\u0090"+
		"\u0091\7*\2\2\u0091*\3\2\2\2\u0092\u0093\7+\2\2\u0093,\3\2\2\2\u0094\u0098"+
		"\7%\2\2\u0095\u0097\13\2\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009c\b\27\2\2\u009c.\3\2\2\2\u009d\u009e\7\61\2\2\u009e\u009f"+
		"\7,\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a2\13\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7,\2\2\u00a7\u00a8\7\61\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\b\30\2\2\u00aa\60\3\2\2\2\b\2\64=\u008b\u0098"+
		"\u00a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}