package A4;

/* JADX INFO: loaded from: classes.dex */
public final class T extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.T DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private A4.V params_;
    private int version_;

    static {
        A4.T t9 = new A4.T();
        DEFAULT_INSTANCE = t9;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.T.class, t9);
    }

    public static A4.S B() {
        return (A4.S) DEFAULT_INSTANCE.h();
    }

    public static A4.T C(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) {
        return (A4.T) com.google.crypto.tink.shaded.protobuf.AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(A4.T t9, A4.V v6) {
        t9.getClass();
        t9.params_ = v6;
    }

    public static void x(A4.T t9, int i3) {
        t9.keySize_ = i3;
    }

    public static A4.T y() {
        return DEFAULT_INSTANCE;
    }

    public final A4.V A() {
        A4.V v6 = this.params_;
        return v6 == null ? A4.V.y() : v6;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new java.lang.Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new A4.T();
            case 4:
                return new A4.S(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.T.class) {
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

    public final int z() {
        return this.keySize_;
    }
}
