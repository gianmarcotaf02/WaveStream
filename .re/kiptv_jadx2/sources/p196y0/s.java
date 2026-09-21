package p196y0;

import p121o0.p;

public final class s {

    public final float f31797a;

    public final float f31798b;

    public s(float f9, float f10) {
        this.f31797a = f9;
        this.f31798b = f10;
    }

    public final float[] a() {
        float f9 = this.f31797a;
        float f10 = this.f31798b;
        return new float[]{f9 / f10, 1.0f, ((1.0f - f9) - f10) / f10};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f31797a, sVar.f31797a) == 0 && Float.compare(this.f31798b, sVar.f31798b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31798b) + (Float.hashCode(this.f31797a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f31797a);
        sb.append(", y=");
        return p.q(sb, this.f31798b, ')');
    }
}
