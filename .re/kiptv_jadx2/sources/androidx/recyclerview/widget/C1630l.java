package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

public final class C1630l implements ValueAnimator.AnimatorUpdateListener {

    public final C1631m f17450a;

    public C1630l(C1631m c1631m) {
        this.f17450a = c1631m;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C1631m c1631m = this.f17450a;
        c1631m.f17457c.setAlpha(iFloatValue);
        c1631m.f17458d.setAlpha(iFloatValue);
        c1631m.f17471s.invalidate();
    }
}
