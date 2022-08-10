package lab2;

import java.text.ParseException;
import java.util.ArrayList;

public class Lab2Parser {
    private static int cnt = 0;
    private final Lab2Lexer lex;

    public Lab2Parser(String input) throws ParseException {
        lex = new Lab2Lexer(input);
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

    private void consume(Node res, Lab2Lexer.Token t) throws ParseException {
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
        return lex.curToken() == Lab2Lexer.Token.END;
    }


    public static class Node_e extends Node {
        public Node_e() {
            super("e");
        }

        protected String label() {
            return name;
        }


    }

    public static class Node_e_ extends Node {
        public Node_e_() {
            super("e_");
        }

        protected String label() {
            return name;
        }


    }

    public static class Node_t extends Node {
        public Node_t() {
            super("t");
        }

        protected String label() {
            return name;
        }


    }

    public static class Node_t_ extends Node {
        public Node_t_() {
            super("t_");
        }

        protected String label() {
            return name;
        }


    }

    public static class Node_f extends Node {
        public Node_f() {
            super("f");
        }

        protected String label() {
            return name;
        }


    }

    public static class Node_x extends Node {
        public Node_x() {
            super("x");
        }

        protected String label() {
            return name;
        }


    }

    public static class Node_x_ extends Node {
        public Node_x_() {
            super("x_");
        }

        protected String label() {
            return name;
        }


    }


    public Node_e e() throws ParseException {
        Node_e res = new Node_e();
        switch (lex.curToken()) {
            case LB, NUM, FUN, MINUS -> {
                Node_t e0 = t();
                res.addChild(e0);
                
                Node_e_ e1 = e_();
                res.addChild(e1);
                
                return res;

            }

            default -> unexpectedToken();
        }
        return res;
    }

    public Node_e_ e_() throws ParseException {
        Node_e_ res = new Node_e_();
        switch (lex.curToken()) {
            case PLUS -> {
                String v0 = lex.curValue();
                consume(res, Lab2Lexer.Token.PLUS);
                
                Node_t e0 = t();
                res.addChild(e0);
                
                Node_e_ e1 = e_();
                res.addChild(e1);
                
                return res;

            }
            case MINUS -> {
                String v0 = lex.curValue();
                consume(res, Lab2Lexer.Token.MINUS);
                
                Node_t e0 = t();
                res.addChild(e0);
                
                Node_e_ e1 = e_();
                res.addChild(e1);
                
                return res;

            }
            case END, RB, COMMA -> {
                res.addChild(new Node("EPS"));
                
                return res;

            }

            default -> unexpectedToken();
        }
        return res;
    }

    public Node_t t() throws ParseException {
        Node_t res = new Node_t();
        switch (lex.curToken()) {
            case LB, NUM, FUN, MINUS -> {
                Node_f e0 = f();
                res.addChild(e0);
                
                Node_t_ e1 = t_();
                res.addChild(e1);
                
                return res;

            }

            default -> unexpectedToken();
        }
        return res;
    }

    public Node_t_ t_() throws ParseException {
        Node_t_ res = new Node_t_();
        switch (lex.curToken()) {
            case MUL -> {
                String v0 = lex.curValue();
                consume(res, Lab2Lexer.Token.MUL);
                
                Node_f e0 = f();
                res.addChild(e0);
                
                Node_t_ e1 = t_();
                res.addChild(e1);
                
                return res;

            }
            case PLUS, MINUS, END, RB, COMMA -> {
                res.addChild(new Node("EPS"));
                
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
                consume(res, Lab2Lexer.Token.LB);
                
                Node_e e0 = e();
                res.addChild(e0);
                
                String v1 = lex.curValue();
                consume(res, Lab2Lexer.Token.RB);
                
                return res;

            }
            case NUM -> {
                String v0 = lex.curValue();
                consume(res, Lab2Lexer.Token.NUM);
                
                return res;

            }
            case FUN -> {
                String v0 = lex.curValue();
                consume(res, Lab2Lexer.Token.FUN);
                
                String v1 = lex.curValue();
                consume(res, Lab2Lexer.Token.LB);
                
                Node_x e0 = x();
                res.addChild(e0);
                
                String v2 = lex.curValue();
                consume(res, Lab2Lexer.Token.RB);
                
                return res;

            }
            case MINUS -> {
                String v0 = lex.curValue();
                consume(res, Lab2Lexer.Token.MINUS);
                
                Node_f e0 = f();
                res.addChild(e0);
                
                return res;

            }

            default -> unexpectedToken();
        }
        return res;
    }

    public Node_x x() throws ParseException {
        Node_x res = new Node_x();
        switch (lex.curToken()) {
            case LB, NUM, FUN, MINUS -> {
                Node_e e0 = e();
                res.addChild(e0);
                
                Node_x_ e1 = x_();
                res.addChild(e1);
                
                return res;

            }

            default -> unexpectedToken();
        }
        return res;
    }

    public Node_x_ x_() throws ParseException {
        Node_x_ res = new Node_x_();
        switch (lex.curToken()) {
            case COMMA -> {
                String v0 = lex.curValue();
                consume(res, Lab2Lexer.Token.COMMA);
                
                Node_e e0 = e();
                res.addChild(e0);
                
                Node_x_ e1 = x_();
                res.addChild(e1);
                
                return res;

            }
            case RB -> {
                res.addChild(new Node("EPS"));
                
                return res;

            }

            default -> unexpectedToken();
        }
        return res;
    }

}
