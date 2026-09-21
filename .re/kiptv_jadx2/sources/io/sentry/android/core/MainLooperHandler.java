package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;

final class MainLooperHandler {
    private final Handler handler;

    public MainLooperHandler() {
        this(Looper.getMainLooper());
    }

    public Thread getThread() {
        return this.handler.getLooper().getThread();
    }

    public void post(Runnable runnable) {
        this.handler.post(runnable);
    }

    public MainLooperHandler(Looper looper) {
        this.handler = new Handler(looper);
    }
}
