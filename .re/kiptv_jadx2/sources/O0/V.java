package O0;

public final class V {

    public static final V f7612h;

    public static final V f7613i;
    public static final V[] j;

    static {
        V v6 = new V("Min", 0);
        f7612h = v6;
        V v9 = new V("Max", 1);
        f7613i = v9;
        V[] vArr = {v6, v9};
        j = vArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(vArr);
    }

    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    public static V[] values() {
        return (V[]) j.clone();
    }
}
