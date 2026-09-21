package j$.time.temporal;

public abstract class c {

    public static final int[] f23786a;

    static {
        int[] iArr = new int[i.values().length];
        f23786a = iArr;
        try {
            iArr[i.WEEK_BASED_YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f23786a[i.QUARTER_YEARS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
