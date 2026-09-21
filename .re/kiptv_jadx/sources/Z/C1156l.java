package Z;

/* JADX INFO: renamed from: Z.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1156l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12449d;

    public C1156l(long j, long j9, long j10, long j11) {
        this.f12446a = j;
        this.f12447b = j9;
        this.f12448c = j10;
        this.f12449d = j11;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Z.C1156l)) {
            return false;
        }
        Z.C1156l c1156l = (Z.C1156l) obj;
        return p188x0.C3098s.d(this.f12446a, c1156l.f12446a) && p188x0.C3098s.d(this.f12447b, c1156l.f12447b) && p188x0.C3098s.d(this.f12448c, c1156l.f12448c) && p188x0.C3098s.d(this.f12449d, c1156l.f12449d);
    }

    public final int hashCode() {
        int i3 = p188x0.C3098s.f31128h;
        return java.lang.Long.hashCode(this.f12449d) + p121o0.p.e(p121o0.p.e(java.lang.Long.hashCode(this.f12446a) * 31, 31, this.f12447b), 31, this.f12448c);
    }
}
