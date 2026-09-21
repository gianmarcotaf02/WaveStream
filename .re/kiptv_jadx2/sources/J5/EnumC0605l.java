package J5;

public final class EnumC0605l {

    public static final EnumC0605l f6475h;

    public static final EnumC0605l f6476i;
    public static final EnumC0605l j;

    public static final EnumC0605l f6477k;

    public static final EnumC0605l f6478l;

    public static final EnumC0605l[] f6479m;

    static {
        EnumC0605l enumC0605l = new EnumC0605l("SET", 0);
        f6475h = enumC0605l;
        EnumC0605l enumC0605l2 = new EnumC0605l("CONFIRM_NEW", 1);
        f6476i = enumC0605l2;
        EnumC0605l enumC0605l3 = new EnumC0605l("CHANGE_CURRENT", 2);
        j = enumC0605l3;
        EnumC0605l enumC0605l4 = new EnumC0605l("CHANGE_NEW", 3);
        f6477k = enumC0605l4;
        EnumC0605l enumC0605l5 = new EnumC0605l("REMOVE", 4);
        f6478l = enumC0605l5;
        EnumC0605l[] enumC0605lArr = {enumC0605l, enumC0605l2, enumC0605l3, enumC0605l4, enumC0605l5};
        f6479m = enumC0605lArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0605lArr);
    }

    public static EnumC0605l valueOf(String str) {
        return (EnumC0605l) Enum.valueOf(EnumC0605l.class, str);
    }

    public static EnumC0605l[] values() {
        return (EnumC0605l[]) f6479m.clone();
    }
}
