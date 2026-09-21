package p175v0;

public final class C2911f {

    public final int f29068a;

    public static String a(int i3) {
        if (i3 == 1) {
            return "Next";
        }
        if (i3 == 2) {
            return "Previous";
        }
        if (i3 == 3) {
            return "Left";
        }
        if (i3 == 4) {
            return "Right";
        }
        if (i3 == 5) {
            return "Up";
        }
        if (i3 == 6) {
            return "Down";
        }
        if (i3 == 7) {
            return "Enter";
        }
        return i3 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2911f) {
            return this.f29068a == ((C2911f) obj).f29068a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29068a);
    }

    public final String toString() {
        return a(this.f29068a);
    }
}
