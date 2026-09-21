package p104m1;

public final class h {

    public final int f25168a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f25168a == ((h) obj).f25168a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25168a);
    }

    public final String toString() {
        int i3 = this.f25168a;
        if (i3 == 1) {
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (i3 == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (i3 == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        return i3 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
