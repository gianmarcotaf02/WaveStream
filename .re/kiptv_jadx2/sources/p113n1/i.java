package p113n1;

public final class i {

    public final long f25558a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f25558a == ((i) obj).f25558a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25558a);
    }

    public final String toString() {
        long j = this.f25558a;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) f.d(Float.intBitsToFloat((int) (j >> 32)))) + " x " + ((Object) f.d(Float.intBitsToFloat((int) (j & 4294967295L))));
    }
}
