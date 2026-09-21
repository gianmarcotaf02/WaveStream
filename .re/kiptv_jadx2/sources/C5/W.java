package C5;

public final class W {

    public static final W f1156h;

    public static final W f1157i;
    public static final W j;

    public static final W f1158k;

    public static final W[] f1159l;

    static {
        W w6 = new W("AUTO", 0);
        f1156h = w6;
        W w9 = new W("GRID", 1);
        f1157i = w9;
        W w10 = new W("STRIP", 2);
        j = w10;
        W w11 = new W("FOCUS", 3);
        f1158k = w11;
        W[] wArr = {w6, w9, w10, w11};
        f1159l = wArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(wArr);
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) f1159l.clone();
    }
}
