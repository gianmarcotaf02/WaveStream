package p159s5;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class D {

    public static final D f27269h;

    public static final D[] f27270i;

    static {
        D d4 = new D("DEFAULT", 0);
        f27269h = d4;
        D[] dArr = {d4, new D("ALPHA_ASC", 1), new D("ALPHA_DESC", 2)};
        f27270i = dArr;
        q0.t(dArr);
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f27270i.clone();
    }
}
