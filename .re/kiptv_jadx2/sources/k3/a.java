package k3;

import java.util.HashMap;

public final class a {

    public final V1.b f24438a;

    public final HashMap f24439b;

    public a(V1.b bVar, HashMap map) {
        this.f24438a = bVar;
        this.f24439b = map;
    }

    public final long a(p013b3.c cVar, long j, int i3) {
        long jG = j - this.f24438a.g();
        b bVar = (b) this.f24439b.get(cVar);
        long j9 = bVar.f24440a;
        int i9 = i3 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i9) * j9 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j9 > 1 ? j9 : 2L) * ((long) i9)))), jG), bVar.f24441b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f24438a.equals(aVar.f24438a) && this.f24439b.equals(aVar.f24439b);
    }

    public final int hashCode() {
        return ((this.f24438a.hashCode() ^ 1000003) * 1000003) ^ this.f24439b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f24438a + ", values=" + this.f24439b + "}";
    }
}
