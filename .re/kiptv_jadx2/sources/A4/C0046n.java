package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class C0046n extends AbstractC1928x {
    private static final C0046n DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER;
    private int keySize_;
    private C0048p params_;

    static {
        C0046n c0046n = new C0046n();
        DEFAULT_INSTANCE = c0046n;
        AbstractC1928x.t(C0046n.class, c0046n);
    }

    public static C0045m B() {
        return (C0045m) DEFAULT_INSTANCE.h();
    }

    public static void w(C0046n c0046n, C0048p c0048p) {
        c0046n.getClass();
        c0046n.params_ = c0048p;
    }

    public static void x(C0046n c0046n, int i3) {
        c0046n.keySize_ = i3;
    }

    public static C0046n y() {
        return DEFAULT_INSTANCE;
    }

    public final C0048p A() {
        C0048p c0048p = this.params_;
        return c0048p == null ? C0048p.x() : c0048p;
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
                return new C0046n();
            case 4:
                return new C0045m(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (C0046n.class) {
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

    public final int z() {
        return this.keySize_;
    }
}
