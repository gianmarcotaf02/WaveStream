package O0;

public final class r {

    public static final r f7684h;

    public static final r f7685i;
    public static final r[] j;

    static {
        r rVar = new r("Min", 0);
        f7684h = rVar;
        r rVar2 = new r("Max", 1);
        f7685i = rVar2;
        r[] rVarArr = {rVar, rVar2};
        j = rVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) j.clone();
    }
}
