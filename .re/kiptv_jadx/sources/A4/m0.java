package A4;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.m0 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private A4.n0 params_;
    private int version_;

    static {
        A4.m0 m0Var = new A4.m0();
        DEFAULT_INSTANCE = m0Var;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.m0.class, m0Var);
    }

    public static A4.l0 A() {
        return (A4.l0) DEFAULT_INSTANCE.h();
    }

    public static A4.m0 B(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) {
        return (A4.m0) com.google.crypto.tink.shaded.protobuf.AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(A4.m0 m0Var) {
        m0Var.version_ = 0;
    }

    public static void x(A4.m0 m0Var, A4.n0 n0Var) {
        m0Var.getClass();
        n0Var.getClass();
        m0Var.params_ = n0Var;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new java.lang.Object[]{"version_", "params_"});
            case 3:
                return new A4.m0();
            case 4:
                return new A4.l0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.m0.class) {
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

    public final A4.n0 y() {
        A4.n0 n0Var = this.params_;
        return n0Var == null ? A4.n0.w() : n0Var;
    }

    public final int z() {
        return this.version_;
    }
}
