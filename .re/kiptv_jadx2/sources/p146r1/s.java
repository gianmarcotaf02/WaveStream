package p146r1;

import android.graphics.Insets;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

public final class s {

    public static final s f26772a = new s();

    public final int a(Window window) {
        WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        Insets insets = currentWindowMetrics.getWindowInsets().getInsets(WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }

    public final void b(WindowManager.LayoutParams layoutParams, int i3) {
        layoutParams.setFitInsetsSides(i3);
    }

    public final void c(WindowManager.LayoutParams layoutParams, int i3) {
        layoutParams.setFitInsetsTypes(i3);
    }
}
