package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/model/PlaylistSettingsExtraSerializer$Surrogate", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class PlaylistSettingsExtraSerializer$Surrogate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.PlaylistSettingsExtraSerializer$Surrogate.Companion INSTANCE = new com.kiptv.core.model.PlaylistSettingsExtraSerializer$Surrogate.Companion();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20070o = {null, null, null, null, new p153r8.C2691d(p153r8.p0.f26988a, 0), null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.ContentTypeSettings f20072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.kiptv.core.model.ContentTypeSettings f20073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.kiptv.core.model.ContentTypeSettings f20074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f20075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20076f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f20077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Boolean f20078i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.kiptv.core.model.IntroSkipPrefs f20079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f20080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f20081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kotlinx.serialization.json.b f20082n;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/PlaylistSettingsExtraSerializer$Surrogate$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/PlaylistSettingsExtraSerializer$Surrogate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.PlaylistSettingsExtraSerializer$Surrogate$$serializer.INSTANCE;
        }
    }

    public PlaylistSettingsExtraSerializer$Surrogate(int i3, int i9, com.kiptv.core.model.ContentTypeSettings contentTypeSettings, com.kiptv.core.model.ContentTypeSettings contentTypeSettings2, com.kiptv.core.model.ContentTypeSettings contentTypeSettings3, java.util.List list, java.lang.String str, boolean z6, java.lang.Boolean bool, java.lang.Boolean bool2, boolean z9, com.kiptv.core.model.IntroSkipPrefs introSkipPrefs, boolean z10, boolean z11, kotlinx.serialization.json.b bVar) {
        if ((i3 & 1) == 0) {
            this.f20071a = 1;
        } else {
            this.f20071a = i9;
        }
        if ((i3 & 2) == 0) {
            com.kiptv.core.model.ContentTypeSettings.INSTANCE.getClass();
            this.f20072b = com.kiptv.core.model.ContentTypeSettings.f19688p;
        } else {
            this.f20072b = contentTypeSettings;
        }
        if ((i3 & 4) == 0) {
            com.kiptv.core.model.ContentTypeSettings.INSTANCE.getClass();
            this.f20073c = com.kiptv.core.model.ContentTypeSettings.f19688p;
        } else {
            this.f20073c = contentTypeSettings2;
        }
        if ((i3 & 8) == 0) {
            com.kiptv.core.model.ContentTypeSettings.INSTANCE.getClass();
            this.f20074d = com.kiptv.core.model.ContentTypeSettings.f19688p;
        } else {
            this.f20074d = contentTypeSettings3;
        }
        if ((i3 & 16) == 0) {
            this.f20075e = p078i6.w.f23205h;
        } else {
            this.f20075e = list;
        }
        if ((i3 & 32) == 0) {
            this.f20076f = "movies";
        } else {
            this.f20076f = str;
        }
        if ((i3 & 64) == 0) {
            this.g = true;
        } else {
            this.g = z6;
        }
        if ((i3 & 128) == 0) {
            this.f20077h = null;
        } else {
            this.f20077h = bool;
        }
        if ((i3 & 256) == 0) {
            this.f20078i = null;
        } else {
            this.f20078i = bool2;
        }
        if ((i3 & 512) == 0) {
            this.j = true;
        } else {
            this.j = z9;
        }
        if ((i3 & 1024) == 0) {
            this.f20079k = null;
        } else {
            this.f20079k = introSkipPrefs;
        }
        if ((i3 & 2048) == 0) {
            this.f20080l = true;
        } else {
            this.f20080l = z10;
        }
        if ((i3 & 4096) == 0) {
            this.f20081m = true;
        } else {
            this.f20081m = z11;
        }
        if ((i3 & 8192) == 0) {
            this.f20082n = null;
        } else {
            this.f20082n = bVar;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.PlaylistSettingsExtraSerializer$Surrogate)) {
            return false;
        }
        com.kiptv.core.model.PlaylistSettingsExtraSerializer$Surrogate playlistSettingsExtraSerializer$Surrogate = (com.kiptv.core.model.PlaylistSettingsExtraSerializer$Surrogate) obj;
        return this.f20071a == playlistSettingsExtraSerializer$Surrogate.f20071a && kotlin.jvm.internal.m.a(this.f20072b, playlistSettingsExtraSerializer$Surrogate.f20072b) && kotlin.jvm.internal.m.a(this.f20073c, playlistSettingsExtraSerializer$Surrogate.f20073c) && kotlin.jvm.internal.m.a(this.f20074d, playlistSettingsExtraSerializer$Surrogate.f20074d) && kotlin.jvm.internal.m.a(this.f20075e, playlistSettingsExtraSerializer$Surrogate.f20075e) && kotlin.jvm.internal.m.a(this.f20076f, playlistSettingsExtraSerializer$Surrogate.f20076f) && this.g == playlistSettingsExtraSerializer$Surrogate.g && kotlin.jvm.internal.m.a(this.f20077h, playlistSettingsExtraSerializer$Surrogate.f20077h) && kotlin.jvm.internal.m.a(this.f20078i, playlistSettingsExtraSerializer$Surrogate.f20078i) && this.j == playlistSettingsExtraSerializer$Surrogate.j && kotlin.jvm.internal.m.a(this.f20079k, playlistSettingsExtraSerializer$Surrogate.f20079k) && this.f20080l == playlistSettingsExtraSerializer$Surrogate.f20080l && this.f20081m == playlistSettingsExtraSerializer$Surrogate.f20081m && kotlin.jvm.internal.m.a(this.f20082n, playlistSettingsExtraSerializer$Surrogate.f20082n);
    }

    public final int hashCode() {
        int iF = p121o0.p.f(B2.a.a(B2.a.b((this.f20074d.hashCode() + ((this.f20073c.hashCode() + ((this.f20072b.hashCode() + (java.lang.Integer.hashCode(this.f20071a) * 31)) * 31)) * 31)) * 31, 31, this.f20075e), 31, this.f20076f), 31, this.g);
        java.lang.Boolean bool = this.f20077h;
        int iHashCode = (iF + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Boolean bool2 = this.f20078i;
        int iF2 = p121o0.p.f((iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.j);
        com.kiptv.core.model.IntroSkipPrefs introSkipPrefs = this.f20079k;
        int iF3 = p121o0.p.f(p121o0.p.f((iF2 + (introSkipPrefs == null ? 0 : introSkipPrefs.hashCode())) * 31, 31, this.f20080l), 31, this.f20081m);
        kotlinx.serialization.json.b bVar = this.f20082n;
        return iF3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Surrogate(v=" + this.f20071a + ", movies=" + this.f20072b + ", series=" + this.f20073c + ", live=" + this.f20074d + ", autoHideKeywords=" + this.f20075e + ", defaultStartScreen=" + this.f20076f + ", showTrending=" + this.g + ", showRecentlyAdded=" + this.f20077h + ", recentlyWatchedLive=" + this.f20078i + ", hideEmptyTabs=" + this.j + ", introSkip=" + this.f20079k + ", homeEnabled=" + this.f20080l + ", startOnHome=" + this.f20081m + ", homeLayout=" + this.f20082n + ")";
    }

    public PlaylistSettingsExtraSerializer$Surrogate(int i3, com.kiptv.core.model.ContentTypeSettings movies, com.kiptv.core.model.ContentTypeSettings series, com.kiptv.core.model.ContentTypeSettings live, java.util.List autoHideKeywords, java.lang.String defaultStartScreen, boolean z6, java.lang.Boolean bool, java.lang.Boolean bool2, boolean z9, com.kiptv.core.model.IntroSkipPrefs introSkipPrefs, boolean z10, boolean z11, kotlinx.serialization.json.b bVar) {
        kotlin.jvm.internal.m.e(movies, "movies");
        kotlin.jvm.internal.m.e(series, "series");
        kotlin.jvm.internal.m.e(live, "live");
        kotlin.jvm.internal.m.e(autoHideKeywords, "autoHideKeywords");
        kotlin.jvm.internal.m.e(defaultStartScreen, "defaultStartScreen");
        this.f20071a = i3;
        this.f20072b = movies;
        this.f20073c = series;
        this.f20074d = live;
        this.f20075e = autoHideKeywords;
        this.f20076f = defaultStartScreen;
        this.g = z6;
        this.f20077h = bool;
        this.f20078i = bool2;
        this.j = z9;
        this.f20079k = introSkipPrefs;
        this.f20080l = z10;
        this.f20081m = z11;
        this.f20082n = bVar;
    }
}
