package R1;

/* JADX INFO: loaded from: classes.dex */
public final class i extends androidx.datastore.preferences.protobuf.AbstractC1514v {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final R1.i DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile androidx.datastore.preferences.protobuf.S PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private java.lang.Object value_;

    static {
        R1.i iVar = new R1.i();
        DEFAULT_INSTANCE = iVar;
        androidx.datastore.preferences.protobuf.AbstractC1514v.j(R1.i.class, iVar);
    }

    public static R1.h D() {
        return (R1.h) ((androidx.datastore.preferences.protobuf.AbstractC1512t) DEFAULT_INSTANCE.c(5));
    }

    public static void l(R1.i iVar, long j) {
        iVar.valueCase_ = 4;
        iVar.value_ = java.lang.Long.valueOf(j);
    }

    public static void m(R1.i iVar, java.lang.String str) {
        iVar.getClass();
        str.getClass();
        iVar.valueCase_ = 5;
        iVar.value_ = str;
    }

    public static void n(R1.i iVar, R1.g gVar) {
        iVar.getClass();
        iVar.value_ = gVar;
        iVar.valueCase_ = 6;
    }

    public static void o(R1.i iVar, double d4) {
        iVar.valueCase_ = 7;
        iVar.value_ = java.lang.Double.valueOf(d4);
    }

    public static void p(R1.i iVar, androidx.datastore.preferences.protobuf.C1500g c1500g) {
        iVar.getClass();
        iVar.valueCase_ = 8;
        iVar.value_ = c1500g;
    }

    public static void q(R1.i iVar, boolean z6) {
        iVar.valueCase_ = 1;
        iVar.value_ = java.lang.Boolean.valueOf(z6);
    }

    public static void r(R1.i iVar, float f9) {
        iVar.valueCase_ = 2;
        iVar.value_ = java.lang.Float.valueOf(f9);
    }

    public static void s(R1.i iVar, int i3) {
        iVar.valueCase_ = 3;
        iVar.value_ = java.lang.Integer.valueOf(i3);
    }

    public static R1.i v() {
        return DEFAULT_INSTANCE;
    }

    public final java.lang.String A() {
        return this.valueCase_ == 5 ? (java.lang.String) this.value_ : "";
    }

    public final R1.g B() {
        return this.valueCase_ == 6 ? (R1.g) this.value_ : R1.g.m();
    }

    public final int C() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1514v
    public final java.lang.Object c(int i3) {
        androidx.datastore.preferences.protobuf.S c1513u;
        switch (Z.AbstractC1149h0.c(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new androidx.datastore.preferences.protobuf.W(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new java.lang.Object[]{"value_", "valueCase_", R1.g.class});
            case 3:
                return new R1.i();
            case 4:
                return new R1.h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                androidx.datastore.preferences.protobuf.S s9 = PARSER;
                if (s9 != null) {
                    return s9;
                }
                synchronized (R1.i.class) {
                    try {
                        c1513u = PARSER;
                        if (c1513u == null) {
                            c1513u = new androidx.datastore.preferences.protobuf.C1513u();
                            PARSER = c1513u;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1513u;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((java.lang.Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final androidx.datastore.preferences.protobuf.C1500g u() {
        return this.valueCase_ == 8 ? (androidx.datastore.preferences.protobuf.C1500g) this.value_ : androidx.datastore.preferences.protobuf.C1500g.j;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((java.lang.Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((java.lang.Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((java.lang.Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((java.lang.Long) this.value_).longValue();
        }
        return 0L;
    }
}
