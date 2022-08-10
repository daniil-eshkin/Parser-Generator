package generator.grammar;

import java.util.List;

public class Rule {
    private final List<Element> elements;

    public Rule(List<Element> elements) {
        this.elements = elements;
    }

    public static class Element {
        public final String name;
        public final String params;
        public final String code;

        public Element(String name, String params, String code) {
            this.name = name;
            this.params = params;
            this.code = code;
        }
    }

    public List<Element> getElements() {
        return elements;
    }
}
