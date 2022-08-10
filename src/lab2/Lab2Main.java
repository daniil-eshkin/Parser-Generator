package lab2;

import util.GraphUtils;

import java.text.ParseException;

public class Lab2Main {
    public static void main(String[] args) {
        try {
            Lab2Parser parser = new Lab2Parser("add(1, 2*(-3)) - 4 + fact(5) * 6");
            GraphUtils.printGraph(parser.parseAll().toGraphviz());
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
}
