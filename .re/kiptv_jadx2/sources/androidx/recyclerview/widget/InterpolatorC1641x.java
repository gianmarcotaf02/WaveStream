package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

public final class InterpolatorC1641x implements Interpolator {
    @Override
    public final float getInterpolation(float f9) {
        float f10 = f9 - 1.0f;
        return (f10 * f10 * f10 * f10 * f10) + 1.0f;
    }
}
