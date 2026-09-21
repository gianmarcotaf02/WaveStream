package com.kiptv.core.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.kiptv.core.model.k0 f20791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.kiptv.core.model.k0 f20792i;
    public static final /* synthetic */ com.kiptv.core.model.k0[] j;

    static {
        com.kiptv.core.model.k0 k0Var = new com.kiptv.core.model.k0("RECAP", 0);
        f20791h = k0Var;
        com.kiptv.core.model.k0 k0Var2 = new com.kiptv.core.model.k0("INTRO", 1);
        f20792i = k0Var2;
        com.kiptv.core.model.k0[] k0VarArr = {k0Var, k0Var2};
        j = k0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(k0VarArr);
    }

    public static com.kiptv.core.model.k0 valueOf(java.lang.String str) {
        return (com.kiptv.core.model.k0) java.lang.Enum.valueOf(com.kiptv.core.model.k0.class, str);
    }

    public static com.kiptv.core.model.k0[] values() {
        return (com.kiptv.core.model.k0[]) j.clone();
    }
}
