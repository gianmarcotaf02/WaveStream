package D0;

public final class A extends C {

    public final float f1792c;

    public A(float f9) {
        super(3);
        this.f1792c = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && Float.compare(this.f1792c, ((A) obj).f1792c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1792c);
    }

    public final String toString() {
        return p121o0.p.q(new StringBuilder("RelativeVerticalTo(dy="), this.f1792c, ')');
    }
}
