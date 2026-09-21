package A4;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.b0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private java.lang.String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.AbstractC1915j value_ = com.google.crypto.tink.shaded.protobuf.AbstractC1915j.f19541i;

    static {
        A4.b0 b0Var = new A4.b0();
        DEFAULT_INSTANCE = b0Var;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.b0.class, b0Var);
    }

    public static A4.a0 D() {
        return (A4.a0) DEFAULT_INSTANCE.h();
    }

    public static void w(A4.b0 b0Var, java.lang.String str) {
        b0Var.getClass();
        str.getClass();
        b0Var.typeUrl_ = str;
    }

    public static void x(A4.b0 b0Var, com.google.crypto.tink.shaded.protobuf.C1914i c1914i) {
        b0Var.getClass();
        b0Var.value_ = c1914i;
    }

    public static void y(A4.b0 b0Var, A4.r0 r0Var) {
        b0Var.getClass();
        b0Var.outputPrefixType_ = r0Var.b();
    }

    public static A4.b0 z() {
        return DEFAULT_INSTANCE;
    }

    public final A4.r0 A() {
        A4.r0 r0VarA = A4.r0.a(this.outputPrefixType_);
        return r0VarA == null ? A4.r0.UNRECOGNIZED : r0VarA;
    }

    public final java.lang.String B() {
        return this.typeUrl_;
    }

    public final com.google.crypto.tink.shaded.protobuf.AbstractC1915j C() {
        return this.value_;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new java.lang.Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new A4.b0();
            case 4:
                return new A4.a0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.b0.class) {
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
