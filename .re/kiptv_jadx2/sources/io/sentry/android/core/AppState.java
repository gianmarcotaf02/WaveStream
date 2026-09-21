package io.sentry.android.core;

import io.sentry.ISentryLifecycleToken;
import io.sentry.util.AutoClosableReentrantLock;

public final class AppState {
    private static AppState instance = new AppState();
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    private Boolean inBackground = null;

    private AppState() {
    }

    public static AppState getInstance() {
        return instance;
    }

    public Boolean isInBackground() {
        return this.inBackground;
    }

    public void resetInstance() {
        instance = new AppState();
    }

    public void setInBackground(boolean z6) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.inBackground = Boolean.valueOf(z6);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
