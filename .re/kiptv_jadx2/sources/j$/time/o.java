package j$.time;

public abstract class o {

    public static final int[] f23767a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f23767a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f23767a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
