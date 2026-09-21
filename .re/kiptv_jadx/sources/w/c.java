package w;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f29717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f29718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f29719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f29720e;

    public c(long j, long j9, long j10, long j11, long j12) {
        this.f29716a = j;
        this.f29717b = j9;
        this.f29718c = j10;
        this.f29719d = j11;
        this.f29720e = j12;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w.c)) {
            return false;
        }
        w.c cVar = (w.c) obj;
        return p188x0.C3098s.d(this.f29716a, cVar.f29716a) && p188x0.C3098s.d(this.f29717b, cVar.f29717b) && p188x0.C3098s.d(this.f29718c, cVar.f29718c) && p188x0.C3098s.d(this.f29719d, cVar.f29719d) && p188x0.C3098s.d(this.f29720e, cVar.f29720e);
    }

    public final int hashCode() {
        int i3 = p188x0.C3098s.f31128h;
        return java.lang.Long.hashCode(this.f29720e) + p121o0.p.e(p121o0.p.e(p121o0.p.e(java.lang.Long.hashCode(this.f29716a) * 31, 31, this.f29717b), 31, this.f29718c), 31, this.f29719d);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContextMenuColors(backgroundColor=");
        p121o0.p.x(this.f29716a, ", textColor=", sb);
        p121o0.p.x(this.f29717b, ", iconColor=", sb);
        p121o0.p.x(this.f29718c, ", disabledTextColor=", sb);
        p121o0.p.x(this.f29719d, ", disabledIconColor=", sb);
        sb.append((java.lang.Object) p188x0.C3098s.j(this.f29720e));
        sb.append(')');
        return sb.toString();
    }
}
