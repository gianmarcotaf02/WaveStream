package D0;

public final class m extends C {

    public final float f1917c;

    public m(float f9) {
        super(3);
        this.f1917c = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(this.f1917c, ((m) obj).f1917c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1917c);
    }

    public final String toString() {
        return p121o0.p.q(new StringBuilder("HorizontalTo(x="), this.f1917c, ')');
    }
}
