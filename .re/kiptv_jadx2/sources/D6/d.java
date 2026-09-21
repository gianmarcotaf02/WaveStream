package D6;

public final class d {

    public final float f2456a;

    public final float f2457b;

    public d(float f9, float f10) {
        this.f2456a = f9;
        this.f2457b = f10;
    }

    public static boolean d(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final Comparable a() {
        return Float.valueOf(this.f2457b);
    }

    public final Comparable b() {
        return Float.valueOf(this.f2456a);
    }

    public final boolean c() {
        return this.f2456a > this.f2457b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (c() && ((d) obj).c()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f2456a == dVar.f2456a && this.f2457b == dVar.f2457b;
    }

    public final int hashCode() {
        if (c()) {
            return -1;
        }
        return Float.hashCode(this.f2457b) + (Float.hashCode(this.f2456a) * 31);
    }

    public final String toString() {
        return this.f2456a + ".." + this.f2457b;
    }
}
