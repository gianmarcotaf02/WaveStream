package p099l5;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f24797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f24798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f24799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f24800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f24801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Double f24802f;
    public final java.util.List g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f24803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.List f24804i;
    public final java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f24805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f24806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.List f24807m;

    public w(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Double d4, java.util.List list, java.lang.Integer num2, java.util.List cast, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.util.List similar, int i3) {
        str2 = (i3 & 4) != 0 ? null : str2;
        kotlin.jvm.internal.m.e(cast, "cast");
        kotlin.jvm.internal.m.e(similar, "similar");
        this.f24797a = num;
        this.f24798b = str;
        this.f24799c = str2;
        this.f24800d = str3;
        this.f24801e = str4;
        this.f24802f = d4;
        this.g = list;
        this.f24803h = num2;
        this.f24804i = cast;
        this.j = str5;
        this.f24805k = str6;
        this.f24806l = str7;
        this.f24807m = similar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p099l5.w)) {
            return false;
        }
        p099l5.w wVar = (p099l5.w) obj;
        return this.f24797a.equals(wVar.f24797a) && kotlin.jvm.internal.m.a(this.f24798b, wVar.f24798b) && kotlin.jvm.internal.m.a(this.f24799c, wVar.f24799c) && kotlin.jvm.internal.m.a(this.f24800d, wVar.f24800d) && kotlin.jvm.internal.m.a(this.f24801e, wVar.f24801e) && kotlin.jvm.internal.m.a(this.f24802f, wVar.f24802f) && this.g.equals(wVar.g) && kotlin.jvm.internal.m.a(this.f24803h, wVar.f24803h) && this.f24804i.equals(wVar.f24804i) && kotlin.jvm.internal.m.a(this.j, wVar.j) && kotlin.jvm.internal.m.a(this.f24805k, wVar.f24805k) && kotlin.jvm.internal.m.a(this.f24806l, wVar.f24806l) && this.f24807m.equals(wVar.f24807m);
    }

    public final int hashCode() {
        int iHashCode = this.f24797a.hashCode() * 31;
        java.lang.String str = this.f24798b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f24799c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f24800d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f24801e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 961;
        java.lang.Double d4 = this.f24802f;
        int iB = B2.a.b((iHashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31, 31, this.g);
        java.lang.Integer num = this.f24803h;
        int iB2 = B2.a.b((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.f24804i);
        java.lang.String str5 = this.j;
        int iHashCode6 = (iB2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f24805k;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f24806l;
        return this.f24807m.hashCode() + ((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        return "PlayerTMDBMetadata(tmdbId=" + this.f24797a + ", title=" + this.f24798b + ", episodeTitle=" + this.f24799c + ", overview=" + this.f24800d + ", posterUrl=" + this.f24801e + ", episodeStillUrl=null, rating=" + this.f24802f + ", genres=" + this.g + ", runtime=" + this.f24803h + ", cast=" + this.f24804i + ", releaseDate=" + this.j + ", director=" + this.f24805k + ", imdbId=" + this.f24806l + ", similar=" + this.f24807m + ")";
    }
}
