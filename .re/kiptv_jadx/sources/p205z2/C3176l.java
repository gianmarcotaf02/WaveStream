package p205z2;

/* JADX INFO: renamed from: z2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3176l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f32269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f32270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f32271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f32272f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f32273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f32274i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f32275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f32276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f32277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f32278n;

    public C3176l(long j, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.f32267a = j;
        this.f32268b = j9;
        this.f32269c = j10;
        this.f32270d = j11;
        this.f32271e = j12;
        this.f32272f = j13;
        this.g = j14;
        this.f32273h = j15;
        this.f32274i = j16;
        this.j = j17;
        this.f32275k = j18;
        this.f32276l = j19;
        this.f32277m = j20;
        this.f32278n = j21;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p205z2.C3176l.class != obj.getClass()) {
            return false;
        }
        p205z2.C3176l c3176l = (p205z2.C3176l) obj;
        return p188x0.C3098s.d(this.f32267a, c3176l.f32267a) && p188x0.C3098s.d(this.f32268b, c3176l.f32268b) && p188x0.C3098s.d(this.f32269c, c3176l.f32269c) && p188x0.C3098s.d(this.f32270d, c3176l.f32270d) && p188x0.C3098s.d(this.f32271e, c3176l.f32271e) && p188x0.C3098s.d(this.f32272f, c3176l.f32272f) && p188x0.C3098s.d(this.g, c3176l.g) && p188x0.C3098s.d(this.f32273h, c3176l.f32273h) && p188x0.C3098s.d(this.f32274i, c3176l.f32274i) && p188x0.C3098s.d(this.j, c3176l.j) && p188x0.C3098s.d(this.f32275k, c3176l.f32275k) && p188x0.C3098s.d(this.f32276l, c3176l.f32276l) && p188x0.C3098s.d(this.f32277m, c3176l.f32277m) && p188x0.C3098s.d(this.f32278n, c3176l.f32278n);
    }

    public final int hashCode() {
        int i3 = p188x0.C3098s.f31128h;
        return java.lang.Long.hashCode(this.f32278n) + p121o0.p.e(p121o0.p.e(p121o0.p.e(p121o0.p.e(p121o0.p.e(p121o0.p.e(p121o0.p.e(p121o0.p.e(p121o0.p.e(p121o0.p.e(p121o0.p.e(p121o0.p.e(java.lang.Long.hashCode(this.f32267a) * 31, 31, this.f32268b), 31, this.f32269c), 31, this.f32270d), 31, this.f32271e), 31, this.f32272f), 31, this.g), 31, this.f32273h), 31, this.f32274i), 31, this.j), 31, this.f32275k), 31, this.f32276l), 31, this.f32277m);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectableSurfaceColors(containerColor=");
        p121o0.p.x(this.f32267a, ", contentColor=", sb);
        p121o0.p.x(this.f32268b, ", focusedContainerColor=", sb);
        p121o0.p.x(this.f32269c, ", focusedContentColor=", sb);
        p121o0.p.x(this.f32270d, ", pressedContainerColor=", sb);
        p121o0.p.x(this.f32271e, ", pressedContentColor=", sb);
        p121o0.p.x(this.f32272f, ", selectedContainerColor=", sb);
        p121o0.p.x(this.g, ", selectedContentColor=", sb);
        p121o0.p.x(this.f32273h, ", disabledContainerColor=", sb);
        p121o0.p.x(this.f32274i, ", disabledContentColor=", sb);
        p121o0.p.x(this.j, ", focusedSelectedContainerColor=", sb);
        p121o0.p.x(this.f32275k, ", focusedSelectedContentColor=", sb);
        p121o0.p.x(this.f32276l, ", pressedSelectedContainerColor=", sb);
        p121o0.p.x(this.f32277m, ", pressedSelectedContentColor=", sb);
        sb.append((java.lang.Object) p188x0.C3098s.j(this.f32278n));
        sb.append(')');
        return sb.toString();
    }
}
