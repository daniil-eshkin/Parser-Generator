package expr;

import java.text.ParseException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExprLexer {
	public enum Token {
		PLUS, MINUS, MUL, DIV, LB, RB, NUM, POWER, END
	}

    private static final Map<Pattern, Token> TOKEN_PATTERNS = Map.of(
    	Pattern.compile("\\+"), Token.PLUS, Pattern.compile("-"), Token.MINUS, Pattern.compile("\\*"), Token.MUL, Pattern.compile("/"), Token.DIV, Pattern.compile("\\("), Token.LB, Pattern.compile("\\)"), Token.RB, Pattern.compile("[0-9]+"), Token.NUM, Pattern.compile("\\^"), Token.POWER
    );

    private String input;
    private Token token;
    private String value;
    private int pos;

    public ExprLexer(String input) throws ParseException {
    this.input = input;
        value = "";
        pos = 0;
        nextToken();
    }

    public Token nextToken() throws ParseException {
         while (!input.isEmpty() && Character.isWhitespace(input.charAt(0))) {
             pos++;
             input = input.substring(1);
         }
         if (input.isEmpty()) {
             token = Token.END;
             value = "";
             return token;
         }
         for (Map.Entry<Pattern, Token> e : TOKEN_PATTERNS.entrySet()) {
             Matcher matcher = e.getKey().matcher(input);
             if (matcher.lookingAt()) {
                 value = matcher.group();
                 pos += value.length();
                 token = e.getValue();
                 input = input.substring(matcher.end());
                 matcher.reset(input);
                 return token;
             }
         }
         throw new ParseException("Incorrect character: \"" + input.charAt(0) + "\"", pos);
    }

    public Token curToken() {
        return token;
    }

    public String curValue() {
        return value;
    }

    public int curPos() {
        return pos;
    }
}
