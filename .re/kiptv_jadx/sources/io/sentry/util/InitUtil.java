package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class InitUtil {
    public static boolean shouldInit(io.sentry.SentryOptions sentryOptions, io.sentry.SentryOptions sentryOptions2, boolean z6) {
        return !z6 || sentryOptions == null || sentryOptions2.isForceInit() || sentryOptions.getInitPriority().ordinal() <= sentryOptions2.getInitPriority().ordinal();
    }
}
