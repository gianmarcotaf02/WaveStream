package I;

public final class d implements a {

    public final float f4525a;

    public d(float f9) {
        this.f4525a = f9;
        if (f9 < 0.0f || f9 > 100.0f) {
            A.b.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override
    public final float a(long j, p113n1.c cVar) {
        return (this.f4525a / 100.0f) * p181w0.d.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(this.f4525a, ((d) obj).f4525a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4525a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f4525a + "%)";
    }
}
