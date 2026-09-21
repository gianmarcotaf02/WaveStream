package K0;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class EnumC0668p {

    public static final EnumC0668p f6730h;

    public static final EnumC0668p f6731i;
    public static final EnumC0668p j;

    public static final EnumC0668p[] f6732k;

    static {
        EnumC0668p enumC0668p = new EnumC0668p("Initial", 0);
        f6730h = enumC0668p;
        EnumC0668p enumC0668p2 = new EnumC0668p("Main", 1);
        f6731i = enumC0668p2;
        EnumC0668p enumC0668p3 = new EnumC0668p("Final", 2);
        j = enumC0668p3;
        EnumC0668p[] enumC0668pArr = {enumC0668p, enumC0668p2, enumC0668p3};
        f6732k = enumC0668pArr;
        q0.t(enumC0668pArr);
    }

    public static EnumC0668p valueOf(String str) {
        return (EnumC0668p) Enum.valueOf(EnumC0668p.class, str);
    }

    public static EnumC0668p[] values() {
        return (EnumC0668p[]) f6732k.clone();
    }
}
