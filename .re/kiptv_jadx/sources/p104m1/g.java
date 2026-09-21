package p104m1;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25167a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p104m1.g) {
            return this.f25167a == ((p104m1.g) obj).f25167a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f25167a);
    }

    public final java.lang.String toString() {
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
