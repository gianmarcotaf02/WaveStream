package p104m1;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25188a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p104m1.r) {
            return this.f25188a == ((p104m1.r) obj).f25188a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f25188a);
    }

    public final java.lang.String toString() {
        int i3 = this.f25188a;
        if (i3 == 1) {
            return "Linearity.Linear";
        }
        if (i3 == 2) {
            return "Linearity.FontHinting";
        }
        return i3 == 3 ? "Linearity.None" : "Invalid";
    }
}
