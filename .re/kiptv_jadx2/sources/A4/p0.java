package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1921p;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class p0 extends AbstractC1928x {
    private static final p0 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private q0 params_;
    private int version_;

    static {
        p0 p0Var = new p0();
        DEFAULT_INSTANCE = p0Var;
        AbstractC1928x.t(p0.class, p0Var);
    }

    public static o0 A() {
        return (o0) DEFAULT_INSTANCE.h();
    }

    public static p0 B(AbstractC1915j abstractC1915j, C1921p c1921p) {
        return (p0) AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(p0 p0Var) {
        p0Var.version_ = 0;
    }

    public static void x(p0 p0Var, q0 q0Var) {
        p0Var.getClass();
        q0Var.getClass();
        p0Var.params_ = q0Var;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new p0();
            case 4:
                return new o0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (p0.class) {
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

    public final q0 y() {
        q0 q0Var = this.params_;
        return q0Var == null ? q0.w() : q0Var;
    }

    public final int z() {
        return this.version_;
    }
}
