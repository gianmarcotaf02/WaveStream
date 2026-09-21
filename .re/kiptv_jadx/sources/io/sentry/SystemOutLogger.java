package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SystemOutLogger implements io.sentry.ILogger {
    private java.lang.String captureStackTrace(java.lang.Throwable th) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // io.sentry.ILogger
    public boolean isEnabled(io.sentry.SentryLevel sentryLevel) {
        return true;
    }

    @Override // io.sentry.ILogger
    public void log(io.sentry.SentryLevel sentryLevel, java.lang.String str, java.lang.Object... objArr) {
        java.lang.System.out.println(sentryLevel + ": " + java.lang.String.format(str, objArr));
    }

    @Override // io.sentry.ILogger
    public void log(io.sentry.SentryLevel sentryLevel, java.lang.String str, java.lang.Throwable th) {
        if (th == null) {
            log(sentryLevel, str, new java.lang.Object[0]);
            return;
        }
        java.lang.System.out.println(sentryLevel + ": " + java.lang.String.format(str, th.toString()) + "\n" + captureStackTrace(th));
    }

    @Override // io.sentry.ILogger
    public void log(io.sentry.SentryLevel sentryLevel, java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (th == null) {
            log(sentryLevel, str, objArr);
            return;
        }
        java.lang.System.out.println(sentryLevel + ": " + java.lang.String.format(str, objArr) + " \n " + th.toString() + "\n" + captureStackTrace(th));
    }
}
