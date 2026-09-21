package Z4;

import kotlin.jvm.internal.m;

public final class b {

    public final String f12988a;

    public final long f12989b;

    public b(String productId, long j) {
        m.e(productId, "productId");
        this.f12988a = productId;
        this.f12989b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f12988a, bVar.f12988a) && this.f12989b == bVar.f12989b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12989b) + (this.f12988a.hashCode() * 31);
    }

    public final String toString() {
        return "PlanPricing(productId=" + this.f12988a + ", priceMicros=" + this.f12989b + ")";
    }
}
