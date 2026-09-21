package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class ShutdownHookIntegration implements io.sentry.Integration, java.io.Closeable, java.lang.AutoCloseable {
    private final java.lang.Runtime runtime;
    private java.lang.Thread thread;

    public ShutdownHookIntegration(java.lang.Runtime runtime) {
        this.runtime = (java.lang.Runtime) io.sentry.util.Objects.requireNonNull(runtime, "Runtime is required");
    }

    private void handleShutdownInProgress(java.lang.Runnable runnable) {
        try {
            runnable.run();
        } catch (java.lang.IllegalStateException e6) {
            java.lang.String message = e6.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e6;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$2() {
        this.runtime.removeShutdownHook(this.thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$register$0(io.sentry.IScopes iScopes, io.sentry.SentryOptions sentryOptions) {
        iScopes.flush(sentryOptions.getFlushTimeoutMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$register$1(io.sentry.SentryOptions sentryOptions) {
        this.runtime.addShutdownHook(this.thread);
        sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "ShutdownHookIntegration installed.", new java.lang.Object[0]);
        io.sentry.util.IntegrationUtils.addIntegrationToSdkVersion("ShutdownHook");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.thread != null) {
            handleShutdownInProgress(new io.sentry.l(1, this));
        }
    }

    public java.lang.Thread getHook() {
        return this.thread;
    }

    @Override // io.sentry.Integration
    public void register(io.sentry.IScopes iScopes, io.sentry.SentryOptions sentryOptions) {
        io.sentry.util.Objects.requireNonNull(iScopes, "Scopes are required");
        io.sentry.util.Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        if (!sentryOptions.isEnableShutdownHook()) {
            sentryOptions.getLogger().log(io.sentry.SentryLevel.INFO, "enableShutdownHook is disabled.", new java.lang.Object[0]);
        } else {
            this.thread = new java.lang.Thread(new io.sentry.a(iScopes, sentryOptions, 2));
            handleShutdownInProgress(new io.sentry.a(this, sentryOptions, 3));
        }
    }

    public ShutdownHookIntegration() {
        this(java.lang.Runtime.getRuntime());
    }
}
