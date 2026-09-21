package Q0;

public final class B0 {

    public static final B0 f8207h;

    public static final B0 f8208i;
    public static final B0 j;

    public static final B0[] f8209k;

    static {
        B0 b9 = new B0("ContinueTraversal", 0);
        f8207h = b9;
        B0 b10 = new B0("SkipSubtreeAndContinueTraversal", 1);
        f8208i = b10;
        B0 b11 = new B0("CancelTraversal", 2);
        j = b11;
        B0[] b0Arr = {b9, b10, b11};
        f8209k = b0Arr;
        com.google.crypto.tink.shaded.protobuf.q0.t(b0Arr);
    }

    public static B0 valueOf(String str) {
        return (B0) Enum.valueOf(B0.class, str);
    }

    public static B0[] values() {
        return (B0[]) f8209k.clone();
    }
}
