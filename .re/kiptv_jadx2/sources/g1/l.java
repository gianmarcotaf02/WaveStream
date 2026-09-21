package g1;

public final class l {

    public final int f21830a;

    public static String a(int i3) {
        if (i3 == 0) {
            return "Unspecified";
        }
        if (i3 == 1) {
            return "Text";
        }
        if (i3 == 2) {
            return "Ascii";
        }
        if (i3 == 3) {
            return "Number";
        }
        if (i3 == 4) {
            return "Phone";
        }
        if (i3 == 5) {
            return "Uri";
        }
        if (i3 == 6) {
            return "Email";
        }
        if (i3 == 7) {
            return "Password";
        }
        if (i3 == 8) {
            return "NumberPassword";
        }
        return i3 == 9 ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f21830a == ((l) obj).f21830a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21830a);
    }

    public final String toString() {
        return a(this.f21830a);
    }
}
