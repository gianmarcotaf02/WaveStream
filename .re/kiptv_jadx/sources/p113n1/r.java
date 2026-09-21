package p113n1;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25573a;

    public static long a(long j, float f9, float f10, int i3) {
        if ((i3 & 1) != 0) {
            f9 = java.lang.Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i3 & 2) != 0) {
            f10 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) java.lang.Float.floatToRawIntBits(f9)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L);
    }

    public static final float b(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long d(long j, long j9) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - java.lang.Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L));
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long e(long j, long j9) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j9 >> 32)) + java.lang.Float.intBitsToFloat((int) (j >> 32));
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static java.lang.String f(long j) {
        return "(" + b(j) + ", " + c(j) + ") px/sec";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p113n1.r) {
            return this.f25573a == ((p113n1.r) obj).f25573a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f25573a);
    }

    public final java.lang.String toString() {
        return f(this.f25573a);
    }
}
