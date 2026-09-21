package j$.time.chrono;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23593a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f23593a = iArr;
        try {
            iArr[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f23593a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f23593a[j$.time.temporal.a.YEAR.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
    }
}
