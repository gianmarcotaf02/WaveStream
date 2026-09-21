package p048f1;

public final class p {

    public final int f21664a;

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f21664a == ((p) obj).f21664a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21664a);
    }

    public final String toString() {
        int i3 = this.f21664a;
        if (i3 == 0) {
            return "None";
        }
        if (i3 == 1) {
            return "Weight";
        }
        if (i3 == 2) {
            return "Style";
        }
        return i3 == 65535 ? "All" : "Invalid";
    }
}
