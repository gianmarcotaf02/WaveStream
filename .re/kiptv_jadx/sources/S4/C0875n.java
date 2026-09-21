package S4;

/* JADX INFO: renamed from: S4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0875n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f9419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f9420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f9421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f9422f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Double f9423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final S4.r f9424i;

    public C0875n(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.String str4, java.lang.Double d4, S4.r rVar) {
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S4.C0875n)) {
            return false;
        }
        S4.C0875n c0875n = (S4.C0875n) obj;
        return this.f9417a == c0875n.f9417a && this.f9418b == c0875n.f9418b && kotlin.jvm.internal.m.a(this.f9419c, c0875n.f9419c) && kotlin.jvm.internal.m.a(this.f9420d, c0875n.f9420d) && kotlin.jvm.internal.m.a(this.f9421e, c0875n.f9421e) && kotlin.jvm.internal.m.a(this.f9422f, c0875n.f9422f) && kotlin.jvm.internal.m.a(this.g, c0875n.g) && kotlin.jvm.internal.m.a(this.f9423h, c0875n.f9423h) && this.f9424i == c0875n.f9424i;
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f9418b, java.lang.Integer.hashCode(this.f9417a) * 31, 31);
        java.lang.String str = this.f9419c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f9420d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f9421e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Integer num = this.f9422f;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str4 = this.g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Double d4 = this.f9423h;
        return this.f9424i.hashCode() + ((iHashCode5 + (d4 != null ? d4.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        return "EpisodeMetadata(episodeNumber=" + this.f9417a + ", seasonNumber=" + this.f9418b + ", title=" + this.f9419c + ", overview=" + this.f9420d + ", stillImageUrl=" + this.f9421e + ", runtime=" + this.f9422f + ", airDate=" + this.g + ", voteAverage=" + this.f9423h + ", source=" + this.f9424i + ")";
    }
}
