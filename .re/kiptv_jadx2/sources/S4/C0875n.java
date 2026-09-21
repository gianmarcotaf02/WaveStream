package S4;

public final class C0875n {

    public final int f9417a;

    public final int f9418b;

    public final String f9419c;

    public final String f9420d;

    public final String f9421e;

    public final Integer f9422f;
    public final String g;

    public final Double f9423h;

    public final r f9424i;

    public C0875n(int i3, int i9, String str, String str2, String str3, Integer num, String str4, Double d4, r rVar) {
        this.f9417a = i3;
        this.f9418b = i9;
        this.f9419c = str;
        this.f9420d = str2;
        this.f9421e = str3;
        this.f9422f = num;
        this.g = str4;
        this.f9423h = d4;
        this.f9424i = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0875n)) {
            return false;
        }
        C0875n c0875n = (C0875n) obj;
        return this.f9417a == c0875n.f9417a && this.f9418b == c0875n.f9418b && kotlin.jvm.internal.m.a(this.f9419c, c0875n.f9419c) && kotlin.jvm.internal.m.a(this.f9420d, c0875n.f9420d) && kotlin.jvm.internal.m.a(this.f9421e, c0875n.f9421e) && kotlin.jvm.internal.m.a(this.f9422f, c0875n.f9422f) && kotlin.jvm.internal.m.a(this.g, c0875n.g) && kotlin.jvm.internal.m.a(this.f9423h, c0875n.f9423h) && this.f9424i == c0875n.f9424i;
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f9418b, Integer.hashCode(this.f9417a) * 31, 31);
        String str = this.f9419c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9420d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9421e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f9422f;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d4 = this.f9423h;
        return this.f9424i.hashCode() + ((iHashCode5 + (d4 != null ? d4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "EpisodeMetadata(episodeNumber=" + this.f9417a + ", seasonNumber=" + this.f9418b + ", title=" + this.f9419c + ", overview=" + this.f9420d + ", stillImageUrl=" + this.f9421e + ", runtime=" + this.f9422f + ", airDate=" + this.g + ", voteAverage=" + this.f9423h + ", source=" + this.f9424i + ")";
    }
}
