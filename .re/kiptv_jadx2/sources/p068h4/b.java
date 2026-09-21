package p068h4;

public final class b extends g {
    public static final b j = new b("CharMatcher.any()", 0);

    public static final b f22486k = new b("CharMatcher.ascii()", 1);

    public static final b f22487l = new b("CharMatcher.javaIsoControl()", 2);

    public static final b f22488m = new b("CharMatcher.none()", 3);

    public final int f22489i;

    public b(String str, int i3) {
        super(str);
        this.f22489i = i3;
    }

    @Override
    public final boolean c(char c9) {
        switch (this.f22489i) {
            case 0:
                return true;
            case 1:
                return c9 <= 127;
            case 2:
                return c9 <= 31 || (c9 >= 127 && c9 <= 159);
            default:
                return false;
        }
    }

    @Override
    public i d() {
        switch (this.f22489i) {
            case 0:
                return f22488m;
            case 3:
                return j;
            default:
                return super.d();
        }
    }
}
