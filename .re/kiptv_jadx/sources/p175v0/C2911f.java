package p175v0;

/* JADX INFO: renamed from: v0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2911f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29068a;

    public static java.lang.String a(int i3) {
        if (i3 == 1) {
            return "Next";
        }
        if (i3 == 2) {
            return "Previous";
        }
        if (i3 == 3) {
            return "Left";
        }
        if (i3 == 4) {
            return "Right";
        }
        if (i3 == 5) {
            return "Up";
        }
        if (i3 == 6) {
            return "Down";
        }
        if (i3 == 7) {
            return "Enter";
        }
        return i3 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p175v0.C2911f) {
            return this.f29068a == ((p175v0.C2911f) obj).f29068a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f29068a);
    }

    public final java.lang.String toString() {
        return a(this.f29068a);
    }
}
