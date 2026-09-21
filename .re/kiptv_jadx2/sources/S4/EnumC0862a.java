package S4;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class EnumC0862a {

    public static final EnumC0862a f9358h;

    public static final EnumC0862a f9359i;
    public static final EnumC0862a j;

    public static final EnumC0862a f9360k;

    public static final EnumC0862a[] f9361l;

    static {
        EnumC0862a enumC0862a = new EnumC0862a("DEFAULT", 0);
        f9358h = enumC0862a;
        EnumC0862a enumC0862a2 = new EnumC0862a("CUSTOM", 1);
        f9359i = enumC0862a2;
        EnumC0862a enumC0862a3 = new EnumC0862a("ALPHABETICAL_ASC", 2);
        j = enumC0862a3;
        EnumC0862a enumC0862a4 = new EnumC0862a("ALPHABETICAL_DESC", 3);
        f9360k = enumC0862a4;
        EnumC0862a[] enumC0862aArr = {enumC0862a, enumC0862a2, enumC0862a3, enumC0862a4};
        f9361l = enumC0862aArr;
        q0.t(enumC0862aArr);
    }

    public static EnumC0862a valueOf(String str) {
        return (EnumC0862a) Enum.valueOf(EnumC0862a.class, str);
    }

    public static EnumC0862a[] values() {
        return (EnumC0862a[]) f9361l.clone();
    }
}
