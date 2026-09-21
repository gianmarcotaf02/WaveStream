package p186w5;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class EnumC2976d {

    public static final EnumC2976d f30206h;

    public static final EnumC2976d f30207i;
    public static final EnumC2976d j;

    public static final EnumC2976d f30208k;

    public static final EnumC2976d f30209l;

    public static final EnumC2976d f30210m;

    public static final EnumC2976d[] f30211n;

    static {
        EnumC2976d enumC2976d = new EnumC2976d("SORT", 0);
        f30206h = enumC2976d;
        EnumC2976d enumC2976d2 = new EnumC2976d("GENRES", 1);
        f30207i = enumC2976d2;
        EnumC2976d enumC2976d3 = new EnumC2976d("EXCLUDED", 2);
        j = enumC2976d3;
        EnumC2976d enumC2976d4 = new EnumC2976d("YEAR", 3);
        f30208k = enumC2976d4;
        EnumC2976d enumC2976d5 = new EnumC2976d("LANGUAGE", 4);
        f30209l = enumC2976d5;
        EnumC2976d enumC2976d6 = new EnumC2976d("MIN_VOTES", 5);
        f30210m = enumC2976d6;
        EnumC2976d[] enumC2976dArr = {enumC2976d, enumC2976d2, enumC2976d3, enumC2976d4, enumC2976d5, enumC2976d6};
        f30211n = enumC2976dArr;
        q0.t(enumC2976dArr);
    }

    public static EnumC2976d valueOf(String str) {
        return (EnumC2976d) Enum.valueOf(EnumC2976d.class, str);
    }

    public static EnumC2976d[] values() {
        return (EnumC2976d[]) f30211n.clone();
    }
}
