package p035d7;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class g {

    public static final g f21262h;

    public static final g f21263i;
    public static final g j;

    public static final g[] f21264k;

    static {
        g gVar = new g("FORCE_FLEXIBILITY", 0);
        f21262h = gVar;
        g gVar2 = new g("NULLABLE", 1);
        f21263i = gVar2;
        g gVar3 = new g("NOT_NULL", 2);
        j = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        f21264k = gVarArr;
        q0.t(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f21264k.clone();
    }
}
