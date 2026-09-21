package D1;

import android.view.View;
import android.view.WindowInsets;

public abstract class J {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i3 = W.f1986a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }
}
