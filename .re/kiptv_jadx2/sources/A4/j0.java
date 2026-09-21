package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class j0 extends AbstractC1928x {
    private static final j0 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        j0 j0Var = new j0();
        DEFAULT_INSTANCE = j0Var;
        AbstractC1928x.t(j0.class, j0Var);
    }

    public static i0 B() {
        return (i0) DEFAULT_INSTANCE.h();
    }

    public static void w(j0 j0Var, String str) {
        j0Var.getClass();
        str.getClass();
        j0Var.typeUrl_ = str;
    }

    public static void x(j0 j0Var, r0 r0Var) {
        j0Var.getClass();
        j0Var.outputPrefixType_ = r0Var.b();
    }

    public static void y(j0 j0Var, Z z6) {
        j0Var.getClass();
        j0Var.status_ = z6.a();
    }

    public static void z(j0 j0Var, int i3) {
        j0Var.keyId_ = i3;
    }

    public final int A() {
        return this.keyId_;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new j0();
            case 4:
                return new i0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (j0.class) {
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
