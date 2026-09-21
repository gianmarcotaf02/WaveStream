package p188x0;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31042a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p188x0.B) {
            return this.f31042a == ((p188x0.B) obj).f31042a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f31042a);
    }

    public final java.lang.String toString() {
        int i3 = this.f31042a;
        if (i3 == 0) {
            return "Argb8888";
        }
        if (i3 == 1) {
            return "Alpha8";
        }
        if (i3 == 2) {
            return "Rgb565";
        }
        if (i3 == 3) {
            return "F16";
        }
        return i3 == 4 ? "Gpu" : "Unknown";
    }
}
