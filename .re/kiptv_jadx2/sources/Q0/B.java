package Q0;

public final class B {

    public static final B f8202h;

    public static final B f8203i;
    public static final B j;

    public static final B f8204k;

    public static final B f8205l;

    public static final B[] f8206m;

    static {
        B b9 = new B("Measuring", 0);
        f8202h = b9;
        B b10 = new B("LookaheadMeasuring", 1);
        f8203i = b10;
        B b11 = new B("LayingOut", 2);
        j = b11;
        B b12 = new B("LookaheadLayingOut", 3);
        f8204k = b12;
        B b13 = new B("Idle", 4);
        f8205l = b13;
        B[] bArr = {b9, b10, b11, b12, b13};
        f8206m = bArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(bArr);
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f8206m.clone();
    }
}
