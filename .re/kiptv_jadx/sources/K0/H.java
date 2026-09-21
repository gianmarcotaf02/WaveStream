package K0;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6656a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof K0.H) {
            return this.f6656a == ((K0.H) obj).f6656a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f6656a);
    }

    public final java.lang.String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f6656a + ')';
    }
}
