package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC2495b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23600a;

    static {
        int[] iArr = new int[j$.time.temporal.b.values().length];
        f23600a = iArr;
        try {
            iArr[j$.time.temporal.b.DAYS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f23600a[j$.time.temporal.b.WEEKS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f23600a[j$.time.temporal.b.MONTHS.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f23600a[j$.time.temporal.b.YEARS.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f23600a[j$.time.temporal.b.DECADES.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f23600a[j$.time.temporal.b.CENTURIES.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            f23600a[j$.time.temporal.b.MILLENNIA.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            f23600a[j$.time.temporal.b.ERAS.ordinal()] = 8;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
    }
}
