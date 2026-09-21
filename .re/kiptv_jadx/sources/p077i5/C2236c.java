package p077i5;

/* JADX INFO: renamed from: i5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2236c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f23085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f23086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f23087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f23088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f23090f;
    public final com.kiptv.core.model.z0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f23091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f23092i;
    public final java.lang.Integer j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Integer f23093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f23094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f23095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f23096n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.Long f23097o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.lang.Long f23098p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.lang.String f23099q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.lang.String f23100r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final java.lang.Integer f23101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final java.lang.String f23102t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final java.lang.Integer f23103u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final java.lang.Integer f23104v;

    public C2236c(java.lang.String contentId, java.lang.String title, java.lang.String str, java.lang.String streamUrl, boolean z6, java.lang.String str2, com.kiptv.core.model.z0 z0Var, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.Integer num2, java.lang.String str5, boolean z9, boolean z10, java.lang.Long l2, java.lang.Long l9, java.lang.String str6, java.lang.String str7, java.lang.Integer num3, java.lang.String str8, java.lang.Integer num4, java.lang.Integer num5, int i3) {
        java.lang.String str9 = (i3 & 4) != 0 ? null : str;
        java.lang.String str10 = (i3 & 256) != 0 ? null : str4;
        java.lang.Integer num6 = (i3 & 512) != 0 ? null : num;
        java.lang.Integer num7 = (i3 & 1024) != 0 ? null : num2;
        java.lang.String str11 = (i3 & 2048) != 0 ? null : str5;
        boolean z11 = (i3 & 4096) != 0 ? false : z9;
        boolean z12 = (i3 & 8192) == 0 ? z10 : false;
        java.lang.Long l10 = (32768 & i3) != 0 ? null : l2;
        java.lang.Long l11 = (65536 & i3) != 0 ? null : l9;
        java.lang.String str12 = (131072 & i3) != 0 ? null : str6;
        java.lang.String str13 = (i3 & 262144) != 0 ? null : str7;
        java.lang.Integer num8 = (i3 & 524288) != 0 ? null : num3;
        java.lang.String str14 = (i3 & 1048576) != 0 ? null : str8;
        java.lang.Integer num9 = (i3 & 2097152) != 0 ? null : num4;
        java.lang.Integer num10 = (i3 & 4194304) != 0 ? null : num5;
        java.lang.Integer num11 = num8;
        kotlin.jvm.internal.m.e(contentId, "contentId");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(streamUrl, "streamUrl");
        this.f23085a = contentId;
        this.f23086b = title;
        this.f23087c = str9;
        this.f23088d = streamUrl;
        this.f23089e = z6;
        this.f23090f = str2;
        this.g = z0Var;
        this.f23091h = str3;
        this.f23092i = str10;
        this.j = num6;
        this.f23093k = num7;
        this.f23094l = str11;
        this.f23095m = z11;
        this.f23096n = z12;
        this.f23097o = l10;
        this.f23098p = l11;
        this.f23099q = str12;
        this.f23100r = str13;
        this.f23101s = num11;
        this.f23102t = str14;
        this.f23103u = num9;
        this.f23104v = num10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p077i5.C2236c)) {
            return false;
        }
        p077i5.C2236c c2236c = (p077i5.C2236c) obj;
        return kotlin.jvm.internal.m.a(this.f23085a, c2236c.f23085a) && kotlin.jvm.internal.m.a(this.f23086b, c2236c.f23086b) && kotlin.jvm.internal.m.a(this.f23087c, c2236c.f23087c) && kotlin.jvm.internal.m.a(this.f23088d, c2236c.f23088d) && this.f23089e == c2236c.f23089e && kotlin.jvm.internal.m.a(this.f23090f, c2236c.f23090f) && this.g == c2236c.g && kotlin.jvm.internal.m.a(this.f23091h, c2236c.f23091h) && kotlin.jvm.internal.m.a(this.f23092i, c2236c.f23092i) && kotlin.jvm.internal.m.a(this.j, c2236c.j) && kotlin.jvm.internal.m.a(this.f23093k, c2236c.f23093k) && kotlin.jvm.internal.m.a(this.f23094l, c2236c.f23094l) && this.f23095m == c2236c.f23095m && this.f23096n == c2236c.f23096n && kotlin.jvm.internal.m.a(this.f23097o, c2236c.f23097o) && kotlin.jvm.internal.m.a(this.f23098p, c2236c.f23098p) && kotlin.jvm.internal.m.a(this.f23099q, c2236c.f23099q) && kotlin.jvm.internal.m.a(this.f23100r, c2236c.f23100r) && kotlin.jvm.internal.m.a(this.f23101s, c2236c.f23101s) && kotlin.jvm.internal.m.a(this.f23102t, c2236c.f23102t) && kotlin.jvm.internal.m.a(this.f23103u, c2236c.f23103u) && kotlin.jvm.internal.m.a(this.f23104v, c2236c.f23104v);
    }

    public final int hashCode() {
        int iA = B2.a.a(this.f23085a.hashCode() * 31, 31, this.f23086b);
        java.lang.String str = this.f23087c;
        int iF = p121o0.p.f(B2.a.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f23088d), 31, this.f23089e);
        java.lang.String str2 = this.f23090f;
        int iHashCode = (this.g.hashCode() + ((iF + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        java.lang.String str3 = this.f23091h;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f23092i;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Integer num = this.j;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f23093k;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.String str5 = this.f23094l;
        int iF2 = p121o0.p.f(p121o0.p.f(p121o0.p.f((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f23095m), 31, this.f23096n), 31, false);
        java.lang.Long l2 = this.f23097o;
        int iHashCode6 = (iF2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        java.lang.Long l9 = this.f23098p;
        int iHashCode7 = (iHashCode6 + (l9 == null ? 0 : l9.hashCode())) * 31;
        java.lang.String str6 = this.f23099q;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f23100r;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.Integer num3 = this.f23101s;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.String str8 = this.f23102t;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.Integer num4 = this.f23103u;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        java.lang.Integer num5 = this.f23104v;
        return iHashCode12 + (num5 != null ? num5.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "VideoPlayerContent(contentId=" + this.f23085a + ", title=" + this.f23086b + ", subtitle=" + this.f23087c + ", streamUrl=" + this.f23088d + ", isLive=" + this.f23089e + ", containerExtension=" + this.f23090f + ", contentType=" + this.g + ", posterUrl=" + this.f23091h + ", seriesId=" + this.f23092i + ", seasonNumber=" + this.j + ", episodeNumber=" + this.f23093k + ", episodeTitle=" + this.f23094l + ", liveHasCatchup=" + this.f23095m + ", isCatchupPlayback=" + this.f23096n + ", isLiveTimeshift=false, catchupStartMillis=" + this.f23097o + ", catchupEndMillis=" + this.f23098p + ", catchupProgramTitle=" + this.f23099q + ", catchupProgramDescription=" + this.f23100r + ", liveStreamId=" + this.f23101s + ", epgChannelId=" + this.f23102t + ", tmdbId=" + this.f23103u + ", tmdbSeriesId=" + this.f23104v + ")";
    }
}
