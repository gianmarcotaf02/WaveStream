package X4;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class a {

    public static final a f10855h;

    public static final a f10856i;
    public static final a j;

    public static final a f10857k;

    public static final a[] f10858l;

    static {
        a aVar = new a("OFFICIAL", 0);
        f10855h = aVar;
        a aVar2 = new a("OFFICIAL_WHEN_RATED", 1);
        f10856i = aVar2;
        a aVar3 = new a("TEXTUAL", 2);
        j = aVar3;
        a aVar4 = new a("NEUTRAL", 3);
        f10857k = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f10858l = aVarArr;
        q0.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f10858l.clone();
    }
}
