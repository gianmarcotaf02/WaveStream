package p152r7;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class a {

    public static final a f26886h;

    public static final a[] f26887i;

    a EF0;

    static {
        a aVar = new a("WARNING", 0);
        a aVar2 = new a("ERROR", 1);
        f26886h = aVar2;
        a[] aVarArr = {aVar, aVar2, new a("HIDDEN", 2)};
        f26887i = aVarArr;
        q0.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f26887i.clone();
    }
}
