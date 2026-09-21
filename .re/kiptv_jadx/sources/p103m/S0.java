package p103m;

/* JADX INFO: loaded from: classes.dex */
public abstract class S0 {
    public static android.window.OnBackInvokedDispatcher a(android.view.View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static android.window.OnBackInvokedCallback b(java.lang.Runnable runnable) {
        java.util.Objects.requireNonNull(runnable);
        return new p019c.q(2, runnable);
    }

    public static void c(java.lang.Object obj, java.lang.Object obj2) {
        ((android.window.OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (android.window.OnBackInvokedCallback) obj2);
    }

    public static void d(java.lang.Object obj, java.lang.Object obj2) {
        ((android.window.OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((android.window.OnBackInvokedCallback) obj2);
    }
}
