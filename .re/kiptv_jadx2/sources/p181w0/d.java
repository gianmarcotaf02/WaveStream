package p181w0;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;

public final class d {

    public final long f29757a;

    public static final boolean a(long j, long j9) {
        return j == j9;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float c(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float d(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean e(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public static String f(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC1864o0.q0(Float.intBitsToFloat((int) (j >> 32))) + ", " + AbstractC1864o0.q0(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f29757a == ((d) obj).f29757a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f29757a);
    }

    public final String toString() {
        return f(this.f29757a);
    }
}
