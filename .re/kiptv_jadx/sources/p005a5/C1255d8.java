package p005a5;

/* JADX INFO: renamed from: a5.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1255d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f14366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f14367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f14368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f14369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f14370f;
    public final java.lang.Double g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f14371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f14372i;
    public final java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f14373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.kiptv.core.model.ContentRatingInfo f14374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f14375m;

    public C1255d8(int i3, java.lang.String title, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Double d4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, com.kiptv.core.model.ContentRatingInfo contentRatingInfo, java.lang.String str9) {
        kotlin.jvm.internal.m.e(title, "title");
        this.f14365a = i3;
        this.f14366b = title;
        this.f14367c = str;
        this.f14368d = str2;
        this.f14369e = str3;
        this.f14370f = str4;
        this.g = d4;
        this.f14371h = str5;
        this.f14372i = str6;
        this.j = str7;
        this.f14373k = str8;
        this.f14374l = contentRatingInfo;
        this.f14375m = str9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.C1255d8)) {
            return false;
        }
        p005a5.C1255d8 c1255d8 = (p005a5.C1255d8) obj;
        return this.f14365a == c1255d8.f14365a && kotlin.jvm.internal.m.a(this.f14366b, c1255d8.f14366b) && kotlin.jvm.internal.m.a(this.f14367c, c1255d8.f14367c) && kotlin.jvm.internal.m.a(this.f14368d, c1255d8.f14368d) && kotlin.jvm.internal.m.a(this.f14369e, c1255d8.f14369e) && kotlin.jvm.internal.m.a(this.f14370f, c1255d8.f14370f) && kotlin.jvm.internal.m.a(this.g, c1255d8.g) && kotlin.jvm.internal.m.a(this.f14371h, c1255d8.f14371h) && kotlin.jvm.internal.m.a(this.f14372i, c1255d8.f14372i) && kotlin.jvm.internal.m.a(this.j, c1255d8.j) && kotlin.jvm.internal.m.a(this.f14373k, c1255d8.f14373k) && kotlin.jvm.internal.m.a(this.f14374l, c1255d8.f14374l) && kotlin.jvm.internal.m.a(this.f14375m, c1255d8.f14375m);
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f14365a) * 31, 31, this.f14366b);
        java.lang.String str = this.f14367c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f14368d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f14369e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f14370f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Double d4 = this.g;
        int iHashCode5 = (iHashCode4 + (d4 == null ? 0 : d4.hashCode())) * 31;
        java.lang.String str5 = this.f14371h;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f14372i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.j;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.f14373k;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        com.kiptv.core.model.ContentRatingInfo contentRatingInfo = this.f14374l;
        int iHashCode10 = (iHashCode9 + (contentRatingInfo == null ? 0 : contentRatingInfo.hashCode())) * 31;
        java.lang.String str9 = this.f14375m;
        return iHashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TrendingHeroItem(id=");
        sb.append(this.f14365a);
        sb.append(", title=");
        sb.append(this.f14366b);
        sb.append(", backdropPath=");
        sb.append(this.f14367c);
        sb.append(", posterPath=");
        sb.append(this.f14368d);
        sb.append(", textlessPosterPath=");
        sb.append(this.f14369e);
        sb.append(", logoPath=");
        sb.append(this.f14370f);
        sb.append(", rating=");
        sb.append(this.g);
        sb.append(", genre=");
        sb.append(this.f14371h);
        sb.append(", year=");
        sb.append(this.f14372i);
        sb.append(", duration=");
        sb.append(this.j);
        sb.append(", ageRating=");
        sb.append(this.f14373k);
        sb.append(", contentRatingInfo=");
        sb.append(this.f14374l);
        sb.append(", overview=");
        return Y6.f.m(sb, this.f14375m, ")");
    }
}
