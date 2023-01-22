// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PCFLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARROW=1, FUNC=2, IFZ=3, THEN=4, ELSE=5, LET=6, IN=7, EQUAL=8, PARD=9, 
		PARG=10, VAR=11, OP=12, OP_PRIO=13, LIT=14, WS=15, LINE_COMMENT=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ARROW", "FUNC", "IFZ", "THEN", "ELSE", "LET", "IN", "EQUAL", "PARD", 
			"PARG", "VAR", "OP", "OP_PRIO", "LIT", "WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'fun'", "'ifz'", "'then'", "'else'", "'let'", "'in'", 
			"'='", "')'", "'('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARROW", "FUNC", "IFZ", "THEN", "ELSE", "LET", "IN", "EQUAL", "PARD", 
			"PARG", "VAR", "OP", "OP_PRIO", "LIT", "WS", "LINE_COMMENT"
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


	public PCFLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PCF.g4"; }

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
		"\u0004\u0000\u0010j\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0004\nE\b"+
		"\n\u000b\n\f\nF\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0005\rP\b\r\n\r\f\rS\t\r\u0003\rU\b\r\u0001\u000e\u0004\u000e"+
		"X\b\u000e\u000b\u000e\f\u000eY\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000fb\b\u000f\n\u000f\f\u000fe\t"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010\u0001\u0000\u0007\u0002\u0000AZaz\u0002\u0000"+
		"++--\u0002\u0000**//\u0001\u000019\u0001\u000009\u0003\u0000\t\n\r\r "+
		" \u0001\u0000\n\nn\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0001!\u0001\u0000\u0000\u0000\u0003$\u0001\u0000\u0000\u0000\u0005"+
		"(\u0001\u0000\u0000\u0000\u0007,\u0001\u0000\u0000\u0000\t1\u0001\u0000"+
		"\u0000\u0000\u000b6\u0001\u0000\u0000\u0000\r:\u0001\u0000\u0000\u0000"+
		"\u000f=\u0001\u0000\u0000\u0000\u0011?\u0001\u0000\u0000\u0000\u0013A"+
		"\u0001\u0000\u0000\u0000\u0015D\u0001\u0000\u0000\u0000\u0017H\u0001\u0000"+
		"\u0000\u0000\u0019J\u0001\u0000\u0000\u0000\u001bT\u0001\u0000\u0000\u0000"+
		"\u001dW\u0001\u0000\u0000\u0000\u001f]\u0001\u0000\u0000\u0000!\"\u0005"+
		"-\u0000\u0000\"#\u0005>\u0000\u0000#\u0002\u0001\u0000\u0000\u0000$%\u0005"+
		"f\u0000\u0000%&\u0005u\u0000\u0000&\'\u0005n\u0000\u0000\'\u0004\u0001"+
		"\u0000\u0000\u0000()\u0005i\u0000\u0000)*\u0005f\u0000\u0000*+\u0005z"+
		"\u0000\u0000+\u0006\u0001\u0000\u0000\u0000,-\u0005t\u0000\u0000-.\u0005"+
		"h\u0000\u0000./\u0005e\u0000\u0000/0\u0005n\u0000\u00000\b\u0001\u0000"+
		"\u0000\u000012\u0005e\u0000\u000023\u0005l\u0000\u000034\u0005s\u0000"+
		"\u000045\u0005e\u0000\u00005\n\u0001\u0000\u0000\u000067\u0005l\u0000"+
		"\u000078\u0005e\u0000\u000089\u0005t\u0000\u00009\f\u0001\u0000\u0000"+
		"\u0000:;\u0005i\u0000\u0000;<\u0005n\u0000\u0000<\u000e\u0001\u0000\u0000"+
		"\u0000=>\u0005=\u0000\u0000>\u0010\u0001\u0000\u0000\u0000?@\u0005)\u0000"+
		"\u0000@\u0012\u0001\u0000\u0000\u0000AB\u0005(\u0000\u0000B\u0014\u0001"+
		"\u0000\u0000\u0000CE\u0007\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000G\u0016\u0001\u0000\u0000\u0000HI\u0007\u0001\u0000\u0000I\u0018"+
		"\u0001\u0000\u0000\u0000JK\u0007\u0002\u0000\u0000K\u001a\u0001\u0000"+
		"\u0000\u0000LU\u00050\u0000\u0000MQ\u0007\u0003\u0000\u0000NP\u0007\u0004"+
		"\u0000\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000TL\u0001\u0000\u0000\u0000TM\u0001\u0000\u0000"+
		"\u0000U\u001c\u0001\u0000\u0000\u0000VX\u0007\u0005\u0000\u0000WV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0006\u000e\u0000"+
		"\u0000\\\u001e\u0001\u0000\u0000\u0000]^\u0005/\u0000\u0000^_\u0005/\u0000"+
		"\u0000_c\u0001\u0000\u0000\u0000`b\b\u0006\u0000\u0000a`\u0001\u0000\u0000"+
		"\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005"+
		"\n\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0006\u000f\u0000\u0000i \u0001"+
		"\u0000\u0000\u0000\u0006\u0000FQTYc\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}