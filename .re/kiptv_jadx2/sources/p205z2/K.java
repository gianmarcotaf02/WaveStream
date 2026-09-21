package p205z2;

import p121o0.p;
import p188x0.C3098s;

public final class K {

    public final long f32187a;

    public final long f32188b;

    public final long f32189c;

    public final long f32190d;

    public final long f32191e;

    public final long f32192f;
    public final long g;

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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof K)) {
            return false;
        }
        K k9 = (K) obj;
        return C3098s.d(this.f32187a, k9.f32187a) && C3098s.d(this.f32188b, k9.f32188b) && C3098s.d(this.f32189c, k9.f32189c) && C3098s.d(this.f32190d, k9.f32190d) && C3098s.d(this.f32191e, k9.f32191e) && C3098s.d(this.f32192f, k9.f32192f) && C3098s.d(this.g, k9.g) && C3098s.d(this.f32193h, k9.f32193h);
    }

    public final int hashCode() {
        int i3 = C3098s.f31128h;
        return Long.hashCode(this.f32193h) + p.e(p.e(p.e(p.e(p.e(p.e(Long.hashCode(this.f32187a) * 31, 31, this.f32188b), 31, this.f32189c), 31, this.f32190d), 31, this.f32191e), 31, this.f32192f), 31, this.g);
    }
}
