package O0;

public final class EnumC0729s {

    public static final EnumC0729s f7686h;

    public static final EnumC0729s f7687i;
    public static final EnumC0729s[] j;

    static {
        EnumC0729s enumC0729s = new EnumC0729s("Width", 0);
        f7686h = enumC0729s;
        EnumC0729s enumC0729s2 = new EnumC0729s("Height", 1);
        f7687i = enumC0729s2;
        EnumC0729s[] enumC0729sArr = {enumC0729s, enumC0729s2};
        j = enumC0729sArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0729sArr);
    }

    public static EnumC0729s valueOf(String str) {
        return (EnumC0729s) Enum.valueOf(EnumC0729s.class, str);
    }

    public static EnumC0729s[] values() {
        return (EnumC0729s[]) j.clone();
    }
}
