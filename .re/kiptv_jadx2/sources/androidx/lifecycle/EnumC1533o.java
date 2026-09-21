package androidx.lifecycle;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class EnumC1533o {

    public static final EnumC1533o f16364h;

    public static final EnumC1533o f16365i;
    public static final EnumC1533o j;

    public static final EnumC1533o f16366k;

    public static final EnumC1533o f16367l;

    public static final EnumC1533o[] f16368m;

    static {
        EnumC1533o enumC1533o = new EnumC1533o("DESTROYED", 0);
        f16364h = enumC1533o;
        EnumC1533o enumC1533o2 = new EnumC1533o("INITIALIZED", 1);
        f16365i = enumC1533o2;
        EnumC1533o enumC1533o3 = new EnumC1533o("CREATED", 2);
        j = enumC1533o3;
        EnumC1533o enumC1533o4 = new EnumC1533o("STARTED", 3);
        f16366k = enumC1533o4;
        EnumC1533o enumC1533o5 = new EnumC1533o("RESUMED", 4);
        f16367l = enumC1533o5;
        EnumC1533o[] enumC1533oArr = {enumC1533o, enumC1533o2, enumC1533o3, enumC1533o4, enumC1533o5};
        f16368m = enumC1533oArr;
        q0.t(enumC1533oArr);
    }

    public static EnumC1533o valueOf(String str) {
        return (EnumC1533o) Enum.valueOf(EnumC1533o.class, str);
    }

    public static EnumC1533o[] values() {
        return (EnumC1533o[]) f16368m.clone();
    }
}
