package G0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3760a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof G0.a) {
            return this.f3760a == ((G0.a) obj).f3760a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f3760a);
    }

    public final java.lang.String toString() {
        int i3 = this.f3760a;
        if (i3 == 1) {
            return "Touch";
        }
        return i3 == 2 ? "Keyboard" : "Error";
    }
}
