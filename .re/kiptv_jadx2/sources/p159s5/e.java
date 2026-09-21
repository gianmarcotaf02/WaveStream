package p159s5;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class e {

    public static final e f27274h;

    public static final e f27275i;
    public static final e j;

    public static final e[] f27276k;

    static {
        e eVar = new e("MOVIES", 0);
        f27274h = eVar;
        e eVar2 = new e("SERIES", 1);
        f27275i = eVar2;
        e eVar3 = new e("LIVE", 2);
        j = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        f27276k = eVarArr;
        q0.t(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f27276k.clone();
    }
}
