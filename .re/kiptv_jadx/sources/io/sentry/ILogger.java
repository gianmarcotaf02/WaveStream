package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface ILogger {
    boolean isEnabled(io.sentry.SentryLevel sentryLevel);

    void log(io.sentry.SentryLevel sentryLevel, java.lang.String str, java.lang.Throwable th);

    void log(io.sentry.SentryLevel sentryLevel, java.lang.String str, java.lang.Object... objArr);

    void log(io.sentry.SentryLevel sentryLevel, java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr);
}
