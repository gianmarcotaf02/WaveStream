package p048f1;

public final class o {

    public final int f21663a;

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f21663a == ((o) obj).f21663a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21663a);
    }

    public final String toString() {
        int i3 = this.f21663a;
        if (i3 == 0) {
            return "Normal";
        }
        return i3 == 1 ? "Italic" : "Invalid";
    }
}
