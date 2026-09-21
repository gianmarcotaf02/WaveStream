package p021c1;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

public abstract class j {

    public static final ThreadLocal f18483a = new ThreadLocal();

    public static final long f18484b = a(0, 0);

    public static final long a(int i3, int i9) {
        return (((long) i9) & 4294967295L) | (((long) i3) << 32);
    }

    public static final TextDirectionHeuristic b(int i3) {
        if (i3 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i3 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i3 == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i3 == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i3 != 4) {
            return i3 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }
}
