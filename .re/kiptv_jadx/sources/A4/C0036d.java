package A4;

/* JADX INFO: renamed from: A4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0036d extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.C0036d DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER;
    private int keySize_;
    private A4.C0038f params_;

    static {
        A4.C0036d c0036d = new A4.C0036d();
        DEFAULT_INSTANCE = c0036d;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.C0036d.class, c0036d);
    }

    public static A4.C0035c A() {
        return (A4.C0035c) DEFAULT_INSTANCE.h();
    }

    public static A4.C0036d B(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) {
        return (A4.C0036d) com.google.crypto.tink.shaded.protobuf.AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(A4.C0036d c0036d) {
        c0036d.keySize_ = 32;
    }

    public static void x(A4.C0036d c0036d, A4.C0038f c0038f) {
        c0036d.getClass();
        c0036d.params_ = c0038f;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new java.lang.Object[]{"keySize_", "params_"});
            case 3:
                return new A4.C0036d();
            case 4:
                return new A4.C0035c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.C0036d.class) {
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
        return this.keySize_;
    }

    public final A4.C0038f z() {
        A4.C0038f c0038f = this.params_;
        return c0038f == null ? A4.C0038f.x() : c0038f;
    }
}
