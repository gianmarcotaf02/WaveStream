package com.kiptv.core.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.kiptv.core.model.m0 f20799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.kiptv.core.model.m0 f20800i;
    public static final /* synthetic */ com.kiptv.core.model.m0[] j;

    static {
        com.kiptv.core.model.m0 m0Var = new com.kiptv.core.model.m0("MOVIE", 0);
        f20799h = m0Var;
        com.kiptv.core.model.m0 m0Var2 = new com.kiptv.core.model.m0("TV", 1);
        f20800i = m0Var2;
        com.kiptv.core.model.m0[] m0VarArr = {m0Var, m0Var2};
        j = m0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(m0VarArr);
    }

    public static com.kiptv.core.model.m0 valueOf(java.lang.String str) {
        return (com.kiptv.core.model.m0) java.lang.Enum.valueOf(com.kiptv.core.model.m0.class, str);
    }

    public static com.kiptv.core.model.m0[] values() {
        return (com.kiptv.core.model.m0[]) j.clone();
    }
}
