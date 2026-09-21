package D5;

public abstract class AbstractC0243b {

    public static final float f2260c;

    public static final float f2261d;

    public static final float f2258a = 150;

    public static final float f2259b = 12;

    public static final float f2262e = 148;

    public static final float f2263f = 142;
    public static final float g = 184;

    static {
        float f9 = 10;
        f2260c = f9;
        f2261d = f9;
    }

    public static float a(C5.U tab) {
        kotlin.jvm.internal.m.e(tab, "tab");
        int iOrdinal = tab.ordinal();
        if (iOrdinal == 0) {
            return (f2259b * 2) + f2258a;
        }
        if (iOrdinal != 1) {
            return iOrdinal != 5 ? f2262e : f2263f;
        }
        return g;
    }
}
