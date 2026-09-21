package p099l5;

import B2.a;
import java.util.List;
import kotlin.jvm.internal.m;

public final class w {

    public final Integer f24797a;

    public final String f24798b;

    public final String f24799c;

    public final String f24800d;

    public final String f24801e;

    public final Double f24802f;
    public final List g;

    public final Integer f24803h;

    public final List f24804i;
    public final String j;

    public final String f24805k;

    public final String f24806l;

    public final List f24807m;

    public w(Integer num, String str, String str2, String str3, String str4, Double d4, List list, Integer num2, List cast, String str5, String str6, String str7, List similar, int i3) {
        str2 = (i3 & 4) != 0 ? null : str2;
        m.e(cast, "cast");
        m.e(similar, "similar");
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f24797a.equals(wVar.f24797a) && m.a(this.f24798b, wVar.f24798b) && m.a(this.f24799c, wVar.f24799c) && m.a(this.f24800d, wVar.f24800d) && m.a(this.f24801e, wVar.f24801e) && m.a(this.f24802f, wVar.f24802f) && this.g.equals(wVar.g) && m.a(this.f24803h, wVar.f24803h) && this.f24804i.equals(wVar.f24804i) && m.a(this.j, wVar.j) && m.a(this.f24805k, wVar.f24805k) && m.a(this.f24806l, wVar.f24806l) && this.f24807m.equals(wVar.f24807m);
    }

    public final int hashCode() {
        int iHashCode = this.f24797a.hashCode() * 31;
        String str = this.f24798b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24799c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24800d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f24801e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 961;
        Double d4 = this.f24802f;
        int iB = a.b((iHashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31, 31, this.g);
        Integer num = this.f24803h;
        int iB2 = a.b((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.f24804i);
        String str5 = this.j;
        int iHashCode6 = (iB2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f24805k;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f24806l;
        return this.f24807m.hashCode() + ((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PlayerTMDBMetadata(tmdbId=" + this.f24797a + ", title=" + this.f24798b + ", episodeTitle=" + this.f24799c + ", overview=" + this.f24800d + ", posterUrl=" + this.f24801e + ", episodeStillUrl=null, rating=" + this.f24802f + ", genres=" + this.g + ", runtime=" + this.f24803h + ", cast=" + this.f24804i + ", releaseDate=" + this.j + ", director=" + this.f24805k + ", imdbId=" + this.f24806l + ", similar=" + this.f24807m + ")";
    }
}
