package A4;

/* JADX INFO: renamed from: A4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0034b extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.C0034b DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.AbstractC1915j keyValue_ = com.google.crypto.tink.shaded.protobuf.AbstractC1915j.f19541i;
    private A4.C0038f params_;
    private int version_;

    static {
        A4.C0034b c0034b = new A4.C0034b();
        DEFAULT_INSTANCE = c0034b;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.C0034b.class, c0034b);
    }

    public static A4.C0033a C() {
        return (A4.C0033a) DEFAULT_INSTANCE.h();
    }

    public static A4.C0034b D(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) {
        return (A4.C0034b) com.google.crypto.tink.shaded.protobuf.AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(A4.C0034b c0034b) {
        c0034b.version_ = 0;
    }

    public static void x(A4.C0034b c0034b, com.google.crypto.tink.shaded.protobuf.C1914i c1914i) {
        c0034b.getClass();
        c0034b.keyValue_ = c1914i;
    }

    public static void y(A4.C0034b c0034b, A4.C0038f c0038f) {
        c0034b.getClass();
        c0038f.getClass();
        c0034b.params_ = c0038f;
    }

    public final A4.C0038f A() {
        A4.C0038f c0038f = this.params_;
        return c0038f == null ? A4.C0038f.x() : c0038f;
    }

    public final int B() {
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new java.lang.Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new A4.C0034b();
            case 4:
                return new A4.C0033a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.C0034b.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.AbstractC1915j z() {
        return this.keyValue_;
    }
}
