package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class LogUtils {
    public static void logNotInstanceOf(java.lang.Class<?> cls, java.lang.Object obj, io.sentry.ILogger iLogger) {
        iLogger.log(io.sentry.SentryLevel.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }
}
