package p005a5;

import com.kiptv.core.model.TMDBSearchResult;
import com.kiptv.core.model.XtreamSeries;
import com.kiptv.core.model.XtreamVODStream;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class Q {

    public final TMDBSearchResult f13796a;

    public final boolean f13797b;

    public final XtreamVODStream f13798c;

    public final XtreamSeries f13799d;

    public final String f13800e;

    public Q(TMDBSearchResult tMDBSearchResult, boolean z6, XtreamVODStream xtreamVODStream, XtreamSeries xtreamSeries, int i3) {
        xtreamVODStream = (i3 & 4) != 0 ? null : xtreamVODStream;
        xtreamSeries = (i3 & 8) != 0 ? null : xtreamSeries;
        this.f13796a = tMDBSearchResult;
        this.f13797b = z6;
        this.f13798c = xtreamVODStream;
        this.f13799d = xtreamSeries;
        StringBuilder sbV = p.v(z6 ? "movie-" : "tv-");
        sbV.append(tMDBSearchResult.f20292a);
        this.f13800e = sbV.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q9 = (Q) obj;
        return this.f13796a.equals(q9.f13796a) && this.f13797b == q9.f13797b && m.a(this.f13798c, q9.f13798c) && m.a(this.f13799d, q9.f13799d);
    }

    public final int hashCode() {
        int iF = p.f(this.f13796a.hashCode() * 31, 31, this.f13797b);
        XtreamVODStream xtreamVODStream = this.f13798c;
        int iHashCode = (iF + (xtreamVODStream == null ? 0 : xtreamVODStream.hashCode())) * 31;
        XtreamSeries xtreamSeries = this.f13799d;
        return iHashCode + (xtreamSeries != null ? xtreamSeries.hashCode() : 0);
    }

    public final String toString() {
        return "FeedItem(result=" + this.f13796a + ", isMovie=" + this.f13797b + ", matchedMovie=" + this.f13798c + ", matchedSeries=" + this.f13799d + ")";
    }
}
