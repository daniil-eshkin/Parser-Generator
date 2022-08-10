package expr.test;

import expr.ExprParser;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ExprParserTest {
    private void assertEval(String expr, int result, boolean intDiv) {
        try {
            ExprParser.Node_e e = new ExprParser(expr).parseAll();
            assertEquals(result, e.x);
            assertEquals(intDiv, e.intDiv);
        } catch (ParseException e) {
            Assert.fail("Exception caught: " + e.getMessage());
        }
    }

    private void assertFails(String expr) {
        try {
            int res = new ExprParser(expr).parseAll().x;
            fail("No exceptions caught for " + expr + " result is " + res);
        } catch (ParseException ignored) {

        }
    }

    @Test
    public void testSingleOperation() {
        assertEval("1+2", 3, false);
        assertEval("1-2", -1, false);
        assertEval("2*3", 6, false);
    }

    @Test
    public void testLeftAssociativity() {
        assertEval("1-2-3", -4, false);
        assertEval("1-2-3-4", -8, false);
    }

    @Test
    public void testDistributivity() {
        assertEval("2+2*2", 6, false);
        assertEval("2*2+2", 6, false);
        assertEval("2*(2+2)", 8, false);
        assertEval("(2+2)*2", 8, false);
    }

    @Test
    public void testSomeCases() {
        assertEval("(1+2)*(3*(7-4)+2)", 33, false);
        assertEval("((((((((((((((((((1))))))))))))))))))", 1, false);
        assertEval("2*(1+3*(2-1)-0)+1*(1+1)*(1+1+1)", 14, false);
    }

    @Test
    public void testFail() {
        assertFails("sin(pi*2)");
        assertFails("1+2)*3");
        assertFails("Hello world");
        assertFails("(1+2*3");
        assertFails("sin 1");
        assertFails("1++2");
    }

    @Test
    public void testIntDiv() {
        assertEval("1 / 2", 0,false);
        assertEval("2 / 1", 2, true);
        assertEval("120 / 5 / 4 / 3 / 2 / 1", 1, true);
        assertEval("100 + 200 / 9 / 11", 102, true);
    }
}
