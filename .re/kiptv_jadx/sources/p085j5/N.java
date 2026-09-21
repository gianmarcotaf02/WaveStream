package p085j5;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24031d;

    public N(int i3, int i9, int i10, int i11) {
        this.f24028a = i3;
        this.f24029b = i9;
        this.f24030c = i10;
        this.f24031d = i11;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p085j5.N)) {
            return false;
        }
        p085j5.N n3 = (p085j5.N) obj;
        return this.f24028a == n3.f24028a && this.f24029b == n3.f24029b && this.f24030c == n3.f24030c && this.f24031d == n3.f24031d;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f24031d) + p121o0.p.d(this.f24030c, p121o0.p.d(this.f24029b, java.lang.Integer.hashCode(this.f24028a) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExoDurations(minMs=");
        sb.append(this.f24028a);
        sb.append(", maxMs=");
        sb.append(this.f24029b);
        sb.append(", forPlaybackMs=");
        sb.append(this.f24030c);
        sb.append(", afterRebufferMs=");
        return Y6.f.k(sb, this.f24031d, ")");
    }
}
