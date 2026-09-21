package p068h4;

public final class f extends d {

    public final char f22494h;

    public final char f22495i;

    public f(char c9, char c10) {
        this.f22494h = c9;
        this.f22495i = c10;
    }

    @Override
    public final boolean c(char c9) {
        return c9 == this.f22494h || c9 == this.f22495i;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f22494h) + i.a(this.f22495i) + "\")";
    }
}
