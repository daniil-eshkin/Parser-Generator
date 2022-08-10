package generator.gen;

import generator.grammar.Grammar;
import generator.grammar.Nonterminal;
import generator.grammar.Terminal;
import generator.parser.LL1GrammarLexer;
import generator.parser.LL1GrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Generator {
    public static void main(String[] args) {
        String gramPath = args[0];
        String pkg = args[1];
        String path = "src/" + pkg.replace('.', '/');

        LL1GrammarParser parser = null;
        try {
            parser = new LL1GrammarParser(
                    new CommonTokenStream(
                            new LL1GrammarLexer(CharStreams.fromFileName(gramPath))
                    )
            );
        } catch (IOException e) {
            System.err.println("Ochen zhal: " + e.getMessage());
            return;
        }
        Grammar g = parser.main().x;

        for (Map.Entry<String, Nonterminal> nt : g.getNonterms().entrySet()) {
            System.out.println(nt.getKey() + ":");
            System.out.print("FIRST: ");
            for (Terminal t : nt.getValue().first) {
                System.out.print(t.getName() + " ");
            }
            System.out.println();
            System.out.print("FOLLOW: ");
            for (Terminal t : nt.getValue().follow) {
                System.out.print(t.getName() + " ");
            }
            System.out.println();
            System.out.println();
        }

        LexerGen lex = new LexerGen(g, pkg);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path + "/" + g.getName() + "Lexer.java"))) {
            writer.write(lex.genCode());
        } catch (IOException e) {
            System.err.println("Ochen zhal: " + e.getMessage());
            return;
        }

        ParserGen parse = new ParserGen(g, pkg);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path + "/" + g.getName() + "Parser.java"))) {
            writer.write(parse.genCode());
        } catch (IOException e) {
            System.err.println("Ochen zhal: " + e.getMessage());
        }
    }
}
