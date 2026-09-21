package E6;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class A {

    public static final A f3190h;

    public static final A f3191i;
    public static final A j;

    public static final A f3192k;

    public static final A[] f3193l;

    static {
        A a2 = new A("PUBLIC", 0);
        f3190h = a2;
        A a9 = new A("PROTECTED", 1);
        f3191i = a9;
        A a10 = new A("INTERNAL", 2);
        j = a10;
        A a11 = new A("PRIVATE", 3);
        f3192k = a11;
        A[] aArr = {a2, a9, a10, a11};
        f3193l = aArr;
        q0.t(aArr);
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f3193l.clone();
    }
}
