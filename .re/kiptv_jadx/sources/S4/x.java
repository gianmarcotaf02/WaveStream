package S4;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final S4.v Companion = new S4.v();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f9477k = new java.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Map f9478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Map f9479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Map f9480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Map f9481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Map f9482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.Map f9483f;
    public final java.util.List g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f9484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.List f9485i;
    public final int j;

    public x(java.util.Map byNormalized, java.util.Map byYear, java.util.Map byTmdbId, java.util.Map byPrefix, java.util.Map byKeyword, java.util.Map byContains, java.util.List list, java.util.List list2, java.util.List list3, int i3) {
        kotlin.jvm.internal.m.e(byNormalized, "byNormalized");
        kotlin.jvm.internal.m.e(byYear, "byYear");
        kotlin.jvm.internal.m.e(byTmdbId, "byTmdbId");
        kotlin.jvm.internal.m.e(byPrefix, "byPrefix");
        kotlin.jvm.internal.m.e(byKeyword, "byKeyword");
        kotlin.jvm.internal.m.e(byContains, "byContains");
        this.f9478a = byNormalized;
        this.f9479b = byYear;
        this.f9480c = byTmdbId;
        this.f9481d = byPrefix;
        this.f9482e = byKeyword;
        this.f9483f = byContains;
        this.g = list;
        this.f9484h = list2;
        this.f9485i = list3;
        this.j = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S4.x)) {
            return false;
        }
        S4.x xVar = (S4.x) obj;
        return kotlin.jvm.internal.m.a(this.f9478a, xVar.f9478a) && kotlin.jvm.internal.m.a(this.f9479b, xVar.f9479b) && kotlin.jvm.internal.m.a(this.f9480c, xVar.f9480c) && kotlin.jvm.internal.m.a(this.f9481d, xVar.f9481d) && kotlin.jvm.internal.m.a(this.f9482e, xVar.f9482e) && kotlin.jvm.internal.m.a(this.f9483f, xVar.f9483f) && kotlin.jvm.internal.m.a(this.g, xVar.g) && kotlin.jvm.internal.m.a(this.f9484h, xVar.f9484h) && kotlin.jvm.internal.m.a(this.f9485i, xVar.f9485i) && this.j == xVar.j;
    }

    public final int hashCode() {
        int iB = B2.a.b(B2.a.c(B2.a.c(B2.a.c(B2.a.c(B2.a.c(this.f9478a.hashCode() * 31, 31, this.f9479b), 31, this.f9480c), 31, this.f9481d), 31, this.f9482e), 31, this.f9483f), 31, this.g);
        java.util.List list = this.f9484h;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        java.util.List list2 = this.f9485i;
        return java.lang.Integer.hashCode(this.j) + ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlaylistIndex(byNormalized=");
        sb.append(this.f9478a);
        sb.append(", byYear=");
        sb.append(this.f9479b);
        sb.append(", byTmdbId=");
        sb.append(this.f9480c);
        sb.append(", byPrefix=");
        sb.append(this.f9481d);
        sb.append(", byKeyword=");
        sb.append(this.f9482e);
        sb.append(", byContains=");
        sb.append(this.f9483f);
        sb.append(", allEntries=");
        sb.append(this.g);
        sb.append(", movies=");
        sb.append(this.f9484h);
        sb.append(", series=");
        sb.append(this.f9485i);
        sb.append(", totalSize=");
        return Y6.f.k(sb, this.j, ")");
    }
}
