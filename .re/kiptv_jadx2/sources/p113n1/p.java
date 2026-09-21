package p113n1;

import com.google.common.util.concurrent.D;

public final class p {

    public static final q[] f25569b = {new q(0), new q(4294967296L), new q(8589934592L)};

    public static final long f25570c = D.C(0, Float.NaN);

    public final long f25571a;

    public p(long j) {
        this.f25571a = j;
    }

    public static final boolean a(long j, long j9) {
        return j == j9;
    }

    public static final long b(long j) {
        return f25569b[(int) ((j & 1095216660480L) >>> 32)].f25572a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long jB = b(j);
        if (q.a(jB, 0L)) {
            return "Unspecified";
        }
        if (q.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!q.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f25571a == ((p) obj).f25571a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25571a);
    }

    public final String toString() {
        return d(this.f25571a);
    }
}
