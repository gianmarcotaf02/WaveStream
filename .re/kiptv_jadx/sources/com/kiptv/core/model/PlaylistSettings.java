package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/PlaylistSettings;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class PlaylistSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.PlaylistSettings.Companion INSTANCE = new com.kiptv.core.model.PlaylistSettings.Companion();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20054r = {null, null, null, null, null, null, null, new p153r8.C2691d(p153r8.p0.f26988a, 0), null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20060f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f20061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.kiptv.core.model.C1944g0 f20062i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f20063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f20064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f20065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f20066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f20067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.lang.String f20068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.lang.String f20069q;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/PlaylistSettings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/PlaylistSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.PlaylistSettings$$serializer.INSTANCE;
        }
    }

    public PlaylistSettings(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6, boolean z9, java.lang.String str4, java.lang.String str5, java.util.List list, com.kiptv.core.model.C1944g0 c1944g0, boolean z10, int i9, int i10, java.lang.String str6, java.lang.String str7, boolean z11, java.lang.String str8, java.lang.String str9) {
        if ((i3 & 1) == 0) {
            this.f20055a = "";
        } else {
            this.f20055a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20056b = "";
        } else {
            this.f20056b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20057c = "";
        } else {
            this.f20057c = str3;
        }
        if ((i3 & 8) == 0) {
            this.f20058d = true;
        } else {
            this.f20058d = z6;
        }
        if ((i3 & 16) == 0) {
            this.f20059e = true;
        } else {
            this.f20059e = z9;
        }
        if ((i3 & 32) == 0) {
            this.f20060f = "default";
        } else {
            this.f20060f = str4;
        }
        if ((i3 & 64) == 0) {
            this.g = "default";
        } else {
            this.g = str5;
        }
        if ((i3 & 128) == 0) {
            this.f20061h = p078i6.w.f23205h;
        } else {
            this.f20061h = list;
        }
        if ((i3 & 256) == 0) {
            com.kiptv.core.model.C1944g0.Companion.getClass();
            this.f20062i = com.kiptv.core.model.C1944g0.f20753p;
        } else {
            this.f20062i = c1944g0;
        }
        if ((i3 & 512) == 0) {
            this.j = false;
        } else {
            this.j = z10;
        }
        if ((i3 & 1024) == 0) {
            this.f20063k = 480;
        } else {
            this.f20063k = i9;
        }
        if ((i3 & 2048) == 0) {
            this.f20064l = 1;
        } else {
            this.f20064l = i10;
        }
        if ((i3 & 4096) == 0) {
            this.f20065m = null;
        } else {
            this.f20065m = str6;
        }
        this.f20066n = (i3 & 8192) == 0 ? androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO : str7;
        if ((i3 & 16384) == 0) {
            this.f20067o = false;
        } else {
            this.f20067o = z11;
        }
        if ((32768 & i3) == 0) {
            this.f20068p = null;
        } else {
            this.f20068p = str8;
        }
        if ((i3 & 65536) == 0) {
            this.f20069q = null;
        } else {
            this.f20069q = str9;
        }
    }

    public static com.kiptv.core.model.PlaylistSettings a(com.kiptv.core.model.PlaylistSettings playlistSettings, boolean z6, boolean z9, com.kiptv.core.model.C1944g0 c1944g0, boolean z10, int i3, int i9, java.lang.String str, java.lang.String str2, boolean z11, int i10) {
        java.lang.String id = playlistSettings.f20055a;
        java.lang.String playlistId = playlistSettings.f20056b;
        java.lang.String userId = playlistSettings.f20057c;
        boolean z12 = (i10 & 8) != 0 ? playlistSettings.f20058d : z6;
        boolean z13 = (i10 & 16) != 0 ? playlistSettings.f20059e : z9;
        java.lang.String categorySortOrder = playlistSettings.f20060f;
        java.lang.String contentSortOrder = playlistSettings.g;
        java.util.List hiddenCategories = playlistSettings.f20061h;
        com.kiptv.core.model.C1944g0 extra = (i10 & 256) != 0 ? playlistSettings.f20062i : c1944g0;
        boolean z14 = (i10 & 512) != 0 ? playlistSettings.j : z10;
        int i11 = (i10 & 1024) != 0 ? playlistSettings.f20063k : i3;
        int i12 = (i10 & 2048) != 0 ? playlistSettings.f20064l : i9;
        java.lang.String str3 = (i10 & 4096) != 0 ? playlistSettings.f20065m : str;
        java.lang.String metadataLanguage = (i10 & 8192) != 0 ? playlistSettings.f20066n : str2;
        boolean z15 = (i10 & 16384) != 0 ? playlistSettings.f20067o : z11;
        java.lang.String str4 = playlistSettings.f20068p;
        java.lang.String str5 = playlistSettings.f20069q;
        playlistSettings.getClass();
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(playlistId, "playlistId");
        kotlin.jvm.internal.m.e(userId, "userId");
        kotlin.jvm.internal.m.e(categorySortOrder, "categorySortOrder");
        kotlin.jvm.internal.m.e(contentSortOrder, "contentSortOrder");
        kotlin.jvm.internal.m.e(hiddenCategories, "hiddenCategories");
        kotlin.jvm.internal.m.e(extra, "extra");
        kotlin.jvm.internal.m.e(metadataLanguage, "metadataLanguage");
        return new com.kiptv.core.model.PlaylistSettings(id, playlistId, userId, z12, z13, categorySortOrder, contentSortOrder, hiddenCategories, extra, z14, i11, i12, str3, metadataLanguage, z15, str4, str5);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.PlaylistSettings)) {
            return false;
        }
        com.kiptv.core.model.PlaylistSettings playlistSettings = (com.kiptv.core.model.PlaylistSettings) obj;
        return kotlin.jvm.internal.m.a(this.f20055a, playlistSettings.f20055a) && kotlin.jvm.internal.m.a(this.f20056b, playlistSettings.f20056b) && kotlin.jvm.internal.m.a(this.f20057c, playlistSettings.f20057c) && this.f20058d == playlistSettings.f20058d && this.f20059e == playlistSettings.f20059e && kotlin.jvm.internal.m.a(this.f20060f, playlistSettings.f20060f) && kotlin.jvm.internal.m.a(this.g, playlistSettings.g) && kotlin.jvm.internal.m.a(this.f20061h, playlistSettings.f20061h) && kotlin.jvm.internal.m.a(this.f20062i, playlistSettings.f20062i) && this.j == playlistSettings.j && this.f20063k == playlistSettings.f20063k && this.f20064l == playlistSettings.f20064l && kotlin.jvm.internal.m.a(this.f20065m, playlistSettings.f20065m) && kotlin.jvm.internal.m.a(this.f20066n, playlistSettings.f20066n) && this.f20067o == playlistSettings.f20067o && kotlin.jvm.internal.m.a(this.f20068p, playlistSettings.f20068p) && kotlin.jvm.internal.m.a(this.f20069q, playlistSettings.f20069q);
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f20064l, p121o0.p.d(this.f20063k, p121o0.p.f((this.f20062i.hashCode() + B2.a.b(B2.a.a(B2.a.a(p121o0.p.f(p121o0.p.f(B2.a.a(B2.a.a(this.f20055a.hashCode() * 31, 31, this.f20056b), 31, this.f20057c), 31, this.f20058d), 31, this.f20059e), 31, this.f20060f), 31, this.g), 31, this.f20061h)) * 31, 31, this.j), 31), 31);
        java.lang.String str = this.f20065m;
        int iF = p121o0.p.f(B2.a.a((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20066n), 31, this.f20067o);
        java.lang.String str2 = this.f20068p;
        int iHashCode = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20069q;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlaylistSettings(id=");
        sb.append(this.f20055a);
        sb.append(", playlistId=");
        sb.append(this.f20056b);
        sb.append(", userId=");
        sb.append(this.f20057c);
        sb.append(", tmdbEnabled=");
        sb.append(this.f20058d);
        sb.append(", titleCleaningEnabled=");
        sb.append(this.f20059e);
        sb.append(", categorySortOrder=");
        sb.append(this.f20060f);
        sb.append(", contentSortOrder=");
        sb.append(this.g);
        sb.append(", hiddenCategories=");
        sb.append(this.f20061h);
        sb.append(", extra=");
        sb.append(this.f20062i);
        sb.append(", groupSimilarChannels=");
        sb.append(this.j);
        sb.append(", epgRefreshMinutes=");
        sb.append(this.f20063k);
        sb.append(", contentRefreshDays=");
        sb.append(this.f20064l);
        sb.append(", customUserAgent=");
        sb.append(this.f20065m);
        sb.append(", metadataLanguage=");
        sb.append(this.f20066n);
        sb.append(", includeAdultContent=");
        sb.append(this.f20067o);
        sb.append(", createdAt=");
        sb.append(this.f20068p);
        sb.append(", updatedAt=");
        return Y6.f.m(sb, this.f20069q, ")");
    }

    public PlaylistSettings(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6, boolean z9, java.lang.String str4, java.lang.String str5, java.util.List hiddenCategories, com.kiptv.core.model.C1944g0 extra, boolean z10, int i3, int i9, java.lang.String str6, java.lang.String str7, boolean z11, java.lang.String str8, java.lang.String str9) {
        kotlin.jvm.internal.m.e(hiddenCategories, "hiddenCategories");
        kotlin.jvm.internal.m.e(extra, "extra");
        this.f20055a = str;
        this.f20056b = str2;
        this.f20057c = str3;
        this.f20058d = z6;
        this.f20059e = z9;
        this.f20060f = str4;
        this.g = str5;
        this.f20061h = hiddenCategories;
        this.f20062i = extra;
        this.j = z10;
        this.f20063k = i3;
        this.f20064l = i9;
        this.f20065m = str6;
        this.f20066n = str7;
        this.f20067o = z11;
        this.f20068p = str8;
        this.f20069q = str9;
    }
}
