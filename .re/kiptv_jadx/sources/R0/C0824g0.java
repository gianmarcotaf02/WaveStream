package R0;

/* JADX INFO: renamed from: R0.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0824g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8911a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof R0.C0824g0) {
            return this.f8911a == ((R0.C0824g0) obj).f8911a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f8911a);
    }

    public final java.lang.String toString() {
        return "AutoClearFocusBehavior(value=" + this.f8911a + ')';
    }
}
