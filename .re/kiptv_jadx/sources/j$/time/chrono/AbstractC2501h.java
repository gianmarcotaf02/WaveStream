package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC2501h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23609a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f23609a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f23609a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
    }
}
