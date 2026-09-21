package androidx.lifecycle;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class EnumC1532n {
    private static final p126o6.a $ENTRIES;
    private static final EnumC1532n[] $VALUES;
    public static final C1530l Companion;
    public static final EnumC1532n ON_ANY;
    public static final EnumC1532n ON_CREATE;
    public static final EnumC1532n ON_DESTROY;
    public static final EnumC1532n ON_PAUSE;
    public static final EnumC1532n ON_RESUME;
    public static final EnumC1532n ON_START;
    public static final EnumC1532n ON_STOP;

    static {
        EnumC1532n enumC1532n = new EnumC1532n("ON_CREATE", 0);
        ON_CREATE = enumC1532n;
        EnumC1532n enumC1532n2 = new EnumC1532n("ON_START", 1);
        ON_START = enumC1532n2;
        EnumC1532n enumC1532n3 = new EnumC1532n("ON_RESUME", 2);
        ON_RESUME = enumC1532n3;
        EnumC1532n enumC1532n4 = new EnumC1532n("ON_PAUSE", 3);
        ON_PAUSE = enumC1532n4;
        EnumC1532n enumC1532n5 = new EnumC1532n("ON_STOP", 4);
        ON_STOP = enumC1532n5;
        EnumC1532n enumC1532n6 = new EnumC1532n("ON_DESTROY", 5);
        ON_DESTROY = enumC1532n6;
        EnumC1532n enumC1532n7 = new EnumC1532n("ON_ANY", 6);
        ON_ANY = enumC1532n7;
        EnumC1532n[] enumC1532nArr = {enumC1532n, enumC1532n2, enumC1532n3, enumC1532n4, enumC1532n5, enumC1532n6, enumC1532n7};
        $VALUES = enumC1532nArr;
        $ENTRIES = q0.t(enumC1532nArr);
        Companion = new C1530l();
    }

    public static EnumC1532n valueOf(String str) {
        return (EnumC1532n) Enum.valueOf(EnumC1532n.class, str);
    }

    public static EnumC1532n[] values() {
        return (EnumC1532n[]) $VALUES.clone();
    }

    public final EnumC1533o a() {
        switch (AbstractC1531m.f16363a[ordinal()]) {
            case 1:
            case 2:
                return EnumC1533o.j;
            case 3:
            case 4:
                return EnumC1533o.f16366k;
            case 5:
                return EnumC1533o.f16367l;
            case 6:
                return EnumC1533o.f16364h;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new I3.b();
        }
    }
}
