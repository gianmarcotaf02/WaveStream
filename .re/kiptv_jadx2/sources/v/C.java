package v;

public final class C {

    public final float f28803a;

    public final p188x0.S f28804b;

    public C(float f9, p188x0.S s9) {
        this.f28803a = f9;
        this.f28804b = s9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c9 = (C) obj;
        return p113n1.f.c(this.f28803a, c9.f28803a) && this.f28804b.equals(c9.f28804b);
    }

    public final int hashCode() {
        return this.f28804b.hashCode() + (Float.hashCode(this.f28803a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) p113n1.f.d(this.f28803a)) + ", brush=" + this.f28804b + ')';
    }
}
