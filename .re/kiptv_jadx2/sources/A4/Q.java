package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1914i;
import com.google.crypto.tink.shaded.protobuf.C1921p;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class Q extends AbstractC1928x {
    private static final Q DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1915j keyValue_ = AbstractC1915j.f19541i;
    private V params_;
    private int version_;

    static {
        Q q9 = new Q();
        DEFAULT_INSTANCE = q9;
        AbstractC1928x.t(Q.class, q9);
    }

    public static P D() {
        return (P) DEFAULT_INSTANCE.h();
    }

    public static Q E(AbstractC1915j abstractC1915j, C1921p c1921p) {
        return (Q) AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(Q q9) {
        q9.version_ = 0;
    }

    public static void x(Q q9, V v6) {
        q9.getClass();
        v6.getClass();
        q9.params_ = v6;
    }

    public static void y(Q q9, C1914i c1914i) {
        q9.getClass();
        q9.keyValue_ = c1914i;
    }

    public static Q z() {
        return DEFAULT_INSTANCE;
    }

    public final AbstractC1915j A() {
        return this.keyValue_;
    }

    public final V B() {
        V v6 = this.params_;
        return v6 == null ? V.y() : v6;
    }

    public final int C() {
        return this.version_;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new Q();
            case 4:
                return new P(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (Q.class) {
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
