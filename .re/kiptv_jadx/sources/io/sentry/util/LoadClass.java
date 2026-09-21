package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public class LoadClass {
    public boolean isClassAvailable(java.lang.String str, io.sentry.ILogger iLogger) {
        return loadClass(str, iLogger) != null;
    }

    public java.lang.Class<?> loadClass(java.lang.String str, io.sentry.ILogger iLogger) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e6) {
            if (iLogger == null) {
                return null;
            }
            iLogger.log(io.sentry.SentryLevel.DEBUG, "Class not available:" + str, e6);
            return null;
        } catch (java.lang.UnsatisfiedLinkError e9) {
            if (iLogger == null) {
                return null;
            }
            iLogger.log(io.sentry.SentryLevel.ERROR, "Failed to load (UnsatisfiedLinkError) " + str, e9);
            return null;
        } catch (java.lang.Throwable th) {
            if (iLogger == null) {
                return null;
            }
            iLogger.log(io.sentry.SentryLevel.ERROR, "Failed to initialize " + str, th);
            return null;
        }
    }

    public boolean isClassAvailable(java.lang.String str, io.sentry.SentryOptions sentryOptions) {
        return isClassAvailable(str, sentryOptions != null ? sentryOptions.getLogger() : null);
    }
}
