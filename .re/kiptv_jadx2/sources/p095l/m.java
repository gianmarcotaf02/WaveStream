package p095l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p072i.h;

public final class m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {

    public D f24658h;

    public h f24659i;
    public h j;

    @Override
    public final void c(l lVar, boolean z6) {
        h hVar;
        if ((z6 || lVar == this.f24658h) && (hVar = this.f24659i) != null) {
            hVar.dismiss();
        }
    }

    @Override
    public final boolean j(l lVar) {
        return false;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i3) {
        h hVar = this.j;
        if (hVar.f24629m == null) {
            hVar.f24629m = new g(hVar);
        }
        this.f24658h.q(hVar.f24629m.getItem(i3), null, 0);
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        this.j.c(this.f24658h, true);
    }

    @Override
    public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        D d4 = this.f24658h;
        if (i3 == 82 || i3 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f24659i.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f24659i.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                d4.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return d4.performShortcut(i3, keyEvent, 0);
    }
}
