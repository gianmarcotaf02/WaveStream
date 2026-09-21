package A4;

/* JADX INFO: loaded from: classes.dex */
public final class B extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.B DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.AbstractC1915j keyValue_ = com.google.crypto.tink.shaded.protobuf.AbstractC1915j.f19541i;
    private int version_;

    static {
        A4.B b9 = new A4.B();
        DEFAULT_INSTANCE = b9;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.B.class, b9);
    }

    public static A4.A A() {
        return (A4.A) DEFAULT_INSTANCE.h();
    }

    public static A4.B B(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) {
        return (A4.B) com.google.crypto.tink.shaded.protobuf.AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(A4.B b9) {
        b9.version_ = 0;
    }

    public static void x(A4.B b9, com.google.crypto.tink.shaded.protobuf.C1914i c1914i) {
        b9.getClass();
        b9.keyValue_ = c1914i;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new java.lang.Object[]{"version_", "keyValue_"});
            case 3:
                return new A4.B();
            case 4:
                return new A4.A(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.B.class) {
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
