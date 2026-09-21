package j$.time;

public abstract class m {

    public static final int[] f23763a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f23763a = iArr;
        try {
            iArr[j$.time.temporal.a.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f23763a[j$.time.temporal.a.MONTH_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
