package p005a5;

import com.kiptv.core.model.XtreamVODStream;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class C1230b3 {

    public final XtreamVODStream f14242a;

    public final double f14243b;

    public final int f14244c;

    public final boolean f14245d;

    public C1230b3(XtreamVODStream xtreamVODStream, double d4, int i3, boolean z6) {
        this.f14242a = xtreamVODStream;
        this.f14243b = d4;
        this.f14244c = i3;
        this.f14245d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1230b3)) {
            return false;
        }
        C1230b3 c1230b3 = (C1230b3) obj;
        return m.a(this.f14242a, c1230b3.f14242a) && Double.compare(this.f14243b, c1230b3.f14243b) == 0 && this.f14244c == c1230b3.f14244c && this.f14245d == c1230b3.f14245d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14245d) + p.d(this.f14244c, (Double.hashCode(this.f14243b) + (this.f14242a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ScoredMovie(movie=" + this.f14242a + ", score=" + this.f14243b + ", quality=" + this.f14244c + ", isAdult=" + this.f14245d + ")";
    }
}
