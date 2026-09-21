package com.kiptv.core.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@p119n8.i
public final class l0 {
    public static final com.kiptv.core.model.SubscriptionTier$Companion Companion;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f20794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.kiptv.core.model.l0 f20795i;
    public static final com.kiptv.core.model.l0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.kiptv.core.model.l0 f20796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ com.kiptv.core.model.l0[] f20797l;

    static {
        com.kiptv.core.model.l0 l0Var = new com.kiptv.core.model.l0("FREE", 0);
        f20795i = l0Var;
        com.kiptv.core.model.l0 l0Var2 = new com.kiptv.core.model.l0("PREMIUM_ONE", 1);
        j = l0Var2;
        com.kiptv.core.model.l0 l0Var3 = new com.kiptv.core.model.l0("PREMIUM_PLUS", 2);
        f20796k = l0Var3;
        com.kiptv.core.model.l0[] l0VarArr = {l0Var, l0Var2, l0Var3};
        f20797l = l0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(l0VarArr);
        Companion = new com.kiptv.core.model.SubscriptionTier$Companion();
        f20794h = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new p026c6.a(3));
    }

    public static com.kiptv.core.model.l0 valueOf(java.lang.String str) {
        return (com.kiptv.core.model.l0) java.lang.Enum.valueOf(com.kiptv.core.model.l0.class, str);
    }

    public static com.kiptv.core.model.l0[] values() {
        return (com.kiptv.core.model.l0[]) f20797l.clone();
    }

    public final int a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 5;
        }
        throw new I3.b();
    }

    public final boolean b() {
        return this != f20795i;
    }
}
