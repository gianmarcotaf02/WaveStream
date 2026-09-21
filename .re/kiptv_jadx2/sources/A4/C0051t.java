package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1921p;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class C0051t extends AbstractC1928x {
    private static final C0051t DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER;
    private int keySize_;
    private C0053v params_;

    static {
        C0051t c0051t = new C0051t();
        DEFAULT_INSTANCE = c0051t;
        AbstractC1928x.t(C0051t.class, c0051t);
    }

    public static C0050s A() {
        return (C0050s) DEFAULT_INSTANCE.h();
    }

    public static C0051t B(AbstractC1915j abstractC1915j, C1921p c1921p) {
        return (C0051t) AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(C0051t c0051t, C0053v c0053v) {
        c0051t.getClass();
        c0051t.params_ = c0053v;
    }

    public static void x(C0051t c0051t, int i3) {
        c0051t.keySize_ = i3;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new C0051t();
            case 4:
                return new C0050s(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (C0051t.class) {
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

    public final C0053v z() {
        C0053v c0053v = this.params_;
        return c0053v == null ? C0053v.x() : c0053v;
    }
}
