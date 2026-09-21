package x;

public final class EnumC3061p0 {

    public static final EnumC3061p0 f30978h;

    public static final EnumC3061p0 f30979i;
    public static final EnumC3061p0[] j;

    static {
        EnumC3061p0 enumC3061p0 = new EnumC3061p0("Vertical", 0);
        f30978h = enumC3061p0;
        EnumC3061p0 enumC3061p1 = new EnumC3061p0("Horizontal", 1);
        f30979i = enumC3061p1;
        EnumC3061p0[] enumC3061p0Arr = {enumC3061p0, enumC3061p1};
        j = enumC3061p0Arr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC3061p0Arr);
    }

    public static EnumC3061p0 valueOf(String str) {
        return (EnumC3061p0) Enum.valueOf(EnumC3061p0.class, str);
    }

    public static EnumC3061p0[] values() {
        return (EnumC3061p0[]) j.clone();
    }
}
