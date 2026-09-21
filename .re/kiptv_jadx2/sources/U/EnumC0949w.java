package U;

public final class EnumC0949w {

    public static final EnumC0949w f10090h;

    public static final EnumC0949w[] f10091i;

    static {
        EnumC0949w enumC0949w = new EnumC0949w("EditableText", 0);
        f10090h = enumC0949w;
        EnumC0949w[] enumC0949wArr = {enumC0949w, new EnumC0949w("StaticText", 1)};
        f10091i = enumC0949wArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0949wArr);
    }

    public static EnumC0949w valueOf(String str) {
        return (EnumC0949w) Enum.valueOf(EnumC0949w.class, str);
    }

    public static EnumC0949w[] values() {
        return (EnumC0949w[]) f10091i.clone();
    }
}
