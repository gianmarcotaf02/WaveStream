package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class o9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.I0 f14902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14903b;

    public o9(com.kiptv.core.model.I0 i3, long j) {
        this.f14902a = i3;
        this.f14903b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.o9)) {
            return false;
        }
        p005a5.o9 o9Var = (p005a5.o9) obj;
        return this.f14902a.equals(o9Var.f14902a) && this.f14903b == o9Var.f14903b;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f14903b) + (this.f14902a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CacheEntry(data=");
        sb.append(this.f14902a);
        sb.append(", timestamp=");
        return Y6.f.g(this.f14903b, ")", sb);
    }
}
