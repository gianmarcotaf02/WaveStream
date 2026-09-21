package P4;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8137e;

    public b(boolean z6, int i3, int i9, long j, boolean z9) {
        this.f8133a = z6;
        this.f8134b = i3;
        this.f8135c = i9;
        this.f8136d = j;
        this.f8137e = z9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P4.b)) {
            return false;
        }
        P4.b bVar = (P4.b) obj;
        return this.f8133a == bVar.f8133a && this.f8134b == bVar.f8134b && this.f8135c == bVar.f8135c && this.f8136d == bVar.f8136d && this.f8137e == bVar.f8137e;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f8137e) + p121o0.p.e(p121o0.p.d(this.f8135c, p121o0.p.d(this.f8134b, java.lang.Boolean.hashCode(this.f8133a) * 31, 31), 31), 31, this.f8136d);
    }

    public final java.lang.String toString() {
        return "Profile(isLowRamFlag=" + this.f8133a + ", memoryClassMb=" + this.f8134b + ", largeMemoryClassMb=" + this.f8135c + ", totalRamBytes=" + this.f8136d + ", isLowMemoryDevice=" + this.f8137e + ")";
    }
}
