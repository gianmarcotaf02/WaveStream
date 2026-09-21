package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1914i;
import com.google.crypto.tink.shaded.protobuf.C1921p;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class B extends AbstractC1928x {
    private static final B DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1915j keyValue_ = AbstractC1915j.f19541i;
    private int version_;

    static {
        B b9 = new B();
        DEFAULT_INSTANCE = b9;
        AbstractC1928x.t(B.class, b9);
    }

    public static A A() {
        return (A) DEFAULT_INSTANCE.h();
    }

    public static B B(AbstractC1915j abstractC1915j, C1921p c1921p) {
        return (B) AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(B b9) {
        b9.version_ = 0;
    }

    public static void x(B b9, C1914i c1914i) {
        b9.getClass();
        b9.keyValue_ = c1914i;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new B();
            case 4:
                return new A(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (B.class) {
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

    public final AbstractC1915j y() {
        return this.keyValue_;
    }

    public final int z() {
        return this.version_;
    }
}
