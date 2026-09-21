package A4;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.q0 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER;
    private A4.b0 dekTemplate_;
    private java.lang.String kekUri_ = "";

    static {
        A4.q0 q0Var = new A4.q0();
        DEFAULT_INSTANCE = q0Var;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.q0.class, q0Var);
    }

    public static A4.q0 A(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) {
        return (A4.q0) com.google.crypto.tink.shaded.protobuf.AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static A4.q0 w() {
        return DEFAULT_INSTANCE;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new java.lang.Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new A4.q0();
            case 4:
                return new A4.K(DEFAULT_INSTANCE, 3);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.q0.class) {
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

    public final A4.b0 x() {
        A4.b0 b0Var = this.dekTemplate_;
        return b0Var == null ? A4.b0.z() : b0Var;
    }

    public final java.lang.String y() {
        return this.kekUri_;
    }

    public final boolean z() {
        return this.dekTemplate_ != null;
    }
}
