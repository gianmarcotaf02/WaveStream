package io.sentry;

public final class NoOpLogger implements ILogger {
    private static final NoOpLogger instance = new NoOpLogger();

    private NoOpLogger() {
    }

    public static NoOpLogger getInstance() {
        return instance;
    }

    @Override
    public boolean isEnabled(SentryLevel sentryLevel) {
        return false;
    }

    @Override
    public void log(SentryLevel sentryLevel, String str, Throwable th) {
    }

    @Override
    public void log(SentryLevel sentryLevel, String str, Object... objArr) {
    }

    @Override
    public void log(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
    }
}
