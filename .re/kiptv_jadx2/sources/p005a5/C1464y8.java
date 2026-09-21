package p005a5;

import Y6.f;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class C1464y8 {

    public final String f15380a;

    public final String f15381b;

    public final int f15382c;

    public final int f15383d;

    public final Integer f15384e;

    public final String f15385f;

    public C1464y8(int i3, int i9, Integer num, String contentId, String str, String str2) {
        m.e(contentId, "contentId");
        this.f15380a = contentId;
        this.f15381b = str;
        this.f15382c = i3;
        this.f15383d = i9;
        this.f15384e = num;
        this.f15385f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1464y8)) {
            return false;
        }
        C1464y8 c1464y8 = (C1464y8) obj;
        return m.a(this.f15380a, c1464y8.f15380a) && m.a(this.f15381b, c1464y8.f15381b) && this.f15382c == c1464y8.f15382c && this.f15383d == c1464y8.f15383d && m.a(this.f15384e, c1464y8.f15384e) && m.a(this.f15385f, c1464y8.f15385f);
    }

    public final int hashCode() {
        int iHashCode = this.f15380a.hashCode() * 31;
        String str = this.f15381b;
        int iD = p.d(this.f15383d, p.d(this.f15382c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Integer num = this.f15384e;
        int iHashCode2 = (iD + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f15385f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchEpisode(contentId=");
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
        return f.m(sb, this.f15385f, ")");
    }
}
