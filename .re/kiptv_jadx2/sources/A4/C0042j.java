package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1921p;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class C0042j extends AbstractC1928x {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C0042j DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER;
    private C0046n aesCtrKeyFormat_;
    private T hmacKeyFormat_;

    static {
        C0042j c0042j = new C0042j();
        DEFAULT_INSTANCE = c0042j;
        AbstractC1928x.t(C0042j.class, c0042j);
    }

    public static C0041i A() {
        return (C0041i) DEFAULT_INSTANCE.h();
    }

    public static C0042j B(AbstractC1915j abstractC1915j, C1921p c1921p) {
        return (C0042j) AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(C0042j c0042j, C0046n c0046n) {
        c0042j.getClass();
        c0042j.aesCtrKeyFormat_ = c0046n;
    }

    public static void x(C0042j c0042j, T t9) {
        c0042j.getClass();
        c0042j.hmacKeyFormat_ = t9;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new C0042j();
            case 4:
                return new C0041i(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (C0042j.class) {
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

    public final C0046n y() {
        C0046n c0046n = this.aesCtrKeyFormat_;
        return c0046n == null ? C0046n.y() : c0046n;
    }

    public final T z() {
        T t9 = this.hmacKeyFormat_;
        return t9 == null ? T.y() : t9;
    }
}
