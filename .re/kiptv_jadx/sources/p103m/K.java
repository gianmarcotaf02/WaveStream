package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class K implements android.widget.PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p095l.ViewTreeObserverOnGlobalLayoutListenerC2547d f24928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p103m.L f24929i;

    public K(p103m.L l2, p095l.ViewTreeObserverOnGlobalLayoutListenerC2547d viewTreeObserverOnGlobalLayoutListenerC2547d) {
        this.f24929i = l2;
        this.f24928h = viewTreeObserverOnGlobalLayoutListenerC2547d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        android.view.ViewTreeObserver viewTreeObserver = this.f24929i.f24941M.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f24928h);
        }
    }
}
