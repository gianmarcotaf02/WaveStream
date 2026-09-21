package A4;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.Q DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.AbstractC1915j keyValue_ = com.google.crypto.tink.shaded.protobuf.AbstractC1915j.f19541i;
    private A4.V params_;
    private int version_;

    static {
        A4.Q q9 = new A4.Q();
        DEFAULT_INSTANCE = q9;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.Q.class, q9);
    }

    public static A4.P D() {
        return (A4.P) DEFAULT_INSTANCE.h();
    }

    public static A4.Q E(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) {
        return (A4.Q) com.google.crypto.tink.shaded.protobuf.AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(A4.Q q9) {
        q9.version_ = 0;
    }

    public static void x(A4.Q q9, A4.V v6) {
        q9.getClass();
        v6.getClass();
        q9.params_ = v6;
    }

    public static void y(A4.Q q9, com.google.crypto.tink.shaded.protobuf.C1914i c1914i) {
        q9.getClass();
        q9.keyValue_ = c1914i;
    }

    public static A4.Q z() {
        return DEFAULT_INSTANCE;
    }

    public final com.google.crypto.tink.shaded.protobuf.AbstractC1915j A() {
        return this.keyValue_;
    }

    public final A4.V B() {
        A4.V v6 = this.params_;
        return v6 == null ? A4.V.y() : v6;
    }

    public final int C() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1928x
    public final java.lang.Object i(int i3) {
        com.google.crypto.tink.shaded.protobuf.Y c1927w;
        switch (Z.AbstractC1149h0.c(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new java.lang.Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new A4.Q();
            case 4:
                return new A4.P(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.Q.class) {
                    try {
                        c1927w = PARSER;
                        if (c1927w == null) {
                            c1927w = new com.google.crypto.tink.shaded.protobuf.C1927w();
                            PARSER = c1927w;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1927w;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }
}
