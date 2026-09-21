package P4;

import p121o0.p;

public final class b {

    public final boolean f8133a;

    public final int f8134b;

    public final int f8135c;

    public final long f8136d;

    public final boolean f8137e;

    public b(boolean z6, int i3, int i9, long j, boolean z9) {
        this.f8133a = z6;
        this.f8134b = i3;
        this.f8135c = i9;
        this.f8136d = j;
        this.f8137e = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8133a == bVar.f8133a && this.f8134b == bVar.f8134b && this.f8135c == bVar.f8135c && this.f8136d == bVar.f8136d && this.f8137e == bVar.f8137e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8137e) + p.e(p.d(this.f8135c, p.d(this.f8134b, Boolean.hashCode(this.f8133a) * 31, 31), 31), 31, this.f8136d);
    }

    public final String toString() {
        return "Profile(isLowRamFlag=" + this.f8133a + ", memoryClassMb=" + this.f8134b + ", largeMemoryClassMb=" + this.f8135c + ", totalRamBytes=" + this.f8136d + ", isLowMemoryDevice=" + this.f8137e + ")";
    }
}
