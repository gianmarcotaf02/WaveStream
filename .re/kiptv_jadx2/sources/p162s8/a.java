package p162s8;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class a {

    public static final a f27383h;

    public static final a f27384i;
    public static final a[] j;

    static {
        a aVar = new a("NONE", 0);
        f27383h = aVar;
        a aVar2 = new a("ALL_JSON_OBJECTS", 1);
        a aVar3 = new a("POLYMORPHIC", 2);
        f27384i = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        j = aVarArr;
        q0.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) j.clone();
    }
}
