package D0;

public final class z extends C {

    public final float f1956c;

    public final float f1957d;

    public z(float f9, float f10) {
        super(1);
        this.f1956c = f9;
        this.f1957d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Float.compare(this.f1956c, zVar.f1956c) == 0 && Float.compare(this.f1957d, zVar.f1957d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1957d) + (Float.hashCode(this.f1956c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f1956c);
        sb.append(", dy=");
        return p121o0.p.q(sb, this.f1957d, ')');
    }
}
