package p154s;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class D {

    public static final D f27046h;

    public static final D f27047i;
    public static final D j;

    public static final D[] f27048k;

    static {
        D d4 = new D("PreEnter", 0);
        f27046h = d4;
        D d6 = new D("Visible", 1);
        f27047i = d6;
        D d9 = new D("PostExit", 2);
        j = d9;
        D[] dArr = {d4, d6, d9};
        f27048k = dArr;
        q0.t(dArr);
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f27048k.clone();
    }
}
