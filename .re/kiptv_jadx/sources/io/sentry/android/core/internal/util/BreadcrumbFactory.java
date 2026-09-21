package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public class BreadcrumbFactory {
    public static io.sentry.Breadcrumb forSession(java.lang.String str) {
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb();
        breadcrumb.setType("session");
        breadcrumb.setData(io.sentry.protocol.SentryThread.JsonKeys.STATE, str);
        breadcrumb.setCategory("app.lifecycle");
        breadcrumb.setLevel(io.sentry.SentryLevel.INFO);
        return breadcrumb;
    }
}
