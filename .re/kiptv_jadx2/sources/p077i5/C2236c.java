package p077i5;

import B2.a;
import com.kiptv.core.model.z0;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class C2236c {

    public final String f23085a;

    public final String f23086b;

    public final String f23087c;

    public final String f23088d;

    public final boolean f23089e;

    public final String f23090f;
    public final z0 g;

    public final String f23091h;

    public final String f23092i;
    public final Integer j;

    public final Integer f23093k;

    public final String f23094l;

    public final boolean f23095m;

    public final boolean f23096n;

    public final Long f23097o;

    public final Long f23098p;

    public final String f23099q;

    public final String f23100r;

    public final Integer f23101s;

    public final String f23102t;

    public final Integer f23103u;

    public final Integer f23104v;

    public C2236c(String contentId, String title, String str, String streamUrl, boolean z6, String str2, z0 z0Var, String str3, String str4, Integer num, Integer num2, String str5, boolean z9, boolean z10, Long l2, Long l9, String str6, String str7, Integer num3, String str8, Integer num4, Integer num5, int i3) {
        String str9 = (i3 & 4) != 0 ? null : str;
        String str10 = (i3 & 256) != 0 ? null : str4;
        Integer num6 = (i3 & 512) != 0 ? null : num;
        Integer num7 = (i3 & 1024) != 0 ? null : num2;
        String str11 = (i3 & 2048) != 0 ? null : str5;
        boolean z11 = (i3 & 4096) != 0 ? false : z9;
        boolean z12 = (i3 & 8192) == 0 ? z10 : false;
        Long l10 = (32768 & i3) != 0 ? null : l2;
        Long l11 = (65536 & i3) != 0 ? null : l9;
        String str12 = (131072 & i3) != 0 ? null : str6;
        String str13 = (i3 & 262144) != 0 ? null : str7;
        Integer num8 = (i3 & 524288) != 0 ? null : num3;
        String str14 = (i3 & 1048576) != 0 ? null : str8;
        Integer num9 = (i3 & 2097152) != 0 ? null : num4;
        Integer num10 = (i3 & 4194304) != 0 ? null : num5;
        Integer num11 = num8;
        m.e(contentId, "contentId");
        m.e(title, "title");
        m.e(streamUrl, "streamUrl");
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2236c)) {
            return false;
        }
        C2236c c2236c = (C2236c) obj;
        return m.a(this.f23085a, c2236c.f23085a) && m.a(this.f23086b, c2236c.f23086b) && m.a(this.f23087c, c2236c.f23087c) && m.a(this.f23088d, c2236c.f23088d) && this.f23089e == c2236c.f23089e && m.a(this.f23090f, c2236c.f23090f) && this.g == c2236c.g && m.a(this.f23091h, c2236c.f23091h) && m.a(this.f23092i, c2236c.f23092i) && m.a(this.j, c2236c.j) && m.a(this.f23093k, c2236c.f23093k) && m.a(this.f23094l, c2236c.f23094l) && this.f23095m == c2236c.f23095m && this.f23096n == c2236c.f23096n && m.a(this.f23097o, c2236c.f23097o) && m.a(this.f23098p, c2236c.f23098p) && m.a(this.f23099q, c2236c.f23099q) && m.a(this.f23100r, c2236c.f23100r) && m.a(this.f23101s, c2236c.f23101s) && m.a(this.f23102t, c2236c.f23102t) && m.a(this.f23103u, c2236c.f23103u) && m.a(this.f23104v, c2236c.f23104v);
    }

    public final int hashCode() {
        int iA = a.a(this.f23085a.hashCode() * 31, 31, this.f23086b);
        String str = this.f23087c;
        int iF = p.f(a.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f23088d), 31, this.f23089e);
        String str2 = this.f23090f;
        int iHashCode = (this.g.hashCode() + ((iF + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f23091h;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f23092i;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.j;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f23093k;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.f23094l;
        int iF2 = p.f(p.f(p.f((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f23095m), 31, this.f23096n), 31, false);
        Long l2 = this.f23097o;
        int iHashCode6 = (iF2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l9 = this.f23098p;
        int iHashCode7 = (iHashCode6 + (l9 == null ? 0 : l9.hashCode())) * 31;
        String str6 = this.f23099q;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f23100r;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num3 = this.f23101s;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str8 = this.f23102t;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num4 = this.f23103u;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f23104v;
        return iHashCode12 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        return "VideoPlayerContent(contentId=" + this.f23085a + ", title=" + this.f23086b + ", subtitle=" + this.f23087c + ", streamUrl=" + this.f23088d + ", isLive=" + this.f23089e + ", containerExtension=" + this.f23090f + ", contentType=" + this.g + ", posterUrl=" + this.f23091h + ", seriesId=" + this.f23092i + ", seasonNumber=" + this.j + ", episodeNumber=" + this.f23093k + ", episodeTitle=" + this.f23094l + ", liveHasCatchup=" + this.f23095m + ", isCatchupPlayback=" + this.f23096n + ", isLiveTimeshift=false, catchupStartMillis=" + this.f23097o + ", catchupEndMillis=" + this.f23098p + ", catchupProgramTitle=" + this.f23099q + ", catchupProgramDescription=" + this.f23100r + ", liveStreamId=" + this.f23101s + ", epgChannelId=" + this.f23102t + ", tmdbId=" + this.f23103u + ", tmdbSeriesId=" + this.f23104v + ")";
    }
}
