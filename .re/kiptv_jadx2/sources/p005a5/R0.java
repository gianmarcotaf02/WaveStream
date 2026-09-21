package p005a5;

import B2.a;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class R0 {

    public final Integer f13836a;

    public final String f13837b;

    public final boolean f13838c;

    public final Integer f13839d;

    public final Integer f13840e;

    public R0(Integer num, String title, boolean z6, Integer num2, Integer num3) {
        m.e(title, "title");
        this.f13836a = num;
        this.f13837b = title;
        this.f13838c = z6;
        this.f13839d = num2;
        this.f13840e = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R0)) {
            return false;
        }
        R0 r9 = (R0) obj;
        return m.a(this.f13836a, r9.f13836a) && m.a(this.f13837b, r9.f13837b) && this.f13838c == r9.f13838c && m.a(this.f13839d, r9.f13839d) && m.a(this.f13840e, r9.f13840e);
    }

    public final int hashCode() {
        Integer num = this.f13836a;
        int iF = p.f(a.a((num == null ? 0 : num.hashCode()) * 31, 31, this.f13837b), 31, this.f13838c);
        Integer num2 = this.f13839d;
        int iHashCode = (iF + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f13840e;
        return iHashCode + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "OpenSubtitlesQuery(tmdbId=" + this.f13836a + ", title=" + this.f13837b + ", isEpisode=" + this.f13838c + ", seasonNumber=" + this.f13839d + ", episodeNumber=" + this.f13840e + ")";
    }
}
