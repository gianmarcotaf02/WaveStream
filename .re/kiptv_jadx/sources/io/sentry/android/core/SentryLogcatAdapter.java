package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryLogcatAdapter {
    private static void addAsBreadcrumb(java.lang.String str, io.sentry.SentryLevel sentryLevel, java.lang.String str2) {
        addAsBreadcrumb(str, sentryLevel, str2, null);
    }

    public static int d(java.lang.String str, java.lang.String str2) {
        addAsBreadcrumb(str, io.sentry.SentryLevel.DEBUG, str2);
        return android.util.Log.d(str, str2);
    }

    public static int e(java.lang.String str, java.lang.String str2) {
        addAsBreadcrumb(str, io.sentry.SentryLevel.ERROR, str2);
        return android.util.Log.e(str, str2);
    }

    public static int i(java.lang.String str, java.lang.String str2) {
        addAsBreadcrumb(str, io.sentry.SentryLevel.INFO, str2);
        return android.util.Log.i(str, str2);
    }

    public static int v(java.lang.String str, java.lang.String str2) {
        addAsBreadcrumb(str, io.sentry.SentryLevel.DEBUG, str2);
        return android.util.Log.v(str, str2);
    }

    public static int w(java.lang.String str, java.lang.String str2) {
        addAsBreadcrumb(str, io.sentry.SentryLevel.WARNING, str2);
        return android.util.Log.w(str, str2);
    }

    public static int wtf(java.lang.String str, java.lang.String str2) {
        addAsBreadcrumb(str, io.sentry.SentryLevel.ERROR, str2);
        return android.util.Log.wtf(str, str2);
    }

    private static void addAsBreadcrumb(java.lang.String str, io.sentry.SentryLevel sentryLevel, java.lang.Throwable th) {
        addAsBreadcrumb(str, sentryLevel, null, th);
    }

    private static void addAsBreadcrumb(java.lang.String str, io.sentry.SentryLevel sentryLevel, java.lang.String str2, java.lang.Throwable th) {
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb();
        breadcrumb.setCategory("Logcat");
        breadcrumb.setMessage(str2);
        breadcrumb.setLevel(sentryLevel);
        if (str != null) {
            breadcrumb.setData("tag", str);
        }
        if (th != null && th.getMessage() != null) {
            breadcrumb.setData("throwable", th.getMessage());
        }
        io.sentry.Sentry.addBreadcrumb(breadcrumb);
    }

    public static int d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        addAsBreadcrumb(str, io.sentry.SentryLevel.DEBUG, str2, th);
        return android.util.Log.d(str, str2, th);
    }

    public static int e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        addAsBreadcrumb(str, io.sentry.SentryLevel.ERROR, str2, th);
        return android.util.Log.e(str, str2, th);
    }

    public static int i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        addAsBreadcrumb(str, io.sentry.SentryLevel.INFO, str2, th);
        return android.util.Log.i(str, str2, th);
    }

    public static int v(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        addAsBreadcrumb(str, io.sentry.SentryLevel.DEBUG, str2, th);
        return android.util.Log.v(str, str2, th);
    }

    public static int w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        addAsBreadcrumb(str, io.sentry.SentryLevel.WARNING, str2, th);
        return android.util.Log.w(str, str2, th);
    }

    public static int wtf(java.lang.String str, java.lang.Throwable th) {
        addAsBreadcrumb(str, io.sentry.SentryLevel.ERROR, th);
        return android.util.Log.wtf(str, th);
    }

    public static int w(java.lang.String str, java.lang.Throwable th) {
        addAsBreadcrumb(str, io.sentry.SentryLevel.WARNING, th);
        return android.util.Log.w(str, th);
    }

    public static int wtf(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        addAsBreadcrumb(str, io.sentry.SentryLevel.ERROR, str2, th);
        return android.util.Log.wtf(str, str2, th);
    }
}
