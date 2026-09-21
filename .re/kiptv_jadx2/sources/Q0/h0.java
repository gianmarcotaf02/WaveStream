package Q0;

public final class h0 {

    public static final h0 f8438h;

    public static final h0 f8439i;
    public static final h0[] j;

    static {
        h0 h0Var = new h0("Min", 0);
        f8438h = h0Var;
        h0 h0Var2 = new h0("Max", 1);
        f8439i = h0Var2;
        h0[] h0VarArr = {h0Var, h0Var2};
        j = h0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(h0VarArr);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) j.clone();
    }
}
