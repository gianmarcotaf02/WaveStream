package t5;

public final class Q1 {
    public static final P1 Companion;

    public static final Q1 f28035h;

    public static final Q1 f28036i;
    public static final Q1 j;

    public static final Q1 f28037k;

    public static final Q1[] f28038l;

    static {
        Q1 q9 = new Q1("NONE", 0);
        f28035h = q9;
        Q1 q10 = new Q1("KIPTV", 1);
        f28036i = q10;
        Q1 q11 = new Q1("TRAKT", 2);
        j = q11;
        Q1 q12 = new Q1("BOTH", 3);
        f28037k = q12;
        Q1[] q1Arr = {q9, q10, q11, q12};
        f28038l = q1Arr;
        com.google.crypto.tink.shaded.protobuf.q0.t(q1Arr);
        Companion = new P1();
    }

    public static Q1 valueOf(String str) {
        return (Q1) Enum.valueOf(Q1.class, str);
    }

    public static Q1[] values() {
        return (Q1[]) f28038l.clone();
    }
}
