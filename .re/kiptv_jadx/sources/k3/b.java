package k3;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Set f24442c;

    public b(long j, long j9, java.util.Set set) {
        this.f24440a = j;
        this.f24441b = j9;
        this.f24442c = set;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k3.b) {
            k3.b bVar = (k3.b) obj;
            if (this.f24440a == bVar.f24440a && this.f24441b == bVar.f24441b && this.f24442c.equals(bVar.f24442c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f24440a;
        int i3 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j9 = this.f24441b;
        return ((i3 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f24442c.hashCode();
    }

    public final java.lang.String toString() {
        return "ConfigValue{delta=" + this.f24440a + ", maxAllowedDelay=" + this.f24441b + ", flags=" + this.f24442c + "}";
    }
}
