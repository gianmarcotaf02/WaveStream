package p021c1;

import p121o0.p;
import v5.L;

public final class d {

    public final int f18455a;

    public final int f18456b;

    public final boolean f18457c;

    public d(int i3, int i9, boolean z6) {
        this.f18455a = i3;
        this.f18456b = i9;
        this.f18457c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f18455a == dVar.f18455a && this.f18456b == dVar.f18456b && this.f18457c == dVar.f18457c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18457c) + p.d(this.f18456b, Integer.hashCode(this.f18455a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.f18455a);
        sb.append(", end=");
        sb.append(this.f18456b);
        sb.append(", isRtl=");
        return L.a(sb, this.f18457c, ')');
    }
}
