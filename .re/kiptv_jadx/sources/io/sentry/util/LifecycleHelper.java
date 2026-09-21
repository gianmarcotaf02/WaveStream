package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class LifecycleHelper {
    public static void close(java.lang.Object obj) {
        if (obj == null || !(obj instanceof io.sentry.ISentryLifecycleToken)) {
            return;
        }
        ((io.sentry.ISentryLifecycleToken) obj).close();
    }
}
