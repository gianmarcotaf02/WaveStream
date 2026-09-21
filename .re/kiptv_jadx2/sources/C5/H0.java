package C5;

import java.util.List;

public final class H0 {

    public final String f960a;

    public final String f961b;

    public final String f962c;

    public final List f963d;

    public final Double f964e;

    public final String f965f;
    public final Integer g;

    public final String f966h;

    public final List f967i;

    public H0(String str, String str2, String str3, List genres, Double d4, String str4, Integer num, String str5, List cast) {
        kotlin.jvm.internal.m.e(genres, "genres");
        kotlin.jvm.internal.m.e(cast, "cast");
        this.f960a = str;
        this.f961b = str2;
        this.f962c = str3;
        this.f963d = genres;
        this.f964e = d4;
        this.f965f = str4;
        this.g = num;
        this.f966h = str5;
        this.f967i = cast;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h9 = (H0) obj;
        return kotlin.jvm.internal.m.a(this.f960a, h9.f960a) && kotlin.jvm.internal.m.a(this.f961b, h9.f961b) && kotlin.jvm.internal.m.a(this.f962c, h9.f962c) && kotlin.jvm.internal.m.a(this.f963d, h9.f963d) && kotlin.jvm.internal.m.a(this.f964e, h9.f964e) && kotlin.jvm.internal.m.a(this.f965f, h9.f965f) && kotlin.jvm.internal.m.a(this.g, h9.g) && kotlin.jvm.internal.m.a(this.f966h, h9.f966h) && kotlin.jvm.internal.m.a(this.f967i, h9.f967i);
    }

    public final int hashCode() {
        String str = this.f960a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f961b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f962c;
        int iB = B2.a.b((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f963d);
        Double d4 = this.f964e;
        int iHashCode3 = (iB + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str4 = this.f965f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f966h;
        return this.f967i.hashCode() + ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TvPlayerTmdbUi(title=" + this.f960a + ", episodeTitle=" + this.f961b + ", overview=" + this.f962c + ", genres=" + this.f963d + ", rating=" + this.f964e + ", releaseDate=" + this.f965f + ", runtimeMinutes=" + this.g + ", posterUrl=" + this.f966h + ", cast=" + this.f967i + ")";
    }
}
