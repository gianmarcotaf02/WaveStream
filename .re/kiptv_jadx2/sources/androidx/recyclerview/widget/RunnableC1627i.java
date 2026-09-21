package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

public final class RunnableC1627i implements Runnable {

    public final int f17445h;

    public final Object f17446i;

    public RunnableC1627i(int i3, Object obj) {
        this.f17445h = i3;
        this.f17446i = obj;
    }

    @Override
    public final void run() {
        Object obj = this.f17446i;
        switch (this.f17445h) {
            case 0:
                C1631m c1631m = (C1631m) obj;
                int i3 = c1631m.f17453A;
                ValueAnimator valueAnimator = c1631m.f17477z;
                if (i3 == 1) {
                    valueAnimator.cancel();
                } else if (i3 != 2) {
                }
                c1631m.f17453A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                break;
            default:
                ((StaggeredGridLayoutManager) obj).t0();
                break;
        }
    }
}
