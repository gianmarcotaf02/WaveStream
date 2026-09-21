package p085j5;

import Y6.f;
import p121o0.p;

public final class N {

    public final int f24028a;

    public final int f24029b;

    public final int f24030c;

    public final int f24031d;

    public N(int i3, int i9, int i10, int i11) {
        this.f24028a = i3;
        this.f24029b = i9;
        this.f24030c = i10;
        this.f24031d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n3 = (N) obj;
        return this.f24028a == n3.f24028a && this.f24029b == n3.f24029b && this.f24030c == n3.f24030c && this.f24031d == n3.f24031d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24031d) + p.d(this.f24030c, p.d(this.f24029b, Integer.hashCode(this.f24028a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExoDurations(minMs=");
        sb.append(this.f24028a);
        sb.append(", maxMs=");
        sb.append(this.f24029b);
        sb.append(", forPlaybackMs=");
        sb.append(this.f24030c);
        sb.append(", afterRebufferMs=");
        return f.k(sb, this.f24031d, ")");
    }
}
