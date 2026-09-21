package A4;

import Z.AbstractC1149h0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1927w;

public final class s0 extends AbstractC1928x {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final s0 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER;
    private String configName_ = "";
    private com.google.crypto.tink.shaded.protobuf.A entry_ = com.google.crypto.tink.shaded.protobuf.b0.f19515k;

    static {
        s0 s0Var = new s0();
        DEFAULT_INSTANCE = s0Var;
        AbstractC1928x.t(s0.class, s0Var);
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
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", c0.class});
            case 3:
                return new s0();
            case 4:
                return new K(DEFAULT_INSTANCE, 4);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (s0.class) {
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
