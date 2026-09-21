package p113n1;

import p121o0.p;

public final class d implements c {

    public final float f25548h;

    public final float f25549i;

    public d(float f9, float f10) {
        this.f25548h = f9;
        this.f25549i = f10;
    }

    @Override
    public final float S() {
        return this.f25549i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f25548h, dVar.f25548h) == 0 && Float.compare(this.f25549i, dVar.f25549i) == 0;
    }

    @Override
    public final float getDensity() {
        return this.f25548h;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25549i) + (Float.hashCode(this.f25548h) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f25548h);
        sb.append(", fontScale=");
        return p.q(sb, this.f25549i, ')');
    }
}
