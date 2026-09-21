package p048f1;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21664a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p048f1.p) {
            return this.f21664a == ((p048f1.p) obj).f21664a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f21664a);
    }

    public final java.lang.String toString() {
        int i3 = this.f21664a;
        if (i3 == 0) {
            return "None";
        }
        if (i3 == 1) {
            return "Weight";
        }
        if (i3 == 2) {
            return "Style";
        }
        return i3 == 65535 ? "All" : "Invalid";
    }
}
