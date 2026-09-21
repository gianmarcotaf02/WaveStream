package D0;

public final class r extends C {

    public final float f1930c;

    public final float f1931d;

    public r(float f9, float f10) {
        super(1);
        this.f1930c = f9;
        this.f1931d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f1930c, rVar.f1930c) == 0 && Float.compare(this.f1931d, rVar.f1931d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1931d) + (Float.hashCode(this.f1930c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f1930c);
        sb.append(", y=");
        return p121o0.p.q(sb, this.f1931d, ')');
    }
}
