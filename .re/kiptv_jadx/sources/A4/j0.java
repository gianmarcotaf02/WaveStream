package A4;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.j0 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private java.lang.String typeUrl_ = "";

    static {
        A4.j0 j0Var = new A4.j0();
        DEFAULT_INSTANCE = j0Var;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.j0.class, j0Var);
    }

    public static A4.i0 B() {
        return (A4.i0) DEFAULT_INSTANCE.h();
    }

    public static void w(A4.j0 j0Var, java.lang.String str) {
        j0Var.getClass();
        str.getClass();
        j0Var.typeUrl_ = str;
    }

    public static void x(A4.j0 j0Var, A4.r0 r0Var) {
        j0Var.getClass();
        j0Var.outputPrefixType_ = r0Var.b();
    }

    public static void y(A4.j0 j0Var, A4.Z z6) {
        j0Var.getClass();
        j0Var.status_ = z6.a();
    }

    public static void z(A4.j0 j0Var, int i3) {
        j0Var.keyId_ = i3;
    }

    public final int A() {
        return this.keyId_;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new java.lang.Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new A4.j0();
            case 4:
                return new A4.i0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.j0.class) {
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
