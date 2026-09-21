package T;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f9630a = a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9631b = 0;

    public static long a(float f9, float f10) {
        return (((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f9) << 32);
    }

    public static java.lang.String b(long j) {
        return "InlineDensity(density=" + java.lang.Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }
}
