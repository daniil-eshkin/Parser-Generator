// Generated from /home/cbird/Desktop/Trans/lab4/src/generator/parser/LL1Grammar.g4 by ANTLR 4.9.2
package generator.parser;

import generator.grammar.*;
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LL1GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, SKIP_WHITESPACES=12, NAME=13, TERM_REGEX=14, CODE=15, 
		ARGS=16, EPS=17;
	public static final int
		RULE_main = 0, RULE_header = 1, RULE_nonterms = 2, RULE_nonterm = 3, RULE_ntArgs = 4, 
		RULE_param = 5, RULE_ntRules = 6, RULE_ntRule = 7, RULE_ruleElem = 8, 
		RULE_start_ = 9, RULE_terms = 10, RULE_term = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "header", "nonterms", "nonterm", "ntArgs", "param", "ntRules", 
			"ntRule", "ruleElem", "start_", "terms", "term"
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

	@Override
	public String getGrammarFileName() { return "LL1Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LL1GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public Grammar x;
		public HeaderContext header;
		public NontermsContext nonterms;
		public Start_Context start_;
		public TermsContext terms;
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public NontermsContext nonterms() {
			return getRuleContext(NontermsContext.class,0);
		}
		public Start_Context start_() {
			return getRuleContext(Start_Context.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LL1GrammarVisitor ) return ((LL1GrammarVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((MainContext)_localctx).header = header();
			setState(25);
			((MainContext)_localctx).nonterms = nonterms();
			setState(26);
			((MainContext)_localctx).start_ = start_();
			setState(27);
			((MainContext)_localctx).terms = terms();
			 ((MainContext)_localctx).x =  new Grammar(((MainContext)_localctx).header.x, ((MainContext)_localctx).terms.x, ((MainContext)_localctx).nonterms.x, ((MainContext)_localctx).start_.x); 
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

	public static class HeaderContext extends ParserRuleContext {
		public String x;
		public Token NAME;
		public TerminalNode NAME() { return getToken(LL1GrammarParser.NAME, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LL1GrammarVisitor ) return ((LL1GrammarVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			((HeaderContext)_localctx).NAME = match(NAME);
			 ((HeaderContext)_localctx).x =  (((HeaderContext)_localctx).NAME!=null?((HeaderContext)_localctx).NAME.getText():null); 
			setState(33);
			match(T__1);
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

	public static class NontermsContext extends ParserRuleContext {
		public Map<String, Nonterminal> x;
		public NontermContext nonterm;
		public List<NontermContext> nonterm() {
			return getRuleContexts(NontermContext.class);
		}
		public NontermContext nonterm(int i) {
			return getRuleContext(NontermContext.class,i);
		}
		public NontermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonterms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).enterNonterms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).exitNonterms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LL1GrammarVisitor ) return ((LL1GrammarVisitor<? extends T>)visitor).visitNonterms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NontermsContext nonterms() throws RecognitionException {
		NontermsContext _localctx = new NontermsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nonterms);

		    ((NontermsContext)_localctx).x =  new LinkedHashMap<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__2);
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				((NontermsContext)_localctx).nonterm = nonterm();
				 _localctx.x.put(((NontermsContext)_localctx).nonterm.x.getName(), ((NontermsContext)_localctx).nonterm.x); 
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
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

	public static class NontermContext extends ParserRuleContext {
		public Nonterminal x;
		public List<Nonterminal.Param> arg;
		public List<Nonterminal.Param> returns;
		public Token NAME;
		public NtArgsContext ntArgs;
		public NtRulesContext ntRules;
		public TerminalNode NAME() { return getToken(LL1GrammarParser.NAME, 0); }
		public NtRulesContext ntRules() {
			return getRuleContext(NtRulesContext.class,0);
		}
		public List<NtArgsContext> ntArgs() {
			return getRuleContexts(NtArgsContext.class);
		}
		public NtArgsContext ntArgs(int i) {
			return getRuleContext(NtArgsContext.class,i);
		}
		public NontermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).enterNonterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).exitNonterm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LL1GrammarVisitor ) return ((LL1GrammarVisitor<? extends T>)visitor).visitNonterm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NontermContext nonterm() throws RecognitionException {
		NontermContext _localctx = new NontermContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nonterm);

		    ((NontermContext)_localctx).arg =  null;
		    ((NontermContext)_localctx).returns =  null;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			((NontermContext)_localctx).NAME = match(NAME);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(44);
				((NontermContext)_localctx).ntArgs = ntArgs();
				 ((NontermContext)_localctx).arg =  ((NontermContext)_localctx).ntArgs.x; 
				}
			}

			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(49);
				match(T__3);
				setState(50);
				((NontermContext)_localctx).ntArgs = ntArgs();
				 ((NontermContext)_localctx).returns =  ((NontermContext)_localctx).ntArgs.x; 
				}
			}

			setState(55);
			match(T__4);
			setState(56);
			((NontermContext)_localctx).ntRules = ntRules();
			setState(57);
			match(T__1);
			 ((NontermContext)_localctx).x =  new Nonterminal((((NontermContext)_localctx).NAME!=null?((NontermContext)_localctx).NAME.getText():null), _localctx.arg, _localctx.returns, ((NontermContext)_localctx).ntRules.x); 
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

	public static class NtArgsContext extends ParserRuleContext {
		public List<Nonterminal.Param> x;
		public ParamContext param;
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public NtArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ntArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).enterNtArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).exitNtArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LL1GrammarVisitor ) return ((LL1GrammarVisitor<? extends T>)visitor).visitNtArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NtArgsContext ntArgs() throws RecognitionException {
		NtArgsContext _localctx = new NtArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ntArgs);

		    ((NtArgsContext)_localctx).x =  new ArrayList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__5);
			setState(61);
			((NtArgsContext)_localctx).param = param();
			 _localctx.x.add(((NtArgsContext)_localctx).param.x); 
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(63);
				match(T__6);
				setState(64);
				((NtArgsContext)_localctx).param = param();
				 _localctx.x.add(((NtArgsContext)_localctx).param.x); 
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(T__7);
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

	public static class ParamContext extends ParserRuleContext {
		public Nonterminal.Param x;
		public Token t;
		public Token n;
		public List<TerminalNode> NAME() { return getTokens(LL1GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(LL1GrammarParser.NAME, i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LL1GrammarVisitor ) return ((LL1GrammarVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			((ParamContext)_localctx).t = match(NAME);
			setState(75);
			((ParamContext)_localctx).n = match(NAME);
			 ((ParamContext)_localctx).x =  new Nonterminal.Param((((ParamContext)_localctx).t!=null?((ParamContext)_localctx).t.getText():null), (((ParamContext)_localctx).n!=null?((ParamContext)_localctx).n.getText():null)); 
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

	public static class NtRulesContext extends ParserRuleContext {
		public List<Rule> x;
		public NtRuleContext ntRule;
		public List<NtRuleContext> ntRule() {
			return getRuleContexts(NtRuleContext.class);
		}
		public NtRuleContext ntRule(int i) {
			return getRuleContext(NtRuleContext.class,i);
		}
		public NtRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ntRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).enterNtRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).exitNtRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LL1GrammarVisitor ) return ((LL1GrammarVisitor<? extends T>)visitor).visitNtRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NtRulesContext ntRules() throws RecognitionException {
		NtRulesContext _localctx = new NtRulesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ntRules);

		    ((NtRulesContext)_localctx).x =  new ArrayList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((NtRulesContext)_localctx).ntRule = ntRule();
			 _localctx.x.add(((NtRulesContext)_localctx).ntRule.x); 
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(80);
				match(T__8);
				setState(81);
				((NtRulesContext)_localctx).ntRule = ntRule();
				 _localctx.x.add(((NtRulesContext)_localctx).ntRule.x); 
				}
				}
				setState(88);
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

	public static class NtRuleContext extends ParserRuleContext {
		public Rule x;
		public List<Rule.Element> elems;
		public RuleElemContext ruleElem;
		public List<RuleElemContext> ruleElem() {
			return getRuleContexts(RuleElemContext.class);
		}
		public RuleElemContext ruleElem(int i) {
			return getRuleContext(RuleElemContext.class,i);
		}
		public NtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ntRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).enterNtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).exitNtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LL1GrammarVisitor ) return ((LL1GrammarVisitor<? extends T>)visitor).visitNtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NtRuleContext ntRule() throws RecognitionException {
		NtRuleContext _localctx = new NtRuleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ntRule);

		    ((NtRuleContext)_localctx).elems =  new ArrayList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				((NtRuleContext)_localctx).ruleElem = ruleElem();
				 _localctx.elems.add(((NtRuleContext)_localctx).ruleElem.x); 
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME || _la==EPS );
			 ((NtRuleContext)_localctx).x =  new Rule(_localctx.elems); 
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

	public static class RuleElemContext extends ParserRuleContext {
		public Rule.Element x;
		public String n;
		public String a;
		public String c;
		public Token NAME;
		public Token ARGS;
		public Token EPS;
		public Token CODE;
		public TerminalNode NAME() { return getToken(LL1GrammarParser.NAME, 0); }
		public TerminalNode EPS() { return getToken(LL1GrammarParser.EPS, 0); }
		public TerminalNode CODE() { return getToken(LL1GrammarParser.CODE, 0); }
		public TerminalNode ARGS() { return getToken(LL1GrammarParser.ARGS, 0); }
		public RuleElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).enterRuleElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).exitRuleElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LL1GrammarVisitor ) return ((LL1GrammarVisitor<? extends T>)visitor).visitRuleElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleElemContext ruleElem() throws RecognitionException {
		RuleElemContext _localctx = new RuleElemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ruleElem);

		    ((RuleElemContext)_localctx).a =  "";
		    ((RuleElemContext)_localctx).c =  "";

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(98);
				((RuleElemContext)_localctx).NAME = match(NAME);
				 ((RuleElemContext)_localctx).n =  (((RuleElemContext)_localctx).NAME!=null?((RuleElemContext)_localctx).NAME.getText():null); 
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARGS) {
					{
					setState(100);
					((RuleElemContext)_localctx).ARGS = match(ARGS);
					 ((RuleElemContext)_localctx).a =  (((RuleElemContext)_localctx).ARGS!=null?((RuleElemContext)_localctx).ARGS.getText():null).substring(1, (((RuleElemContext)_localctx).ARGS!=null?((RuleElemContext)_localctx).ARGS.getText():null).length() - 1); 
					}
				}

				}
				break;
			case EPS:
				{
				setState(104);
				((RuleElemContext)_localctx).EPS = match(EPS);
				 ((RuleElemContext)_localctx).n =  (((RuleElemContext)_localctx).EPS!=null?((RuleElemContext)_localctx).EPS.getText():null); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE) {
				{
				setState(108);
				((RuleElemContext)_localctx).CODE = match(CODE);
				 ((RuleElemContext)_localctx).c =  (((RuleElemContext)_localctx).CODE!=null?((RuleElemContext)_localctx).CODE.getText():null).substring(1, (((RuleElemContext)_localctx).CODE!=null?((RuleElemContext)_localctx).CODE.getText():null).length() - 1); 
				}
			}

			 ((RuleElemContext)_localctx).x =  new Rule.Element(_localctx.n, _localctx.a, _localctx.c); 
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

	public static class Start_Context extends ParserRuleContext {
		public String x;
		public Token NAME;
		public TerminalNode NAME() { return getToken(LL1GrammarParser.NAME, 0); }
		public Start_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).enterStart_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).exitStart_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LL1GrammarVisitor ) return ((LL1GrammarVisitor<? extends T>)visitor).visitStart_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_Context start_() throws RecognitionException {
		Start_Context _localctx = new Start_Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_start_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__9);
			setState(115);
			match(T__4);
			setState(116);
			((Start_Context)_localctx).NAME = match(NAME);
			 ((Start_Context)_localctx).x =  (((Start_Context)_localctx).NAME!=null?((Start_Context)_localctx).NAME.getText():null); 
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

	public static class TermsContext extends ParserRuleContext {
		public Map<String, Terminal> x;
		public TermContext term;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LL1GrammarVisitor ) return ((LL1GrammarVisitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_terms);

		    ((TermsContext)_localctx).x =  new LinkedHashMap<>();
		    _localctx.x.put(Grammar.EPS, Grammar.EPS_TERM);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__10);
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				((TermsContext)_localctx).term = term();
				 _localctx.x.put(((TermsContext)_localctx).term.x.getName(), ((TermsContext)_localctx).term.x); 
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
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

	public static class TermContext extends ParserRuleContext {
		public Terminal x;
		public Token NAME;
		public Token TERM_REGEX;
		public TerminalNode NAME() { return getToken(LL1GrammarParser.NAME, 0); }
		public TerminalNode TERM_REGEX() { return getToken(LL1GrammarParser.TERM_REGEX, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1GrammarListener ) ((LL1GrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LL1GrammarVisitor ) return ((LL1GrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			((TermContext)_localctx).NAME = match(NAME);
			setState(128);
			match(T__4);
			setState(129);
			((TermContext)_localctx).TERM_REGEX = match(TERM_REGEX);
			setState(130);
			match(T__1);
			 ((TermContext)_localctx).x =  new Terminal((((TermContext)_localctx).NAME!=null?((TermContext)_localctx).NAME.getText():null), (((TermContext)_localctx).TERM_REGEX!=null?((TermContext)_localctx).TERM_REGEX.getText():null)); 
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\6\4*\n\4\r\4\16\4+\3\5\3\5\3\5\3\5\5\5\62\n\5\3\5\3\5\3\5"+
		"\3\5\5\58\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6F\n\6"+
		"\f\6\16\6I\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bW\n"+
		"\b\f\b\16\bZ\13\b\3\t\3\t\3\t\6\t_\n\t\r\t\16\t`\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\5\ni\n\n\3\n\3\n\5\nm\n\n\3\n\3\n\5\nq\n\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\6\f~\n\f\r\f\16\f\177\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u0085\2\32\3\2\2\2\4 "+
		"\3\2\2\2\6%\3\2\2\2\b-\3\2\2\2\n>\3\2\2\2\fL\3\2\2\2\16P\3\2\2\2\20^\3"+
		"\2\2\2\22l\3\2\2\2\24t\3\2\2\2\26y\3\2\2\2\30\u0081\3\2\2\2\32\33\5\4"+
		"\3\2\33\34\5\6\4\2\34\35\5\24\13\2\35\36\5\26\f\2\36\37\b\2\1\2\37\3\3"+
		"\2\2\2 !\7\3\2\2!\"\7\17\2\2\"#\b\3\1\2#$\7\4\2\2$\5\3\2\2\2%)\7\5\2\2"+
		"&\'\5\b\5\2\'(\b\4\1\2(*\3\2\2\2)&\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2"+
		"\2,\7\3\2\2\2-\61\7\17\2\2./\5\n\6\2/\60\b\5\1\2\60\62\3\2\2\2\61.\3\2"+
		"\2\2\61\62\3\2\2\2\62\67\3\2\2\2\63\64\7\6\2\2\64\65\5\n\6\2\65\66\b\5"+
		"\1\2\668\3\2\2\2\67\63\3\2\2\2\678\3\2\2\289\3\2\2\29:\7\7\2\2:;\5\16"+
		"\b\2;<\7\4\2\2<=\b\5\1\2=\t\3\2\2\2>?\7\b\2\2?@\5\f\7\2@G\b\6\1\2AB\7"+
		"\t\2\2BC\5\f\7\2CD\b\6\1\2DF\3\2\2\2EA\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3"+
		"\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\n\2\2K\13\3\2\2\2LM\7\17\2\2MN\7\17\2\2"+
		"NO\b\7\1\2O\r\3\2\2\2PQ\5\20\t\2QX\b\b\1\2RS\7\13\2\2ST\5\20\t\2TU\b\b"+
		"\1\2UW\3\2\2\2VR\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\17\3\2\2\2ZX\3"+
		"\2\2\2[\\\5\22\n\2\\]\b\t\1\2]_\3\2\2\2^[\3\2\2\2_`\3\2\2\2`^\3\2\2\2"+
		"`a\3\2\2\2ab\3\2\2\2bc\b\t\1\2c\21\3\2\2\2de\7\17\2\2eh\b\n\1\2fg\7\22"+
		"\2\2gi\b\n\1\2hf\3\2\2\2hi\3\2\2\2im\3\2\2\2jk\7\23\2\2km\b\n\1\2ld\3"+
		"\2\2\2lj\3\2\2\2mp\3\2\2\2no\7\21\2\2oq\b\n\1\2pn\3\2\2\2pq\3\2\2\2qr"+
		"\3\2\2\2rs\b\n\1\2s\23\3\2\2\2tu\7\f\2\2uv\7\7\2\2vw\7\17\2\2wx\b\13\1"+
		"\2x\25\3\2\2\2y}\7\r\2\2z{\5\30\r\2{|\b\f\1\2|~\3\2\2\2}z\3\2\2\2~\177"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\27\3\2\2\2\u0081\u0082\7"+
		"\17\2\2\u0082\u0083\7\7\2\2\u0083\u0084\7\20\2\2\u0084\u0085\7\4\2\2\u0085"+
		"\u0086\b\r\1\2\u0086\31\3\2\2\2\f+\61\67GX`hlp\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}