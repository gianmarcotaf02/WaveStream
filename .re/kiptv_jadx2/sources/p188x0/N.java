package p188x0;

import p121o0.p;
import p181w0.a;

public final class N {

    public static final N f31076d = new N(z.d(4278190080L), 0, 0.0f);

    public final long f31077a;

    public final long f31078b;

    public final float f31079c;

    public N(long j, long j9, float f9) {
        this.f31077a = j;
        this.f31078b = j9;
        this.f31079c = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n3 = (N) obj;
        return C3098s.d(this.f31077a, n3.f31077a) && a.b(this.f31078b, n3.f31078b) && this.f31079c == n3.f31079c;
    }

    public final int hashCode() {
        int i3 = C3098s.f31128h;
        return Float.hashCode(this.f31079c) + p.e(Long.hashCode(this.f31077a) * 31, 31, this.f31078b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        p.x(this.f31077a, ", offset=", sb);
        sb.append((Object) a.i(this.f31078b));
        sb.append(", blurRadius=");
        return p.q(sb, this.f31079c, ')');
    }
}
