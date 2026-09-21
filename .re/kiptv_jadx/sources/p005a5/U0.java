package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f13958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13959b;

    public U0(java.util.List results, long j) {
        kotlin.jvm.internal.m.e(results, "results");
        this.f13958a = results;
        this.f13959b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.U0)) {
            return false;
        }
        p005a5.U0 u1 = (p005a5.U0) obj;
        return kotlin.jvm.internal.m.a(this.f13958a, u1.f13958a) && this.f13959b == u1.f13959b;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f13959b) + (this.f13958a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "SearchCacheEntry(results=" + this.f13958a + ", timestampMs=" + this.f13959b + ")";
    }
}
