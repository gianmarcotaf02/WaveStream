package p104m1;

public final class d {

    public final int f25160a;

    public static String a(int i3) {
        if (i3 == 1) {
            return "Hyphens.None";
        }
        if (i3 == 2) {
            return "Hyphens.Auto";
        }
        return i3 == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f25160a == ((d) obj).f25160a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25160a);
    }

    public final String toString() {
        return a(this.f25160a);
    }
}
