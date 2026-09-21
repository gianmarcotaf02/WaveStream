package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.internal.gestures.WindowCallbackAdapter;

public class WindowContentChangedCallback extends WindowCallbackAdapter {
    private final Runnable callback;

    public WindowContentChangedCallback(Window.Callback callback, Runnable runnable) {
        super(callback);
        this.callback = runnable;
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        this.callback.run();
    }
}
