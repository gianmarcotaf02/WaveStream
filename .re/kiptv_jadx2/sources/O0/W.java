package O0;

public final class W {

    public static final W f7614h;

    public static final W f7615i;
    public static final W[] j;

    static {
        W w6 = new W("Width", 0);
        f7614h = w6;
        W w9 = new W("Height", 1);
        f7615i = w9;
        W[] wArr = {w6, w9};
        j = wArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(wArr);
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) j.clone();
    }
}
