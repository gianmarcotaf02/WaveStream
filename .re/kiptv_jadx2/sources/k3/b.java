package k3;

import java.util.Set;

public final class b {

    public final long f24440a;

    public final long f24441b;

    public final Set f24442c;

    public b(long j, long j9, Set set) {
        this.f24440a = j;
        this.f24441b = j9;
        this.f24442c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
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

    public final String toString() {
        return "ConfigValue{delta=" + this.f24440a + ", maxAllowedDelay=" + this.f24441b + ", flags=" + this.f24442c + "}";
    }
}
