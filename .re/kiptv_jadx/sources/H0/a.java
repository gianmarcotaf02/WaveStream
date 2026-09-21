package H0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3832a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof H0.a) {
            return this.f3832a == ((H0.a) obj).f3832a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f3832a);
    }

    public final java.lang.String toString() {
        return "IndirectPointerEventPrimaryDirectionalMotionAxis(value=" + this.f3832a + ')';
    }
}
