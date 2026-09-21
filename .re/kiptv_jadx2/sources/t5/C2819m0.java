package t5;

import com.kiptv.core.model.ContentRatingInfo;
import java.util.ArrayList;
import java.util.List;

public final class C2819m0 {

    public final String f28269a;

    public final String f28270b;

    public final String f28271c;

    public final Integer f28272d;

    public final Integer f28273e;

    public final Integer f28274f;
    public final Double g;

    public final Integer f28275h;

    public final List f28276i;
    public final List j;

    public final String f28277k;

    public final ContentRatingInfo f28278l;

    public final List f28279m;

    public final List f28280n;

    public C2819m0(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Double d4, Integer num4, List list, List list2, String str4, ContentRatingInfo contentRatingInfo, List list3, int i3) {
        String str5 = (i3 & 2) != 0 ? null : str2;
        String str6 = (i3 & 4) != 0 ? null : str3;
        Integer num5 = (i3 & 8) != 0 ? null : num;
        Integer num6 = (i3 & 16) != 0 ? null : num2;
        Integer num7 = (i3 & 32) != 0 ? null : num3;
        Double d6 = (i3 & 64) != 0 ? null : d4;
        Integer num8 = (i3 & 128) != 0 ? null : num4;
        int i9 = i3 & 256;
        p078i6.w wVar = p078i6.w.f23205h;
        this(str, str5, str6, num5, num6, num7, d6, num8, i9 != 0 ? wVar : list, (i3 & 512) != 0 ? wVar : list2, (i3 & 1024) != 0 ? null : str4, (i3 & 2048) != 0 ? null : contentRatingInfo, (i3 & 4096) != 0 ? wVar : list3, wVar);
    }

    public static C2819m0 a(C2819m0 c2819m0, ArrayList arrayList) {
        String title = c2819m0.f28269a;
        String str = c2819m0.f28270b;
        String str2 = c2819m0.f28271c;
        Integer num = c2819m0.f28272d;
        Integer num2 = c2819m0.f28273e;
        Integer num3 = c2819m0.f28274f;
        Double d4 = c2819m0.g;
        Integer num4 = c2819m0.f28275h;
        List genres = c2819m0.f28276i;
        List cast = c2819m0.j;
        String str3 = c2819m0.f28277k;
        ContentRatingInfo contentRatingInfo = c2819m0.f28278l;
        List upcoming = c2819m0.f28279m;
        c2819m0.getClass();
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(genres, "genres");
        kotlin.jvm.internal.m.e(cast, "cast");
        kotlin.jvm.internal.m.e(upcoming, "upcoming");
        return new C2819m0(title, str, str2, num, num2, num3, d4, num4, genres, cast, str3, contentRatingInfo, upcoming, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2819m0)) {
            return false;
        }
        C2819m0 c2819m0 = (C2819m0) obj;
        return kotlin.jvm.internal.m.a(this.f28269a, c2819m0.f28269a) && kotlin.jvm.internal.m.a(this.f28270b, c2819m0.f28270b) && kotlin.jvm.internal.m.a(this.f28271c, c2819m0.f28271c) && kotlin.jvm.internal.m.a(this.f28272d, c2819m0.f28272d) && kotlin.jvm.internal.m.a(this.f28273e, c2819m0.f28273e) && kotlin.jvm.internal.m.a(this.f28274f, c2819m0.f28274f) && kotlin.jvm.internal.m.a(this.g, c2819m0.g) && kotlin.jvm.internal.m.a(this.f28275h, c2819m0.f28275h) && kotlin.jvm.internal.m.a(this.f28276i, c2819m0.f28276i) && kotlin.jvm.internal.m.a(this.j, c2819m0.j) && kotlin.jvm.internal.m.a(this.f28277k, c2819m0.f28277k) && kotlin.jvm.internal.m.a(this.f28278l, c2819m0.f28278l) && kotlin.jvm.internal.m.a(this.f28279m, c2819m0.f28279m) && kotlin.jvm.internal.m.a(this.f28280n, c2819m0.f28280n);
    }

    public final int hashCode() {
        int iHashCode = this.f28269a.hashCode() * 31;
        String str = this.f28270b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28271c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f28272d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f28273e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f28274f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d4 = this.g;
        int iHashCode7 = (iHashCode6 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num4 = this.f28275h;
        int iB = B2.a.b(B2.a.b((iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.f28276i), 31, this.j);
        String str3 = this.f28277k;
        int iHashCode8 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
        ContentRatingInfo contentRatingInfo = this.f28278l;
        return this.f28280n.hashCode() + B2.a.b((iHashCode8 + (contentRatingInfo != null ? contentRatingInfo.hashCode() : 0)) * 31, 31, this.f28279m);
    }

    public final String toString() {
        return "TvHeroMeta(title=" + this.f28269a + ", logoUrl=" + this.f28270b + ", channelLogoUrl=" + this.f28271c + ", year=" + this.f28272d + ", runtimeMinutes=" + this.f28273e + ", seasonsCount=" + this.f28274f + ", rating=" + this.g + ", voteCount=" + this.f28275h + ", genres=" + this.f28276i + ", cast=" + this.j + ", overview=" + this.f28277k + ", contentRating=" + this.f28278l + ", upcoming=" + this.f28279m + ", providerLogoUrls=" + this.f28280n + ")";
    }

    public C2819m0(String title, String str, String str2, Integer num, Integer num2, Integer num3, Double d4, Integer num4, List genres, List cast, String str3, ContentRatingInfo contentRatingInfo, List upcoming, List list) {
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
