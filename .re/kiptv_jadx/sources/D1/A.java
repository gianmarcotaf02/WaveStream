package D1;

/* JADX INFO: loaded from: classes.dex */
public final class A extends A.a {
    public android.view.View j;

    /* JADX WARN: Type inference failed for: r4v0, types: [D1.z] */
    @Override // A.a
    public final void F() {
        android.view.View view = this.j;
        android.view.WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.F();
            return;
        }
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        ?? r9 = new android.view.WindowInsetsController.OnControllableInsetsChangedListener() { // from class: D1.z
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(android.view.WindowInsetsController windowInsetsController2, int i3) {
                atomicBoolean.set((i3 & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r9);
        if (!atomicBoolean.get() && view != null) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r9);
        windowInsetsController.hide(android.view.WindowInsets.Type.ime());
    }

    @Override // A.a
    public final void M() {
        android.view.View view = this.j;
        if (view != null && android.os.Build.VERSION.SDK_INT < 33) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        android.view.WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            windowInsetsController.show(android.view.WindowInsets.Type.ime());
        }
        super.M();
    }
}
