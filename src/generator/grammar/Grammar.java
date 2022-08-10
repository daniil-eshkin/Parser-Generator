package generator.grammar;

import java.util.*;

public class Grammar {
    public static final String EPS = "EPS";
    public static final Terminal EPS_TERM = new Terminal(EPS, "");
    private static final String END = "END";
    private static final Terminal END_TERM = new Terminal(END, "");

    private final String name;
    private final Map<String, Terminal> terms;
    private final Map<String, Nonterminal> nonterms;
    private final String start;

    public Grammar(String name, Map<String, Terminal> terms, Map<String, Nonterminal> nonterms, String start) {
        this.name = name;
        this.terms = terms;
        this.nonterms = nonterms;
        this.start = start;
        calcFirst();
        calcFollow();
    }

    public String getName() {
        return name;
    }

    public Map<String, Terminal> getTerms() {
        return terms;
    }

    public Map<String, Nonterminal> getNonterms() {
        return nonterms;
    }

    public String getStart() {
        return start;
    }

    private void calcFirst() {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (Map.Entry<String, Nonterminal> nt : getNonterms().entrySet()) {
                for (Rule rule : nt.getValue().getRules()) {
                    int sz = nt.getValue().first.size();
                    nt.getValue().first.addAll(seqFirst(rule.getElements(), 0));
                    if (sz != nt.getValue().first.size()) {
                        changed = true;
                    }
                }
            }
        }
    }

    public Set<Terminal> seqFirst(List<Rule.Element> elements, int start) {
        Set<Terminal> res = new LinkedHashSet<>();
        for (int i = start; i < elements.size(); i++) {
            Rule.Element e = elements.get(i);
            if (terms.containsKey(e.name)) {
                res.add(terms.get(e.name));
                break;
            } else {
                Nonterminal nt = nonterms.get(e.name);
                res.addAll(nt.first);
                if (res.contains(EPS_TERM) && i != elements.size() - 1) {
                    res.remove(EPS_TERM);
                } else {
                    break;
                }
            }
        }
        return res;
    }

    private void calcFollow() {
        nonterms.get(start).follow.add(END_TERM);

        boolean changed = true;
        while (changed) {
            changed = false;
            for (Map.Entry<String, Nonterminal> nt : getNonterms().entrySet()) {
                Nonterminal a = nt.getValue();
                for (Rule rule : a.getRules()) {
                    List<Rule.Element> elements = rule.getElements();
                    for (int i = 0; i < elements.size(); i++) {
                        Rule.Element e = elements.get(i);
                        if (nonterms.containsKey(e.name)) {
                            Nonterminal b = nonterms.get(e.name);
                            int sz = b.follow.size();
                            if (i != elements.size() - 1) {
                                Set<Terminal> first = seqFirst(rule.getElements(), i + 1);
                                if (first.contains(EPS_TERM)) {
                                    first.remove(EPS_TERM);
                                    first.addAll(a.follow);
                                }
                                b.follow.addAll(first);
                            } else {
                                b.follow.addAll(a.follow);
                            }
                            if (sz != b.follow.size()) {
                                changed = true;
                            }
                        }
                    }
                }
            }
        }
    }
}
