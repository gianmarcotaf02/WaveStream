package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1914i;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class C0044l extends AbstractC1928x {
    private static final C0044l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1915j keyValue_ = AbstractC1915j.f19541i;
    private C0048p params_;
    private int version_;

    static {
        C0044l c0044l = new C0044l();
        DEFAULT_INSTANCE = c0044l;
        AbstractC1928x.t(C0044l.class, c0044l);
    }

    public static C0043k D() {
        return (C0043k) DEFAULT_INSTANCE.h();
    }

    public static void w(C0044l c0044l) {
        c0044l.version_ = 0;
    }

    public static void x(C0044l c0044l, C0048p c0048p) {
        c0044l.getClass();
        c0048p.getClass();
        c0044l.params_ = c0048p;
    }

    public static void y(C0044l c0044l, C1914i c1914i) {
        c0044l.getClass();
        c0044l.keyValue_ = c1914i;
    }

    public static C0044l z() {
        return DEFAULT_INSTANCE;
    }

    public final AbstractC1915j A() {
        return this.keyValue_;
    }

    public final C0048p B() {
        C0048p c0048p = this.params_;
        return c0048p == null ? C0048p.x() : c0048p;
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
                return new C0044l();
            case 4:
                return new C0043k(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (C0044l.class) {
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
