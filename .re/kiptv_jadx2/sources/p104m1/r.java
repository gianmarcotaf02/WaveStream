package p104m1;

public final class r {

    public final int f25188a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f25188a == ((r) obj).f25188a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25188a);
    }

    public final String toString() {
        int i3 = this.f25188a;
        if (i3 == 1) {
            return "Linearity.Linear";
        }
        if (i3 == 2) {
            return "Linearity.FontHinting";
        }
        return i3 == 3 ? "Linearity.None" : "Invalid";
    }
}
