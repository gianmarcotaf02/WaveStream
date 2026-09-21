package D1;

/* JADX INFO: renamed from: D1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0226k {
    public static android.graphics.drawable.Icon a(android.net.Uri uri) {
        return android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static java.lang.CharSequence b(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static android.graphics.Insets c(android.view.DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void d(android.view.Window window, boolean z6) {
        android.view.View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z6 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z6);
    }

    public static void e(android.view.Window window, boolean z6) {
        window.setDecorFitsSystemWindows(z6);
    }

    public static void f(android.view.View view) {
        view.setImportantForContentCapture(1);
    }

    public static void g(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
