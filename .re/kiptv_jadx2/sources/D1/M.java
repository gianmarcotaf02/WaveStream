package D1;

import android.view.View;
import android.view.WindowInsets;

public abstract class M {
    public static E0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        E0 e0C = E0.c(null, rootWindowInsets);
        z0 z0Var = e0C.f1967a;
        z0Var.t(e0C);
        z0Var.d(view.getRootView());
        return e0C;
    }

    public static void b(View view, int i3, int i9) {
        view.setScrollIndicators(i3, i9);
    }
}
