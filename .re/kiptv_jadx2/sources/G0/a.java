package G0;

public final class a {

    public final int f3760a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f3760a == ((a) obj).f3760a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3760a);
    }

    public final String toString() {
        int i3 = this.f3760a;
        if (i3 == 1) {
            return "Touch";
        }
        return i3 == 2 ? "Keyboard" : "Error";
    }
}
