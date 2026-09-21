package A4;

/* JADX INFO: loaded from: classes.dex */
public final class V extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.V DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        A4.V v6 = new A4.V();
        DEFAULT_INSTANCE = v6;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.V.class, v6);
    }

    public static A4.U B() {
        return (A4.U) DEFAULT_INSTANCE.h();
    }

    public static void w(A4.V v6, A4.O o8) {
        v6.getClass();
        v6.hash_ = o8.a();
    }

    public static void x(A4.V v6, int i3) {
        v6.tagSize_ = i3;
    }

    public static A4.V y() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return this.tagSize_;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new java.lang.Object[]{"hash_", "tagSize_"});
            case 3:
                return new A4.V();
            case 4:
                return new A4.U(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.V.class) {
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

    public final A4.O z() {
        A4.O o8;
        int i3 = this.hash_;
        if (i3 == 0) {
            o8 = A4.O.UNKNOWN_HASH;
        } else if (i3 == 1) {
            o8 = A4.O.SHA1;
        } else if (i3 == 2) {
            o8 = A4.O.SHA384;
        } else if (i3 == 3) {
            o8 = A4.O.SHA256;
        } else if (i3 != 4) {
            o8 = i3 != 5 ? null : A4.O.SHA224;
        } else {
            o8 = A4.O.SHA512;
        }
        return o8 == null ? A4.O.UNRECOGNIZED : o8;
    }
}
