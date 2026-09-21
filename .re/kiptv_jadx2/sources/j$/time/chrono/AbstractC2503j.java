package j$.time.chrono;

public abstract class AbstractC2503j {

    public static final int[] f23610a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f23610a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f23610a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
