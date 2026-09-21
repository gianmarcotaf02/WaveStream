package D1;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

public final class H implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    public final WeakHashMap f1969h = new WeakHashMap();

    @Override
    public final void onGlobalLayout() {
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.f1969h.entrySet()) {
                View view = (View) entry.getKey();
                boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                boolean z6 = view.isShown() && view.getWindowVisibility() == 0;
                if (zBooleanValue != z6) {
                    U.f(z6 ? 16 : 32, view);
                    entry.setValue(Boolean.valueOf(z6));
                }
            }
        }
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
