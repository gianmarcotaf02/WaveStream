package D0;

public final class u extends C {

    public final float f1943c;

    public u(float f9) {
        super(3);
        this.f1943c = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Float.compare(this.f1943c, ((u) obj).f1943c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1943c);
    }

    public final String toString() {
        return p121o0.p.q(new StringBuilder("RelativeHorizontalTo(dx="), this.f1943c, ')');
    }
}
