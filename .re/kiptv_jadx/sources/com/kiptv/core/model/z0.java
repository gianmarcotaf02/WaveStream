package com.kiptv.core.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@p119n8.i
public final class z0 {
    public static final com.kiptv.core.model.WatchContentType$Companion Companion;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f20884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.kiptv.core.model.z0 f20885i;
    public static final com.kiptv.core.model.z0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.kiptv.core.model.z0 f20886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ com.kiptv.core.model.z0[] f20887l;

    static {
        com.kiptv.core.model.z0 z0Var = new com.kiptv.core.model.z0("MOVIE", 0);
        f20885i = z0Var;
        com.kiptv.core.model.z0 z0Var2 = new com.kiptv.core.model.z0("SERIES", 1);
        j = z0Var2;
        com.kiptv.core.model.z0 z0Var3 = new com.kiptv.core.model.z0("LIVE", 2);
        f20886k = z0Var3;
        com.kiptv.core.model.z0[] z0VarArr = {z0Var, z0Var2, z0Var3};
        f20887l = z0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(z0VarArr);
        Companion = new com.kiptv.core.model.WatchContentType$Companion();
        f20884h = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new p026c6.a(6));
    }

    public static com.kiptv.core.model.z0 valueOf(java.lang.String str) {
        return (com.kiptv.core.model.z0) java.lang.Enum.valueOf(com.kiptv.core.model.z0.class, str);
    }

    public static com.kiptv.core.model.z0[] values() {
        return (com.kiptv.core.model.z0[]) f20887l.clone();
    }
}
