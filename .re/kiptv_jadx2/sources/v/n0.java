package v;

public final class n0 {

    public static final n0 f28974h;

    public static final n0 f28975i;
    public static final n0[] j;

    static {
        n0 n0Var = new n0("Default", 0);
        f28974h = n0Var;
        n0 n0Var2 = new n0("UserInput", 1);
        f28975i = n0Var2;
        n0[] n0VarArr = {n0Var, n0Var2, new n0("PreventUserInput", 2)};
        j = n0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(n0VarArr);
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) j.clone();
    }
}
