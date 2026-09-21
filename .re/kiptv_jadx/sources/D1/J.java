package D1;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {
    public static android.view.WindowInsets a(android.view.View view, android.view.WindowInsets windowInsets) {
        int i3 = D1.W.f1986a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static android.view.WindowInsets b(android.view.View view, android.view.WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(android.view.View view) {
        view.requestApplyInsets();
    }
}
