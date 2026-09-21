package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1921p;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class C0040h extends AbstractC1928x {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C0040h DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C0044l aesCtrKey_;
    private Q hmacKey_;
    private int version_;

    static {
        C0040h c0040h = new C0040h();
        DEFAULT_INSTANCE = c0040h;
        AbstractC1928x.t(C0040h.class, c0040h);
    }

    public static C0039g C() {
        return (C0039g) DEFAULT_INSTANCE.h();
    }

    public static C0040h D(AbstractC1915j abstractC1915j, C1921p c1921p) {
        return (C0040h) AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(C0040h c0040h) {
        c0040h.version_ = 0;
    }

    public static void x(C0040h c0040h, C0044l c0044l) {
        c0040h.getClass();
        c0044l.getClass();
        c0040h.aesCtrKey_ = c0044l;
    }

    public static void y(C0040h c0040h, Q q9) {
        c0040h.getClass();
        q9.getClass();
        c0040h.hmacKey_ = q9;
    }

    public final Q A() {
        Q q9 = this.hmacKey_;
        return q9 == null ? Q.z() : q9;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new C0040h();
            case 4:
                return new C0039g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (C0040h.class) {
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

    public final C0044l z() {
        C0044l c0044l = this.aesCtrKey_;
        return c0044l == null ? C0044l.z() : c0044l;
    }
}
