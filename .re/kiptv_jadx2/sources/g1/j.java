package g1;

public final class j {

    public final int f21823a;

    public static String a(int i3) {
        if (i3 == -1) {
            return "Unspecified";
        }
        if (i3 == 0) {
            return "None";
        }
        if (i3 == 1) {
            return "Default";
        }
        if (i3 == 2) {
            return "Go";
        }
        if (i3 == 3) {
            return "Search";
        }
        if (i3 == 4) {
            return "Send";
        }
        if (i3 == 5) {
            return "Previous";
        }
        if (i3 == 6) {
            return "Next";
        }
        return i3 == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f21823a == ((j) obj).f21823a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21823a);
    }

    public final String toString() {
        return a(this.f21823a);
    }
}
