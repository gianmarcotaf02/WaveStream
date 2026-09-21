package p113n1;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25553a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p113n1.g) {
            return this.f25553a == ((p113n1.g) obj).f25553a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f25553a);
    }

    public final java.lang.String toString() {
        long j = this.f25553a;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((java.lang.Object) p113n1.f.d(java.lang.Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((java.lang.Object) p113n1.f.d(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)))) + ')';
    }
}
