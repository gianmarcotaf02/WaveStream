package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f23778b;

    static {
        int[] iArr = new int[j$.time.temporal.b.values().length];
        f23778b = iArr;
        try {
            iArr[j$.time.temporal.b.YEARS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f23778b[j$.time.temporal.b.DECADES.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f23778b[j$.time.temporal.b.CENTURIES.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f23778b[j$.time.temporal.b.MILLENNIA.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f23778b[j$.time.temporal.b.ERAS.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[j$.time.temporal.a.values().length];
        f23777a = iArr2;
        try {
            iArr2[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            f23777a[j$.time.temporal.a.YEAR.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            f23777a[j$.time.temporal.a.ERA.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
    }
}
