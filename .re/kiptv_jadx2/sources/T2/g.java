package T2;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class g {

    public static final g f9736h;

    public static final g f9737i;
    public static final g[] j;

    static {
        g gVar = new g("FILL", 0);
        f9736h = gVar;
        g gVar2 = new g("FIT", 1);
        f9737i = gVar2;
        g[] gVarArr = {gVar, gVar2};
        j = gVarArr;
        q0.t(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) j.clone();
    }
}
