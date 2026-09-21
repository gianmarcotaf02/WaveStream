package p118n7;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class o {

    public static final o f25930h;

    public static final o f25931i;
    public static final o j;

    public static final o[] f25932k;

    static {
        o oVar = new o("ALL", 0);
        f25930h = oVar;
        o oVar2 = new o("ONLY_NON_SYNTHESIZED", 1);
        f25931i = oVar2;
        o oVar3 = new o("NONE", 2);
        j = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        f25932k = oVarArr;
        q0.t(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f25932k.clone();
    }
}
