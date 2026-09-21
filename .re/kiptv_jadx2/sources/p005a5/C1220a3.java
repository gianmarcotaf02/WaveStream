package p005a5;

import com.kiptv.core.model.XtreamLiveStream;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class C1220a3 {

    public final XtreamLiveStream f14201a;

    public final double f14202b;

    public final int f14203c;

    public final boolean f14204d;

    public C1220a3(XtreamLiveStream xtreamLiveStream, double d4, int i3, boolean z6) {
        this.f14201a = xtreamLiveStream;
        this.f14202b = d4;
        this.f14203c = i3;
        this.f14204d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1220a3)) {
            return false;
        }
        C1220a3 c1220a3 = (C1220a3) obj;
        return m.a(this.f14201a, c1220a3.f14201a) && Double.compare(this.f14202b, c1220a3.f14202b) == 0 && this.f14203c == c1220a3.f14203c && this.f14204d == c1220a3.f14204d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14204d) + p.d(this.f14203c, (Double.hashCode(this.f14202b) + (this.f14201a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ScoredChannel(channel=" + this.f14201a + ", score=" + this.f14202b + ", quality=" + this.f14203c + ", isAdult=" + this.f14204d + ")";
    }
}
