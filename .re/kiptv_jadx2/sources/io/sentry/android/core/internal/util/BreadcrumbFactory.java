package io.sentry.android.core.internal.util;

import io.sentry.Breadcrumb;
import io.sentry.SentryLevel;
import io.sentry.protocol.SentryThread;

public class BreadcrumbFactory {
    public static Breadcrumb forSession(String str) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType("session");
        breadcrumb.setData(SentryThread.JsonKeys.STATE, str);
        breadcrumb.setCategory("app.lifecycle");
        breadcrumb.setLevel(SentryLevel.INFO);
        return breadcrumb;
    }
}
