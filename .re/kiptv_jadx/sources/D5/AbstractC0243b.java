package D5;

/* JADX INFO: renamed from: D5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0243b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f2260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f2261d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f2258a = 150;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f2259b = 12;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f2262e = 148;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
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
