package H5;

/* JADX INFO: renamed from: H5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0393k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.Y2 f4237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f4238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Map f4239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Set f4240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.Set f4241f;
    public final java.util.Set g;

    public C0393k(boolean z6, p005a5.Y2 y9, java.lang.String str, java.util.Map progressById, java.util.Set watchedIds, java.util.Set traktWatchedIds, java.util.Set kiptvWatchedIds) {
        kotlin.jvm.internal.m.e(progressById, "progressById");
        kotlin.jvm.internal.m.e(watchedIds, "watchedIds");
        kotlin.jvm.internal.m.e(traktWatchedIds, "traktWatchedIds");
        kotlin.jvm.internal.m.e(kiptvWatchedIds, "kiptvWatchedIds");
        this.f4236a = z6;
        this.f4237b = y9;
        this.f4238c = str;
        this.f4239d = progressById;
        this.f4240e = watchedIds;
        this.f4241f = traktWatchedIds;
        this.g = kiptvWatchedIds;
    }

    public static H5.C0393k a(H5.C0393k c0393k, boolean z6, p005a5.Y2 y9, java.util.LinkedHashMap linkedHashMap, java.util.Set set, java.util.Set set2, java.util.Set set3, int i3) {
        if ((i3 & 1) != 0) {
            z6 = c0393k.f4236a;
        }
        boolean z9 = z6;
        if ((i3 & 2) != 0) {
            y9 = c0393k.f4237b;
        }
        p005a5.Y2 y10 = y9;
        java.lang.String str = c0393k.f4238c;
        java.util.Map map = linkedHashMap;
        if ((i3 & 8) != 0) {
            map = c0393k.f4239d;
        }
        java.util.Map progressById = map;
        if ((i3 & 16) != 0) {
            set = c0393k.f4240e;
        }
        java.util.Set watchedIds = set;
        if ((i3 & 32) != 0) {
            set2 = c0393k.f4241f;
        }
        java.util.Set traktWatchedIds = set2;
        if ((i3 & 64) != 0) {
            set3 = c0393k.g;
        }
        java.util.Set kiptvWatchedIds = set3;
        c0393k.getClass();
        kotlin.jvm.internal.m.e(progressById, "progressById");
        kotlin.jvm.internal.m.e(watchedIds, "watchedIds");
        kotlin.jvm.internal.m.e(traktWatchedIds, "traktWatchedIds");
        kotlin.jvm.internal.m.e(kiptvWatchedIds, "kiptvWatchedIds");
        return new H5.C0393k(z9, y10, str, progressById, watchedIds, traktWatchedIds, kiptvWatchedIds);
    }

    public final boolean b(p005a5.Z2 entry) {
        java.lang.String string;
        com.kiptv.core.model.WatchProgress watchProgress;
        kotlin.jvm.internal.m.e(entry, "entry");
        com.kiptv.core.model.XtreamVODStream xtreamVODStreamA = entry.a();
        return (xtreamVODStreamA == null || (string = java.lang.Integer.valueOf(xtreamVODStreamA.f20725d).toString()) == null || (((watchProgress = (com.kiptv.core.model.WatchProgress) this.f4239d.get(string)) == null || !watchProgress.g()) && !this.f4240e.contains(string))) ? false : true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H5.C0393k)) {
            return false;
        }
        H5.C0393k c0393k = (H5.C0393k) obj;
        return this.f4236a == c0393k.f4236a && kotlin.jvm.internal.m.a(this.f4237b, c0393k.f4237b) && kotlin.jvm.internal.m.a(this.f4238c, c0393k.f4238c) && kotlin.jvm.internal.m.a(this.f4239d, c0393k.f4239d) && kotlin.jvm.internal.m.a(this.f4240e, c0393k.f4240e) && kotlin.jvm.internal.m.a(this.f4241f, c0393k.f4241f) && kotlin.jvm.internal.m.a(this.g, c0393k.g);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.f4236a) * 31;
        p005a5.Y2 y9 = this.f4237b;
        return this.g.hashCode() + p121o0.p.g(this.f4241f, p121o0.p.g(this.f4240e, B2.a.c(B2.a.a((iHashCode + (y9 == null ? 0 : y9.hashCode())) * 31, 31, this.f4238c), 31, this.f4239d), 31), 31);
    }

    public final java.lang.String toString() {
        return "TvCollectionUiState(isLoading=" + this.f4236a + ", saga=" + this.f4237b + ", imageBaseUrl=" + this.f4238c + ", progressById=" + this.f4239d + ", watchedIds=" + this.f4240e + ", traktWatchedIds=" + this.f4241f + ", kiptvWatchedIds=" + this.g + ")";
    }
}
