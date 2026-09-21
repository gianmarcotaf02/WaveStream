package p208z5;

/* JADX INFO: renamed from: z5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3224q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamVODStream f32789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBMovieDetail f32790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f32791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f32792f;
    public final java.util.List g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f32793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.List f32794i;
    public final com.kiptv.core.model.WatchProgress j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f32795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f32796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p208z5.EnumC3182a f32797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.List f32798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final S4.C0871j f32799o;

    public C3224q(boolean z6, int i3, com.kiptv.core.model.XtreamVODStream xtreamVODStream, com.kiptv.core.model.TMDBMovieDetail tMDBMovieDetail, java.util.List cast, java.util.List trailers, java.util.List recommendations, java.util.List externalRatings, java.util.List collectionMovies, com.kiptv.core.model.WatchProgress watchProgress, boolean z9, java.lang.String str, p208z5.EnumC3182a availability, java.util.List otherVersions, S4.C0871j c0871j) {
        kotlin.jvm.internal.m.e(cast, "cast");
        kotlin.jvm.internal.m.e(trailers, "trailers");
        kotlin.jvm.internal.m.e(recommendations, "recommendations");
        kotlin.jvm.internal.m.e(externalRatings, "externalRatings");
        kotlin.jvm.internal.m.e(collectionMovies, "collectionMovies");
        kotlin.jvm.internal.m.e(availability, "availability");
        kotlin.jvm.internal.m.e(otherVersions, "otherVersions");
        this.f32787a = z6;
        this.f32788b = i3;
        this.f32789c = xtreamVODStream;
        this.f32790d = tMDBMovieDetail;
        this.f32791e = cast;
        this.f32792f = trailers;
        this.g = recommendations;
        this.f32793h = externalRatings;
        this.f32794i = collectionMovies;
        this.j = watchProgress;
        this.f32795k = z9;
        this.f32796l = str;
        this.f32797m = availability;
        this.f32798n = otherVersions;
        this.f32799o = c0871j;
    }

    public static p208z5.C3224q a(p208z5.C3224q c3224q, int i3, com.kiptv.core.model.XtreamVODStream xtreamVODStream, com.kiptv.core.model.TMDBMovieDetail tMDBMovieDetail, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, com.kiptv.core.model.WatchProgress watchProgress, boolean z6, p208z5.EnumC3182a enumC3182a, java.util.List list6, S4.C0871j c0871j, int i9) {
        boolean z9 = (i9 & 1) != 0 ? c3224q.f32787a : false;
        int i10 = (i9 & 2) != 0 ? c3224q.f32788b : i3;
        com.kiptv.core.model.XtreamVODStream xtreamVODStream2 = (i9 & 4) != 0 ? c3224q.f32789c : xtreamVODStream;
        com.kiptv.core.model.TMDBMovieDetail tMDBMovieDetail2 = (i9 & 8) != 0 ? c3224q.f32790d : tMDBMovieDetail;
        java.util.List cast = (i9 & 16) != 0 ? c3224q.f32791e : list;
        java.util.List trailers = (i9 & 32) != 0 ? c3224q.f32792f : list2;
        java.util.List recommendations = (i9 & 64) != 0 ? c3224q.g : list3;
        java.util.List externalRatings = (i9 & 128) != 0 ? c3224q.f32793h : list4;
        java.util.List collectionMovies = (i9 & 256) != 0 ? c3224q.f32794i : list5;
        com.kiptv.core.model.WatchProgress watchProgress2 = (i9 & 512) != 0 ? c3224q.j : watchProgress;
        boolean z10 = (i9 & 1024) != 0 ? c3224q.f32795k : z6;
        java.lang.String str = c3224q.f32796l;
        p208z5.EnumC3182a availability = (i9 & 4096) != 0 ? c3224q.f32797m : enumC3182a;
        java.util.List otherVersions = (i9 & 8192) != 0 ? c3224q.f32798n : list6;
        S4.C0871j c0871j2 = (i9 & 16384) != 0 ? c3224q.f32799o : c0871j;
        c3224q.getClass();
        kotlin.jvm.internal.m.e(cast, "cast");
        kotlin.jvm.internal.m.e(trailers, "trailers");
        kotlin.jvm.internal.m.e(recommendations, "recommendations");
        kotlin.jvm.internal.m.e(externalRatings, "externalRatings");
        kotlin.jvm.internal.m.e(collectionMovies, "collectionMovies");
        kotlin.jvm.internal.m.e(availability, "availability");
        kotlin.jvm.internal.m.e(otherVersions, "otherVersions");
        return new p208z5.C3224q(z9, i10, xtreamVODStream2, tMDBMovieDetail2, cast, trailers, recommendations, externalRatings, collectionMovies, watchProgress2, z10, str, availability, otherVersions, c0871j2);
    }

    public final java.lang.String b() {
        com.kiptv.core.model.TMDBMovieDetail tMDBMovieDetail = this.f32790d;
        if (tMDBMovieDetail != null) {
            return tMDBMovieDetail.g;
        }
        return null;
    }

    public final S4.C0871j c() {
        return this.f32799o;
    }

    public final java.lang.String d() {
        java.lang.Integer num;
        int iIntValue;
        com.kiptv.core.model.TMDBMovieDetail tMDBMovieDetail = this.f32790d;
        if (tMDBMovieDetail == null || (num = tMDBMovieDetail.f20202i) == null || (iIntValue = num.intValue()) <= 0) {
            return null;
        }
        int i3 = iIntValue / 60;
        int i9 = iIntValue % 60;
        if (i3 <= 0) {
            return Y6.f.e(i9, androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_MANIFEST);
        }
        return i3 + "h " + i9 + androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_MANIFEST;
    }

    public final java.util.List e() {
        return this.f32793h;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p208z5.C3224q)) {
            return false;
        }
        p208z5.C3224q c3224q = (p208z5.C3224q) obj;
        return this.f32787a == c3224q.f32787a && this.f32788b == c3224q.f32788b && kotlin.jvm.internal.m.a(this.f32789c, c3224q.f32789c) && kotlin.jvm.internal.m.a(this.f32790d, c3224q.f32790d) && kotlin.jvm.internal.m.a(this.f32791e, c3224q.f32791e) && kotlin.jvm.internal.m.a(this.f32792f, c3224q.f32792f) && kotlin.jvm.internal.m.a(this.g, c3224q.g) && kotlin.jvm.internal.m.a(this.f32793h, c3224q.f32793h) && kotlin.jvm.internal.m.a(this.f32794i, c3224q.f32794i) && kotlin.jvm.internal.m.a(this.j, c3224q.j) && this.f32795k == c3224q.f32795k && kotlin.jvm.internal.m.a(this.f32796l, c3224q.f32796l) && this.f32797m == c3224q.f32797m && kotlin.jvm.internal.m.a(this.f32798n, c3224q.f32798n) && kotlin.jvm.internal.m.a(this.f32799o, c3224q.f32799o);
    }

    public final java.lang.String f() {
        java.util.List list;
        com.kiptv.core.model.TMDBMovieDetail tMDBMovieDetail = this.f32790d;
        if (tMDBMovieDetail == null || (list = tMDBMovieDetail.f20204l) == null) {
            return null;
        }
        return p078i6.o.o1(list, " • ", null, null, new p208z5.C3214l(5), 30);
    }

    public final java.lang.String g() {
        com.kiptv.core.model.TMDBMovieDetail tMDBMovieDetail = this.f32790d;
        if (tMDBMovieDetail != null) {
            return tMDBMovieDetail.f20199e;
        }
        return null;
    }

    public final java.lang.String h() {
        com.kiptv.core.model.XtreamVODStream xtreamVODStream = this.f32789c;
        if (xtreamVODStream != null) {
            return xtreamVODStream.a();
        }
        return null;
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f32788b, java.lang.Boolean.hashCode(this.f32787a) * 31, 31);
        com.kiptv.core.model.XtreamVODStream xtreamVODStream = this.f32789c;
        int iHashCode = (iD + (xtreamVODStream == null ? 0 : xtreamVODStream.hashCode())) * 31;
        com.kiptv.core.model.TMDBMovieDetail tMDBMovieDetail = this.f32790d;
        int iB = B2.a.b(B2.a.b(B2.a.b(B2.a.b(B2.a.b((iHashCode + (tMDBMovieDetail == null ? 0 : tMDBMovieDetail.hashCode())) * 31, 31, this.f32791e), 31, this.f32792f), 31, this.g), 31, this.f32793h), 31, this.f32794i);
        com.kiptv.core.model.WatchProgress watchProgress = this.j;
        int iB2 = B2.a.b((this.f32797m.hashCode() + B2.a.a(p121o0.p.f((iB + (watchProgress == null ? 0 : watchProgress.hashCode())) * 31, 31, this.f32795k), 31, this.f32796l)) * 31, 31, this.f32798n);
        S4.C0871j c0871j = this.f32799o;
        return iB2 + (c0871j != null ? c0871j.hashCode() : 0);
    }

    public final java.util.List i() {
        return this.g;
    }

    public final java.lang.String j() {
        java.lang.String str;
        com.kiptv.core.model.TMDBMovieDetail tMDBMovieDetail = this.f32790d;
        if (tMDBMovieDetail != null && (str = tMDBMovieDetail.f20196b) != null) {
            return str;
        }
        S4.K k9 = S4.K.f9329a;
        com.kiptv.core.model.XtreamVODStream xtreamVODStream = this.f32789c;
        java.lang.String str2 = xtreamVODStream != null ? xtreamVODStream.f20723b : null;
        if (str2 == null) {
            str2 = "";
        }
        return S4.K.c(k9, str2, false, 6);
    }

    public final java.lang.String k() {
        java.lang.Integer numC;
        com.kiptv.core.model.TMDBMovieDetail tMDBMovieDetail = this.f32790d;
        if (tMDBMovieDetail == null || (numC = tMDBMovieDetail.c()) == null) {
            return null;
        }
        return numC.toString();
    }

    public final java.lang.String toString() {
        return "TvMovieDetailUiState(isLoading=" + this.f32787a + ", streamId=" + this.f32788b + ", movie=" + this.f32789c + ", tmdbDetail=" + this.f32790d + ", cast=" + this.f32791e + ", trailers=" + this.f32792f + ", recommendations=" + this.g + ", externalRatings=" + this.f32793h + ", collectionMovies=" + this.f32794i + ", watchProgress=" + this.j + ", isInMyList=" + this.f32795k + ", imageBaseUrl=" + this.f32796l + ", availability=" + this.f32797m + ", otherVersions=" + this.f32798n + ", currentVersion=" + this.f32799o + ")";
    }
}
