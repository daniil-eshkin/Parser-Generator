// Generated from /home/cbird/Desktop/Trans/lab4/src/generator/parser/LL1Grammar.g4 by ANTLR 4.9.2
package generator.parser;

import generator.grammar.*;
import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LL1GrammarParser}.
 */
public interface LL1GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LL1GrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(LL1GrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1GrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(LL1GrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1GrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(LL1GrammarParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1GrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(LL1GrammarParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1GrammarParser#nonterms}.
	 * @param ctx the parse tree
	 */
	void enterNonterms(LL1GrammarParser.NontermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1GrammarParser#nonterms}.
	 * @param ctx the parse tree
	 */
	void exitNonterms(LL1GrammarParser.NontermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1GrammarParser#nonterm}.
	 * @param ctx the parse tree
	 */
	void enterNonterm(LL1GrammarParser.NontermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1GrammarParser#nonterm}.
	 * @param ctx the parse tree
	 */
	void exitNonterm(LL1GrammarParser.NontermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1GrammarParser#ntArgs}.
	 * @param ctx the parse tree
	 */
	void enterNtArgs(LL1GrammarParser.NtArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1GrammarParser#ntArgs}.
	 * @param ctx the parse tree
	 */
	void exitNtArgs(LL1GrammarParser.NtArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1GrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(LL1GrammarParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1GrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(LL1GrammarParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1GrammarParser#ntRules}.
	 * @param ctx the parse tree
	 */
	void enterNtRules(LL1GrammarParser.NtRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1GrammarParser#ntRules}.
	 * @param ctx the parse tree
	 */
	void exitNtRules(LL1GrammarParser.NtRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1GrammarParser#ntRule}.
	 * @param ctx the parse tree
	 */
	void enterNtRule(LL1GrammarParser.NtRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1GrammarParser#ntRule}.
	 * @param ctx the parse tree
	 */
	void exitNtRule(LL1GrammarParser.NtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1GrammarParser#ruleElem}.
	 * @param ctx the parse tree
	 */
	void enterRuleElem(LL1GrammarParser.RuleElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1GrammarParser#ruleElem}.
	 * @param ctx the parse tree
	 */
	void exitRuleElem(LL1GrammarParser.RuleElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1GrammarParser#start_}.
	 * @param ctx the parse tree
	 */
	void enterStart_(LL1GrammarParser.Start_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1GrammarParser#start_}.
	 * @param ctx the parse tree
	 */
	void exitStart_(LL1GrammarParser.Start_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1GrammarParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(LL1GrammarParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1GrammarParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(LL1GrammarParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LL1GrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LL1GrammarParser.TermContext ctx);
}