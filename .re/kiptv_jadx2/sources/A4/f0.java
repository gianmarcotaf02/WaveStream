package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class f0 extends AbstractC1928x {
    private static final f0 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private Y keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        f0 f0Var = new f0();
        DEFAULT_INSTANCE = f0Var;
        AbstractC1928x.t(f0.class, f0Var);
    }

    public static e0 F() {
        return (e0) DEFAULT_INSTANCE.h();
    }

    public static void w(f0 f0Var, Y y) {
        f0Var.getClass();
        f0Var.keyData_ = y;
    }

    public static void x(f0 f0Var, r0 r0Var) {
        f0Var.getClass();
        f0Var.outputPrefixType_ = r0Var.b();
    }

    public static void y(f0 f0Var) {
        Z z6 = Z.ENABLED;
        f0Var.getClass();
        f0Var.status_ = z6.a();
    }

    public static void z(f0 f0Var, int i3) {
        f0Var.keyId_ = i3;
    }

    public final Y A() {
        Y y = this.keyData_;
        return y == null ? Y.z() : y;
    }

    public final int B() {
        return this.keyId_;
    }

    public final r0 C() {
        r0 r0VarA = r0.a(this.outputPrefixType_);
        return r0VarA == null ? r0.UNRECOGNIZED : r0VarA;
    }

    public final Z D() {
        Z z6;
        int i3 = this.status_;
        if (i3 == 0) {
            z6 = Z.UNKNOWN_STATUS;
        } else if (i3 == 1) {
            z6 = Z.ENABLED;
        } else if (i3 != 2) {
            z6 = i3 != 3 ? null : Z.DESTROYED;
        } else {
            z6 = Z.DISABLED;
        }
        return z6 == null ? Z.UNRECOGNIZED : z6;
    }

    public final boolean E() {
        return this.keyData_ != null;
    }

    @Override
    public final Object i(int i3) {
        com.google.crypto.tink.shaded.protobuf.Y c1927w;
        switch (AbstractC1149h0.c(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new f0();
            case 4:
                return new e0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (f0.class) {
                    try {
                        c1927w = PARSER;
                        if (c1927w == null) {
                            c1927w = new C1927w();
                            PARSER = c1927w;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1927w;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
