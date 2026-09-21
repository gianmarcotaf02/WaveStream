package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final class AnrIntegration implements io.sentry.Integration, java.io.Closeable, java.lang.AutoCloseable {
    private static io.sentry.android.core.ANRWatchDog anrWatchDog;
    protected static final io.sentry.util.AutoClosableReentrantLock watchDogLock = new io.sentry.util.AutoClosableReentrantLock();
    private final android.content.Context context;
    private io.sentry.SentryOptions options;
    private boolean isClosed = false;
    private final io.sentry.util.AutoClosableReentrantLock startLock = new io.sentry.util.AutoClosableReentrantLock();

    public static final class AnrHint implements io.sentry.hints.AbnormalExit, io.sentry.hints.TransactionEnd {
        private final boolean isBackgroundAnr;

        public AnrHint(boolean z6) {
            this.isBackgroundAnr = z6;
        }

        @Override // io.sentry.hints.AbnormalExit
        public boolean ignoreCurrentThread() {
            return true;
        }

        @Override // io.sentry.hints.AbnormalExit
        public java.lang.String mechanism() {
            return this.isBackgroundAnr ? "anr_background" : "anr_foreground";
        }

        @Override // io.sentry.hints.AbnormalExit
        public java.lang.Long timestamp() {
            return null;
        }
    }

    public AnrIntegration(android.content.Context context) {
        this.context = io.sentry.android.core.ContextUtils.getApplicationContext(context);
    }

    private java.lang.Throwable buildAnrThrowable(boolean z6, io.sentry.android.core.SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.ApplicationNotResponding applicationNotResponding) {
        java.lang.String strC = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
        if (z6) {
            strC = p121o0.p.C("Background ", strC);
        }
        io.sentry.android.core.ApplicationNotResponding applicationNotResponding2 = new io.sentry.android.core.ApplicationNotResponding(strC, applicationNotResponding.getThread());
        io.sentry.protocol.Mechanism mechanism = new io.sentry.protocol.Mechanism();
        mechanism.setType("ANR");
        return new io.sentry.exception.ExceptionMechanismException(mechanism, applicationNotResponding2, applicationNotResponding2.getThread(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$register$0(io.sentry.IScopes iScopes, io.sentry.android.core.SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.startLock.acquire();
        try {
            if (!this.isClosed) {
                startAnrWatchdog(iScopes, sentryAndroidOptions);
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

    private void startAnrWatchdog(io.sentry.IScopes iScopes, io.sentry.android.core.SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = watchDogLock.acquire();
        try {
            if (anrWatchDog == null) {
                io.sentry.ILogger logger = sentryAndroidOptions.getLogger();
                io.sentry.SentryLevel sentryLevel = io.sentry.SentryLevel.DEBUG;
                logger.log(sentryLevel, "ANR timeout in milliseconds: %d", java.lang.Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                io.sentry.android.core.ANRWatchDog aNRWatchDog = new io.sentry.android.core.ANRWatchDog(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new io.sentry.android.core.e(this, iScopes, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.context);
                anrWatchDog = aNRWatchDog;
                aNRWatchDog.start();
                sentryAndroidOptions.getLogger().log(sentryLevel, "AnrIntegration installed.", new java.lang.Object[0]);
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire == null) {
                throw th;
            }
            try {
                iSentryLifecycleTokenAcquire.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.startLock.acquire();
        try {
            this.isClosed = true;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            iSentryLifecycleTokenAcquire = watchDogLock.acquire();
            try {
                io.sentry.android.core.ANRWatchDog aNRWatchDog = anrWatchDog;
                if (aNRWatchDog != null) {
                    aNRWatchDog.interrupt();
                    anrWatchDog = null;
                    io.sentry.SentryOptions sentryOptions = this.options;
                    if (sentryOptions != null) {
                        sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "AnrIntegration removed.", new java.lang.Object[0]);
                    }
                }
                if (iSentryLifecycleTokenAcquire != null) {
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
        } finally {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th3) {
                    th.addSuppressed(th3);
                }
            }
        }
    }

    public io.sentry.android.core.ANRWatchDog getANRWatchDog() {
        return anrWatchDog;
    }

    @Override // io.sentry.Integration
    public final void register(io.sentry.IScopes iScopes, io.sentry.SentryOptions sentryOptions) {
        this.options = (io.sentry.SentryOptions) io.sentry.util.Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        register(iScopes, (io.sentry.android.core.SentryAndroidOptions) sentryOptions);
    }

    /* JADX INFO: renamed from: reportANR, reason: merged with bridge method [inline-methods] */
    public void lambda$startAnrWatchdog$1(io.sentry.IScopes iScopes, io.sentry.android.core.SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.ApplicationNotResponding applicationNotResponding) {
        sentryAndroidOptions.getLogger().log(io.sentry.SentryLevel.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
        boolean zEquals = java.lang.Boolean.TRUE.equals(io.sentry.android.core.AppState.getInstance().isInBackground());
        io.sentry.SentryEvent sentryEvent = new io.sentry.SentryEvent(buildAnrThrowable(zEquals, sentryAndroidOptions, applicationNotResponding));
        sentryEvent.setLevel(io.sentry.SentryLevel.ERROR);
        iScopes.captureEvent(sentryEvent, io.sentry.util.HintUtils.createWithTypeCheckHint(new io.sentry.android.core.AnrIntegration.AnrHint(zEquals)));
    }

    private void register(io.sentry.IScopes iScopes, io.sentry.android.core.SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "AnrIntegration enabled: %s", java.lang.Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.util.IntegrationUtils.addIntegrationToSdkVersion("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new io.sentry.android.core.n((java.lang.Object) this, iScopes, (io.sentry.SentryOptions) sentryAndroidOptions, 2));
            } catch (java.lang.Throwable th) {
                sentryAndroidOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
            }
        }
    }
}
