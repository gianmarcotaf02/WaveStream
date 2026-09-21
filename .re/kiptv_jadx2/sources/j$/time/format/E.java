package j$.time.format;

public final class E {
    public static final E ALWAYS;
    public static final E EXCEEDS_PAD;
    public static final E NEVER;
    public static final E NORMAL;
    public static final E NOT_NEGATIVE;

    public static final E[] f23678a;

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f23678a.clone();
    }

    static {
        E e6 = new E("NORMAL", 0);
        NORMAL = e6;
        E e9 = new E("ALWAYS", 1);
        ALWAYS = e9;
        E e10 = new E("NEVER", 2);
        NEVER = e10;
        E e11 = new E("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = e11;
        E e12 = new E("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = e12;
        f23678a = new E[]{e6, e9, e10, e11, e12};
    }
}
