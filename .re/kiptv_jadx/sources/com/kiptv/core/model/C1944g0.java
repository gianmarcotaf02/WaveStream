package com.kiptv.core.model;

/* JADX INFO: renamed from: com.kiptv.core.model.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@p119n8.i(with = com.kiptv.core.model.C1946h0.class)
public final class C1944g0 {
    public static final com.kiptv.core.model.PlaylistSettingsExtra$Companion Companion = new com.kiptv.core.model.PlaylistSettingsExtra$Companion();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.kiptv.core.model.C1944g0 f20753p = new com.kiptv.core.model.C1944g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.ContentTypeSettings f20755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.kiptv.core.model.ContentTypeSettings f20756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.kiptv.core.model.ContentTypeSettings f20757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f20758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20759f;
    public final com.kiptv.core.model.IntroSkipPrefs g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f20760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Boolean f20761i;
    public final java.lang.Boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f20762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f20763l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f20764m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.List f20765n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final kotlinx.serialization.json.c f20766o;

    public C1944g0(int i3, com.kiptv.core.model.ContentTypeSettings movies, com.kiptv.core.model.ContentTypeSettings series, com.kiptv.core.model.ContentTypeSettings live, java.util.List autoHideKeywords, java.lang.String defaultStartScreen, com.kiptv.core.model.IntroSkipPrefs introSkipPrefs, boolean z6, java.lang.Boolean bool, java.lang.Boolean bool2, boolean z9, boolean z10, boolean z11, java.util.List list, kotlinx.serialization.json.c cVar) {
        kotlin.jvm.internal.m.e(movies, "movies");
        kotlin.jvm.internal.m.e(series, "series");
        kotlin.jvm.internal.m.e(live, "live");
        kotlin.jvm.internal.m.e(autoHideKeywords, "autoHideKeywords");
        kotlin.jvm.internal.m.e(defaultStartScreen, "defaultStartScreen");
        this.f20754a = i3;
        this.f20755b = movies;
        this.f20756c = series;
        this.f20757d = live;
        this.f20758e = autoHideKeywords;
        this.f20759f = defaultStartScreen;
        this.g = introSkipPrefs;
        this.f20760h = z6;
        this.f20761i = bool;
        this.j = bool2;
        this.f20762k = z9;
        this.f20763l = z10;
        this.f20764m = z11;
        this.f20765n = list;
        this.f20766o = cVar;
    }

    public static com.kiptv.core.model.C1944g0 a(com.kiptv.core.model.C1944g0 c1944g0, com.kiptv.core.model.ContentTypeSettings contentTypeSettings, com.kiptv.core.model.ContentTypeSettings contentTypeSettings2, com.kiptv.core.model.ContentTypeSettings contentTypeSettings3, java.util.ArrayList arrayList, java.lang.String str, com.kiptv.core.model.IntroSkipPrefs introSkipPrefs, boolean z6, java.lang.Boolean bool, java.lang.Boolean bool2, boolean z9, boolean z10, boolean z11, java.util.ArrayList arrayList2, int i3) {
        int i9 = c1944g0.f20754a;
        com.kiptv.core.model.ContentTypeSettings movies = (i3 & 2) != 0 ? c1944g0.f20755b : contentTypeSettings;
        com.kiptv.core.model.ContentTypeSettings series = (i3 & 4) != 0 ? c1944g0.f20756c : contentTypeSettings2;
        com.kiptv.core.model.ContentTypeSettings live = (i3 & 8) != 0 ? c1944g0.f20757d : contentTypeSettings3;
        java.util.List autoHideKeywords = (i3 & 16) != 0 ? c1944g0.f20758e : arrayList;
        java.lang.String defaultStartScreen = (i3 & 32) != 0 ? c1944g0.f20759f : str;
        com.kiptv.core.model.IntroSkipPrefs introSkipPrefs2 = (i3 & 64) != 0 ? c1944g0.g : introSkipPrefs;
        boolean z12 = (i3 & 128) != 0 ? c1944g0.f20760h : z6;
        java.lang.Boolean bool3 = (i3 & 256) != 0 ? c1944g0.f20761i : bool;
        java.lang.Boolean bool4 = (i3 & 512) != 0 ? c1944g0.j : bool2;
        boolean z13 = (i3 & 1024) != 0 ? c1944g0.f20762k : z9;
        boolean z14 = (i3 & 2048) != 0 ? c1944g0.f20763l : z10;
        boolean z15 = (i3 & 4096) != 0 ? c1944g0.f20764m : z11;
        java.util.List list = (i3 & 8192) != 0 ? c1944g0.f20765n : arrayList2;
        kotlinx.serialization.json.c cVar = c1944g0.f20766o;
        c1944g0.getClass();
        kotlin.jvm.internal.m.e(movies, "movies");
        kotlin.jvm.internal.m.e(series, "series");
        kotlin.jvm.internal.m.e(live, "live");
        kotlin.jvm.internal.m.e(autoHideKeywords, "autoHideKeywords");
        kotlin.jvm.internal.m.e(defaultStartScreen, "defaultStartScreen");
        return new com.kiptv.core.model.C1944g0(i9, movies, series, live, autoHideKeywords, defaultStartScreen, introSkipPrefs2, z12, bool3, bool4, z13, z14, z15, list, cVar);
    }

    public final boolean b(java.lang.String categoryName, java.lang.String categoryId, com.kiptv.core.model.EnumC1937d enumC1937d) {
        kotlin.jvm.internal.m.e(categoryName, "categoryName");
        kotlin.jvm.internal.m.e(categoryId, "categoryId");
        com.kiptv.core.model.ContentTypeSettings contentTypeSettingsD = d(enumC1937d);
        if (contentTypeSettingsD.f19689a.contains(categoryId)) {
            return true;
        }
        java.lang.String lowerCase = categoryName.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        java.util.List list = contentTypeSettingsD.g;
        if (list == null || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String lowerCase2 = ((java.lang.String) it.next()).toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
                if (O7.q.B0(lowerCase, lowerCase2, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c(java.lang.String itemId, com.kiptv.core.model.EnumC1937d enumC1937d) {
        kotlin.jvm.internal.m.e(itemId, "itemId");
        return d(enumC1937d).f19690b.contains(itemId);
    }

    public final com.kiptv.core.model.ContentTypeSettings d(com.kiptv.core.model.EnumC1937d type) {
        kotlin.jvm.internal.m.e(type, "type");
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            return this.f20755b;
        }
        if (iOrdinal == 1) {
            return this.f20756c;
        }
        if (iOrdinal == 2) {
            return this.f20757d;
        }
        throw new I3.b();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.C1944g0)) {
            return false;
        }
        com.kiptv.core.model.C1944g0 c1944g0 = (com.kiptv.core.model.C1944g0) obj;
        return this.f20754a == c1944g0.f20754a && kotlin.jvm.internal.m.a(this.f20755b, c1944g0.f20755b) && kotlin.jvm.internal.m.a(this.f20756c, c1944g0.f20756c) && kotlin.jvm.internal.m.a(this.f20757d, c1944g0.f20757d) && kotlin.jvm.internal.m.a(this.f20758e, c1944g0.f20758e) && kotlin.jvm.internal.m.a(this.f20759f, c1944g0.f20759f) && kotlin.jvm.internal.m.a(this.g, c1944g0.g) && this.f20760h == c1944g0.f20760h && kotlin.jvm.internal.m.a(this.f20761i, c1944g0.f20761i) && kotlin.jvm.internal.m.a(this.j, c1944g0.j) && this.f20762k == c1944g0.f20762k && this.f20763l == c1944g0.f20763l && this.f20764m == c1944g0.f20764m && kotlin.jvm.internal.m.a(this.f20765n, c1944g0.f20765n) && kotlin.jvm.internal.m.a(this.f20766o, c1944g0.f20766o);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.b((this.f20757d.hashCode() + ((this.f20756c.hashCode() + ((this.f20755b.hashCode() + (java.lang.Integer.hashCode(this.f20754a) * 31)) * 31)) * 31)) * 31, 31, this.f20758e), 31, this.f20759f);
        com.kiptv.core.model.IntroSkipPrefs introSkipPrefs = this.g;
        int iF = p121o0.p.f((iA + (introSkipPrefs == null ? 0 : introSkipPrefs.hashCode())) * 31, 31, this.f20760h);
        java.lang.Boolean bool = this.f20761i;
        int iHashCode = (iF + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Boolean bool2 = this.j;
        int iF2 = p121o0.p.f(p121o0.p.f(p121o0.p.f((iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f20762k), 31, this.f20763l), 31, this.f20764m);
        java.util.List list = this.f20765n;
        int iHashCode2 = (iF2 + (list == null ? 0 : list.hashCode())) * 31;
        kotlinx.serialization.json.c cVar = this.f20766o;
        return iHashCode2 + (cVar != null ? cVar.f24558h.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "PlaylistSettingsExtra(v=" + this.f20754a + ", movies=" + this.f20755b + ", series=" + this.f20756c + ", live=" + this.f20757d + ", autoHideKeywords=" + this.f20758e + ", defaultStartScreen=" + this.f20759f + ", introSkip=" + this.g + ", showTrending=" + this.f20760h + ", showRecentlyAdded=" + this.f20761i + ", recentlyWatchedLive=" + this.j + ", hideEmptyTabs=" + this.f20762k + ", homeEnabled=" + this.f20763l + ", startOnHome=" + this.f20764m + ", homeLayout=" + this.f20765n + ", raw=" + this.f20766o + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1944g0() {
        com.kiptv.core.model.ContentTypeSettings.Companion companion = com.kiptv.core.model.ContentTypeSettings.INSTANCE;
        companion.getClass();
        com.kiptv.core.model.ContentTypeSettings contentTypeSettings = com.kiptv.core.model.ContentTypeSettings.f19688p;
        companion.getClass();
        companion.getClass();
        this(1, contentTypeSettings, contentTypeSettings, contentTypeSettings, p078i6.w.f23205h, "movies", null, true, null, null, true, true, true, null, null);
    }
}
