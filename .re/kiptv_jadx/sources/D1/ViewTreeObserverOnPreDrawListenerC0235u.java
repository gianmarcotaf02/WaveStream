package D1;

/* JADX INFO: renamed from: D1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0235u implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.view.View f2066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.view.ViewTreeObserver f2067i;
    public final java.lang.Runnable j;

    public ViewTreeObserverOnPreDrawListenerC0235u(android.view.View view, java.lang.Runnable runnable) {
        this.f2066h = view;
        this.f2067i = view.getViewTreeObserver();
        this.j = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f2067i.isAlive();
        android.view.View view = this.f2066h;
        if (zIsAlive) {
            this.f2067i.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.j.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.f2067i = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        boolean zIsAlive = this.f2067i.isAlive();
        android.view.View view2 = this.f2066h;
        if (zIsAlive) {
            this.f2067i.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
