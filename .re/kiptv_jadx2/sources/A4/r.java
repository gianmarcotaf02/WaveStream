package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1914i;
import com.google.crypto.tink.shaded.protobuf.C1921p;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class r extends AbstractC1928x {
    private static final r DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1915j keyValue_ = AbstractC1915j.f19541i;
    private C0053v params_;
    private int version_;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        AbstractC1928x.t(r.class, rVar);
    }

    public static C0049q C() {
        return (C0049q) DEFAULT_INSTANCE.h();
    }

    public static r D(AbstractC1915j abstractC1915j, C1921p c1921p) {
        return (r) AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(r rVar) {
        rVar.version_ = 0;
    }

    public static void x(r rVar, C0053v c0053v) {
        rVar.getClass();
        c0053v.getClass();
        rVar.params_ = c0053v;
    }

    public static void y(r rVar, C1914i c1914i) {
        rVar.getClass();
        rVar.keyValue_ = c1914i;
    }

    public final C0053v A() {
        C0053v c0053v = this.params_;
        return c0053v == null ? C0053v.x() : c0053v;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new r();
            case 4:
                return new C0049q(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (r.class) {
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
