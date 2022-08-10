// Generated from /home/cbird/Desktop/Trans/lab4/src/generator/parser/LL1Grammar.g4 by ANTLR 4.9.2
package generator.parser;

import generator.grammar.*;
import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LL1GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, SKIP_WHITESPACES=12, NAME=13, TERM_REGEX=14, CODE=15, 
		ARGS=16, EPS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "SKIP_WHITESPACES", "NAME", "TERM_REGEX", "CODE", "ARGS", 
			"EPS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "';'", "'@nonterminals'", "'returns'", "':'", "'['", 
			"','", "']'", "'|'", "'@start'", "'@terminals'", null, null, null, null, 
			null, "'EPS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"SKIP_WHITESPACES", "NAME", "TERM_REGEX", "CODE", "ARGS", "EPS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public LL1GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LL1Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\6\rc\n\r\r\r\16\rd\3"+
		"\r\3\r\3\16\3\16\7\16k\n\16\f\16\16\16n\13\16\3\17\3\17\3\17\3\17\7\17"+
		"t\n\17\f\17\16\17w\13\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\177\n\20\f"+
		"\20\16\20\u0082\13\20\3\20\3\20\3\20\3\21\3\21\7\21\u0089\n\21\f\21\16"+
		"\21\u008c\13\21\3\21\3\21\3\22\3\22\3\22\3\22\4\u0080\u008a\2\23\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23\3\2\6\5\2\13\f\17\17\"\"\4\2C\\c|\6\2\62;C\\aac|\3\2$$\2\u0098"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\3%\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t=\3\2\2\2\13E\3\2\2\2\rG\3\2\2"+
		"\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27V\3\2\2\2\31b\3\2"+
		"\2\2\33h\3\2\2\2\35o\3\2\2\2\37z\3\2\2\2!\u0086\3\2\2\2#\u008f\3\2\2\2"+
		"%&\7i\2\2&\'\7t\2\2\'(\7c\2\2()\7o\2\2)*\7o\2\2*+\7c\2\2+,\7t\2\2,\4\3"+
		"\2\2\2-.\7=\2\2.\6\3\2\2\2/\60\7B\2\2\60\61\7p\2\2\61\62\7q\2\2\62\63"+
		"\7p\2\2\63\64\7v\2\2\64\65\7g\2\2\65\66\7t\2\2\66\67\7o\2\2\678\7k\2\2"+
		"89\7p\2\29:\7c\2\2:;\7n\2\2;<\7u\2\2<\b\3\2\2\2=>\7t\2\2>?\7g\2\2?@\7"+
		"v\2\2@A\7w\2\2AB\7t\2\2BC\7p\2\2CD\7u\2\2D\n\3\2\2\2EF\7<\2\2F\f\3\2\2"+
		"\2GH\7]\2\2H\16\3\2\2\2IJ\7.\2\2J\20\3\2\2\2KL\7_\2\2L\22\3\2\2\2MN\7"+
		"~\2\2N\24\3\2\2\2OP\7B\2\2PQ\7u\2\2QR\7v\2\2RS\7c\2\2ST\7t\2\2TU\7v\2"+
		"\2U\26\3\2\2\2VW\7B\2\2WX\7v\2\2XY\7g\2\2YZ\7t\2\2Z[\7o\2\2[\\\7k\2\2"+
		"\\]\7p\2\2]^\7c\2\2^_\7n\2\2_`\7u\2\2`\30\3\2\2\2ac\t\2\2\2ba\3\2\2\2"+
		"cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\b\r\2\2g\32\3\2\2\2hl\t\3\2"+
		"\2ik\t\4\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\34\3\2\2\2nl\3\2"+
		"\2\2ou\7$\2\2pq\7^\2\2qt\13\2\2\2rt\n\5\2\2sp\3\2\2\2sr\3\2\2\2tw\3\2"+
		"\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7$\2\2y\36\3\2\2\2z{\7"+
		"}\2\2{|\7}\2\2|\u0080\3\2\2\2}\177\13\2\2\2~}\3\2\2\2\177\u0082\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0084\7\177\2\2\u0084\u0085\7\177\2\2\u0085 \3\2\2\2\u0086"+
		"\u008a\7>\2\2\u0087\u0089\13\2\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\7@\2\2\u008e\"\3\2\2\2\u008f\u0090\7G\2\2\u0090"+
		"\u0091\7R\2\2\u0091\u0092\7U\2\2\u0092$\3\2\2\2\t\2dlsu\u0080\u008a\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}