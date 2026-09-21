package p104m1;

public final class k {

    public final int f25175a;

    public k(int i3) {
        this.f25175a = i3;
    }

    public static final k a() {
        return new k(3);
    }

    public static String b(int i3) {
        if (i3 == 1) {
            return "Left";
        }
        if (i3 == 2) {
            return "Right";
        }
        if (i3 == 3) {
            return "Center";
        }
        if (i3 == 4) {
            return "Justify";
        }
        if (i3 == 5) {
            return "Start";
        }
        if (i3 == 6) {
            return "End";
        }
        return i3 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f25175a == ((k) obj).f25175a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25175a);
    }

    public final String toString() {
        return b(this.f25175a);
    }
}
