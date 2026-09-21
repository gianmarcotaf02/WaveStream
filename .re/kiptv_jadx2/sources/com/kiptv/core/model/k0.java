package com.kiptv.core.model;

public final class k0 {

    public static final k0 f20791h;

    public static final k0 f20792i;
    public static final k0[] j;

    static {
        k0 k0Var = new k0("RECAP", 0);
        f20791h = k0Var;
        k0 k0Var2 = new k0("INTRO", 1);
        f20792i = k0Var2;
        k0[] k0VarArr = {k0Var, k0Var2};
        j = k0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(k0VarArr);
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) j.clone();
    }
}
