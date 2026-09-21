package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.C1949j f13495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13496b;

    public I(com.kiptv.core.model.C1949j data, long j) {
        kotlin.jvm.internal.m.e(data, "data");
        this.f13495a = data;
        this.f13496b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.I)) {
            return false;
        }
        p005a5.I i3 = (p005a5.I) obj;
        return kotlin.jvm.internal.m.a(this.f13495a, i3.f13495a) && this.f13496b == i3.f13496b;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f13496b) + (this.f13495a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "CacheEntry(data=" + this.f13495a + ", cachedAtMillis=" + this.f13496b + ")";
    }
}
