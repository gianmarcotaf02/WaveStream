package p188x0;

public final class T {

    public static final long f31094b = z.h(0.5f, 0.5f);

    public static final int f31095c = 0;

    public final long f31096a;

    public static final boolean a(long j, long j9) {
        return j == j9;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T) {
            return this.f31096a == ((T) obj).f31096a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31096a);
    }

    public final String toString() {
        return d(this.f31096a);
    }
}
