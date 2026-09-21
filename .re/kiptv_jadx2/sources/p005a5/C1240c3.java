package p005a5;

import com.kiptv.core.model.XtreamSeries;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class C1240c3 {

    public final XtreamSeries f14290a;

    public final double f14291b;

    public final int f14292c;

    public final boolean f14293d;

    public C1240c3(XtreamSeries xtreamSeries, double d4, int i3, boolean z6) {
        this.f14290a = xtreamSeries;
        this.f14291b = d4;
        this.f14292c = i3;
        this.f14293d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1240c3)) {
            return false;
        }
        C1240c3 c1240c3 = (C1240c3) obj;
        return m.a(this.f14290a, c1240c3.f14290a) && Double.compare(this.f14291b, c1240c3.f14291b) == 0 && this.f14292c == c1240c3.f14292c && this.f14293d == c1240c3.f14293d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14293d) + p.d(this.f14292c, (Double.hashCode(this.f14291b) + (this.f14290a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ScoredSeries(series=" + this.f14290a + ", score=" + this.f14291b + ", quality=" + this.f14292c + ", isAdult=" + this.f14293d + ")";
    }
}
