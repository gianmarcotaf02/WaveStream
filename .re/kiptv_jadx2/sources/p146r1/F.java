package p146r1;

import p020c0.C;
import p121o0.p;

public final class F {

    public final int f26715a;

    public final boolean f26716b;

    public final boolean f26717c;

    public final boolean f26718d;

    public final boolean f26719e;

    public F(int i3) {
        this((i3 & 1) == 0, G.f26720h, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f9 = (F) obj;
        return this.f26715a == f9.f26715a && this.f26716b == f9.f26716b && this.f26717c == f9.f26717c && this.f26718d == f9.f26718d && this.f26719e == f9.f26719e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + p.f(p.f(p.f(p.f(this.f26715a * 31, 31, this.f26716b), 31, this.f26717c), 31, this.f26718d), 31, this.f26719e);
    }

    public F(boolean z6, G g, boolean z9) {
        C c9 = p.f26768a;
        int i3 = !z6 ? 262152 : 262144;
        i3 = g == G.f26721i ? i3 | 8192 : i3;
        i3 = z9 ? i3 : i3 | 512;
        boolean z10 = g == G.f26720h;
        this.f26715a = i3;
        this.f26716b = z10;
        this.f26717c = true;
        this.f26718d = true;
        this.f26719e = true;
    }
}
