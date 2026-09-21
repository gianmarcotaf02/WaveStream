package p005a5;

import kotlin.jvm.internal.m;
import p121o0.p;

public final class C1250d3 {

    public final Object f14349a;

    public final int f14350b;

    public final Integer f14351c;

    public C1250d3(Object obj, int i3, Integer num) {
        this.f14349a = obj;
        this.f14350b = i3;
        this.f14351c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1250d3)) {
            return false;
        }
        C1250d3 c1250d3 = (C1250d3) obj;
        return m.a(this.f14349a, c1250d3.f14349a) && this.f14350b == c1250d3.f14350b && m.a(this.f14351c, c1250d3.f14351c);
    }

    public final int hashCode() {
        Object obj = this.f14349a;
        int iD = p.d(this.f14350b, (obj == null ? 0 : obj.hashCode()) * 31, 31);
        Integer num = this.f14351c;
        return iD + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "VodHit(item=" + this.f14349a + ", variantCount=" + this.f14350b + ", tmdbId=" + this.f14351c + ")";
    }
}
