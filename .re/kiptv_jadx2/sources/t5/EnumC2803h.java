package t5;

public final class EnumC2803h {

    public static final EnumC2803h f28192h;

    public static final EnumC2803h f28193i;
    public static final EnumC2803h[] j;

    static {
        EnumC2803h enumC2803h = new EnumC2803h("Left", 0);
        f28192h = enumC2803h;
        EnumC2803h enumC2803h2 = new EnumC2803h("Right", 1);
        f28193i = enumC2803h2;
        EnumC2803h[] enumC2803hArr = {enumC2803h, enumC2803h2};
        j = enumC2803hArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC2803hArr);
    }

    public static EnumC2803h valueOf(String str) {
        return (EnumC2803h) Enum.valueOf(EnumC2803h.class, str);
    }

    public static EnumC2803h[] values() {
        return (EnumC2803h[]) j.clone();
    }
}
