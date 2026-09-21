package U7;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class EnumC0955c {

    public static final EnumC0955c f10175h;

    public static final EnumC0955c f10176i;
    public static final EnumC0955c j;

    public static final EnumC0955c[] f10177k;

    static {
        EnumC0955c enumC0955c = new EnumC0955c("SUSPEND", 0);
        f10175h = enumC0955c;
        EnumC0955c enumC0955c2 = new EnumC0955c("DROP_OLDEST", 1);
        f10176i = enumC0955c2;
        EnumC0955c enumC0955c3 = new EnumC0955c("DROP_LATEST", 2);
        j = enumC0955c3;
        EnumC0955c[] enumC0955cArr = {enumC0955c, enumC0955c2, enumC0955c3};
        f10177k = enumC0955cArr;
        q0.t(enumC0955cArr);
    }

    public static EnumC0955c valueOf(String str) {
        return (EnumC0955c) Enum.valueOf(EnumC0955c.class, str);
    }

    public static EnumC0955c[] values() {
        return (EnumC0955c[]) f10177k.clone();
    }
}
