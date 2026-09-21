package A4;

/* JADX INFO: loaded from: classes.dex */
public final class L extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.L DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER;

    static {
        A4.L l2 = new A4.L();
        DEFAULT_INSTANCE = l2;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.L.class, l2);
    }

    public static A4.L w() {
        return DEFAULT_INSTANCE;
    }

    public static A4.L x(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) {
        return (A4.L) com.google.crypto.tink.shaded.protobuf.AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new A4.L();
            case 4:
                return new A4.K(DEFAULT_INSTANCE, 0);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.L.class) {
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
