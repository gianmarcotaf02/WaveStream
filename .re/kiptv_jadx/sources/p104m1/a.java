package p104m1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f25156a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p104m1.a) {
            return java.lang.Float.compare(this.f25156a, ((p104m1.a) obj).f25156a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f25156a);
    }

    public final java.lang.String toString() {
        return "BaselineShift(multiplier=" + this.f25156a + ')';
    }
}
