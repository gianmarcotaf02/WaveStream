package j$.time.zone;

public abstract class c {

    public static final int[] f23842a;

    static {
        int[] iArr = new int[d.values().length];
        f23842a = iArr;
        try {
            iArr[d.UTC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f23842a[d.STANDARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
