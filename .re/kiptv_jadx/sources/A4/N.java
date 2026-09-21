package A4;

/* JADX INFO: loaded from: classes.dex */
public final class N extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.N DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER;
    private com.google.crypto.tink.shaded.protobuf.AbstractC1915j encryptedKeyset_ = com.google.crypto.tink.shaded.protobuf.AbstractC1915j.f19541i;
    private A4.k0 keysetInfo_;

    static {
        A4.N n3 = new A4.N();
        DEFAULT_INSTANCE = n3;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.N.class, n3);
    }

    public static A4.N A(java.io.ByteArrayInputStream byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) throws com.google.crypto.tink.shaded.protobuf.D {
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x abstractC1928xS = com.google.crypto.tink.shaded.protobuf.AbstractC1928x.s(DEFAULT_INSTANCE, new com.google.crypto.tink.shaded.protobuf.C1917l(byteArrayInputStream), c1921p);
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.g(abstractC1928xS);
        return (A4.N) abstractC1928xS;
    }

    public static void w(A4.N n3, com.google.crypto.tink.shaded.protobuf.C1914i c1914i) {
        n3.getClass();
        n3.encryptedKeyset_ = c1914i;
    }

    public static void x(A4.N n3, A4.k0 k0Var) {
        n3.getClass();
        n3.keysetInfo_ = k0Var;
    }

    public static A4.M z() {
        return (A4.M) DEFAULT_INSTANCE.h();
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new java.lang.Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new A4.N();
            case 4:
                return new A4.M(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.N.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.AbstractC1915j y() {
        return this.encryptedKeyset_;
    }
}
