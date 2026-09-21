package B;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class A {

    public static final A f458h;

    public static final A f459i;
    public static final A j;

    public static final A[] f460k;

    static {
        A a2 = new A("Vertical", 0);
        f458h = a2;
        A a9 = new A("Horizontal", 1);
        f459i = a9;
        A a10 = new A("Both", 2);
        j = a10;
        A[] aArr = {a2, a9, a10};
        f460k = aArr;
        q0.t(aArr);
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f460k.clone();
    }
}
