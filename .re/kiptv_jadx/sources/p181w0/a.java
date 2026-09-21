package p181w0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29744a;

    public static long a(int i3, long j, float f9) {
        float fIntBitsToFloat = (i3 & 1) != 0 ? java.lang.Float.intBitsToFloat((int) (j >> 32)) : 0.0f;
        if ((i3 & 2) != 0) {
            f9 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f9)) & 4294967295L);
    }

    public static final boolean b(long j, long j9) {
        return j == j9;
    }

    public static final float c(long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) java.lang.Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    public static final float d(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float e(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long f(long j, long j9) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - java.lang.Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L));
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long g(long j, long j9) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j9 >> 32)) + java.lang.Float.intBitsToFloat((int) (j >> 32));
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long h(long j, float f9) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) * f9;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) * f9;
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static java.lang.String i(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(java.lang.Float.intBitsToFloat((int) (j >> 32))) + ", " + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p181w0.a) {
            return this.f29744a == ((p181w0.a) obj).f29744a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f29744a);
    }

    public final java.lang.String toString() {
        return i(this.f29744a);
    }
}
