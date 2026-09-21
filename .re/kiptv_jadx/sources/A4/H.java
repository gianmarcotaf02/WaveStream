package A4;

/* JADX INFO: loaded from: classes.dex */
public final class H extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.H DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int keySize_;
    private int version_;

    static {
        A4.H h9 = new A4.H();
        DEFAULT_INSTANCE = h9;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.H.class, h9);
    }

    public static void w(A4.H h9) {
        h9.keySize_ = 64;
    }

    public static A4.G y() {
        return (A4.G) DEFAULT_INSTANCE.h();
    }

    public static A4.H z(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) {
        return (A4.H) com.google.crypto.tink.shaded.protobuf.AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new java.lang.Object[]{"keySize_", "version_"});
            case 3:
                return new A4.H();
            case 4:
                return new A4.G(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.H.class) {
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

    public final int x() {
        return this.keySize_;
    }
}
