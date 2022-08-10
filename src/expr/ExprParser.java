package expr;

import java.text.ParseException;
import java.util.ArrayList;

public class ExprParser {
    private static int cnt = 0;
    private final ExprLexer lex;

    public ExprParser(String input) throws ParseException {
        lex = new ExprLexer(input);
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
            StringBuilder res = new StringBuilder("n" + idx + " [label=\"" + label() + "\"]\n");
            for (Node child : children) {
                res.append("n").append(idx).append(" -- n").append(child.idx).append("\n").append(child.toGraphviz1());
            }
            return res.toString();
        }

        public String toGraphviz() {
            return "graph {\n" + toGraphviz1() + "}\n";
        }
    }

    private void unexpectedToken() throws ParseException {
        throw new ParseException("Unexpected token " + lex.curToken(), lex.curPos());
    }

    private void consume(Node res, ExprLexer.Token t) throws ParseException {
        if (lex.curToken() != t) {
            throw new ParseException("Expected " + t + ", found " + lex.curToken(), lex.curPos());
        }
        res.addChild(new Node(t.toString() + ": " + lex.curValue()));
        lex.nextToken();
    }

    public Node_e parseAll() throws ParseException {
        Node_e res = e();
        if (!isEnd()) {
            unexpectedToken();
        }
        return res;
    }

    public boolean isEnd() {
        return lex.curToken() == ExprLexer.Token.END;
    }


    public static class Node_e extends Node {
        public Node_e() {
            super("e");
        }

        protected String label() {
            return name + " (x : " + x + ")"
 + " (intDiv : " + intDiv + ")"
;
        }

        public int x;
        public boolean intDiv;

    }

    public static class Node_e_ extends Node {
        public Node_e_() {
            super("e_");
        }

        protected String label() {
            return name + " (x : " + x + ")"
 + " (intDiv : " + intDiv + ")"
;
        }

        public int x;
        public boolean intDiv;

    }

    public static class Node_t extends Node {
        public Node_t() {
            super("t");
        }

        protected String label() {
            return name + " (x : " + x + ")"
 + " (intDiv : " + intDiv + ")"
;
        }

        public int x;
        public boolean intDiv;

    }

    public static class Node_t_ extends Node {
        public Node_t_() {
            super("t_");
        }

        protected String label() {
            return name + " (x : " + x + ")"
 + " (intDiv : " + intDiv + ")"
;
        }

        public int x;
        public boolean intDiv;

    }

    public static class Node_f extends Node {
        public Node_f() {
            super("f");
        }

        protected String label() {
            return name + " (x : " + x + ")"
 + " (intDiv : " + intDiv + ")"
;
        }

        public int x;
        public boolean intDiv;

    }


    public Node_e e() throws ParseException {
        Node_e res = new Node_e();
        switch (lex.curToken()) {
            case LB, NUM -> {
                Node_t e0 = t();
                res.addChild(e0);
                
                Node_e_ e1 = e_(e0.x);
                res.addChild(e1);
                { res.x = e1.x; res.intDiv = e0.intDiv || e1.intDiv; }
                return res;

            }

            default -> unexpectedToken();
        }
        return res;
    }

    public Node_e_ e_(int acc) throws ParseException {
        Node_e_ res = new Node_e_();
        switch (lex.curToken()) {
            case PLUS -> {
                String v0 = lex.curValue();
                consume(res, ExprLexer.Token.PLUS);
                
                Node_t e0 = t();
                res.addChild(e0);
                
                Node_e_ e1 = e_(acc + e0.x);
                res.addChild(e1);
                { res.x = e1.x; res.intDiv = e0.intDiv || e1.intDiv; }
                return res;

            }
            case MINUS -> {
                String v0 = lex.curValue();
                consume(res, ExprLexer.Token.MINUS);
                
                Node_t e0 = t();
                res.addChild(e0);
                
                Node_e_ e1 = e_(acc - e0.x);
                res.addChild(e1);
                { res.x = e1.x; res.intDiv = e0.intDiv || e1.intDiv; }
                return res;

            }
            case END, RB -> {
                res.addChild(new Node("EPS"));
                { res.x = acc; res.intDiv = false; }
                return res;

            }

            default -> unexpectedToken();
        }
        return res;
    }

    public Node_t t() throws ParseException {
        Node_t res = new Node_t();
        switch (lex.curToken()) {
            case LB, NUM -> {
                Node_f e0 = f();
                res.addChild(e0);
                
                Node_t_ e1 = t_(e0.x);
                res.addChild(e1);
                { res.x = e1.x; res.intDiv = e0.intDiv || e1.intDiv; }
                return res;

            }

            default -> unexpectedToken();
        }
        return res;
    }

    public Node_t_ t_(int acc) throws ParseException {
        Node_t_ res = new Node_t_();
        switch (lex.curToken()) {
            case MUL -> {
                String v0 = lex.curValue();
                consume(res, ExprLexer.Token.MUL);
                
                Node_f e0 = f();
                res.addChild(e0);
                
                Node_t_ e1 = t_(acc * e0.x);
                res.addChild(e1);
                { res.x = e1.x; res.intDiv = e0.intDiv || e1.intDiv; }
                return res;

            }
            case DIV -> {
                String v0 = lex.curValue();
                consume(res, ExprLexer.Token.DIV);
                
                Node_f e0 = f();
                res.addChild(e0);
                
                Node_t_ e1 = t_(acc / e0.x);
                res.addChild(e1);
                { res.x = e1.x; res.intDiv = e0.intDiv || e1.intDiv || (acc % e0.x == 0); }
                return res;

            }
            case PLUS, MINUS, END, RB -> {
                res.addChild(new Node("EPS"));
                { res.x = acc; res.intDiv = false; }
                return res;

            }

            default -> unexpectedToken();
        }
        return res;
    }

    public Node_f f() throws ParseException {
        Node_f res = new Node_f();
        switch (lex.curToken()) {
            case LB -> {
                String v0 = lex.curValue();
                consume(res, ExprLexer.Token.LB);
                
                Node_e e0 = e();
                res.addChild(e0);
                
                String v1 = lex.curValue();
                consume(res, ExprLexer.Token.RB);
                { res.x = e0.x; res.intDiv = e0.intDiv; }
                return res;

            }
            case NUM -> {
                String v0 = lex.curValue();
                consume(res, ExprLexer.Token.NUM);
                { res.x = Integer.parseInt(v0); res.intDiv = false; }
                return res;

            }

            default -> unexpectedToken();
        }
        return res;
    }

}
