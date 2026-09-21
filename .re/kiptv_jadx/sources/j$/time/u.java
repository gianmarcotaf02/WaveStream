package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f23828b;

    static {
        int[] iArr = new int[j$.time.temporal.b.values().length];
        f23828b = iArr;
        try {
            iArr[j$.time.temporal.b.MONTHS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f23828b[j$.time.temporal.b.YEARS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f23828b[j$.time.temporal.b.DECADES.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f23828b[j$.time.temporal.b.CENTURIES.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f23828b[j$.time.temporal.b.MILLENNIA.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f23828b[j$.time.temporal.b.ERAS.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[j$.time.temporal.a.values().length];
        f23827a = iArr2;
        try {
            iArr2[j$.time.temporal.a.MONTH_OF_YEAR.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            f23827a[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            f23827a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            f23827a[j$.time.temporal.a.YEAR.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        try {
            f23827a[j$.time.temporal.a.ERA.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
    }
}
