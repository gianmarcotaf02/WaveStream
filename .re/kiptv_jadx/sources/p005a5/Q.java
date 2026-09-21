package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBSearchResult f13796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamVODStream f13798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamSeries f13799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f13800e;

    public Q(com.kiptv.core.model.TMDBSearchResult tMDBSearchResult, boolean z6, com.kiptv.core.model.XtreamVODStream xtreamVODStream, com.kiptv.core.model.XtreamSeries xtreamSeries, int i3) {
        xtreamVODStream = (i3 & 4) != 0 ? null : xtreamVODStream;
        xtreamSeries = (i3 & 8) != 0 ? null : xtreamSeries;
        this.f13796a = tMDBSearchResult;
        this.f13797b = z6;
        this.f13798c = xtreamVODStream;
        this.f13799d = xtreamSeries;
        java.lang.StringBuilder sbV = p121o0.p.v(z6 ? "movie-" : "tv-");
        sbV.append(tMDBSearchResult.f20292a);
        this.f13800e = sbV.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.Q)) {
            return false;
        }
        p005a5.Q q9 = (p005a5.Q) obj;
        return this.f13796a.equals(q9.f13796a) && this.f13797b == q9.f13797b && kotlin.jvm.internal.m.a(this.f13798c, q9.f13798c) && kotlin.jvm.internal.m.a(this.f13799d, q9.f13799d);
    }

    public final int hashCode() {
        int iF = p121o0.p.f(this.f13796a.hashCode() * 31, 31, this.f13797b);
        com.kiptv.core.model.XtreamVODStream xtreamVODStream = this.f13798c;
        int iHashCode = (iF + (xtreamVODStream == null ? 0 : xtreamVODStream.hashCode())) * 31;
        com.kiptv.core.model.XtreamSeries xtreamSeries = this.f13799d;
        return iHashCode + (xtreamSeries != null ? xtreamSeries.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "FeedItem(result=" + this.f13796a + ", isMovie=" + this.f13797b + ", matchedMovie=" + this.f13798c + ", matchedSeries=" + this.f13799d + ")";
    }
}
