package com.kiptv.core.model;

@p119n8.i
public final class z0 {
    public static final WatchContentType$Companion Companion;

    public static final Object f20884h;

    public static final z0 f20885i;
    public static final z0 j;

    public static final z0 f20886k;

    public static final z0[] f20887l;

    static {
        z0 z0Var = new z0("MOVIE", 0);
        f20885i = z0Var;
        z0 z0Var2 = new z0("SERIES", 1);
        j = z0Var2;
        z0 z0Var3 = new z0("LIVE", 2);
        f20886k = z0Var3;
        z0[] z0VarArr = {z0Var, z0Var2, z0Var3};
        f20887l = z0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(z0VarArr);
        Companion = new WatchContentType$Companion();
        f20884h = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new p026c6.a(6));
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f20887l.clone();
    }
}
