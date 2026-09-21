package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1914i;
import com.google.crypto.tink.shaded.protobuf.C1921p;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class C0034b extends AbstractC1928x {
    private static final C0034b DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1915j keyValue_ = AbstractC1915j.f19541i;
    private C0038f params_;
    private int version_;

    static {
        C0034b c0034b = new C0034b();
        DEFAULT_INSTANCE = c0034b;
        AbstractC1928x.t(C0034b.class, c0034b);
    }

    public static C0033a C() {
        return (C0033a) DEFAULT_INSTANCE.h();
    }

    public static C0034b D(AbstractC1915j abstractC1915j, C1921p c1921p) {
        return (C0034b) AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(C0034b c0034b) {
        c0034b.version_ = 0;
    }

    public static void x(C0034b c0034b, C1914i c1914i) {
        c0034b.getClass();
        c0034b.keyValue_ = c1914i;
    }

    public static void y(C0034b c0034b, C0038f c0038f) {
        c0034b.getClass();
        c0038f.getClass();
        c0034b.params_ = c0038f;
    }

    public final C0038f A() {
        C0038f c0038f = this.params_;
        return c0038f == null ? C0038f.x() : c0038f;
    }

    public final int B() {
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new C0034b();
            case 4:
                return new C0033a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (C0034b.class) {
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

    public final AbstractC1915j z() {
        return this.keyValue_;
    }
}
