package p188x0;

public final class B {

    public final int f31042a;

    public final boolean equals(Object obj) {
        if (obj instanceof B) {
            return this.f31042a == ((B) obj).f31042a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31042a);
    }

    public final String toString() {
        int i3 = this.f31042a;
        if (i3 == 0) {
            return "Argb8888";
        }
        if (i3 == 1) {
            return "Alpha8";
        }
        if (i3 == 2) {
            return "Rgb565";
        }
        if (i3 == 3) {
            return "F16";
        }
        return i3 == 4 ? "Gpu" : "Unknown";
    }
}
