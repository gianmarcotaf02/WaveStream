package p104m1;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25160a;

    public static java.lang.String a(int i3) {
        if (i3 == 1) {
            return "Hyphens.None";
        }
        if (i3 == 2) {
            return "Hyphens.Auto";
        }
        return i3 == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p104m1.d) {
            return this.f25160a == ((p104m1.d) obj).f25160a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f25160a);
    }

    public final java.lang.String toString() {
        return a(this.f25160a);
    }
}
