package t5;

/* JADX INFO: renamed from: t5.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2819m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f28269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f28270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f28271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f28272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f28273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f28274f;
    public final java.lang.Double g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f28275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.List f28276i;
    public final java.util.List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f28277k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.kiptv.core.model.ContentRatingInfo f28278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.List f28279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.List f28280n;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C2819m0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Double d4, java.lang.Integer num4, java.util.List list, java.util.List list2, java.lang.String str4, com.kiptv.core.model.ContentRatingInfo contentRatingInfo, java.util.List list3, int i3) {
        java.lang.String str5 = (i3 & 2) != 0 ? null : str2;
        java.lang.String str6 = (i3 & 4) != 0 ? null : str3;
        java.lang.Integer num5 = (i3 & 8) != 0 ? null : num;
        java.lang.Integer num6 = (i3 & 16) != 0 ? null : num2;
        java.lang.Integer num7 = (i3 & 32) != 0 ? null : num3;
        java.lang.Double d6 = (i3 & 64) != 0 ? null : d4;
        java.lang.Integer num8 = (i3 & 128) != 0 ? null : num4;
        int i9 = i3 & 256;
        p078i6.w wVar = p078i6.w.f23205h;
        this(str, str5, str6, num5, num6, num7, d6, num8, i9 != 0 ? wVar : list, (i3 & 512) != 0 ? wVar : list2, (i3 & 1024) != 0 ? null : str4, (i3 & 2048) != 0 ? null : contentRatingInfo, (i3 & 4096) != 0 ? wVar : list3, wVar);
    }

    public static t5.C2819m0 a(t5.C2819m0 c2819m0, java.util.ArrayList arrayList) {
        java.lang.String title = c2819m0.f28269a;
        java.lang.String str = c2819m0.f28270b;
        java.lang.String str2 = c2819m0.f28271c;
        java.lang.Integer num = c2819m0.f28272d;
        java.lang.Integer num2 = c2819m0.f28273e;
        java.lang.Integer num3 = c2819m0.f28274f;
        java.lang.Double d4 = c2819m0.g;
        java.lang.Integer num4 = c2819m0.f28275h;
        java.util.List genres = c2819m0.f28276i;
        java.util.List cast = c2819m0.j;
        java.lang.String str3 = c2819m0.f28277k;
        com.kiptv.core.model.ContentRatingInfo contentRatingInfo = c2819m0.f28278l;
        java.util.List upcoming = c2819m0.f28279m;
        c2819m0.getClass();
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(genres, "genres");
        kotlin.jvm.internal.m.e(cast, "cast");
        kotlin.jvm.internal.m.e(upcoming, "upcoming");
        return new t5.C2819m0(title, str, str2, num, num2, num3, d4, num4, genres, cast, str3, contentRatingInfo, upcoming, arrayList);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5.C2819m0)) {
            return false;
        }
        t5.C2819m0 c2819m0 = (t5.C2819m0) obj;
        return kotlin.jvm.internal.m.a(this.f28269a, c2819m0.f28269a) && kotlin.jvm.internal.m.a(this.f28270b, c2819m0.f28270b) && kotlin.jvm.internal.m.a(this.f28271c, c2819m0.f28271c) && kotlin.jvm.internal.m.a(this.f28272d, c2819m0.f28272d) && kotlin.jvm.internal.m.a(this.f28273e, c2819m0.f28273e) && kotlin.jvm.internal.m.a(this.f28274f, c2819m0.f28274f) && kotlin.jvm.internal.m.a(this.g, c2819m0.g) && kotlin.jvm.internal.m.a(this.f28275h, c2819m0.f28275h) && kotlin.jvm.internal.m.a(this.f28276i, c2819m0.f28276i) && kotlin.jvm.internal.m.a(this.j, c2819m0.j) && kotlin.jvm.internal.m.a(this.f28277k, c2819m0.f28277k) && kotlin.jvm.internal.m.a(this.f28278l, c2819m0.f28278l) && kotlin.jvm.internal.m.a(this.f28279m, c2819m0.f28279m) && kotlin.jvm.internal.m.a(this.f28280n, c2819m0.f28280n);
    }

    public final int hashCode() {
        int iHashCode = this.f28269a.hashCode() * 31;
        java.lang.String str = this.f28270b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f28271c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num = this.f28272d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f28273e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.f28274f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.Double d4 = this.g;
        int iHashCode7 = (iHashCode6 + (d4 == null ? 0 : d4.hashCode())) * 31;
        java.lang.Integer num4 = this.f28275h;
        int iB = B2.a.b(B2.a.b((iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.f28276i), 31, this.j);
        java.lang.String str3 = this.f28277k;
        int iHashCode8 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
        com.kiptv.core.model.ContentRatingInfo contentRatingInfo = this.f28278l;
        return this.f28280n.hashCode() + B2.a.b((iHashCode8 + (contentRatingInfo != null ? contentRatingInfo.hashCode() : 0)) * 31, 31, this.f28279m);
    }

    public final java.lang.String toString() {
        return "TvHeroMeta(title=" + this.f28269a + ", logoUrl=" + this.f28270b + ", channelLogoUrl=" + this.f28271c + ", year=" + this.f28272d + ", runtimeMinutes=" + this.f28273e + ", seasonsCount=" + this.f28274f + ", rating=" + this.g + ", voteCount=" + this.f28275h + ", genres=" + this.f28276i + ", cast=" + this.j + ", overview=" + this.f28277k + ", contentRating=" + this.f28278l + ", upcoming=" + this.f28279m + ", providerLogoUrls=" + this.f28280n + ")";
    }

    public C2819m0(java.lang.String title, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Double d4, java.lang.Integer num4, java.util.List genres, java.util.List cast, java.lang.String str3, com.kiptv.core.model.ContentRatingInfo contentRatingInfo, java.util.List upcoming, java.util.List list) {
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(genres, "genres");
        kotlin.jvm.internal.m.e(cast, "cast");
        kotlin.jvm.internal.m.e(upcoming, "upcoming");
        this.f28269a = title;
        this.f28270b = str;
        this.f28271c = str2;
        this.f28272d = num;
        this.f28273e = num2;
        this.f28274f = num3;
        this.g = d4;
        this.f28275h = num4;
        this.f28276i = genres;
        this.j = cast;
        this.f28277k = str3;
        this.f28278l = contentRatingInfo;
        this.f28279m = upcoming;
        this.f28280n = list;
    }
}
