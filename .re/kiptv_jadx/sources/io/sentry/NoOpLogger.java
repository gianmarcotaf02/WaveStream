package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpLogger implements io.sentry.ILogger {
    private static final io.sentry.NoOpLogger instance = new io.sentry.NoOpLogger();

    private NoOpLogger() {
    }

    public static io.sentry.NoOpLogger getInstance() {
        return instance;
    }

    @Override // io.sentry.ILogger
    public boolean isEnabled(io.sentry.SentryLevel sentryLevel) {
        return false;
    }

    @Override // io.sentry.ILogger
    public void log(io.sentry.SentryLevel sentryLevel, java.lang.String str, java.lang.Throwable th) {
    }

    @Override // io.sentry.ILogger
    public void log(io.sentry.SentryLevel sentryLevel, java.lang.String str, java.lang.Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public void log(io.sentry.SentryLevel sentryLevel, java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
    }
}
