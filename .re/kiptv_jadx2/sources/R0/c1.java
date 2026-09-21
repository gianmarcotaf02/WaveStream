package R0;

import android.view.View;
import p020c0.C1718z0;

public final class c1 implements View.OnAttachStateChangeListener {

    public final View f8886h;

    public final C1718z0 f8887i;

    public c1(View view, C1718z0 c1718z0) {
        this.f8886h = view;
        this.f8887i = c1718z0;
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f8886h.removeOnAttachStateChangeListener(this);
        this.f8887i.x();
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
    }
}
