package I;

public final class b implements a {

    public final float f4524a;

    public b(float f9) {
        this.f4524a = f9;
    }

    @Override
    public final float a(long j, p113n1.c cVar) {
        return cVar.Y(this.f4524a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && p113n1.f.c(this.f4524a, ((b) obj).f4524a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f4524a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f4524a + ".dp)";
    }
}
