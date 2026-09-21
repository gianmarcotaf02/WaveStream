package p068h4;

public final enum n extends r {
    public n() {
        super("ALWAYS_TRUE", 0);
    }

    @Override
    public final boolean apply(Object obj) {
        return true;
    }

    @Override
    public final String toString() {
        return "Predicates.alwaysTrue()";
    }
}
