package E1;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.EditorBoundsInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

public abstract class c {
    public static LineBreakConfig.Builder d() {
        return new LineBreakConfig.Builder();
    }

    public static BoringLayout h(CharSequence charSequence, TextPaint textPaint, int i3, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z6, TextUtils.TruncateAt truncateAt, int i9) {
        return new BoringLayout(charSequence, textPaint, i3, alignment, 1.0f, 0.0f, metrics, z6, truncateAt, i9, true);
    }

    public static EditorBoundsInfo.Builder k() {
        return new EditorBoundsInfo.Builder();
    }

    public static OnBackInvokedCallback n(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static OnBackInvokedDispatcher q(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }
}
