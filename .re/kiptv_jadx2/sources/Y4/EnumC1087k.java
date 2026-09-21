package Y4;

public final class EnumC1087k {

    public static final EnumC1087k f11954h;

    public static final EnumC1087k f11955i;
    public static final EnumC1087k j;

    public static final EnumC1087k[] f11956k;

    static {
        EnumC1087k enumC1087k = new EnumC1087k("LIVE", 0);
        f11954h = enumC1087k;
        EnumC1087k enumC1087k2 = new EnumC1087k("VOD", 1);
        f11955i = enumC1087k2;
        EnumC1087k enumC1087k3 = new EnumC1087k("SERIES", 2);
        j = enumC1087k3;
        EnumC1087k[] enumC1087kArr = {enumC1087k, enumC1087k2, enumC1087k3};
        f11956k = enumC1087kArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC1087kArr);
    }

    public static EnumC1087k valueOf(String str) {
        return (EnumC1087k) Enum.valueOf(EnumC1087k.class, str);
    }

    public static EnumC1087k[] values() {
        return (EnumC1087k[]) f11956k.clone();
    }
}
