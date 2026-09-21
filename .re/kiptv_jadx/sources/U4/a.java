package U4;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f10117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f10118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f10119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f10120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f10121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f10122f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Map f10123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Map f10124i;

    public a(java.util.List vodCategories, java.util.List vodStreams, java.util.List seriesCategories, java.util.List seriesStreams, java.util.List liveCategories, java.util.List liveStreams, long j, java.util.Map map, java.util.Map map2) {
        kotlin.jvm.internal.m.e(vodCategories, "vodCategories");
        kotlin.jvm.internal.m.e(vodStreams, "vodStreams");
        kotlin.jvm.internal.m.e(seriesCategories, "seriesCategories");
        kotlin.jvm.internal.m.e(seriesStreams, "seriesStreams");
        kotlin.jvm.internal.m.e(liveCategories, "liveCategories");
        kotlin.jvm.internal.m.e(liveStreams, "liveStreams");
        this.f10117a = vodCategories;
        this.f10118b = vodStreams;
        this.f10119c = seriesCategories;
        this.f10120d = seriesStreams;
        this.f10121e = liveCategories;
        this.f10122f = liveStreams;
        this.g = j;
        this.f10123h = map;
        this.f10124i = map2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U4.a)) {
            return false;
        }
        U4.a aVar = (U4.a) obj;
        return kotlin.jvm.internal.m.a(this.f10117a, aVar.f10117a) && kotlin.jvm.internal.m.a(this.f10118b, aVar.f10118b) && kotlin.jvm.internal.m.a(this.f10119c, aVar.f10119c) && kotlin.jvm.internal.m.a(this.f10120d, aVar.f10120d) && kotlin.jvm.internal.m.a(this.f10121e, aVar.f10121e) && kotlin.jvm.internal.m.a(this.f10122f, aVar.f10122f) && this.g == aVar.g && kotlin.jvm.internal.m.a(this.f10123h, aVar.f10123h) && kotlin.jvm.internal.m.a(this.f10124i, aVar.f10124i);
    }

    public final int hashCode() {
        int iE = p121o0.p.e(B2.a.b(B2.a.b(B2.a.b(B2.a.b(B2.a.b(this.f10117a.hashCode() * 31, 31, this.f10118b), 31, this.f10119c), 31, this.f10120d), 31, this.f10121e), 31, this.f10122f), 31, this.g);
        java.util.Map map = this.f10123h;
        int iHashCode = (iE + (map == null ? 0 : map.hashCode())) * 31;
        java.util.Map map2 = this.f10124i;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CachedXtreamContent(vodCategories=" + this.f10117a + ", vodStreams=" + this.f10118b + ", seriesCategories=" + this.f10119c + ", seriesStreams=" + this.f10120d + ", liveCategories=" + this.f10121e + ", liveStreams=" + this.f10122f + ", cachedAt=" + this.g + ", streamURLMap=" + this.f10123h + ", catchupSourceMap=" + this.f10124i + ")";
    }
}
