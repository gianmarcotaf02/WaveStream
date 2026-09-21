package p104m1;

public final class m {

    public final int f25180a;

    public static String a(int i3) {
        if (i3 == 1) {
            return "Ltr";
        }
        if (i3 == 2) {
            return "Rtl";
        }
        if (i3 == 3) {
            return "Content";
        }
        if (i3 == 4) {
            return "ContentOrLtr";
        }
        if (i3 == 5) {
            return "ContentOrRtl";
        }
        return i3 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f25180a == ((m) obj).f25180a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25180a);
    }

    public final String toString() {
        return a(this.f25180a);
    }
}
