package A4;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.Y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private java.lang.String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.AbstractC1915j value_ = com.google.crypto.tink.shaded.protobuf.AbstractC1915j.f19541i;

    static {
        A4.Y y = new A4.Y();
        DEFAULT_INSTANCE = y;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.Y.class, y);
    }

    public static A4.W D() {
        return (A4.W) DEFAULT_INSTANCE.h();
    }

    public static void w(A4.Y y, java.lang.String str) {
        y.getClass();
        str.getClass();
        y.typeUrl_ = str;
    }

    public static void x(A4.Y y, com.google.crypto.tink.shaded.protobuf.C1914i c1914i) {
        y.getClass();
        y.value_ = c1914i;
    }

    public static void y(A4.Y y, A4.X x9) {
        y.getClass();
        if (x9 != A4.X.UNRECOGNIZED) {
            y.keyMaterialType_ = x9.f232h;
        } else {
            x9.getClass();
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static A4.Y z() {
        return DEFAULT_INSTANCE;
    }

    public final A4.X A() {
        A4.X x9;
        int i3 = this.keyMaterialType_;
        if (i3 == 0) {
            x9 = A4.X.UNKNOWN_KEYMATERIAL;
        } else if (i3 == 1) {
            x9 = A4.X.SYMMETRIC;
        } else if (i3 == 2) {
            x9 = A4.X.ASYMMETRIC_PRIVATE;
        } else if (i3 != 3) {
            x9 = i3 != 4 ? null : A4.X.REMOTE;
        } else {
            x9 = A4.X.ASYMMETRIC_PUBLIC;
        }
        return x9 == null ? A4.X.UNRECOGNIZED : x9;
    }

    public final java.lang.String B() {
        return this.typeUrl_;
    }

    public final com.google.crypto.tink.shaded.protobuf.AbstractC1915j C() {
        return this.value_;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new java.lang.Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new A4.Y();
            case 4:
                return new A4.W(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.Y.class) {
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
}
