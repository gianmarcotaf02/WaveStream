package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public final class SentrySpanStorage {
    private static volatile io.sentry.SentrySpanStorage INSTANCE;
    private static final io.sentry.util.AutoClosableReentrantLock staticLock = new io.sentry.util.AutoClosableReentrantLock();
    private final java.util.Map<java.lang.String, io.sentry.ISpan> spans = new java.util.concurrent.ConcurrentHashMap();

    private SentrySpanStorage() {
    }

    public static io.sentry.SentrySpanStorage getInstance() {
        if (INSTANCE == null) {
            io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
            try {
                if (INSTANCE == null) {
                    INSTANCE = new io.sentry.SentrySpanStorage();
                }
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
        return INSTANCE;
    }

    public io.sentry.ISpan get(java.lang.String str) {
        return this.spans.get(str);
    }

    public io.sentry.ISpan removeAndGet(java.lang.String str) {
        return this.spans.remove(str);
    }

    public void store(java.lang.String str, io.sentry.ISpan iSpan) {
        this.spans.put(str, iSpan);
    }
}
