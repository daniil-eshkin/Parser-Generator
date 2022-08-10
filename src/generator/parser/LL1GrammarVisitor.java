// Generated from /home/cbird/Desktop/Trans/lab4/src/generator/parser/LL1Grammar.g4 by ANTLR 4.9.2
package generator.parser;

import generator.grammar.*;
import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LL1GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LL1GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LL1GrammarParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(LL1GrammarParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link LL1GrammarParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(LL1GrammarParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link LL1GrammarParser#nonterms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonterms(LL1GrammarParser.NontermsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LL1GrammarParser#nonterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonterm(LL1GrammarParser.NontermContext ctx);
	/**
	 * Visit a parse tree produced by {@link LL1GrammarParser#ntArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNtArgs(LL1GrammarParser.NtArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LL1GrammarParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(LL1GrammarParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link LL1GrammarParser#ntRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNtRules(LL1GrammarParser.NtRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LL1GrammarParser#ntRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNtRule(LL1GrammarParser.NtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LL1GrammarParser#ruleElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleElem(LL1GrammarParser.RuleElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link LL1GrammarParser#start_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_(LL1GrammarParser.Start_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LL1GrammarParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(LL1GrammarParser.TermsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LL1GrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(LL1GrammarParser.TermContext ctx);
}