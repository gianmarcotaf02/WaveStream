package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryCrashLastRunState {
    private static final io.sentry.SentryCrashLastRunState INSTANCE = new io.sentry.SentryCrashLastRunState();
    private java.lang.Boolean crashedLastRun;
    private final io.sentry.util.AutoClosableReentrantLock crashedLastRunLock = new io.sentry.util.AutoClosableReentrantLock();
    private boolean readCrashedLastRun;

    private SentryCrashLastRunState() {
    }

    public static io.sentry.SentryCrashLastRunState getInstance() {
        return INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004e  */
    public java.lang.Boolean isCrashedLastRun(java.lang.String str, boolean z6) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.crashedLastRunLock.acquire();
        try {
            if (this.readCrashedLastRun) {
                java.lang.Boolean bool = this.crashedLastRun;
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return bool;
            }
            if (str == null) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return null;
            }
            boolean z9 = true;
            this.readCrashedLastRun = true;
            java.io.File file = new java.io.File(str, io.sentry.cache.EnvelopeCache.CRASH_MARKER_FILE);
            java.io.File file2 = new java.io.File(str, io.sentry.cache.EnvelopeCache.NATIVE_CRASH_MARKER_FILE);
            try {
                try {
                    if (!file.exists()) {
                        if (!file2.exists()) {
                            z9 = false;
                        } else if (z6) {
                            file2.delete();
                        }
                        this.crashedLastRun = java.lang.Boolean.valueOf(z9);
                        if (iSentryLifecycleTokenAcquire != null) {
                            iSentryLifecycleTokenAcquire.close();
                        }
                        return this.crashedLastRun;
                    }
                    file.delete();
                } catch (java.lang.Throwable unused) {
                }
            } catch (java.lang.Throwable unused2) {
            }
            this.crashedLastRun = java.lang.Boolean.valueOf(z9);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return this.crashedLastRun;
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

    public void reset() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.crashedLastRunLock.acquire();
        try {
            this.readCrashedLastRun = false;
            this.crashedLastRun = null;
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

    public void setCrashedLastRun(boolean z6) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.crashedLastRunLock.acquire();
        try {
            if (!this.readCrashedLastRun) {
                this.crashedLastRun = java.lang.Boolean.valueOf(z6);
                this.readCrashedLastRun = true;
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
}
