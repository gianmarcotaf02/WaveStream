package E1;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ android.graphics.text.LineBreakConfig.Builder d() {
        return new android.graphics.text.LineBreakConfig.Builder();
    }

    public static /* synthetic */ android.text.BoringLayout h(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i3, android.text.Layout.Alignment alignment, android.text.BoringLayout.Metrics metrics, boolean z6, android.text.TextUtils.TruncateAt truncateAt, int i9) {
        return new android.text.BoringLayout(charSequence, textPaint, i3, alignment, 1.0f, 0.0f, metrics, z6, truncateAt, i9, true);
    }

    public static /* synthetic */ android.view.inputmethod.EditorBoundsInfo.Builder k() {
        return new android.view.inputmethod.EditorBoundsInfo.Builder();
    }

    public static /* bridge */ /* synthetic */ android.window.OnBackInvokedCallback n(java.lang.Object obj) {
        return (android.window.OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ android.window.OnBackInvokedDispatcher q(java.lang.Object obj) {
        return (android.window.OnBackInvokedDispatcher) obj;
    }
}
