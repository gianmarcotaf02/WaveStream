package p005a5;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class E1 {

    public static final E1 f13331h;

    public static final E1 f13332i;
    public static final E1 j;

    public static final E1 f13333k;

    public static final E1 f13334l;

    public static final E1 f13335m;

    public static final E1[] f13336n;

    static {
        E1 e6 = new E1("NoContent", 0);
        f13331h = e6;
        E1 e9 = new E1("Timeout", 1);
        f13332i = e9;
        E1 e10 = new E1("ServerError", 2);
        j = e10;
        E1 e11 = new E1("NetworkError", 3);
        f13333k = e11;
        E1 e12 = new E1("AuthFailed", 4);
        f13334l = e12;
        E1 e13 = new E1("Expired", 5);
        f13335m = e13;
        E1[] e1Arr = {e6, e9, e10, e11, e12, e13};
        f13336n = e1Arr;
        q0.t(e1Arr);
    }

    public static E1 valueOf(String str) {
        return (E1) Enum.valueOf(E1.class, str);
    }

    public static E1[] values() {
        return (E1[]) f13336n.clone();
    }
}
