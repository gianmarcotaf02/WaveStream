package A0;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

public abstract class l {
    public static WindowInsetsAnimation.Bounds h(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static WindowInsetsAnimation i(int i3, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i3, interpolator, j);
    }

    public static WindowInsetsAnimation j(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static void l() {
    }
}
