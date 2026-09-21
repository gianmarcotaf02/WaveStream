package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class V extends AbstractC1928x {
    private static final V DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        V v6 = new V();
        DEFAULT_INSTANCE = v6;
        AbstractC1928x.t(V.class, v6);
    }

    public static U B() {
        return (U) DEFAULT_INSTANCE.h();
    }

    public static void w(V v6, O o8) {
        v6.getClass();
        v6.hash_ = o8.a();
    }

    public static void x(V v6, int i3) {
        v6.tagSize_ = i3;
    }

    public static V y() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return this.tagSize_;
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new V();
            case 4:
                return new U(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (V.class) {
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

    public final O z() {
        O o8;
        int i3 = this.hash_;
        if (i3 == 0) {
            o8 = O.UNKNOWN_HASH;
        } else if (i3 == 1) {
            o8 = O.SHA1;
        } else if (i3 == 2) {
            o8 = O.SHA384;
        } else if (i3 == 3) {
            o8 = O.SHA256;
        } else if (i3 != 4) {
            o8 = i3 != 5 ? null : O.SHA224;
        } else {
            o8 = O.SHA512;
        }
        return o8 == null ? O.UNRECOGNIZED : o8;
    }
}
