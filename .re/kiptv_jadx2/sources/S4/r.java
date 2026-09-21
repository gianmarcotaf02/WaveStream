package S4;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class r {

    public static final r f9437h;

    public static final r f9438i;
    public static final r[] j;

    static {
        r rVar = new r("TMDB", 0);
        f9437h = rVar;
        r rVar2 = new r("XTREAM", 1);
        f9438i = rVar2;
        r[] rVarArr = {rVar, rVar2};
        j = rVarArr;
        q0.t(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) j.clone();
    }
}
