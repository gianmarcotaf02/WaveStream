package p188x0;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f31094b = p188x0.z.h(0.5f, 0.5f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f31095c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31096a;

    public static final boolean a(long j, long j9) {
        return j == j9;
    }

    public static final float b(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static java.lang.String d(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p188x0.T) {
            return this.f31096a == ((p188x0.T) obj).f31096a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f31096a);
    }

    public final java.lang.String toString() {
        return d(this.f31096a);
    }
}
