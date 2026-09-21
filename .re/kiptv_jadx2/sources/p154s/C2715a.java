package p154s;

import p121o0.p;

public final class C2715a {

    public final float f27107a;

    public final float f27108b;

    public C2715a(float f9, float f10) {
        this.f27107a = f9;
        this.f27108b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2715a)) {
            return false;
        }
        C2715a c2715a = (C2715a) obj;
        return Float.compare(this.f27107a, c2715a.f27107a) == 0 && Float.compare(this.f27108b, c2715a.f27108b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27108b) + (Float.hashCode(this.f27107a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f27107a);
        sb.append(", velocityCoefficient=");
        return p.q(sb, this.f27108b, ')');
    }
}
