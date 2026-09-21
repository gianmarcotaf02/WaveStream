package A4;

/* JADX INFO: renamed from: A4.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0053v extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.C0053v DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER;
    private int ivSize_;

    static {
        A4.C0053v c0053v = new A4.C0053v();
        DEFAULT_INSTANCE = c0053v;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.C0053v.class, c0053v);
    }

    public static void w(A4.C0053v c0053v) {
        c0053v.ivSize_ = 16;
    }

    public static A4.C0053v x() {
        return DEFAULT_INSTANCE;
    }

    public static A4.C0052u z() {
        return (A4.C0052u) DEFAULT_INSTANCE.h();
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new java.lang.Object[]{"ivSize_"});
            case 3:
                return new A4.C0053v();
            case 4:
                return new A4.C0052u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.C0053v.class) {
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

    public final int y() {
        return this.ivSize_;
    }
}
