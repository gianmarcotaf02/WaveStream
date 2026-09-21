package Z4;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f12988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12989b;

    public b(java.lang.String productId, long j) {
        kotlin.jvm.internal.m.e(productId, "productId");
        this.f12988a = productId;
        this.f12989b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z4.b)) {
            return false;
        }
        Z4.b bVar = (Z4.b) obj;
        return kotlin.jvm.internal.m.a(this.f12988a, bVar.f12988a) && this.f12989b == bVar.f12989b;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f12989b) + (this.f12988a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "PlanPricing(productId=" + this.f12988a + ", priceMicros=" + this.f12989b + ")";
    }
}
