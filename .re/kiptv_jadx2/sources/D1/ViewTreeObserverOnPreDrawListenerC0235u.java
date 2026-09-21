package D1;

import android.view.View;
import android.view.ViewTreeObserver;

public final class ViewTreeObserverOnPreDrawListenerC0235u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    public final View f2066h;

    public ViewTreeObserver f2067i;
    public final Runnable j;

    public ViewTreeObserverOnPreDrawListenerC0235u(View view, Runnable runnable) {
        this.f2066h = view;
        this.f2067i = view.getViewTreeObserver();
        this.j = runnable;
    }

    @Override
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f2067i.isAlive();
        View view = this.f2066h;
        if (zIsAlive) {
            this.f2067i.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.j.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f2067i = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f2067i.isAlive();
        View view2 = this.f2066h;
        if (zIsAlive) {
            this.f2067i.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
