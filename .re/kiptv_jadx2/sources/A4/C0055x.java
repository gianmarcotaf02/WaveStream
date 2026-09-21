package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1914i;
import com.google.crypto.tink.shaded.protobuf.C1921p;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class C0055x extends AbstractC1928x {
    private static final C0055x DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1915j keyValue_ = AbstractC1915j.f19541i;
    private int version_;

    static {
        C0055x c0055x = new C0055x();
        DEFAULT_INSTANCE = c0055x;
        AbstractC1928x.t(C0055x.class, c0055x);
    }

    public static C0054w A() {
        return (C0054w) DEFAULT_INSTANCE.h();
    }

    public static C0055x B(AbstractC1915j abstractC1915j, C1921p c1921p) {
        return (C0055x) AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(C0055x c0055x) {
        c0055x.version_ = 0;
    }

    public static void x(C0055x c0055x, C1914i c1914i) {
        c0055x.getClass();
        c0055x.keyValue_ = c1914i;
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
                return new C0055x();
            case 4:
                return new C0054w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (C0055x.class) {
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
