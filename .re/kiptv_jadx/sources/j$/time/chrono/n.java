package j$.time.chrono;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23614a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f23614a = iArr;
        try {
            iArr[j$.time.temporal.a.DAY_OF_MONTH.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f23614a[j$.time.temporal.a.DAY_OF_YEAR.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f23614a[j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f23614a[j$.time.temporal.a.YEAR.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f23614a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f23614a[j$.time.temporal.a.ERA.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
    }
}
