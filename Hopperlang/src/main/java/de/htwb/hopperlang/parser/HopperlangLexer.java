// Generated from /home/laokoon/Git/hopperlang/Hopperlang/src/main/res/Hopperlang.g4 by ANTLR 4.6
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
		TRANSITION=14, AND=15, OR=16, XOR=17, LOWER=18, LOWER_EQUAL=19, EQUAL=20, 
		GREATER_EQUAL=21, GREATER=22, OPEN_BRACKET=23, CLOSE_BRACKET=24, PLUS=25, 
		MINUS=26, BIT=27, BUS=28, HILO=29, INT=30, NAME=31, COMMENT=32, MULTILINE_COMMENT=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "NEWLINE", "NUMBER", "OPEN_BLOCK", "CLOSE_BLOCK", "SIGNAL", "SIG_INPUT", 
		"SIG_OUTPUT", "SIG_LOCAL", "AUTOMAT", "STATE", "CONDITION", "NEGATION", 
		"TRANSITION", "AND", "OR", "XOR", "LOWER", "LOWER_EQUAL", "EQUAL", "GREATER_EQUAL", 
		"GREATER", "OPEN_BRACKET", "CLOSE_BRACKET", "PLUS", "MINUS", "BIT", "BUS", 
		"HILO", "INT", "NAME", "COMMENT", "MULTILINE_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00e8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\6\2G\n\2\r\2\16\2H\3\2\3\2\3\3\3\3\3\4\6\4P\n\4\r\4\16"+
		"\4Q\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\6\35\u00b9\n\35\r\35\16"+
		"\35\u00ba\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\6\37\u00c7"+
		"\n\37\r\37\16\37\u00c8\3 \3 \7 \u00cd\n \f \16 \u00d0\13 \3!\3!\7!\u00d4"+
		"\n!\f!\16!\u00d7\13!\3!\3!\3\"\3\"\3\"\3\"\7\"\u00df\n\"\f\"\16\"\u00e2"+
		"\13\"\3\"\3\"\3\"\3\"\3\"\4\u00d5\u00e0\2#\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\7\5\2\13\13\17"+
		"\17\"\"\3\2\f\f\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\u00ee\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3F\3\2\2\2\5L\3\2\2\2\7O\3\2\2\2\tS"+
		"\3\2\2\2\13V\3\2\2\2\rZ\3\2\2\2\17a\3\2\2\2\21g\3\2\2\2\23n\3\2\2\2\25"+
		"t\3\2\2\2\27|\3\2\2\2\31\u0082\3\2\2\2\33\u0087\3\2\2\2\35\u008b\3\2\2"+
		"\2\37\u0090\3\2\2\2!\u0094\3\2\2\2#\u0097\3\2\2\2%\u009b\3\2\2\2\'\u009d"+
		"\3\2\2\2)\u00a0\3\2\2\2+\u00a2\3\2\2\2-\u00a5\3\2\2\2/\u00a7\3\2\2\2\61"+
		"\u00a9\3\2\2\2\63\u00ab\3\2\2\2\65\u00ad\3\2\2\2\67\u00af\3\2\2\29\u00b3"+
		"\3\2\2\2;\u00bc\3\2\2\2=\u00c1\3\2\2\2?\u00ca\3\2\2\2A\u00d1\3\2\2\2C"+
		"\u00da\3\2\2\2EG\t\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2"+
		"\2\2JK\b\2\2\2K\4\3\2\2\2LM\t\3\2\2M\6\3\2\2\2NP\t\4\2\2ON\3\2\2\2PQ\3"+
		"\2\2\2QO\3\2\2\2QR\3\2\2\2R\b\3\2\2\2ST\7f\2\2TU\7q\2\2U\n\3\2\2\2VW\7"+
		"g\2\2WX\7p\2\2XY\7f\2\2Y\f\3\2\2\2Z[\7u\2\2[\\\7k\2\2\\]\7i\2\2]^\7p\2"+
		"\2^_\7c\2\2_`\7n\2\2`\16\3\2\2\2ab\7k\2\2bc\7p\2\2cd\7r\2\2de\7w\2\2e"+
		"f\7v\2\2f\20\3\2\2\2gh\7q\2\2hi\7w\2\2ij\7v\2\2jk\7r\2\2kl\7w\2\2lm\7"+
		"v\2\2m\22\3\2\2\2no\7n\2\2op\7q\2\2pq\7e\2\2qr\7c\2\2rs\7n\2\2s\24\3\2"+
		"\2\2tu\7c\2\2uv\7w\2\2vw\7v\2\2wx\7q\2\2xy\7o\2\2yz\7c\2\2z{\7v\2\2{\26"+
		"\3\2\2\2|}\7u\2\2}~\7v\2\2~\177\7c\2\2\177\u0080\7v\2\2\u0080\u0081\7"+
		"g\2\2\u0081\30\3\2\2\2\u0082\u0083\7y\2\2\u0083\u0084\7j\2\2\u0084\u0085"+
		"\7g\2\2\u0085\u0086\7p\2\2\u0086\32\3\2\2\2\u0087\u0088\7p\2\2\u0088\u0089"+
		"\7q\2\2\u0089\u008a\7v\2\2\u008a\34\3\2\2\2\u008b\u008c\7i\2\2\u008c\u008d"+
		"\7q\2\2\u008d\u008e\7v\2\2\u008e\u008f\7q\2\2\u008f\36\3\2\2\2\u0090\u0091"+
		"\7c\2\2\u0091\u0092\7p\2\2\u0092\u0093\7f\2\2\u0093 \3\2\2\2\u0094\u0095"+
		"\7q\2\2\u0095\u0096\7t\2\2\u0096\"\3\2\2\2\u0097\u0098\7z\2\2\u0098\u0099"+
		"\7q\2\2\u0099\u009a\7t\2\2\u009a$\3\2\2\2\u009b\u009c\7>\2\2\u009c&\3"+
		"\2\2\2\u009d\u009e\7>\2\2\u009e\u009f\7?\2\2\u009f(\3\2\2\2\u00a0\u00a1"+
		"\7?\2\2\u00a1*\3\2\2\2\u00a2\u00a3\7@\2\2\u00a3\u00a4\7?\2\2\u00a4,\3"+
		"\2\2\2\u00a5\u00a6\7@\2\2\u00a6.\3\2\2\2\u00a7\u00a8\7*\2\2\u00a8\60\3"+
		"\2\2\2\u00a9\u00aa\7+\2\2\u00aa\62\3\2\2\2\u00ab\u00ac\7-\2\2\u00ac\64"+
		"\3\2\2\2\u00ad\u00ae\7/\2\2\u00ae\66\3\2\2\2\u00af\u00b0\7d\2\2\u00b0"+
		"\u00b1\7k\2\2\u00b1\u00b2\7v\2\2\u00b28\3\2\2\2\u00b3\u00b4\7d\2\2\u00b4"+
		"\u00b5\7w\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b9\t\4\2"+
		"\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb:\3\2\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7k\2\2\u00be\u00bf"+
		"\7n\2\2\u00bf\u00c0\7q\2\2\u00c0<\3\2\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3"+
		"\7p\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c7\t\4\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9>\3\2\2\2\u00ca\u00ce\t\5\2\2\u00cb\u00cd\t\6\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"@\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d5\7%\2\2\u00d2\u00d4\13\2\2\2"+
		"\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\b!\2\2\u00d9"+
		"B\3\2\2\2\u00da\u00db\7\61\2\2\u00db\u00dc\7,\2\2\u00dc\u00e0\3\2\2\2"+
		"\u00dd\u00df\13\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e4\7,\2\2\u00e4\u00e5\7\61\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\""+
		"\2\2\u00e7D\3\2\2\2\n\2HQ\u00ba\u00c8\u00ce\u00d5\u00e0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}