package A4;

/* JADX INFO: renamed from: A4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0046n extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.C0046n DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER;
    private int keySize_;
    private A4.C0048p params_;

    static {
        A4.C0046n c0046n = new A4.C0046n();
        DEFAULT_INSTANCE = c0046n;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.C0046n.class, c0046n);
    }

    public static A4.C0045m B() {
        return (A4.C0045m) DEFAULT_INSTANCE.h();
    }

    public static void w(A4.C0046n c0046n, A4.C0048p c0048p) {
        c0046n.getClass();
        c0046n.params_ = c0048p;
    }

    public static void x(A4.C0046n c0046n, int i3) {
        c0046n.keySize_ = i3;
    }

    public static A4.C0046n y() {
        return DEFAULT_INSTANCE;
    }

    public final A4.C0048p A() {
        A4.C0048p c0048p = this.params_;
        return c0048p == null ? A4.C0048p.x() : c0048p;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new java.lang.Object[]{"params_", "keySize_"});
            case 3:
                return new A4.C0046n();
            case 4:
                return new A4.C0045m(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.C0046n.class) {
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
