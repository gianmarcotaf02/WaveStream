package p005a5;

import B2.a;
import Y6.f;
import com.kiptv.core.model.ContentRatingInfo;
import kotlin.jvm.internal.m;

public final class C1255d8 {

    public final int f14365a;

    public final String f14366b;

    public final String f14367c;

    public final String f14368d;

    public final String f14369e;

    public final String f14370f;
    public final Double g;

    public final String f14371h;

    public final String f14372i;
    public final String j;

    public final String f14373k;

    public final ContentRatingInfo f14374l;

    public final String f14375m;

    public C1255d8(int i3, String title, String str, String str2, String str3, String str4, Double d4, String str5, String str6, String str7, String str8, ContentRatingInfo contentRatingInfo, String str9) {
        m.e(title, "title");
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1255d8)) {
            return false;
        }
        C1255d8 c1255d8 = (C1255d8) obj;
        return this.f14365a == c1255d8.f14365a && m.a(this.f14366b, c1255d8.f14366b) && m.a(this.f14367c, c1255d8.f14367c) && m.a(this.f14368d, c1255d8.f14368d) && m.a(this.f14369e, c1255d8.f14369e) && m.a(this.f14370f, c1255d8.f14370f) && m.a(this.g, c1255d8.g) && m.a(this.f14371h, c1255d8.f14371h) && m.a(this.f14372i, c1255d8.f14372i) && m.a(this.j, c1255d8.j) && m.a(this.f14373k, c1255d8.f14373k) && m.a(this.f14374l, c1255d8.f14374l) && m.a(this.f14375m, c1255d8.f14375m);
    }

    public final int hashCode() {
        int iA = a.a(Integer.hashCode(this.f14365a) * 31, 31, this.f14366b);
        String str = this.f14367c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14368d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14369e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14370f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d4 = this.g;
        int iHashCode5 = (iHashCode4 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str5 = this.f14371h;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f14372i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f14373k;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ContentRatingInfo contentRatingInfo = this.f14374l;
        int iHashCode10 = (iHashCode9 + (contentRatingInfo == null ? 0 : contentRatingInfo.hashCode())) * 31;
        String str9 = this.f14375m;
        return iHashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrendingHeroItem(id=");
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
        return f.m(sb, this.f14375m, ")");
    }
}
