package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class C1629k extends AnimatorListenerAdapter {

    public boolean f17448a = false;

    public final C1631m f17449b;

    public C1629k(C1631m c1631m) {
        this.f17449b = c1631m;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f17448a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f17448a) {
            this.f17448a = false;
            return;
        }
        C1631m c1631m = this.f17449b;
        if (((Float) c1631m.f17477z.getAnimatedValue()).floatValue() == 0.0f) {
            c1631m.f17453A = 0;
            c1631m.d(0);
        } else {
            c1631m.f17453A = 2;
            c1631m.f17471s.invalidate();
        }
    }
}
