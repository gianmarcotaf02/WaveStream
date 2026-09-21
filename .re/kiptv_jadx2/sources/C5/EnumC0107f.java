package C5;

public final class EnumC0107f {

    public static final EnumC0107f f1319h;

    public static final EnumC0107f f1320i;
    public static final EnumC0107f j;

    public static final EnumC0107f[] f1321k;

    static {
        EnumC0107f enumC0107f = new EnumC0107f("PIP", 0);
        f1319h = enumC0107f;
        EnumC0107f enumC0107f2 = new EnumC0107f("MULTIVIEW_ARMED", 1);
        f1320i = enumC0107f2;
        EnumC0107f enumC0107f3 = new EnumC0107f("MULTIVIEW", 2);
        j = enumC0107f3;
        EnumC0107f[] enumC0107fArr = {enumC0107f, enumC0107f2, enumC0107f3};
        f1321k = enumC0107fArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0107fArr);
    }

    public static EnumC0107f valueOf(String str) {
        return (EnumC0107f) Enum.valueOf(EnumC0107f.class, str);
    }

    public static EnumC0107f[] values() {
        return (EnumC0107f[]) f1321k.clone();
    }
}
