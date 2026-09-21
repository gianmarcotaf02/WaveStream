package H5;

public final class EnumC0399q {

    public static final EnumC0399q f4288h;

    public static final EnumC0399q f4289i;
    public static final EnumC0399q[] j;

    public static final p126o6.b f4290k;

    static {
        EnumC0399q enumC0399q = new EnumC0399q("MOVIES", 0);
        f4288h = enumC0399q;
        EnumC0399q enumC0399q2 = new EnumC0399q("SERIES", 1);
        f4289i = enumC0399q2;
        EnumC0399q[] enumC0399qArr = {enumC0399q, enumC0399q2};
        j = enumC0399qArr;
        f4290k = com.google.crypto.tink.shaded.protobuf.q0.t(enumC0399qArr);
    }

    public static EnumC0399q valueOf(String str) {
        return (EnumC0399q) Enum.valueOf(EnumC0399q.class, str);
    }

    public static EnumC0399q[] values() {
        return (EnumC0399q[]) j.clone();
    }
}
