package p104m1;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25168a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p104m1.h) {
            return this.f25168a == ((p104m1.h) obj).f25168a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f25168a);
    }

    public final java.lang.String toString() {
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
