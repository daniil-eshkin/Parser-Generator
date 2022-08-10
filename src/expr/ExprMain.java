//package expr;
//
//import util.GraphUtils;
//
//import java.text.ParseException;
//
//public class ExprMain {
//    public static void main(String[] args) {
//        try {
//            ExprParser parser = new ExprParser("1 + (3 - 5) * 33443 - 123 * 234");
//            GraphUtils.printGraph(parser.parseAll().toGraphviz());
//        } catch (ParseException ex) {
//            ex.printStackTrace();
//        }
//    }
//}
