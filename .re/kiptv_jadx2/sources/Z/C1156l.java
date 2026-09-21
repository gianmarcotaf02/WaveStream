package Z;

import p188x0.C3098s;

public final class C1156l {

    public final long f12446a;

    public final long f12447b;

    public final long f12448c;

    public final long f12449d;

    public C1156l(long j, long j9, long j10, long j11) {
        this.f12446a = j;
        this.f12447b = j9;
        this.f12448c = j10;
        this.f12449d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1156l)) {
            return false;
        }
        C1156l c1156l = (C1156l) obj;
        return C3098s.d(this.f12446a, c1156l.f12446a) && C3098s.d(this.f12447b, c1156l.f12447b) && C3098s.d(this.f12448c, c1156l.f12448c) && C3098s.d(this.f12449d, c1156l.f12449d);
    }

    public final int hashCode() {
        int i3 = C3098s.f31128h;
        return Long.hashCode(this.f12449d) + p121o0.p.e(p121o0.p.e(Long.hashCode(this.f12446a) * 31, 31, this.f12447b), 31, this.f12448c);
    }
}
