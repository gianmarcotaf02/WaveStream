package androidx.media3.ui;

import android.animation.ValueAnimator;

public final class g implements ValueAnimator.AnimatorUpdateListener {

    public final int f17162a;

    public final Object f17163b;

    public g(int i3, Object obj) {
        this.f17162a = i3;
        this.f17163b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17162a) {
            case 0:
                ((PlayerControlViewLayoutManager) this.f17163b).lambda$new$0(valueAnimator);
                break;
            case 1:
                ((PlayerControlViewLayoutManager) this.f17163b).lambda$new$1(valueAnimator);
                break;
            case 2:
                ((PlayerControlViewLayoutManager) this.f17163b).lambda$new$2(valueAnimator);
                break;
            case 3:
                ((PlayerControlViewLayoutManager) this.f17163b).lambda$new$3(valueAnimator);
                break;
            default:
                ((DefaultTimeBar) this.f17163b).lambda$new$1(valueAnimator);
                break;
        }
    }
}
