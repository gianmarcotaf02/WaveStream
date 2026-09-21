package p109m6;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class a {

    public static final a f25430h;

    public static final a f25431i;
    public static final a j;

    public static final a[] f25432k;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f25430h = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f25431i = aVar2;
        a aVar3 = new a("RESUMED", 2);
        j = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f25432k = aVarArr;
        q0.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f25432k.clone();
    }
}
