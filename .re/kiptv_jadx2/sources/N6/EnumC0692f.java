package N6;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class EnumC0692f {

    public static final EnumC0692f f7389h;

    public static final EnumC0692f f7390i;
    public static final EnumC0692f j;

    public static final EnumC0692f f7391k;

    public static final EnumC0692f f7392l;

    public static final EnumC0692f f7393m;

    public static final EnumC0692f[] f7394n;

    static {
        EnumC0692f enumC0692f = new EnumC0692f("CLASS", 0);
        f7389h = enumC0692f;
        EnumC0692f enumC0692f2 = new EnumC0692f("INTERFACE", 1);
        f7390i = enumC0692f2;
        EnumC0692f enumC0692f3 = new EnumC0692f("ENUM_CLASS", 2);
        j = enumC0692f3;
        EnumC0692f enumC0692f4 = new EnumC0692f("ENUM_ENTRY", 3);
        f7391k = enumC0692f4;
        EnumC0692f enumC0692f5 = new EnumC0692f("ANNOTATION_CLASS", 4);
        f7392l = enumC0692f5;
        EnumC0692f enumC0692f6 = new EnumC0692f("OBJECT", 5);
        f7393m = enumC0692f6;
        EnumC0692f[] enumC0692fArr = {enumC0692f, enumC0692f2, enumC0692f3, enumC0692f4, enumC0692f5, enumC0692f6};
        f7394n = enumC0692fArr;
        q0.t(enumC0692fArr);
    }

    public static EnumC0692f valueOf(String str) {
        return (EnumC0692f) Enum.valueOf(EnumC0692f.class, str);
    }

    public static EnumC0692f[] values() {
        return (EnumC0692f[]) f7394n.clone();
    }

    public final boolean a() {
        return this == f7393m || this == f7391k;
    }
}
