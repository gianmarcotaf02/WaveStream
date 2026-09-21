package p181w0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29757a;

    public static final boolean a(long j, long j9) {
        return j == j9;
    }

    public static final float b(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float c(long j) {
        return java.lang.Math.min(java.lang.Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), java.lang.Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float d(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean e(long j) {
        return (j == 9205357640488583168L) | (java.lang.Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public static java.lang.String f(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(java.lang.Float.intBitsToFloat((int) (j >> 32))) + ", " + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p181w0.d) {
            return this.f29757a == ((p181w0.d) obj).f29757a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f29757a);
    }

    public final java.lang.String toString() {
        return f(this.f29757a);
    }
}
