package x;

public final class EnumC3060p {

    public static final EnumC3060p f30975h;

    public static final EnumC3060p f30976i;
    public static final EnumC3060p j;

    public static final EnumC3060p[] f30977k;

    static {
        EnumC3060p enumC3060p = new EnumC3060p("Yes", 0);
        f30975h = enumC3060p;
        EnumC3060p enumC3060p2 = new EnumC3060p("No", 1);
        f30976i = enumC3060p2;
        EnumC3060p enumC3060p3 = new EnumC3060p("NotInitialized", 2);
        j = enumC3060p3;
        EnumC3060p[] enumC3060pArr = {enumC3060p, enumC3060p2, enumC3060p3};
        f30977k = enumC3060pArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC3060pArr);
    }

    public static EnumC3060p valueOf(String str) {
        return (EnumC3060p) Enum.valueOf(EnumC3060p.class, str);
    }

    public static EnumC3060p[] values() {
        return (EnumC3060p[]) f30977k.clone();
    }
}
