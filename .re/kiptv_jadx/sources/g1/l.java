package g1;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21830a;

    public static java.lang.String a(int i3) {
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

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof g1.l) {
            return this.f21830a == ((g1.l) obj).f21830a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f21830a);
    }

    public final java.lang.String toString() {
        return a(this.f21830a);
    }
}
