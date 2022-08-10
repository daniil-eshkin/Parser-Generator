package generator.grammar;

import java.util.*;

public class Nonterminal {
    private final String name;
    private final List<Param> args;
    private final List<Param> returns;
    private final List<Rule> rules;
    public final Set<Terminal> first = new LinkedHashSet<>();
    public final Set<Terminal> follow = new LinkedHashSet<>();

    public Nonterminal(String name, List<Param> args, List<Param> returns, List<Rule> rules) {
        this.name = name;
        this.args = args == null ? new ArrayList<>() : args;
        this.returns = returns == null ? new ArrayList<>() : returns;
        this.rules = rules;
    }

    public String getName() {
        return name;
    }

    public List<Param> getArgs() {
        return args;
    }

    public List<Param> getReturns() {
        return returns;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public static class Param {
        public final String type;
        public final String name;

        public Param(String type, String name) {
            this.type = type;
            this.name = name;
        }
    }
}
