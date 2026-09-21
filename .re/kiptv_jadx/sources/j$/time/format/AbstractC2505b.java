package j$.time.format;

/* JADX INFO: renamed from: j$.time.format.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC2505b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23689a;

    static {
        int[] iArr = new int[j$.time.format.E.values().length];
        f23689a = iArr;
        try {
            iArr[j$.time.format.E.EXCEEDS_PAD.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f23689a[j$.time.format.E.ALWAYS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f23689a[j$.time.format.E.NORMAL.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f23689a[j$.time.format.E.NOT_NEGATIVE.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
    }
}
