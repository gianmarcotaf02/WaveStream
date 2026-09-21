package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f23649b;

    static {
        int[] iArr = new int[j$.time.temporal.b.values().length];
        f23649b = iArr;
        try {
            iArr[j$.time.temporal.b.NANOS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f23649b[j$.time.temporal.b.MICROS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f23649b[j$.time.temporal.b.MILLIS.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f23649b[j$.time.temporal.b.SECONDS.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f23649b[j$.time.temporal.b.MINUTES.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f23649b[j$.time.temporal.b.HOURS.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            f23649b[j$.time.temporal.b.HALF_DAYS.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            f23649b[j$.time.temporal.b.DAYS.ordinal()] = 8;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        int[] iArr2 = new int[j$.time.temporal.a.values().length];
        f23648a = iArr2;
        try {
            iArr2[j$.time.temporal.a.NANO_OF_SECOND.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            f23648a[j$.time.temporal.a.MICRO_OF_SECOND.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        try {
            f23648a[j$.time.temporal.a.MILLI_OF_SECOND.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
        try {
            f23648a[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused12) {
        }
    }
}
