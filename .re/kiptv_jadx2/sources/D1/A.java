package D1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class A extends A.a {
    public View j;

    @Override
    public final void F() {
        View view = this.j;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.F();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r9 = new WindowInsetsController.OnControllableInsetsChangedListener() {
            @Override
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i3) {
                atomicBoolean.set((i3 & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r9);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r9);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    @Override
    public final void M() {
        View view = this.j;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.M();
    }
}
