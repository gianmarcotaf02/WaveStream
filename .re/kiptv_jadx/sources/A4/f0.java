package A4;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.f0 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private A4.Y keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        A4.f0 f0Var = new A4.f0();
        DEFAULT_INSTANCE = f0Var;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.f0.class, f0Var);
    }

    public static A4.e0 F() {
        return (A4.e0) DEFAULT_INSTANCE.h();
    }

    public static void w(A4.f0 f0Var, A4.Y y) {
        f0Var.getClass();
        f0Var.keyData_ = y;
    }

    public static void x(A4.f0 f0Var, A4.r0 r0Var) {
        f0Var.getClass();
        f0Var.outputPrefixType_ = r0Var.b();
    }

    public static void y(A4.f0 f0Var) {
        A4.Z z6 = A4.Z.ENABLED;
        f0Var.getClass();
        f0Var.status_ = z6.a();
    }

    public static void z(A4.f0 f0Var, int i3) {
        f0Var.keyId_ = i3;
    }

    public final A4.Y A() {
        A4.Y y = this.keyData_;
        return y == null ? A4.Y.z() : y;
    }

    public final int B() {
        return this.keyId_;
    }

    public final A4.r0 C() {
        A4.r0 r0VarA = A4.r0.a(this.outputPrefixType_);
        return r0VarA == null ? A4.r0.UNRECOGNIZED : r0VarA;
    }

    public final A4.Z D() {
        A4.Z z6;
        int i3 = this.status_;
        if (i3 == 0) {
            z6 = A4.Z.UNKNOWN_STATUS;
        } else if (i3 == 1) {
            z6 = A4.Z.ENABLED;
        } else if (i3 != 2) {
            z6 = i3 != 3 ? null : A4.Z.DESTROYED;
        } else {
            z6 = A4.Z.DISABLED;
        }
        return z6 == null ? A4.Z.UNRECOGNIZED : z6;
    }

    public final boolean E() {
        return this.keyData_ != null;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new java.lang.Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new A4.f0();
            case 4:
                return new A4.e0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.f0.class) {
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
