package com.kiptv.core.model;

@p119n8.i
public final class t0 {
    public static final TraktMediaRef$Kind$Companion Companion;

    public static final Object f20841h;

    public static final t0 f20842i;
    public static final t0 j;

    public static final t0 f20843k;

    public static final t0[] f20844l;

    static {
        t0 t0Var = new t0("MOVIE", 0);
        f20842i = t0Var;
        t0 t0Var2 = new t0("EPISODE", 1);
        j = t0Var2;
        t0 t0Var3 = new t0("SHOW", 2);
        f20843k = t0Var3;
        t0[] t0VarArr = {t0Var, t0Var2, t0Var3};
        f20844l = t0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(t0VarArr);
        Companion = new TraktMediaRef$Kind$Companion();
        f20841h = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new p026c6.a(4));
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) f20844l.clone();
    }
}
