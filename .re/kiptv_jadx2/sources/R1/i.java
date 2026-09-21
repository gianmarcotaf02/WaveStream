package R1;

import Z.AbstractC1149h0;
import androidx.datastore.preferences.protobuf.AbstractC1512t;
import androidx.datastore.preferences.protobuf.AbstractC1514v;
import androidx.datastore.preferences.protobuf.C1500g;
import androidx.datastore.preferences.protobuf.C1513u;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.W;

public final class i extends AbstractC1514v {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final i DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile S PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        AbstractC1514v.j(i.class, iVar);
    }

    public static h D() {
        return (h) ((AbstractC1512t) DEFAULT_INSTANCE.c(5));
    }

    public static void l(i iVar, long j) {
        iVar.valueCase_ = 4;
        iVar.value_ = Long.valueOf(j);
    }

    public static void m(i iVar, String str) {
        iVar.getClass();
        str.getClass();
        iVar.valueCase_ = 5;
        iVar.value_ = str;
    }

    public static void n(i iVar, g gVar) {
        iVar.getClass();
        iVar.value_ = gVar;
        iVar.valueCase_ = 6;
    }

    public static void o(i iVar, double d4) {
        iVar.valueCase_ = 7;
        iVar.value_ = Double.valueOf(d4);
    }

    public static void p(i iVar, C1500g c1500g) {
        iVar.getClass();
        iVar.valueCase_ = 8;
        iVar.value_ = c1500g;
    }

    public static void q(i iVar, boolean z6) {
        iVar.valueCase_ = 1;
        iVar.value_ = Boolean.valueOf(z6);
    }

    public static void r(i iVar, float f9) {
        iVar.valueCase_ = 2;
        iVar.value_ = Float.valueOf(f9);
    }

    public static void s(i iVar, int i3) {
        iVar.valueCase_ = 3;
        iVar.value_ = Integer.valueOf(i3);
    }

    public static i v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final g B() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.m();
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

    @Override
    public final Object c(int i3) {
        S c1513u;
        switch (AbstractC1149h0.c(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 3:
                return new i();
            case 4:
                return new h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S s9 = PARSER;
                if (s9 != null) {
                    return s9;
                }
                synchronized (i.class) {
                    try {
                        c1513u = PARSER;
                        if (c1513u == null) {
                            c1513u = new C1513u();
                            PARSER = c1513u;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1513u;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C1500g u() {
        return this.valueCase_ == 8 ? (C1500g) this.value_ : C1500g.j;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
