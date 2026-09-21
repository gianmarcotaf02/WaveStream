package p113n1;

public final class g {

    public final long f25553a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f25553a == ((g) obj).f25553a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25553a);
    }

    public final String toString() {
        long j = this.f25553a;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.d(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) f.d(Float.intBitsToFloat((int) (j & 4294967295L)))) + ')';
    }
}
