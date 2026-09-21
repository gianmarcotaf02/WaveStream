package com.kiptv.core.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class A0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.kiptv.core.model.A0 f19669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.kiptv.core.model.A0 f19670i;
    public static final /* synthetic */ com.kiptv.core.model.A0[] j;

    static {
        com.kiptv.core.model.A0 a2 = new com.kiptv.core.model.A0("PLAYER", 0);
        f19669h = a2;
        com.kiptv.core.model.A0 a9 = new com.kiptv.core.model.A0("MANUAL", 1);
        f19670i = a9;
        com.kiptv.core.model.A0[] a0Arr = {a2, a9};
        j = a0Arr;
        com.google.crypto.tink.shaded.protobuf.q0.t(a0Arr);
    }

    public static com.kiptv.core.model.A0 valueOf(java.lang.String str) {
        return (com.kiptv.core.model.A0) java.lang.Enum.valueOf(com.kiptv.core.model.A0.class, str);
    }

    public static com.kiptv.core.model.A0[] values() {
        return (com.kiptv.core.model.A0[]) j.clone();
    }
}
