package A4;

/* JADX INFO: renamed from: A4.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0057z extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.C0057z DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    static {
        A4.C0057z c0057z = new A4.C0057z();
        DEFAULT_INSTANCE = c0057z;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.C0057z.class, c0057z);
    }

    public static void w(A4.C0057z c0057z, int i3) {
        c0057z.keySize_ = i3;
    }

    public static A4.C0056y y() {
        return (A4.C0056y) DEFAULT_INSTANCE.h();
    }

    public static A4.C0057z z(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) {
        return (A4.C0057z) com.google.crypto.tink.shaded.protobuf.AbstractC1928x.r(DEFAULT_INSTANCE, abstractC1915j, c1921p);
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new java.lang.Object[]{"keySize_", "version_"});
            case 3:
                return new A4.C0057z();
            case 4:
                return new A4.C0056y(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.C0057z.class) {
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

    public final int x() {
        return this.keySize_;
    }
}
