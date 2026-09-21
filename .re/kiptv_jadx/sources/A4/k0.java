package A4;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.k0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.A keyInfo_ = com.google.crypto.tink.shaded.protobuf.b0.f19515k;
    private int primaryKeyId_;

    static {
        A4.k0 k0Var = new A4.k0();
        DEFAULT_INSTANCE = k0Var;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.k0.class, k0Var);
    }

    public static void w(A4.k0 k0Var, int i3) {
        k0Var.primaryKeyId_ = i3;
    }

    public static void x(A4.k0 k0Var, A4.j0 j0Var) {
        k0Var.getClass();
        com.google.crypto.tink.shaded.protobuf.A a2 = k0Var.keyInfo_;
        if (!((com.google.crypto.tink.shaded.protobuf.AbstractC1907b) a2).f19514h) {
            int size = a2.size();
            k0Var.keyInfo_ = a2.g(size == 0 ? 10 : size * 2);
        }
        k0Var.keyInfo_.add(j0Var);
    }

    public static A4.h0 z() {
        return (A4.h0) DEFAULT_INSTANCE.h();
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new java.lang.Object[]{"primaryKeyId_", "keyInfo_", A4.j0.class});
            case 3:
                return new A4.k0();
            case 4:
                return new A4.h0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.k0.class) {
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

    public final A4.j0 y() {
        return (A4.j0) this.keyInfo_.get(0);
    }
}
