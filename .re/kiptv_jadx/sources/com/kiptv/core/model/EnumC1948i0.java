package com.kiptv.core.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.kiptv.core.model.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@p119n8.i
public final class EnumC1948i0 {
    public static final com.kiptv.core.model.RatingProvenance$Companion Companion;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f20777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.kiptv.core.model.EnumC1948i0 f20778i;
    public static final com.kiptv.core.model.EnumC1948i0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ com.kiptv.core.model.EnumC1948i0[] f20779k;

    static {
        com.kiptv.core.model.EnumC1948i0 enumC1948i0 = new com.kiptv.core.model.EnumC1948i0("OFFICIAL", 0);
        f20778i = enumC1948i0;
        com.kiptv.core.model.EnumC1948i0 enumC1948i1 = new com.kiptv.core.model.EnumC1948i0("CONVERTED", 1);
        j = enumC1948i1;
        com.kiptv.core.model.EnumC1948i0[] enumC1948i0Arr = {enumC1948i0, enumC1948i1};
        f20779k = enumC1948i0Arr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC1948i0Arr);
        Companion = new com.kiptv.core.model.RatingProvenance$Companion();
        f20777h = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new p026c6.a(2));
    }

    public static com.kiptv.core.model.EnumC1948i0 valueOf(java.lang.String str) {
        return (com.kiptv.core.model.EnumC1948i0) java.lang.Enum.valueOf(com.kiptv.core.model.EnumC1948i0.class, str);
    }

    public static com.kiptv.core.model.EnumC1948i0[] values() {
        return (com.kiptv.core.model.EnumC1948i0[]) f20779k.clone();
    }
}
