package x;

/* JADX INFO: renamed from: x.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3039e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30874c;

    public C3039e0(long j, long j9, boolean z6) {
        this.f30872a = j;
        this.f30873b = j9;
        this.f30874c = z6;
    }

    public final x.C3039e0 a(x.C3039e0 c3039e0) {
        return new x.C3039e0(p181w0.a.g(this.f30872a, c3039e0.f30872a), java.lang.Math.max(this.f30873b, c3039e0.f30873b), this.f30874c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x.C3039e0)) {
            return false;
        }
        x.C3039e0 c3039e0 = (x.C3039e0) obj;
        return p181w0.a.b(this.f30872a, c3039e0.f30872a) && this.f30873b == c3039e0.f30873b && this.f30874c == c3039e0.f30874c;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f30874c) + p121o0.p.e(java.lang.Long.hashCode(this.f30872a) * 31, 31, this.f30873b);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((java.lang.Object) p181w0.a.i(this.f30872a));
        sb.append(", timeMillis=");
        sb.append(this.f30873b);
        sb.append(", shouldApplyImmediately=");
        return v5.L.a(sb, this.f30874c, ')');
    }
}
