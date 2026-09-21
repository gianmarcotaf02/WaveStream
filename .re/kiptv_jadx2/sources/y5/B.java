package y5;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class B {

    public static final B f31889h;

    public static final B f31890i;
    public static final B j;

    public static final B f31891k;

    public static final B f31892l;

    public static final B f31893m;

    public static final B f31894n;

    public static final B[] f31895o;

    public static final p126o6.b f31896p;

    static {
        B b9 = new B("HOME", 0);
        f31889h = b9;
        B b10 = new B("MOVIES", 1);
        f31890i = b10;
        B b11 = new B("SERIES", 2);
        j = b11;
        B b12 = new B("LIVE", 3);
        f31891k = b12;
        B b13 = new B("EPG", 4);
        f31892l = b13;
        B b14 = new B("SEARCH", 5);
        f31893m = b14;
        B b15 = new B("SETTINGS", 6);
        f31894n = b15;
        B[] bArr = {b9, b10, b11, b12, b13, b14, b15};
        f31895o = bArr;
        f31896p = q0.t(bArr);
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f31895o.clone();
    }
}
