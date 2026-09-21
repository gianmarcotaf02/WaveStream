package D1;

/* JADX INFO: loaded from: classes.dex */
public final class H implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.WeakHashMap f1969h = new java.util.WeakHashMap();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            for (java.util.Map.Entry entry : this.f1969h.entrySet()) {
                android.view.View view = (android.view.View) entry.getKey();
                boolean zBooleanValue = ((java.lang.Boolean) entry.getValue()).booleanValue();
                boolean z6 = view.isShown() && view.getWindowVisibility() == 0;
                if (zBooleanValue != z6) {
                    D1.U.f(z6 ? 16 : 32, view);
                    entry.setValue(java.lang.Boolean.valueOf(z6));
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
    }
}
