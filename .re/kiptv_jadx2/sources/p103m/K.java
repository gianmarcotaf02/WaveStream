package p103m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import p095l.ViewTreeObserverOnGlobalLayoutListenerC2547d;

public final class K implements PopupWindow.OnDismissListener {

    public final ViewTreeObserverOnGlobalLayoutListenerC2547d f24928h;

    public final L f24929i;

    public K(L l2, ViewTreeObserverOnGlobalLayoutListenerC2547d viewTreeObserverOnGlobalLayoutListenerC2547d) {
        this.f24929i = l2;
        this.f24928h = viewTreeObserverOnGlobalLayoutListenerC2547d;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f24929i.f24941M.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f24928h);
        }
    }
}
