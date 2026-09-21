package p095l;

import android.widget.PopupWindow;

public final class u implements PopupWindow.OnDismissListener {

    public final v f24697h;

    public u(v vVar) {
        this.f24697h = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f24697h.c();
    }
}
