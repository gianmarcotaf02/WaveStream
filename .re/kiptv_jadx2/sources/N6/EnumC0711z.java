package N6;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class EnumC0711z {

    public static final Q f7426h;

    public static final EnumC0711z f7427i;
    public static final EnumC0711z j;

    public static final EnumC0711z f7428k;

    public static final EnumC0711z f7429l;

    public static final EnumC0711z[] f7430m;

    static {
        EnumC0711z enumC0711z = new EnumC0711z("FINAL", 0);
        f7427i = enumC0711z;
        EnumC0711z enumC0711z2 = new EnumC0711z("SEALED", 1);
        j = enumC0711z2;
        EnumC0711z enumC0711z3 = new EnumC0711z("OPEN", 2);
        f7428k = enumC0711z3;
        EnumC0711z enumC0711z4 = new EnumC0711z("ABSTRACT", 3);
        f7429l = enumC0711z4;
        EnumC0711z[] enumC0711zArr = {enumC0711z, enumC0711z2, enumC0711z3, enumC0711z4};
        f7430m = enumC0711zArr;
        q0.t(enumC0711zArr);
        f7426h = new Q(5);
    }

    public static EnumC0711z valueOf(String str) {
        return (EnumC0711z) Enum.valueOf(EnumC0711z.class, str);
    }

    public static EnumC0711z[] values() {
        return (EnumC0711z[]) f7430m.clone();
    }
}
