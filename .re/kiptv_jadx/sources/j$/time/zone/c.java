package j$.time.zone;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23842a;

    static {
        int[] iArr = new int[j$.time.zone.d.values().length];
        f23842a = iArr;
        try {
            iArr[j$.time.zone.d.UTC.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f23842a[j$.time.zone.d.STANDARD.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
    }
}
