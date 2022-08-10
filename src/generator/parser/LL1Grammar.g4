grammar LL1Grammar;

@header {
import generator.grammar.*;
import java.util.*;
}

main returns [Grammar x] : header nonterms start_ terms
    { $x = new Grammar($header.x, $terms.x, $nonterms.x, $start_.x); };

header returns [String x] : 'grammar' NAME { $x = $NAME.text; } ';' ;

nonterms returns [Map<String, Nonterminal> x]
@init {
    $x = new LinkedHashMap<>();
} : '@nonterminals' (nonterm { $x.put($nonterm.x.getName(), $nonterm.x); })+ ;

nonterm returns [Nonterminal x] locals [List<Nonterminal.Param> arg, List<Nonterminal.Param> returns]
@init {
    $arg = null;
    $returns = null;
} : NAME (ntArgs { $arg = $ntArgs.x; } )? ('returns' ntArgs { $returns = $ntArgs.x; } )? ':' ntRules ';'
    { $x = new Nonterminal($NAME.text, $arg, $returns, $ntRules.x); };

ntArgs returns [List<Nonterminal.Param> x]
@init {
    $x = new ArrayList<>();
} : '[' param { $x.add($param.x); } (',' param { $x.add($param.x); })* ']' ;

param returns [Nonterminal.Param x] : t=NAME n=NAME { $x = new Nonterminal.Param($t.text, $n.text); } ;

ntRules returns [List<Rule> x]
@init {
    $x = new ArrayList<>();
} : ntRule { $x.add($ntRule.x); } ('|' ntRule { $x.add($ntRule.x); } )* ;

ntRule returns [Rule x] locals [List<Rule.Element> elems]
@init {
    $elems = new ArrayList<>();
} : (ruleElem { $elems.add($ruleElem.x); })+ { $x = new Rule($elems); };

ruleElem returns [Rule.Element x] locals [String n, String a, String c]
@init {
    $a = "";
    $c = "";
} :
    (NAME { $n = $NAME.text; } (ARGS { $a = $ARGS.text.substring(1, $ARGS.text.length() - 1); })?
    | EPS { $n = $EPS.text; })
        (CODE { $c = $CODE.text.substring(1, $CODE.text.length() - 1); } )?
        { $x = new Rule.Element($n, $a, $c); };

start_ returns [String x]: '@start' ':' NAME { $x = $NAME.text; };

terms returns [Map<String, Terminal> x] @init {
    $x = new LinkedHashMap<>();
    $x.put(Grammar.EPS, Grammar.EPS_TERM);
} : '@terminals' (term { $x.put($term.x.getName(), $term.x); })+ ;

term returns [Terminal x] : NAME ':' TERM_REGEX ';' { $x = new Terminal($NAME.text, $TERM_REGEX.text); };

SKIP_WHITESPACES : [ \n\r\t]+ -> skip ;

NAME : [a-zA-Z][a-zA-Z0-9_]* ;
TERM_REGEX : '"' ('\\'. | ~('"'))* '"' ;
CODE : '{{' .*? '}}';
ARGS : '<' .*? '>';
EPS : 'EPS' ;
