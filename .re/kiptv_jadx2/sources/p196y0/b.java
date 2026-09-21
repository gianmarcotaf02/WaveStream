package p196y0;

public abstract class b {

    public static final long f31724a;

    public static final long f31725b;

    public static final long f31726c;

    public static final long f31727d;

    public static final int f31728e = 0;

    static {
        long j = 3;
        long j9 = j << 32;
        f31724a = (((long) 0) & 4294967295L) | j9;
        f31725b = (((long) 1) & 4294967295L) | j9;
        f31726c = j9 | (((long) 2) & 4294967295L);
        f31727d = (j & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean a(long j, long j9) {
        return j == j9;
    }

    public static String b(long j) {
        if (a(j, f31724a)) {
            return "Rgb";
        }
        if (a(j, f31725b)) {
            return "Xyz";
        }
        if (a(j, f31726c)) {
            return "Lab";
        }
        return a(j, f31727d) ? "Cmyk" : "Unknown";
    }
}
