package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1914i;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class Y extends AbstractC1928x {
    private static final Y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private AbstractC1915j value_ = AbstractC1915j.f19541i;

    static {
        Y y = new Y();
        DEFAULT_INSTANCE = y;
        AbstractC1928x.t(Y.class, y);
    }

    public static W D() {
        return (W) DEFAULT_INSTANCE.h();
    }

    public static void w(Y y, String str) {
        y.getClass();
        str.getClass();
        y.typeUrl_ = str;
    }

    public static void x(Y y, C1914i c1914i) {
        y.getClass();
        y.value_ = c1914i;
    }

    public static void y(Y y, X x9) {
        y.getClass();
        if (x9 != X.UNRECOGNIZED) {
            y.keyMaterialType_ = x9.f232h;
        } else {
            x9.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static Y z() {
        return DEFAULT_INSTANCE;
    }

    public final X A() {
        X x9;
        int i3 = this.keyMaterialType_;
        if (i3 == 0) {
            x9 = X.UNKNOWN_KEYMATERIAL;
        } else if (i3 == 1) {
            x9 = X.SYMMETRIC;
        } else if (i3 == 2) {
            x9 = X.ASYMMETRIC_PRIVATE;
        } else if (i3 != 3) {
            x9 = i3 != 4 ? null : X.REMOTE;
        } else {
            x9 = X.ASYMMETRIC_PUBLIC;
        }
        return x9 == null ? X.UNRECOGNIZED : x9;
    }

    public final String B() {
        return this.typeUrl_;
    }

    public final AbstractC1915j C() {
        return this.value_;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new Y();
            case 4:
                return new W(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (Y.class) {
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
}
