package p103m;

/* JADX INFO: loaded from: classes.dex */
public abstract class f1 {
    public static void a(android.view.View view, android.graphics.Rect rect, android.graphics.Rect rect2) {
        android.graphics.Insets systemWindowInsets = view.computeSystemWindowInsets(new android.view.WindowInsets.Builder().setSystemWindowInsets(android.graphics.Insets.of(rect)).build(), rect2).getSystemWindowInsets();
        rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
    }
}
