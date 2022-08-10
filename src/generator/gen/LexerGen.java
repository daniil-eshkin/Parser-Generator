package generator.gen;

import generator.grammar.*;

import java.util.Map;

public class LexerGen {
    private final Grammar g;
    private final String pkg;

    public LexerGen(Grammar g, String pkg) {
        this.g = g;
        this.pkg = pkg;
    }

    public String genCode() {
        StringBuilder tokens = new StringBuilder();
        StringBuilder patterns = new StringBuilder();

        for (Map.Entry<String, Terminal> e : g.getTerms().entrySet()) {
            if (e.getKey().equals(Grammar.EPS)) {
                continue;
            }
            tokens.append(e.getKey()).append(", ");
            patterns.append("Pattern.compile(").append(e.getValue().getRegex()).append("), Token.").append(e.getKey()).append(", ");
        }
        tokens.append("END");
        patterns.delete(patterns.length() - 2, patterns.length());

        return String.format("""
                        package %1$s;
                                        
                        import java.text.ParseException;
                        import java.util.Map;
                        import java.util.regex.Matcher;
                        import java.util.regex.Pattern;
                                        
                        public class %2$sLexer {
                        	public enum Token {
                        		%3$s
                        	}
                                    
                            private static final Map<Pattern, Token> TOKEN_PATTERNS = Map.of(
                            	%4$s
                            );
                                        
                            private String input;
                            private Token token;
                            private String value;
                            private int pos;
                                        
                            public %2$sLexer(String input) throws ParseException {
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
                                 throw new ParseException("Incorrect character: \\"" + input.charAt(0) + "\\"", pos);
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
                        """,
                pkg, g.getName(), tokens, patterns);
    }
}