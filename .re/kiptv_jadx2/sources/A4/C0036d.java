package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1921p;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class C0036d extends AbstractC1928x {
    private static final C0036d DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER;
    private int keySize_;
    private C0038f params_;

    static {
        C0036d c0036d = new C0036d();
        DEFAULT_INSTANCE = c0036d;
        AbstractC1928x.t(C0036d.class, c0036d);
    }

    public static C0035c A() {
        return (C0035c) DEFAULT_INSTANCE.h();
    }

    public static C0036d B(AbstractC1915j abstractC1915j, C1921p c1921p) {
        return (C0036d) AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(C0036d c0036d) {
        c0036d.keySize_ = 32;
    }

    public static void x(C0036d c0036d, C0038f c0038f) {
        c0036d.getClass();
        c0036d.params_ = c0038f;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new C0036d();
            case 4:
                return new C0035c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (C0036d.class) {
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

    public final int y() {
        return this.keySize_;
    }

    public final C0038f z() {
        C0038f c0038f = this.params_;
        return c0038f == null ? C0038f.x() : c0038f;
    }
}
