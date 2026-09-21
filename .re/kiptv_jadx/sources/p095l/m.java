package p095l;

/* JADX INFO: loaded from: classes.dex */
public final class m implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, p095l.w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p095l.D f24658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p072i.h f24659i;
    public p095l.h j;

    @Override // p095l.w
    public final void c(p095l.l lVar, boolean z6) {
        p072i.h hVar;
        if ((z6 || lVar == this.f24658h) && (hVar = this.f24659i) != null) {
            hVar.dismiss();
        }
    }

    @Override // p095l.w
    public final boolean j(p095l.l lVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i3) {
        p095l.h hVar = this.j;
        if (hVar.f24629m == null) {
            hVar.f24629m = new p095l.g(hVar);
        }
        this.f24658h.q(hVar.f24629m.getItem(i3), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.j.c(this.f24658h, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(android.content.DialogInterface dialogInterface, int i3, android.view.KeyEvent keyEvent) {
        android.view.Window window;
        android.view.View decorView;
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        android.view.View decorView2;
        android.view.KeyEvent.DispatcherState keyDispatcherState2;
        p095l.D d4 = this.f24658h;
        if (i3 == 82 || i3 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                android.view.Window window2 = this.f24659i.getWindow();
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
