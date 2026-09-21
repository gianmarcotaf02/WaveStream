package p005a5;

/* JADX INFO: renamed from: a5.y8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1464y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f15380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f15381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f15384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f15385f;

    public C1464y8(int i3, int i9, java.lang.Integer num, java.lang.String contentId, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.m.e(contentId, "contentId");
        this.f15380a = contentId;
        this.f15381b = str;
        this.f15382c = i3;
        this.f15383d = i9;
        this.f15384e = num;
        this.f15385f = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.C1464y8)) {
            return false;
        }
        p005a5.C1464y8 c1464y8 = (p005a5.C1464y8) obj;
        return kotlin.jvm.internal.m.a(this.f15380a, c1464y8.f15380a) && kotlin.jvm.internal.m.a(this.f15381b, c1464y8.f15381b) && this.f15382c == c1464y8.f15382c && this.f15383d == c1464y8.f15383d && kotlin.jvm.internal.m.a(this.f15384e, c1464y8.f15384e) && kotlin.jvm.internal.m.a(this.f15385f, c1464y8.f15385f);
    }

    public final int hashCode() {
        int iHashCode = this.f15380a.hashCode() * 31;
        java.lang.String str = this.f15381b;
        int iD = p121o0.p.d(this.f15383d, p121o0.p.d(this.f15382c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        java.lang.Integer num = this.f15384e;
        int iHashCode2 = (iD + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str2 = this.f15385f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BatchEpisode(contentId=");
        sb.append(this.f15380a);
        sb.append(", contentTitle=");
        sb.append(this.f15381b);
        sb.append(", seasonNumber=");
        sb.append(this.f15382c);
        sb.append(", episodeNumber=");
        sb.append(this.f15383d);
        sb.append(", tmdbId=");
        sb.append(this.f15384e);
        sb.append(", posterUrl=");
        return Y6.f.m(sb, this.f15385f, ")");
    }
}
