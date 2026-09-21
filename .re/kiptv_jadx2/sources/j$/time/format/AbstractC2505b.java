package j$.time.format;

public abstract class AbstractC2505b {

    public static final int[] f23689a;

    static {
        int[] iArr = new int[E.values().length];
        f23689a = iArr;
        try {
            iArr[E.EXCEEDS_PAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f23689a[E.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f23689a[E.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f23689a[E.NOT_NEGATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
