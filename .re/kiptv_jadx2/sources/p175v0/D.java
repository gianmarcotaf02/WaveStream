package p175v0;

import I3.b;
import com.google.crypto.tink.shaded.protobuf.q0;

public final class D implements C {

    public static final D f29046h;

    public static final D f29047i;
    public static final D j;

    public static final D[] f29048k;

    static {
        D d4 = new D("Active", 0);
        f29046h = d4;
        D d6 = new D("ActiveParent", 1);
        f29047i = d6;
        D d9 = new D("Captured", 2);
        D d10 = new D("Inactive", 3);
        j = d10;
        D[] dArr = {d4, d6, d9, d10};
        f29048k = dArr;
        q0.t(dArr);
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f29048k.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new b();
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new b();
            }
        }
        return true;
    }
}
