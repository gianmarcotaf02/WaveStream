package v;

import android.view.ViewConfiguration;

public abstract class L {

    public static final float f28876a = ViewConfiguration.getScrollFriction();

    public static final double f28877b;

    public static final double f28878c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f28877b = dLog;
        f28878c = dLog - 1.0d;
    }
}
