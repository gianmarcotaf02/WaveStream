package com.kiptv.core.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.kiptv.core.model.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1956p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.kiptv.core.model.EnumC1956p f20810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.kiptv.core.model.EnumC1956p f20811i;
    public static final com.kiptv.core.model.EnumC1956p j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.kiptv.core.model.EnumC1956p f20812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.kiptv.core.model.EnumC1956p f20813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ com.kiptv.core.model.EnumC1956p[] f20814m;

    static {
        com.kiptv.core.model.EnumC1956p enumC1956p = new com.kiptv.core.model.EnumC1956p("IMDB", 0);
        f20810h = enumC1956p;
        com.kiptv.core.model.EnumC1956p enumC1956p2 = new com.kiptv.core.model.EnumC1956p("TMDB", 1);
        f20811i = enumC1956p2;
        com.kiptv.core.model.EnumC1956p enumC1956p3 = new com.kiptv.core.model.EnumC1956p("TOMATOMETER", 2);
        j = enumC1956p3;
        com.kiptv.core.model.EnumC1956p enumC1956p4 = new com.kiptv.core.model.EnumC1956p("POPCORNMETER", 3);
        f20812k = enumC1956p4;
        com.kiptv.core.model.EnumC1956p enumC1956p5 = new com.kiptv.core.model.EnumC1956p("TRAKT", 4);
        f20813l = enumC1956p5;
        com.kiptv.core.model.EnumC1956p[] enumC1956pArr = {enumC1956p, enumC1956p2, enumC1956p3, enumC1956p4, enumC1956p5};
        f20814m = enumC1956pArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC1956pArr);
    }

    public static com.kiptv.core.model.EnumC1956p valueOf(java.lang.String str) {
        return (com.kiptv.core.model.EnumC1956p) java.lang.Enum.valueOf(com.kiptv.core.model.EnumC1956p.class, str);
    }

    public static com.kiptv.core.model.EnumC1956p[] values() {
        return (com.kiptv.core.model.EnumC1956p[]) f20814m.clone();
    }
}
