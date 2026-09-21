package p104m1;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25175a;

    public /* synthetic */ k(int i3) {
        this.f25175a = i3;
    }

    public static final /* synthetic */ p104m1.k a() {
        return new p104m1.k(3);
    }

    public static java.lang.String b(int i3) {
        if (i3 == 1) {
            return "Left";
        }
        if (i3 == 2) {
            return "Right";
        }
        if (i3 == 3) {
            return "Center";
        }
        if (i3 == 4) {
            return "Justify";
        }
        if (i3 == 5) {
            return "Start";
        }
        if (i3 == 6) {
            return "End";
        }
        return i3 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p104m1.k) {
            return this.f25175a == ((p104m1.k) obj).f25175a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f25175a);
    }

    public final java.lang.String toString() {
        return b(this.f25175a);
    }
}
