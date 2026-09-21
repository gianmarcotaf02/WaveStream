package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final class AppState {
    private static io.sentry.android.core.AppState instance = new io.sentry.android.core.AppState();
    private final io.sentry.util.AutoClosableReentrantLock lock = new io.sentry.util.AutoClosableReentrantLock();
    private java.lang.Boolean inBackground = null;

    private AppState() {
    }

    public static io.sentry.android.core.AppState getInstance() {
        return instance;
    }

    public java.lang.Boolean isInBackground() {
        return this.inBackground;
    }

    public void resetInstance() {
        instance = new io.sentry.android.core.AppState();
    }

    public void setInBackground(boolean z6) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.inBackground = java.lang.Boolean.valueOf(z6);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
