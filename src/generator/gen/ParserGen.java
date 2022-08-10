package generator.gen;

import generator.grammar.*;

import java.util.Map;
import java.util.Set;

public class ParserGen {
    private final Grammar g;
    private final String pkg;

    public ParserGen(Grammar g, String pkg) {
        this.g = g;
        this.pkg = pkg;
    }

    public String genCode() {
        return String.format("""
                        package %1$s;
                                    
                        import java.text.ParseException;
                        import java.util.ArrayList;
                                        
                        public class %2$sParser {
                            private static int cnt = 0;
                            private final %2$sLexer lex;
                                        
                            public %2$sParser(String input) throws ParseException {
                                lex = new %2$sLexer(input);
                            }
                                        
                            public static class Node {
                                protected final String name;
                                private final ArrayList<Node> children = new ArrayList<>();
                                private final int idx;
                        
                                public Node(String name) {
                                    this.name = name;
                                    idx = cnt++;
                                }
                        
                                public String getName() {
                                    return name;
                                }
                        
                                public void addChild(Node node) {
                                    children.add(node);
                                }
                        
                                public ArrayList<Node> getChildren() {
                                    return children;
                                }
                                
                                protected String label() {
                                    return name;
                                }
                                
                                private String toGraphviz1() {
                                    StringBuilder res = new StringBuilder("n" + idx + " [label=\\"" + label() + "\\"]\\n");
                                    for (Node child : children) {
                                        res.append("n").append(idx).append(" -- n").append(child.idx).append("\\n").append(child.toGraphviz1());
                                    }
                                    return res.toString();
                                }
                            
                                public String toGraphviz() {
                                    return "graph {\\n" + toGraphviz1() + "}\\n";
                                }
                            }
                            
                            private void unexpectedToken() throws ParseException {
                                throw new ParseException("Unexpected token " + lex.curToken(), lex.curPos());
                            }
                            
                            private void consume(Node res, %2$sLexer.Token t) throws ParseException {
                                if (lex.curToken() != t) {
                                    throw new ParseException("Expected " + t + ", found " + lex.curToken(), lex.curPos());
                                }
                                res.addChild(new Node(t.toString() + ": " + lex.curValue()));
                                lex.nextToken();
                            }
                            
                            public Node_%5$s parseAll() throws ParseException {
                                Node_%5$s res = %5$s();
                                if (!isEnd()) {
                                    unexpectedToken();
                                }
                                return res;
                            }
                            
                            public boolean isEnd() {
                                return lex.curToken() == %2$sLexer.Token.END;
                            }
                            
                        %3$s
                        %4$s
                        }
                        """,
                pkg, g.getName(), nodes(), parsers(), g.getStart());
    }

    private String nodes() {
        StringBuilder res = new StringBuilder();
        for (Map.Entry<String, Nonterminal> e : g.getNonterms().entrySet()) {
            StringBuilder rets = new StringBuilder();
            StringBuilder label = new StringBuilder();
            for (Nonterminal.Param ret : e.getValue().getReturns()) {
                rets.append(String.format("""
                                public %s %s;
                        """, ret.type, ret.name));
                label.append(String.format("""
                         + " (%1$s : " + %1$s + ")"
                        """, ret.name));
            }
            res.append(String.format("""
                        
                        public static class Node_%1$s extends Node {
                            public Node_%1$s() {
                                super("%1$s");
                            }
                            
                            protected String label() {
                                return name%3$s;
                            }
                            
                    %2$s
                        }
                    """,
                    e.getKey(), rets, label));
        }
        return res.toString();
    }

    private String parsers() {
        StringBuilder res = new StringBuilder();
        for (Map.Entry<String, Nonterminal> e : g.getNonterms().entrySet()) {
            StringBuilder args = new StringBuilder("");
            for (Nonterminal.Param ret : e.getValue().getArgs()) {
                args.append(String.format("%s %s, ", ret.type, ret.name));
            }
            if (!args.isEmpty()) {
                args.delete(args.length() - 2, args.length());
            }
            res.append(String.format("""
                                
                                public Node_%1$s %1$s(%2$s) throws ParseException {
                                    Node_%1$s res = new Node_%1$s();
                                    switch (lex.curToken()) {
                            %3$s
                                        default -> unexpectedToken();
                                    }
                                    return res;
                                }
                            """,
                    e.getKey(), args, rules(e.getValue())));
        }
        return res.toString();
    }

    private String rules(Nonterminal nt) {
        StringBuilder res = new StringBuilder();
        for (Rule r : nt.getRules()) {
            Set<Terminal> first = g.seqFirst(r.getElements(), 0);
            if (first.contains(Grammar.EPS_TERM)) {
                first.remove(Grammar.EPS_TERM);
                first.addAll(nt.follow);
            }
            StringBuilder tokens = new StringBuilder();
            for (Terminal t : first) {
                if (t.getName().equals(Grammar.EPS)) {
                    continue;
                }
                tokens.append(t.getName()).append(", ");
            }
            if (!tokens.isEmpty()) {
                tokens.delete(tokens.length() - 2, tokens.length());
            }
            if (tokens.isEmpty()) {
                continue;
            }

            int i = 0;
            int vi = 0;
            StringBuilder code = new StringBuilder();
            for (Rule.Element e : r.getElements()) {
                if (g.getTerms().containsKey(e.name)) {
                    if (e.name.equals(Grammar.EPS)) {
                        code.append(String.format("""
                                                res.addChild(new Node("%1$s"));
                                """, Grammar.EPS));
                    } else {
                        code.append(String.format("""
                                                        String v%1$s = lex.curValue();
                                                        consume(res, %2$sLexer.Token.%3$s);
                                        """,
                                vi, g.getName(), e.name));
                        vi++;
                    }
                } else {
                    code.append(String.format("""
                                            Node_%1$s e%2$s = %1$s(%3$s);
                                            res.addChild(e%2$s);
                            """,
                            e.name, i, e.params));
                    i++;
                }
                code.append(String.format("""
                                        %1$s
                        """, e.code));
            }
            code.append("""
                                    return res;
                    """);
            res.append(String.format("""
                                case %1$s -> {
                    %2$s
                                }
                    """,
                    tokens, code));
        }
        return res.toString();
    }
}
