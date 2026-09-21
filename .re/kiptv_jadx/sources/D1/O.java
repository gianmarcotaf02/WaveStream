package D1;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {
    public static java.lang.CharSequence a(android.view.View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean b(android.view.View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean c(android.view.View view) {
        return view.isScreenReaderFocusable();
    }

    public static void d(android.view.View view, boolean z6) {
        view.setAccessibilityHeading(z6);
    }

    public static void e(android.view.View view, java.lang.CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void f(android.view.View view, boolean z6) {
        view.setScreenReaderFocusable(z6);
    }
}
