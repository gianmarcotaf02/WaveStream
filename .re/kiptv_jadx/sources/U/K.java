package U;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f9919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f9920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Y0.w f9921c = new Y0.w("SelectionHandleInfo");

    static {
        float f9 = 25;
        f9919a = f9;
        f9920b = f9;
    }

    public static final long a(long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
