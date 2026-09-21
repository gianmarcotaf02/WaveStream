package A4;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.v0 DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    static {
        A4.v0 v0Var = new A4.v0();
        DEFAULT_INSTANCE = v0Var;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.v0.class, v0Var);
    }

    public static A4.v0 w() {
        return DEFAULT_INSTANCE;
    }

    public static A4.v0 x(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) {
        return (A4.v0) com.google.crypto.tink.shaded.protobuf.AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new java.lang.Object[]{"version_"});
            case 3:
                return new A4.v0();
            case 4:
                return new A4.K(DEFAULT_INSTANCE, 5);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.v0.class) {
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
