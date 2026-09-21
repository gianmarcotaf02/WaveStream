package B;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class E {

    public static final E f465h;

    public static final E f466i;
    public static final E[] j;

    static {
        E e6 = new E("Min", 0);
        f465h = e6;
        E e9 = new E("Max", 1);
        f466i = e9;
        E[] eArr = {e6, e9};
        j = eArr;
        q0.t(eArr);
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) j.clone();
    }
}
