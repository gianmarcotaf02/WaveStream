package p146r1;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p146r1.s f26772a = new p146r1.s();

    public final int a(android.view.Window window) {
        android.view.WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        android.graphics.Insets insets = currentWindowMetrics.getWindowInsets().getInsets(android.view.WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }

    public final void b(android.view.WindowManager.LayoutParams layoutParams, int i3) {
        layoutParams.setFitInsetsSides(i3);
    }

    public final void c(android.view.WindowManager.LayoutParams layoutParams, int i3) {
        layoutParams.setFitInsetsTypes(i3);
    }
}
