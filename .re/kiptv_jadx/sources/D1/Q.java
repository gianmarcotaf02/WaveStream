package D1;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {
    public static android.view.WindowInsets a(android.view.View view, android.view.WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static java.lang.CharSequence b(android.view.View view) {
        return view.getStateDescription();
    }
}
