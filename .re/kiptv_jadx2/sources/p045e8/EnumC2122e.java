package p045e8;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class EnumC2122e {

    public static final EnumC2122e f21535h;

    public static final EnumC2122e[] f21536i;

    EnumC2122e EF0;

    static {
        EnumC2122e enumC2122e = new EnumC2122e("AM", 0);
        EnumC2122e enumC2122e2 = new EnumC2122e("PM", 1);
        f21535h = enumC2122e2;
        EnumC2122e[] enumC2122eArr = {enumC2122e, enumC2122e2};
        f21536i = enumC2122eArr;
        q0.t(enumC2122eArr);
    }

    public static EnumC2122e valueOf(String str) {
        return (EnumC2122e) Enum.valueOf(EnumC2122e.class, str);
    }

    public static EnumC2122e[] values() {
        return (EnumC2122e[]) f21536i.clone();
    }
}
