package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class ExceptionUtils {
    public static java.lang.Throwable findRootCause(java.lang.Throwable th) {
        io.sentry.util.Objects.requireNonNull(th, "throwable cannot be null");
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        return th;
    }

    public static boolean isIgnored(java.util.Set<java.lang.Class<? extends java.lang.Throwable>> set, java.lang.Throwable th) {
        return set.contains(th.getClass());
    }
}
