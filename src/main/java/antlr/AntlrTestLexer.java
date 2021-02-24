// Generated from C:/Users/User/Downloads/comicStore-master/FirstAntlr/src/main/java/antlr\AntlrTest.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrTestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, NUM=21, MULTIPLICATION=22, DIV=23, PLUS=24, 
		MINUS=25, LOGIC=26, COMPARE=27, UNARY_OPERATOR=28, NAME=29, TYPE=30, WHITESPACE=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "NUM", "MULTIPLICATION", "DIV", "PLUS", "MINUS", 
			"LOGIC", "COMPARE", "UNARY_OPERATOR", "NAME", "TYPE", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'^'", "'!'", "'='", "'if'", "'{'", "'}'", "'else'", 
			"'while'", "'do'", "'return'", "';'", "'for'", "'switch'", "':'", "'case'", 
			"'break'", "'continue'", "'auf'", null, "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "NUM", "MULTIPLICATION", 
			"DIV", "PLUS", "MINUS", "LOGIC", "COMPARE", "UNARY_OPERATOR", "NAME", 
			"TYPE", "WHITESPACE"
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


	public AntlrTestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AntlrTest.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00d4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\6\26\u0090\n\26\r\26\16\26\u0091\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\5\33\u00a0\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u00ab\n\34\3\35\3\35\3\35\3\35\5\35\u00b1\n"+
		"\35\3\36\6\36\u00b4\n\36\r\36\16\36\u00b5\3\36\6\36\u00b9\n\36\r\36\16"+
		"\36\u00ba\5\36\u00bd\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u00cc\n\37\3 \6 \u00cf\n \r \16 \u00d0\3 \3"+
		" \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!\3\2\7\3\2\62;\4\2>>@@\3\2c|\3\2C\\\5\2\13\f\17\17\"\"\2\u00df"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2"+
		"\2\13I\3\2\2\2\rK\3\2\2\2\17N\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25W\3\2"+
		"\2\2\27]\3\2\2\2\31`\3\2\2\2\33g\3\2\2\2\35i\3\2\2\2\37m\3\2\2\2!t\3\2"+
		"\2\2#v\3\2\2\2%{\3\2\2\2\'\u0081\3\2\2\2)\u008a\3\2\2\2+\u008f\3\2\2\2"+
		"-\u0093\3\2\2\2/\u0095\3\2\2\2\61\u0097\3\2\2\2\63\u0099\3\2\2\2\65\u009f"+
		"\3\2\2\2\67\u00aa\3\2\2\29\u00b0\3\2\2\2;\u00bc\3\2\2\2=\u00cb\3\2\2\2"+
		"?\u00ce\3\2\2\2AB\7*\2\2B\4\3\2\2\2CD\7+\2\2D\6\3\2\2\2EF\7`\2\2F\b\3"+
		"\2\2\2GH\7#\2\2H\n\3\2\2\2IJ\7?\2\2J\f\3\2\2\2KL\7k\2\2LM\7h\2\2M\16\3"+
		"\2\2\2NO\7}\2\2O\20\3\2\2\2PQ\7\177\2\2Q\22\3\2\2\2RS\7g\2\2ST\7n\2\2"+
		"TU\7u\2\2UV\7g\2\2V\24\3\2\2\2WX\7y\2\2XY\7j\2\2YZ\7k\2\2Z[\7n\2\2[\\"+
		"\7g\2\2\\\26\3\2\2\2]^\7f\2\2^_\7q\2\2_\30\3\2\2\2`a\7t\2\2ab\7g\2\2b"+
		"c\7v\2\2cd\7w\2\2de\7t\2\2ef\7p\2\2f\32\3\2\2\2gh\7=\2\2h\34\3\2\2\2i"+
		"j\7h\2\2jk\7q\2\2kl\7t\2\2l\36\3\2\2\2mn\7u\2\2no\7y\2\2op\7k\2\2pq\7"+
		"v\2\2qr\7e\2\2rs\7j\2\2s \3\2\2\2tu\7<\2\2u\"\3\2\2\2vw\7e\2\2wx\7c\2"+
		"\2xy\7u\2\2yz\7g\2\2z$\3\2\2\2{|\7d\2\2|}\7t\2\2}~\7g\2\2~\177\7c\2\2"+
		"\177\u0080\7m\2\2\u0080&\3\2\2\2\u0081\u0082\7e\2\2\u0082\u0083\7q\2\2"+
		"\u0083\u0084\7p\2\2\u0084\u0085\7v\2\2\u0085\u0086\7k\2\2\u0086\u0087"+
		"\7p\2\2\u0087\u0088\7w\2\2\u0088\u0089\7g\2\2\u0089(\3\2\2\2\u008a\u008b"+
		"\7c\2\2\u008b\u008c\7w\2\2\u008c\u008d\7h\2\2\u008d*\3\2\2\2\u008e\u0090"+
		"\t\2\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092,\3\2\2\2\u0093\u0094\7,\2\2\u0094.\3\2\2\2\u0095"+
		"\u0096\7\61\2\2\u0096\60\3\2\2\2\u0097\u0098\7-\2\2\u0098\62\3\2\2\2\u0099"+
		"\u009a\7/\2\2\u009a\64\3\2\2\2\u009b\u009c\7(\2\2\u009c\u00a0\7(\2\2\u009d"+
		"\u009e\7~\2\2\u009e\u00a0\7~\2\2\u009f\u009b\3\2\2\2\u009f\u009d\3\2\2"+
		"\2\u00a0\66\3\2\2\2\u00a1\u00a2\7#\2\2\u00a2\u00ab\7?\2\2\u00a3\u00a4"+
		"\7?\2\2\u00a4\u00ab\7?\2\2\u00a5\u00ab\t\3\2\2\u00a6\u00a7\7@\2\2\u00a7"+
		"\u00ab\7?\2\2\u00a8\u00a9\7>\2\2\u00a9\u00ab\7?\2\2\u00aa\u00a1\3\2\2"+
		"\2\u00aa\u00a3\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab8\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad\u00b1\7/\2\2\u00ae\u00af"+
		"\7-\2\2\u00af\u00b1\7-\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		":\3\2\2\2\u00b2\u00b4\t\4\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2"+
		"\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00bd\3\2\2\2\u00b7\u00b9"+
		"\t\5\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b8\3\2"+
		"\2\2\u00bd<\3\2\2\2\u00be\u00bf\7K\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1"+
		"\7v\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7i\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		"\u00cc\7t\2\2\u00c5\u00c6\7F\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7w\2\2"+
		"\u00c8\u00c9\7d\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cc\7g\2\2\u00cb\u00be"+
		"\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cc>\3\2\2\2\u00cd\u00cf\t\6\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\b \2\2\u00d3@\3\2\2\2\f\2\u0091\u009f"+
		"\u00aa\u00b0\u00b5\u00ba\u00bc\u00cb\u00d0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}