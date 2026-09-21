package A4;

/* JADX INFO: renamed from: A4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0051t extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.C0051t DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER;
    private int keySize_;
    private A4.C0053v params_;

    static {
        A4.C0051t c0051t = new A4.C0051t();
        DEFAULT_INSTANCE = c0051t;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.C0051t.class, c0051t);
    }

    public static A4.C0050s A() {
        return (A4.C0050s) DEFAULT_INSTANCE.h();
    }

    public static A4.C0051t B(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) {
        return (A4.C0051t) com.google.crypto.tink.shaded.protobuf.AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
    }

    public static void w(A4.C0051t c0051t, A4.C0053v c0053v) {
        c0051t.getClass();
        c0051t.params_ = c0053v;
    }

    public static void x(A4.C0051t c0051t, int i3) {
        c0051t.keySize_ = i3;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new java.lang.Object[]{"params_", "keySize_"});
            case 3:
                return new A4.C0051t();
            case 4:
                return new A4.C0050s(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.C0051t.class) {
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

    public final int y() {
        return this.keySize_;
    }

    public final A4.C0053v z() {
        A4.C0053v c0053v = this.params_;
        return c0053v == null ? A4.C0053v.x() : c0053v;
    }
}
