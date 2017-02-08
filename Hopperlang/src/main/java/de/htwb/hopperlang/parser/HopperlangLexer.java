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
		GREATER_EQUAL=21, GREATER=22, OPEN_BRACKET=23, CLOSE_BRACKET=24, BIT=25, 
		BUS=26, HILO=27, INT=28, NAME=29, COMMENT=30, MULTILINE_COMMENT=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "NEWLINE", "NUMBER", "OPEN_BLOCK", "CLOSE_BLOCK", "SIGNAL", "SIG_INPUT", 
		"SIG_OUTPUT", "SIG_LOCAL", "AUTOMAT", "STATE", "CONDITION", "NEGATION", 
		"TRANSITION", "AND", "OR", "XOR", "LOWER", "LOWER_EQUAL", "EQUAL", "GREATER_EQUAL", 
		"GREATER", "OPEN_BRACKET", "CLOSE_BRACKET", "BIT", "BUS", "HILO", "INT", 
		"NAME", "COMMENT", "MULTILINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'do'", "'end'", "'signal'", "'input'", "'output'", 
		"'local'", "'automat'", "'state'", "'when'", "'not'", "'goto'", "'and'", 
		"'or'", "'xor'", "'<'", "'<='", "'='", "'>='", "'>'", "'('", "')'", "'bit'", 
		null, "'hilo'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "NEWLINE", "NUMBER", "OPEN_BLOCK", "CLOSE_BLOCK", "SIGNAL", 
		"SIG_INPUT", "SIG_OUTPUT", "SIG_LOCAL", "AUTOMAT", "STATE", "CONDITION", 
		"NEGATION", "TRANSITION", "AND", "OR", "XOR", "LOWER", "LOWER_EQUAL", 
		"EQUAL", "GREATER_EQUAL", "GREATER", "OPEN_BRACKET", "CLOSE_BRACKET", 
		"BIT", "BUS", "HILO", "INT", "NAME", "COMMENT", "MULTILINE_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00e0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\6\2C\n\2\r\2\16\2D\3\2\3\2\3\3\3\3\3\4\6\4L\n\4\r\4\16\4M\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\6\33\u00b1\n\33\r\33\16\33\u00b2\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\6\35\u00bf\n\35\r\35\16\35\u00c0\3\36\3\36\7\36"+
		"\u00c5\n\36\f\36\16\36\u00c8\13\36\3\37\3\37\7\37\u00cc\n\37\f\37\16\37"+
		"\u00cf\13\37\3\37\3\37\3 \3 \3 \3 \7 \u00d7\n \f \16 \u00da\13 \3 \3 "+
		"\3 \3 \3 \4\u00cd\u00d8\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!\3\2\7\5\2\13\13\17\17\"\"\3\2\f\f\3\2\62"+
		";\4\2C\\c|\5\2\62;C\\c|\u00e6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3B\3\2\2\2\5"+
		"H\3\2\2\2\7K\3\2\2\2\tO\3\2\2\2\13R\3\2\2\2\rV\3\2\2\2\17]\3\2\2\2\21"+
		"c\3\2\2\2\23j\3\2\2\2\25p\3\2\2\2\27x\3\2\2\2\31~\3\2\2\2\33\u0083\3\2"+
		"\2\2\35\u0087\3\2\2\2\37\u008c\3\2\2\2!\u0090\3\2\2\2#\u0093\3\2\2\2%"+
		"\u0097\3\2\2\2\'\u0099\3\2\2\2)\u009c\3\2\2\2+\u009e\3\2\2\2-\u00a1\3"+
		"\2\2\2/\u00a3\3\2\2\2\61\u00a5\3\2\2\2\63\u00a7\3\2\2\2\65\u00ab\3\2\2"+
		"\2\67\u00b4\3\2\2\29\u00b9\3\2\2\2;\u00c2\3\2\2\2=\u00c9\3\2\2\2?\u00d2"+
		"\3\2\2\2AC\t\2\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2F"+
		"G\b\2\2\2G\4\3\2\2\2HI\t\3\2\2I\6\3\2\2\2JL\t\4\2\2KJ\3\2\2\2LM\3\2\2"+
		"\2MK\3\2\2\2MN\3\2\2\2N\b\3\2\2\2OP\7f\2\2PQ\7q\2\2Q\n\3\2\2\2RS\7g\2"+
		"\2ST\7p\2\2TU\7f\2\2U\f\3\2\2\2VW\7u\2\2WX\7k\2\2XY\7i\2\2YZ\7p\2\2Z["+
		"\7c\2\2[\\\7n\2\2\\\16\3\2\2\2]^\7k\2\2^_\7p\2\2_`\7r\2\2`a\7w\2\2ab\7"+
		"v\2\2b\20\3\2\2\2cd\7q\2\2de\7w\2\2ef\7v\2\2fg\7r\2\2gh\7w\2\2hi\7v\2"+
		"\2i\22\3\2\2\2jk\7n\2\2kl\7q\2\2lm\7e\2\2mn\7c\2\2no\7n\2\2o\24\3\2\2"+
		"\2pq\7c\2\2qr\7w\2\2rs\7v\2\2st\7q\2\2tu\7o\2\2uv\7c\2\2vw\7v\2\2w\26"+
		"\3\2\2\2xy\7u\2\2yz\7v\2\2z{\7c\2\2{|\7v\2\2|}\7g\2\2}\30\3\2\2\2~\177"+
		"\7y\2\2\177\u0080\7j\2\2\u0080\u0081\7g\2\2\u0081\u0082\7p\2\2\u0082\32"+
		"\3\2\2\2\u0083\u0084\7p\2\2\u0084\u0085\7q\2\2\u0085\u0086\7v\2\2\u0086"+
		"\34\3\2\2\2\u0087\u0088\7i\2\2\u0088\u0089\7q\2\2\u0089\u008a\7v\2\2\u008a"+
		"\u008b\7q\2\2\u008b\36\3\2\2\2\u008c\u008d\7c\2\2\u008d\u008e\7p\2\2\u008e"+
		"\u008f\7f\2\2\u008f \3\2\2\2\u0090\u0091\7q\2\2\u0091\u0092\7t\2\2\u0092"+
		"\"\3\2\2\2\u0093\u0094\7z\2\2\u0094\u0095\7q\2\2\u0095\u0096\7t\2\2\u0096"+
		"$\3\2\2\2\u0097\u0098\7>\2\2\u0098&\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b"+
		"\7?\2\2\u009b(\3\2\2\2\u009c\u009d\7?\2\2\u009d*\3\2\2\2\u009e\u009f\7"+
		"@\2\2\u009f\u00a0\7?\2\2\u00a0,\3\2\2\2\u00a1\u00a2\7@\2\2\u00a2.\3\2"+
		"\2\2\u00a3\u00a4\7*\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\7+\2\2\u00a6\62\3"+
		"\2\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7v\2\2\u00aa"+
		"\64\3\2\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7u\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00b1\t\4\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\66\3\2\2\2\u00b4\u00b5"+
		"\7j\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7q\2\2\u00b8"+
		"8\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7v\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00bf\t\4\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1:\3\2\2\2\u00c2\u00c6"+
		"\t\5\2\2\u00c3\u00c5\t\6\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7<\3\2\2\2\u00c8\u00c6\3\2\2\2"+
		"\u00c9\u00cd\7%\2\2\u00ca\u00cc\13\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d1\b\37\2\2\u00d1>\3\2\2\2\u00d2\u00d3\7\61\2"+
		"\2\u00d3\u00d4\7,\2\2\u00d4\u00d8\3\2\2\2\u00d5\u00d7\13\2\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7,\2\2\u00dc\u00dd\7\61"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\b \2\2\u00df@\3\2\2\2\n\2DM\u00b2"+
		"\u00c0\u00c6\u00cd\u00d8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}