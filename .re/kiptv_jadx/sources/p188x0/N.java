package p188x0;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p188x0.N f31076d = new p188x0.N(p188x0.z.d(4278190080L), 0, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f31079c;

    public N(long j, long j9, float f9) {
        this.f31077a = j;
        this.f31078b = j9;
        this.f31079c = f9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p188x0.N)) {
            return false;
        }
        p188x0.N n3 = (p188x0.N) obj;
        return p188x0.C3098s.d(this.f31077a, n3.f31077a) && p181w0.a.b(this.f31078b, n3.f31078b) && this.f31079c == n3.f31079c;
    }

    public final int hashCode() {
        int i3 = p188x0.C3098s.f31128h;
        return java.lang.Float.hashCode(this.f31079c) + p121o0.p.e(java.lang.Long.hashCode(this.f31077a) * 31, 31, this.f31078b);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Shadow(color=");
        p121o0.p.x(this.f31077a, ", offset=", sb);
        sb.append((java.lang.Object) p181w0.a.i(this.f31078b));
        sb.append(", blurRadius=");
        return p121o0.p.q(sb, this.f31079c, ')');
    }
}
