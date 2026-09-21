package com.kiptv.core.model;

@p119n8.i
public final class l0 {
    public static final SubscriptionTier$Companion Companion;

    public static final Object f20794h;

    public static final l0 f20795i;
    public static final l0 j;

    public static final l0 f20796k;

    public static final l0[] f20797l;

    static {
        l0 l0Var = new l0("FREE", 0);
        f20795i = l0Var;
        l0 l0Var2 = new l0("PREMIUM_ONE", 1);
        j = l0Var2;
        l0 l0Var3 = new l0("PREMIUM_PLUS", 2);
        f20796k = l0Var3;
        l0[] l0VarArr = {l0Var, l0Var2, l0Var3};
        f20797l = l0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(l0VarArr);
        Companion = new SubscriptionTier$Companion();
        f20794h = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new p026c6.a(3));
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f20797l.clone();
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
