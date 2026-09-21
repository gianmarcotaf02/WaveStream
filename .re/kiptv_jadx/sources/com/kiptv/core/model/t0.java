package com.kiptv.core.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@p119n8.i
public final class t0 {
    public static final com.kiptv.core.model.TraktMediaRef$Kind$Companion Companion;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f20841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.kiptv.core.model.t0 f20842i;
    public static final com.kiptv.core.model.t0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.kiptv.core.model.t0 f20843k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ com.kiptv.core.model.t0[] f20844l;

    static {
        com.kiptv.core.model.t0 t0Var = new com.kiptv.core.model.t0("MOVIE", 0);
        f20842i = t0Var;
        com.kiptv.core.model.t0 t0Var2 = new com.kiptv.core.model.t0("EPISODE", 1);
        j = t0Var2;
        com.kiptv.core.model.t0 t0Var3 = new com.kiptv.core.model.t0("SHOW", 2);
        f20843k = t0Var3;
        com.kiptv.core.model.t0[] t0VarArr = {t0Var, t0Var2, t0Var3};
        f20844l = t0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(t0VarArr);
        Companion = new com.kiptv.core.model.TraktMediaRef$Kind$Companion();
        f20841h = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new p026c6.a(4));
    }

    public static com.kiptv.core.model.t0 valueOf(java.lang.String str) {
        return (com.kiptv.core.model.t0) java.lang.Enum.valueOf(com.kiptv.core.model.t0.class, str);
    }

    public static com.kiptv.core.model.t0[] values() {
        return (com.kiptv.core.model.t0[]) f20844l.clone();
    }
}
