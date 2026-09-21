package p068h4;

public final class e extends d {

    public final int f22492h;

    public final char f22493i;

    public e(char c9, int i3) {
        this.f22492h = i3;
        this.f22493i = c9;
    }

    @Override
    public final boolean c(char c9) {
        switch (this.f22492h) {
            case 0:
                return c9 == this.f22493i;
            default:
                return c9 != this.f22493i;
        }
    }

    @Override
    public final i d() {
        switch (this.f22492h) {
            case 0:
                return new e(this.f22493i, 1);
            default:
                return new e(this.f22493i, 0);
        }
    }

    public final String toString() {
        switch (this.f22492h) {
            case 0:
                return "CharMatcher.is('" + i.a(this.f22493i) + "')";
            default:
                return "CharMatcher.isNot('" + i.a(this.f22493i) + "')";
        }
    }
}
