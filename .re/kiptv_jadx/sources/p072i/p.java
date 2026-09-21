package p072i;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static android.window.OnBackInvokedDispatcher a(android.app.Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static android.window.OnBackInvokedCallback b(java.lang.Object obj, p072i.v vVar) {
        java.util.Objects.requireNonNull(vVar);
        p019c.q qVar = new p019c.q(1, vVar);
        E1.c.q(obj).registerOnBackInvokedCallback(1000000, qVar);
        return qVar;
    }

    public static void c(java.lang.Object obj, java.lang.Object obj2) {
        E1.c.q(obj).unregisterOnBackInvokedCallback(E1.c.n(obj2));
    }
}
