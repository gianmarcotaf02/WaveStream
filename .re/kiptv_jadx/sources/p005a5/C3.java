package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class C3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f13238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f13239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f13240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f13241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f13242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f13243f;
    public final java.lang.Double g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f13244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f13245i;
    public final java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.kiptv.core.model.ContentRatingInfo f13246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Integer f13247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.List f13248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f13249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.List f13250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.util.List f13251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.lang.String f13252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final S4.r f13253r;

    public C3(java.lang.Integer num, java.lang.String title, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Double d4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.kiptv.core.model.ContentRatingInfo contentRatingInfo, java.lang.Integer num2, java.util.List list, java.lang.String str8, java.util.List list2, java.util.List crew, java.lang.String str9, S4.r source) {
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(crew, "crew");
        kotlin.jvm.internal.m.e(source, "source");
        this.f13238a = num;
        this.f13239b = title;
        this.f13240c = str;
        this.f13241d = str2;
        this.f13242e = str3;
        this.f13243f = str4;
        this.g = d4;
        this.f13244h = str5;
        this.f13245i = str6;
        this.j = str7;
        this.f13246k = contentRatingInfo;
        this.f13247l = num2;
        this.f13248m = list;
        this.f13249n = str8;
        this.f13250o = list2;
        this.f13251p = crew;
        this.f13252q = str9;
        this.f13253r = source;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.C3)) {
            return false;
        }
        p005a5.C3 c9 = (p005a5.C3) obj;
        return kotlin.jvm.internal.m.a(this.f13238a, c9.f13238a) && kotlin.jvm.internal.m.a(this.f13239b, c9.f13239b) && kotlin.jvm.internal.m.a(this.f13240c, c9.f13240c) && kotlin.jvm.internal.m.a(this.f13241d, c9.f13241d) && kotlin.jvm.internal.m.a(this.f13242e, c9.f13242e) && kotlin.jvm.internal.m.a(this.f13243f, c9.f13243f) && kotlin.jvm.internal.m.a(this.g, c9.g) && kotlin.jvm.internal.m.a(this.f13244h, c9.f13244h) && kotlin.jvm.internal.m.a(this.f13245i, c9.f13245i) && kotlin.jvm.internal.m.a(this.j, c9.j) && kotlin.jvm.internal.m.a(this.f13246k, c9.f13246k) && kotlin.jvm.internal.m.a(this.f13247l, c9.f13247l) && kotlin.jvm.internal.m.a(this.f13248m, c9.f13248m) && kotlin.jvm.internal.m.a(this.f13249n, c9.f13249n) && kotlin.jvm.internal.m.a(this.f13250o, c9.f13250o) && kotlin.jvm.internal.m.a(this.f13251p, c9.f13251p) && kotlin.jvm.internal.m.a(this.f13252q, c9.f13252q) && this.f13253r == c9.f13253r;
    }

    public final int hashCode() {
        java.lang.Integer num = this.f13238a;
        int iA = B2.a.a((num == null ? 0 : num.hashCode()) * 31, 31, this.f13239b);
        java.lang.String str = this.f13240c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f13241d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f13242e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f13243f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Double d4 = this.g;
        int iHashCode5 = (iHashCode4 + (d4 == null ? 0 : d4.hashCode())) * 31;
        java.lang.String str5 = this.f13244h;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f13245i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.j;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        com.kiptv.core.model.ContentRatingInfo contentRatingInfo = this.f13246k;
        int iHashCode9 = (iHashCode8 + (contentRatingInfo == null ? 0 : contentRatingInfo.hashCode())) * 31;
        java.lang.Integer num2 = this.f13247l;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.util.List list = this.f13248m;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        java.lang.String str8 = this.f13249n;
        int iB = B2.a.b(B2.a.b((iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.f13250o), 31, this.f13251p);
        java.lang.String str9 = this.f13252q;
        return this.f13253r.hashCode() + ((iB + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        return "SeriesMetadata(tmdbId=" + this.f13238a + ", title=" + this.f13239b + ", overview=" + this.f13240c + ", posterPath=" + this.f13241d + ", backdropPath=" + this.f13242e + ", logoPath=" + this.f13243f + ", rating=" + this.g + ", year=" + this.f13244h + ", genres=" + this.f13245i + ", ageRating=" + this.j + ", contentRatingInfo=" + this.f13246k + ", numberOfSeasons=" + this.f13247l + ", episodeRunTime=" + this.f13248m + ", originalLanguage=" + this.f13249n + ", cast=" + this.f13250o + ", crew=" + this.f13251p + ", imdbId=" + this.f13252q + ", source=" + this.f13253r + ")";
    }
}
