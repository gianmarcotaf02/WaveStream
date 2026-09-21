package p104m1;

public final class a {

    public final float f25156a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f25156a, ((a) obj).f25156a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25156a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f25156a + ')';
    }
}
