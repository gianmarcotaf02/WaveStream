package D1;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {
    public static D1.E0 a(android.view.View view) {
        android.view.WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        D1.E0 e0C = D1.E0.c(null, rootWindowInsets);
        D1.z0 z0Var = e0C.f1967a;
        z0Var.t(e0C);
        z0Var.d(view.getRootView());
        return e0C;
    }

    public static void b(android.view.View view, int i3, int i9) {
        view.setScrollIndicators(i3, i9);
    }
}
