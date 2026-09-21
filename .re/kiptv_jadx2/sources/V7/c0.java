package V7;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class c0 {

    public static final c0 f10447h;

    public static final c0 f10448i;
    public static final c0 j;

    public static final c0[] f10449k;

    static {
        c0 c0Var = new c0("START", 0);
        f10447h = c0Var;
        c0 c0Var2 = new c0("STOP", 1);
        f10448i = c0Var2;
        c0 c0Var3 = new c0("STOP_AND_RESET_REPLAY_CACHE", 2);
        j = c0Var3;
        c0[] c0VarArr = {c0Var, c0Var2, c0Var3};
        f10449k = c0VarArr;
        q0.t(c0VarArr);
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f10449k.clone();
    }
}
