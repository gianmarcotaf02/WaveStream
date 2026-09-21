package A4;

/* JADX INFO: renamed from: A4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0042j extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final A4.C0042j DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER;
    private A4.C0046n aesCtrKeyFormat_;
    private A4.T hmacKeyFormat_;

    static {
        A4.C0042j c0042j = new A4.C0042j();
        DEFAULT_INSTANCE = c0042j;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.C0042j.class, c0042j);
    }

    public static A4.C0041i A() {
        return (A4.C0041i) DEFAULT_INSTANCE.h();
    }

    public static A4.C0042j B(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) {
        return (A4.C0042j) com.google.crypto.tink.shaded.protobuf.AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(A4.C0042j c0042j, A4.C0046n c0046n) {
        c0042j.getClass();
        c0042j.aesCtrKeyFormat_ = c0046n;
    }

    public static void x(A4.C0042j c0042j, A4.T t9) {
        c0042j.getClass();
        c0042j.hmacKeyFormat_ = t9;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1928x
    public final java.lang.Object i(int i3) {
        com.google.crypto.tink.shaded.protobuf.Y c1927w;
        switch (Z.AbstractC1149h0.c(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new java.lang.Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new A4.C0042j();
            case 4:
                return new A4.C0041i(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.C0042j.class) {
                    try {
                        c1927w = PARSER;
                        if (c1927w == null) {
                            c1927w = new com.google.crypto.tink.shaded.protobuf.C1927w();
                            PARSER = c1927w;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1927w;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public final A4.C0046n y() {
        A4.C0046n c0046n = this.aesCtrKeyFormat_;
        return c0046n == null ? A4.C0046n.y() : c0046n;
    }

    public final A4.T z() {
        A4.T t9 = this.hmacKeyFormat_;
        return t9 == null ? A4.T.y() : t9;
    }
}
