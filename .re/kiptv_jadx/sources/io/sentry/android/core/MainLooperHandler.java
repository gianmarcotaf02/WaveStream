package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
final class MainLooperHandler {
    private final android.os.Handler handler;

    public MainLooperHandler() {
        this(android.os.Looper.getMainLooper());
    }

    public java.lang.Thread getThread() {
        return this.handler.getLooper().getThread();
    }

    public void post(java.lang.Runnable runnable) {
        this.handler.post(runnable);
    }

    public MainLooperHandler(android.os.Looper looper) {
        this.handler = new android.os.Handler(looper);
    }
}
