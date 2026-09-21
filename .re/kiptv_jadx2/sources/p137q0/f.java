package p137q0;

import p113n1.n;
import p121o0.p;

public final class f {

    public final float f26465a;

    public f(float f9) {
        this.f26465a = f9;
    }

    public final int a(int i3, int i9, n nVar) {
        float f9 = (i9 - i3) / 2.0f;
        n nVar2 = n.f25566h;
        float f10 = this.f26465a;
        if (nVar != nVar2) {
            f10 *= -1;
        }
        return Math.round((1 + f10) * f9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f26465a, ((f) obj).f26465a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26465a);
    }

    public final String toString() {
        return p.q(new StringBuilder("Horizontal(bias="), this.f26465a, ')');
    }
}
