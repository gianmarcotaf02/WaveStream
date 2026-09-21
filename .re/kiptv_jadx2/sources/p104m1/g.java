package p104m1;

public final class g {

    public final int f25167a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f25167a == ((g) obj).f25167a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25167a);
    }

    public final String toString() {
        int i3 = this.f25167a;
        if (i3 == 0) {
            return "LineHeightStyle.Mode.Fixed";
        }
        if (i3 == 1) {
            return "LineHeightStyle.Mode.Minimum";
        }
        return i3 == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
