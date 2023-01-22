// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PCFParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARROW=1, FUNC=2, IFZ=3, THEN=4, ELSE=5, LET=6, IN=7, EQUAL=8, PARD=9, 
		PARG=10, VAR=11, OP=12, OP_PRIO=13, LIT=14, WS=15, LINE_COMMENT=16;
	public static final int
		RULE_term = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"term"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PCFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParContext extends TermContext {
		public TerminalNode PARG() { return getToken(PCFParser.PARG, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PARD() { return getToken(PCFParser.PARD, 0); }
		public ParContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends TermContext {
		public TerminalNode IFZ() { return getToken(PCFParser.IFZ, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode THEN() { return getToken(PCFParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(PCFParser.ELSE, 0); }
		public CondContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiaisonContext extends TermContext {
		public TerminalNode LET() { return getToken(PCFParser.LET, 0); }
		public TerminalNode VAR() { return getToken(PCFParser.VAR, 0); }
		public TerminalNode EQUAL() { return getToken(PCFParser.EQUAL, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode IN() { return getToken(PCFParser.IN, 0); }
		public LiaisonContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitLiaison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LitContext extends TermContext {
		public TerminalNode LIT() { return getToken(PCFParser.LIT, 0); }
		public LitContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends TermContext {
		public TerminalNode VAR() { return getToken(PCFParser.VAR, 0); }
		public VarContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode OP_PRIO() { return getToken(PCFParser.OP_PRIO, 0); }
		public TerminalNode OP() { return getToken(PCFParser.OP, 0); }
		public BinOpContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitBinOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunContext extends TermContext {
		public TerminalNode FUNC() { return getToken(PCFParser.FUNC, 0); }
		public TerminalNode VAR() { return getToken(PCFParser.VAR, 0); }
		public TerminalNode ARROW() { return getToken(PCFParser.ARROW, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FunContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIT:
				{
				_localctx = new LitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(3);
				match(LIT);
				}
				break;
			case VAR:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(4);
				match(VAR);
				}
				break;
			case PARG:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(5);
				match(PARG);
				setState(6);
				term(0);
				setState(7);
				match(PARD);
				}
				break;
			case FUNC:
				{
				_localctx = new FunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(9);
				match(FUNC);
				setState(10);
				match(VAR);
				setState(11);
				match(ARROW);
				setState(12);
				term(5);
				}
				break;
			case LET:
				{
				_localctx = new LiaisonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(13);
				match(LET);
				setState(14);
				match(VAR);
				setState(15);
				match(EQUAL);
				setState(16);
				term(0);
				setState(17);
				match(IN);
				setState(18);
				term(3);
				}
				break;
			case IFZ:
				{
				_localctx = new CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				match(IFZ);
				setState(21);
				term(0);
				setState(22);
				match(THEN);
				setState(23);
				term(0);
				setState(24);
				match(ELSE);
				setState(25);
				term(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(35);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new BinOpContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(29);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(30);
						match(OP_PRIO);
						setState(31);
						term(5);
						}
						break;
					case 2:
						{
						_localctx = new BinOpContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(32);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(33);
						match(OP);
						setState(34);
						term(3);
						}
						break;
					}
					} 
				}
				setState(39);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0010)\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001c"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000\'\t\u0000\u0001\u0000\u0000"+
		"\u0001\u0000\u0001\u0000\u0000\u0000.\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0002\u0003\u0006\u0000\uffff\uffff\u0000\u0003\u001c\u0005\u000e\u0000"+
		"\u0000\u0004\u001c\u0005\u000b\u0000\u0000\u0005\u0006\u0005\n\u0000\u0000"+
		"\u0006\u0007\u0003\u0000\u0000\u0000\u0007\b\u0005\t\u0000\u0000\b\u001c"+
		"\u0001\u0000\u0000\u0000\t\n\u0005\u0002\u0000\u0000\n\u000b\u0005\u000b"+
		"\u0000\u0000\u000b\f\u0005\u0001\u0000\u0000\f\u001c\u0003\u0000\u0000"+
		"\u0005\r\u000e\u0005\u0006\u0000\u0000\u000e\u000f\u0005\u000b\u0000\u0000"+
		"\u000f\u0010\u0005\b\u0000\u0000\u0010\u0011\u0003\u0000\u0000\u0000\u0011"+
		"\u0012\u0005\u0007\u0000\u0000\u0012\u0013\u0003\u0000\u0000\u0003\u0013"+
		"\u001c\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0003\u0000\u0000\u0015"+
		"\u0016\u0003\u0000\u0000\u0000\u0016\u0017\u0005\u0004\u0000\u0000\u0017"+
		"\u0018\u0003\u0000\u0000\u0000\u0018\u0019\u0005\u0005\u0000\u0000\u0019"+
		"\u001a\u0003\u0000\u0000\u0001\u001a\u001c\u0001\u0000\u0000\u0000\u001b"+
		"\u0002\u0001\u0000\u0000\u0000\u001b\u0004\u0001\u0000\u0000\u0000\u001b"+
		"\u0005\u0001\u0000\u0000\u0000\u001b\t\u0001\u0000\u0000\u0000\u001b\r"+
		"\u0001\u0000\u0000\u0000\u001b\u0014\u0001\u0000\u0000\u0000\u001c%\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\n\u0004\u0000\u0000\u001e\u001f\u0005\r"+
		"\u0000\u0000\u001f$\u0003\u0000\u0000\u0005 !\n\u0002\u0000\u0000!\"\u0005"+
		"\f\u0000\u0000\"$\u0003\u0000\u0000\u0003#\u001d\u0001\u0000\u0000\u0000"+
		"# \u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\u0001\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000\u0003\u001b#%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}