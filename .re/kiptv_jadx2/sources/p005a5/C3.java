package p005a5;

import B2.a;
import S4.r;
import com.kiptv.core.model.ContentRatingInfo;
import java.util.List;
import kotlin.jvm.internal.m;

public final class C3 {

    public final Integer f13238a;

    public final String f13239b;

    public final String f13240c;

    public final String f13241d;

    public final String f13242e;

    public final String f13243f;
    public final Double g;

    public final String f13244h;

    public final String f13245i;
    public final String j;

    public final ContentRatingInfo f13246k;

    public final Integer f13247l;

    public final List f13248m;

    public final String f13249n;

    public final List f13250o;

    public final List f13251p;

    public final String f13252q;

    public final r f13253r;

    public C3(Integer num, String title, String str, String str2, String str3, String str4, Double d4, String str5, String str6, String str7, ContentRatingInfo contentRatingInfo, Integer num2, List list, String str8, List list2, List crew, String str9, r source) {
        m.e(title, "title");
        m.e(crew, "crew");
        m.e(source, "source");
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3)) {
            return false;
        }
        C3 c9 = (C3) obj;
        return m.a(this.f13238a, c9.f13238a) && m.a(this.f13239b, c9.f13239b) && m.a(this.f13240c, c9.f13240c) && m.a(this.f13241d, c9.f13241d) && m.a(this.f13242e, c9.f13242e) && m.a(this.f13243f, c9.f13243f) && m.a(this.g, c9.g) && m.a(this.f13244h, c9.f13244h) && m.a(this.f13245i, c9.f13245i) && m.a(this.j, c9.j) && m.a(this.f13246k, c9.f13246k) && m.a(this.f13247l, c9.f13247l) && m.a(this.f13248m, c9.f13248m) && m.a(this.f13249n, c9.f13249n) && m.a(this.f13250o, c9.f13250o) && m.a(this.f13251p, c9.f13251p) && m.a(this.f13252q, c9.f13252q) && this.f13253r == c9.f13253r;
    }

    public final int hashCode() {
        Integer num = this.f13238a;
        int iA = a.a((num == null ? 0 : num.hashCode()) * 31, 31, this.f13239b);
        String str = this.f13240c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f13241d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13242e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13243f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d4 = this.g;
        int iHashCode5 = (iHashCode4 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str5 = this.f13244h;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f13245i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ContentRatingInfo contentRatingInfo = this.f13246k;
        int iHashCode9 = (iHashCode8 + (contentRatingInfo == null ? 0 : contentRatingInfo.hashCode())) * 31;
        Integer num2 = this.f13247l;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.f13248m;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.f13249n;
        int iB = a.b(a.b((iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.f13250o), 31, this.f13251p);
        String str9 = this.f13252q;
        return this.f13253r.hashCode() + ((iB + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SeriesMetadata(tmdbId=" + this.f13238a + ", title=" + this.f13239b + ", overview=" + this.f13240c + ", posterPath=" + this.f13241d + ", backdropPath=" + this.f13242e + ", logoPath=" + this.f13243f + ", rating=" + this.g + ", year=" + this.f13244h + ", genres=" + this.f13245i + ", ageRating=" + this.j + ", contentRatingInfo=" + this.f13246k + ", numberOfSeasons=" + this.f13247l + ", episodeRunTime=" + this.f13248m + ", originalLanguage=" + this.f13249n + ", cast=" + this.f13250o + ", crew=" + this.f13251p + ", imdbId=" + this.f13252q + ", source=" + this.f13253r + ")";
    }
}
