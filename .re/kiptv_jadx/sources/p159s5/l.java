package p159s5;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p159s5.e f27300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f27301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f27302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f27303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p159s5.D f27304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.Set f27305f;
    public final java.util.Set g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Set f27306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Set f27307i;
    public final java.util.Set j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.Set f27308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.Set f27309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.Set f27310m;

    public l(p159s5.e type, java.lang.String categoryId, java.lang.String categoryName, java.util.List items, p159s5.D sort, java.util.Set set, java.util.Set set2, java.util.Set set3, java.util.Set set4, java.util.Set set5, java.util.Set set6, java.util.Set set7, java.util.Set set8) {
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(categoryId, "categoryId");
        kotlin.jvm.internal.m.e(categoryName, "categoryName");
        kotlin.jvm.internal.m.e(items, "items");
        kotlin.jvm.internal.m.e(sort, "sort");
        this.f27300a = type;
        this.f27301b = categoryId;
        this.f27302c = categoryName;
        this.f27303d = items;
        this.f27304e = sort;
        this.f27305f = set;
        this.g = set2;
        this.f27306h = set3;
        this.f27307i = set4;
        this.j = set5;
        this.f27308k = set6;
        this.f27309l = set7;
        this.f27310m = set8;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p159s5.l)) {
            return false;
        }
        p159s5.l lVar = (p159s5.l) obj;
        return this.f27300a == lVar.f27300a && kotlin.jvm.internal.m.a(this.f27301b, lVar.f27301b) && kotlin.jvm.internal.m.a(this.f27302c, lVar.f27302c) && kotlin.jvm.internal.m.a(this.f27303d, lVar.f27303d) && this.f27304e == lVar.f27304e && kotlin.jvm.internal.m.a(this.f27305f, lVar.f27305f) && kotlin.jvm.internal.m.a(this.g, lVar.g) && kotlin.jvm.internal.m.a(this.f27306h, lVar.f27306h) && kotlin.jvm.internal.m.a(this.f27307i, lVar.f27307i) && kotlin.jvm.internal.m.a(this.j, lVar.j) && kotlin.jvm.internal.m.a(this.f27308k, lVar.f27308k) && kotlin.jvm.internal.m.a(this.f27309l, lVar.f27309l) && kotlin.jvm.internal.m.a(this.f27310m, lVar.f27310m);
    }

    public final int hashCode() {
        return this.f27310m.hashCode() + p121o0.p.g(this.f27309l, p121o0.p.g(this.f27308k, p121o0.p.g(this.j, p121o0.p.g(this.f27307i, p121o0.p.g(this.f27306h, p121o0.p.g(this.g, p121o0.p.g(this.f27305f, (this.f27304e.hashCode() + B2.a.b(B2.a.a(B2.a.a(this.f27300a.hashCode() * 31, 31, this.f27301b), 31, this.f27302c), 31, this.f27303d)) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final java.lang.String toString() {
        return "TvExpandedCategoryUiState(type=" + this.f27300a + ", categoryId=" + this.f27301b + ", categoryName=" + this.f27302c + ", items=" + this.f27303d + ", sort=" + this.f27304e + ", lockedItemIds=" + this.f27305f + ", lockedCategoryIds=" + this.g + ", watchedMovieIds=" + this.f27306h + ", traktWatchedMovieIds=" + this.f27307i + ", kiptvWatchedMovieIds=" + this.j + ", watchedSeriesIds=" + this.f27308k + ", traktWatchedSeriesIds=" + this.f27309l + ", kiptvWatchedSeriesIds=" + this.f27310m + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(p159s5.e eVar, java.lang.String str, java.lang.String str2, java.util.List list, p159s5.D d4, int i3) {
        java.util.List list2 = (i3 & 8) != 0 ? p078i6.w.f23205h : list;
        p159s5.D d6 = (i3 & 16) != 0 ? p159s5.D.f27269h : d4;
        p078i6.y yVar = p078i6.y.f23207h;
        this(eVar, str, str2, list2, d6, yVar, yVar, yVar, yVar, yVar, yVar, yVar, yVar);
    }
}
