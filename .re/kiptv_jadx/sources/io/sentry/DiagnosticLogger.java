package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class DiagnosticLogger implements io.sentry.ILogger {
    private final io.sentry.ILogger logger;
    private final io.sentry.SentryOptions options;

    public DiagnosticLogger(io.sentry.SentryOptions sentryOptions, io.sentry.ILogger iLogger) {
        this.options = (io.sentry.SentryOptions) io.sentry.util.Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        this.logger = iLogger;
    }

    public io.sentry.ILogger getLogger() {
        return this.logger;
    }

    @Override // io.sentry.ILogger
    public boolean isEnabled(io.sentry.SentryLevel sentryLevel) {
        return sentryLevel != null && this.options.isDebug() && sentryLevel.ordinal() >= this.options.getDiagnosticLevel().ordinal();
    }

    @Override // io.sentry.ILogger
    public void log(io.sentry.SentryLevel sentryLevel, java.lang.String str, java.lang.Object... objArr) {
        if (this.logger == null || !isEnabled(sentryLevel)) {
            return;
        }
        this.logger.log(sentryLevel, str, objArr);
    }

    @Override // io.sentry.ILogger
    public void log(io.sentry.SentryLevel sentryLevel, java.lang.String str, java.lang.Throwable th) {
        if (this.logger == null || !isEnabled(sentryLevel)) {
            return;
        }
        this.logger.log(sentryLevel, str, th);
    }

    @Override // io.sentry.ILogger
    public void log(io.sentry.SentryLevel sentryLevel, java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (this.logger == null || !isEnabled(sentryLevel)) {
            return;
        }
        this.logger.log(sentryLevel, th, str, objArr);
    }
}
