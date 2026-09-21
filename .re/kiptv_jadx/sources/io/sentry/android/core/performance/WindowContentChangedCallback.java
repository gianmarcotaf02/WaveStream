package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes4.dex */
public class WindowContentChangedCallback extends io.sentry.android.core.internal.gestures.WindowCallbackAdapter {
    private final java.lang.Runnable callback;

    public WindowContentChangedCallback(android.view.Window.Callback callback, java.lang.Runnable runnable) {
        super(callback);
        this.callback = runnable;
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        this.callback.run();
    }
}
