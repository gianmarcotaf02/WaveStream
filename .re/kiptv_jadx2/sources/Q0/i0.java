package Q0;

public final class i0 {

    public static final i0 f8440h;

    public static final i0 f8441i;
    public static final i0[] j;

    static {
        i0 i0Var = new i0("Width", 0);
        f8440h = i0Var;
        i0 i0Var2 = new i0("Height", 1);
        f8441i = i0Var2;
        i0[] i0VarArr = {i0Var, i0Var2};
        j = i0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(i0VarArr);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) j.clone();
    }
}
