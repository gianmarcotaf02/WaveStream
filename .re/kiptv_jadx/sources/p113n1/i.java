package p113n1;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25558a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p113n1.i) {
            return this.f25558a == ((p113n1.i) obj).f25558a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f25558a);
    }

    public final java.lang.String toString() {
        long j = this.f25558a;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((java.lang.Object) p113n1.f.d(java.lang.Float.intBitsToFloat((int) (j >> 32)))) + " x " + ((java.lang.Object) p113n1.f.d(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
    }
}
