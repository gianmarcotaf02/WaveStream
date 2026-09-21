package B5;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBPersonDetail f812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f816f;

    public z(boolean z6, com.kiptv.core.model.TMDBPersonDetail tMDBPersonDetail, java.util.List movies, java.util.List tv, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.m.e(movies, "movies");
        kotlin.jvm.internal.m.e(tv, "tv");
        this.f811a = z6;
        this.f812b = tMDBPersonDetail;
        this.f813c = movies;
        this.f814d = tv;
        this.f815e = str;
        this.f816f = str2;
    }

    public static B5.z a(B5.z zVar, boolean z6, com.kiptv.core.model.TMDBPersonDetail tMDBPersonDetail, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.lang.String str, int i3) {
        if ((i3 & 2) != 0) {
            tMDBPersonDetail = zVar.f812b;
        }
        com.kiptv.core.model.TMDBPersonDetail tMDBPersonDetail2 = tMDBPersonDetail;
        java.util.List list = arrayList;
        if ((i3 & 4) != 0) {
            list = zVar.f813c;
        }
        java.util.List movies = list;
        java.util.List list2 = arrayList2;
        if ((i3 & 8) != 0) {
            list2 = zVar.f814d;
        }
        java.util.List tv = list2;
        if ((i3 & 16) != 0) {
            str = zVar.f815e;
        }
        java.lang.String str2 = zVar.f816f;
        zVar.getClass();
        kotlin.jvm.internal.m.e(movies, "movies");
        kotlin.jvm.internal.m.e(tv, "tv");
        return new B5.z(z6, tMDBPersonDetail2, movies, tv, str, str2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B5.z)) {
            return false;
        }
        B5.z zVar = (B5.z) obj;
        return this.f811a == zVar.f811a && kotlin.jvm.internal.m.a(this.f812b, zVar.f812b) && kotlin.jvm.internal.m.a(this.f813c, zVar.f813c) && kotlin.jvm.internal.m.a(this.f814d, zVar.f814d) && kotlin.jvm.internal.m.a(this.f815e, zVar.f815e) && this.f816f.equals(zVar.f816f);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.f811a) * 31;
        com.kiptv.core.model.TMDBPersonDetail tMDBPersonDetail = this.f812b;
        int iB = B2.a.b(B2.a.b((iHashCode + (tMDBPersonDetail == null ? 0 : tMDBPersonDetail.hashCode())) * 31, 31, this.f813c), 31, this.f814d);
        java.lang.String str = this.f815e;
        return this.f816f.hashCode() + ((iB + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvPersonUiState(loading=");
        sb.append(this.f811a);
        sb.append(", person=");
        sb.append(this.f812b);
        sb.append(", movies=");
        sb.append(this.f813c);
        sb.append(", tv=");
        sb.append(this.f814d);
        sb.append(", error=");
        sb.append(this.f815e);
        sb.append(", imageBaseUrl=");
        return Y6.f.m(sb, this.f816f, ")");
    }
}
