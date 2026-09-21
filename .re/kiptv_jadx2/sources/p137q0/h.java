package p137q0;

import p113n1.n;
import p121o0.p;

public final class h implements d {

    public final float f26467a;

    public final float f26468b;

    public h(float f9, float f10) {
        this.f26467a = f9;
        this.f26468b = f10;
    }

    @Override
    public final long a(long j, long j9, n nVar) {
        float f9 = (((int) (j9 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f10 = (((int) (j9 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        n nVar2 = n.f25566h;
        float f11 = this.f26467a;
        if (nVar != nVar2) {
            f11 *= -1;
        }
        float f12 = 1;
        float f13 = (f11 + f12) * f9;
        return (((long) Math.round((f12 + this.f26468b) * f10)) & 4294967295L) | (((long) Math.round(f13)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f26467a, hVar.f26467a) == 0 && Float.compare(this.f26468b, hVar.f26468b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26468b) + (Float.hashCode(this.f26467a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f26467a);
        sb.append(", verticalBias=");
        return p.q(sb, this.f26468b, ')');
    }
}
