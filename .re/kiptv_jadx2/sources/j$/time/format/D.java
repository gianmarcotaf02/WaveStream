package j$.time.format;

public final class D {
    public static final D LENIENT;
    public static final D SMART;
    public static final D STRICT;

    public static final D[] f23661a;

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f23661a.clone();
    }

    static {
        D d4 = new D("STRICT", 0);
        STRICT = d4;
        D d6 = new D("SMART", 1);
        SMART = d6;
        D d9 = new D("LENIENT", 2);
        LENIENT = d9;
        f23661a = new D[]{d4, d6, d9};
    }
}
