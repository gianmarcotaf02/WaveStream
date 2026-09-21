package com.kiptv.core.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.kiptv.core.model.o0 f20806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.kiptv.core.model.o0 f20807i;
    public static final com.kiptv.core.model.o0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.kiptv.core.model.o0 f20808k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ com.kiptv.core.model.o0[] f20809l;

    static {
        com.kiptv.core.model.o0 o0Var = new com.kiptv.core.model.o0("EXACT_WITH_YEAR", 0);
        f20806h = o0Var;
        com.kiptv.core.model.o0 o0Var2 = new com.kiptv.core.model.o0("EXACT_WITHOUT_YEAR", 1);
        f20807i = o0Var2;
        com.kiptv.core.model.o0 o0Var3 = new com.kiptv.core.model.o0("VARIANT", 2);
        j = o0Var3;
        com.kiptv.core.model.o0 o0Var4 = new com.kiptv.core.model.o0("FUZZY", 3);
        f20808k = o0Var4;
        com.kiptv.core.model.o0[] o0VarArr = {o0Var, o0Var2, o0Var3, o0Var4, new com.kiptv.core.model.o0("MULTI_LANGUAGE", 4), new com.kiptv.core.model.o0("RELAXED", 5)};
        f20809l = o0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(o0VarArr);
    }

    public static com.kiptv.core.model.o0 valueOf(java.lang.String str) {
        return (com.kiptv.core.model.o0) java.lang.Enum.valueOf(com.kiptv.core.model.o0.class, str);
    }

    public static com.kiptv.core.model.o0[] values() {
        return (com.kiptv.core.model.o0[]) f20809l.clone();
    }
}
