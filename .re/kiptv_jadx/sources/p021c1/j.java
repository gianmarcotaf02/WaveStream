package p021c1;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f18483a = new java.lang.ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f18484b = a(0, 0);

    public static final long a(int i3, int i9) {
        return (((long) i9) & 4294967295L) | (((long) i3) << 32);
    }

    public static final android.text.TextDirectionHeuristic b(int i3) {
        if (i3 == 0) {
            return android.text.TextDirectionHeuristics.LTR;
        }
        if (i3 == 1) {
            return android.text.TextDirectionHeuristics.RTL;
        }
        if (i3 == 2) {
            return android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i3 == 3) {
            return android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i3 != 4) {
            return i3 != 5 ? android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR : android.text.TextDirectionHeuristics.LOCALE;
        }
        return android.text.TextDirectionHeuristics.ANYRTL_LTR;
    }
}
