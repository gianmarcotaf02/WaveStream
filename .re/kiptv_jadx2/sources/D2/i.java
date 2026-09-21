package D2;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class i {

    public static final i f2087h;

    public static final i f2088i;
    public static final i j;

    public static final i f2089k;

    public static final i f2090l;

    public static final i f2091m;

    public static final i[] f2092n;

    static {
        i iVar = new i("Verbose", 0);
        f2087h = iVar;
        i iVar2 = new i("Debug", 1);
        f2088i = iVar2;
        i iVar3 = new i("Info", 2);
        j = iVar3;
        i iVar4 = new i("Warn", 3);
        f2089k = iVar4;
        i iVar5 = new i("Error", 4);
        f2090l = iVar5;
        i iVar6 = new i("Assert", 5);
        f2091m = iVar6;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6};
        f2092n = iVarArr;
        q0.t(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f2092n.clone();
    }
}
