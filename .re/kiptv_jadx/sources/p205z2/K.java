package p205z2;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f32189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f32190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f32191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f32192f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f32193h;

    public K(long j, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f32187a = j;
        this.f32188b = j9;
        this.f32189c = j10;
        this.f32190d = j11;
        this.f32191e = j12;
        this.f32192f = j13;
        this.g = j14;
        this.f32193h = j15;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p205z2.K)) {
            return false;
        }
        p205z2.K k9 = (p205z2.K) obj;
        return p188x0.C3098s.d(this.f32187a, k9.f32187a) && p188x0.C3098s.d(this.f32188b, k9.f32188b) && p188x0.C3098s.d(this.f32189c, k9.f32189c) && p188x0.C3098s.d(this.f32190d, k9.f32190d) && p188x0.C3098s.d(this.f32191e, k9.f32191e) && p188x0.C3098s.d(this.f32192f, k9.f32192f) && p188x0.C3098s.d(this.g, k9.g) && p188x0.C3098s.d(this.f32193h, k9.f32193h);
    }

    public final int hashCode() {
        int i3 = p188x0.C3098s.f31128h;
        return java.lang.Long.hashCode(this.f32193h) + p121o0.p.e(p121o0.p.e(p121o0.p.e(p121o0.p.e(p121o0.p.e(p121o0.p.e(java.lang.Long.hashCode(this.f32187a) * 31, 31, this.f32188b), 31, this.f32189c), 31, this.f32190d), 31, this.f32191e), 31, this.f32192f), 31, this.g);
    }
}
