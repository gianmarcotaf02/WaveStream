package D0;

public final class B extends C {

    public final float f1793c;

    public B(float f9) {
        super(3);
        this.f1793c = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && Float.compare(this.f1793c, ((B) obj).f1793c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1793c);
    }

    public final String toString() {
        return p121o0.p.q(new StringBuilder("VerticalTo(y="), this.f1793c, ')');
    }
}
