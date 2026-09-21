package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;

public final class SystemOutLogger implements ILogger {
    private String captureStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override
    public boolean isEnabled(SentryLevel sentryLevel) {
        return true;
    }

    @Override
    public void log(SentryLevel sentryLevel, String str, Object... objArr) {
        System.out.println(sentryLevel + ": " + String.format(str, objArr));
    }

    @Override
    public void log(SentryLevel sentryLevel, String str, Throwable th) {
        if (th == null) {
            log(sentryLevel, str, new Object[0]);
            return;
        }
        System.out.println(sentryLevel + ": " + String.format(str, th.toString()) + "\n" + captureStackTrace(th));
    }

    @Override
    public void log(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
        if (th == null) {
            log(sentryLevel, str, objArr);
            return;
        }
        System.out.println(sentryLevel + ": " + String.format(str, objArr) + " \n " + th.toString() + "\n" + captureStackTrace(th));
    }
}
