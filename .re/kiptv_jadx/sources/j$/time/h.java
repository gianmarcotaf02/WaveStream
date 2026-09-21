package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23753a;

    static {
        int[] iArr = new int[j$.time.temporal.b.values().length];
        f23753a = iArr;
        try {
            iArr[j$.time.temporal.b.NANOS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f23753a[j$.time.temporal.b.MICROS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f23753a[j$.time.temporal.b.MILLIS.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f23753a[j$.time.temporal.b.SECONDS.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f23753a[j$.time.temporal.b.MINUTES.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f23753a[j$.time.temporal.b.HOURS.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            f23753a[j$.time.temporal.b.HALF_DAYS.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
    }
}
