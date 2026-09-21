package com.kiptv.core.model;

public final class o0 {

    public static final o0 f20806h;

    public static final o0 f20807i;
    public static final o0 j;

    public static final o0 f20808k;

    public static final o0[] f20809l;

    static {
        o0 o0Var = new o0("EXACT_WITH_YEAR", 0);
        f20806h = o0Var;
        o0 o0Var2 = new o0("EXACT_WITHOUT_YEAR", 1);
        f20807i = o0Var2;
        o0 o0Var3 = new o0("VARIANT", 2);
        j = o0Var3;
        o0 o0Var4 = new o0("FUZZY", 3);
        f20808k = o0Var4;
        o0[] o0VarArr = {o0Var, o0Var2, o0Var3, o0Var4, new o0("MULTI_LANGUAGE", 4), new o0("RELAXED", 5)};
        f20809l = o0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(o0VarArr);
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f20809l.clone();
    }
}
