package A4;

/* JADX INFO: loaded from: classes.dex */
public final class J extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.J DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.AbstractC1915j keyValue_ = com.google.crypto.tink.shaded.protobuf.AbstractC1915j.f19541i;
    private int version_;

    static {
        A4.J j = new A4.J();
        DEFAULT_INSTANCE = j;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.J.class, j);
    }

    public static A4.I A() {
        return (A4.I) DEFAULT_INSTANCE.h();
    }

    public static A4.J B(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) {
        return (A4.J) com.google.crypto.tink.shaded.protobuf.AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(A4.J j) {
        j.version_ = 0;
    }

    public static void x(A4.J j, com.google.crypto.tink.shaded.protobuf.C1914i c1914i) {
        j.getClass();
        j.keyValue_ = c1914i;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new java.lang.Object[]{"version_", "keyValue_"});
            case 3:
                return new A4.J();
            case 4:
                return new A4.I(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.J.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.AbstractC1915j y() {
        return this.keyValue_;
    }

    public final int z() {
        return this.version_;
    }
}
