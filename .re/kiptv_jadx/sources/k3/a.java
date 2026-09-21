package k3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V1.b f24438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f24439b;

    public a(V1.b bVar, java.util.HashMap map) {
        this.f24438a = bVar;
        this.f24439b = map;
    }

    public final long a(p013b3.c cVar, long j, int i3) {
        long jG = j - this.f24438a.g();
        k3.b bVar = (k3.b) this.f24439b.get(cVar);
        long j9 = bVar.f24440a;
        int i9 = i3 - 1;
        return java.lang.Math.min(java.lang.Math.max((long) (java.lang.Math.pow(3.0d, i9) * j9 * java.lang.Math.max(1.0d, java.lang.Math.log(10000.0d) / java.lang.Math.log((j9 > 1 ? j9 : 2L) * ((long) i9)))), jG), bVar.f24441b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k3.a)) {
            return false;
        }
        k3.a aVar = (k3.a) obj;
        return this.f24438a.equals(aVar.f24438a) && this.f24439b.equals(aVar.f24439b);
    }

    public final int hashCode() {
        return ((this.f24438a.hashCode() ^ 1000003) * 1000003) ^ this.f24439b.hashCode();
    }

    public final java.lang.String toString() {
        return "SchedulerConfig{clock=" + this.f24438a + ", values=" + this.f24439b + "}";
    }
}
