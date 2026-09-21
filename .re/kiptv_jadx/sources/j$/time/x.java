package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23835a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f23835a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f23835a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
    }
}
