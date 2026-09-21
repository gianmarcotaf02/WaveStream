package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class C0038f extends AbstractC1928x {
    private static final C0038f DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        C0038f c0038f = new C0038f();
        DEFAULT_INSTANCE = c0038f;
        AbstractC1928x.t(C0038f.class, c0038f);
    }

    public static void w(C0038f c0038f) {
        c0038f.tagSize_ = 16;
    }

    public static C0038f x() {
        return DEFAULT_INSTANCE;
    }

    public static C0037e z() {
        return (C0037e) DEFAULT_INSTANCE.h();
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new C0038f();
            case 4:
                return new C0037e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (C0038f.class) {
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
        return this.tagSize_;
    }
}
