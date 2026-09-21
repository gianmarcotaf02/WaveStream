package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryRandom {
    private static final io.sentry.util.SentryRandom.SentryRandomThreadLocal instance = new io.sentry.util.SentryRandom.SentryRandomThreadLocal();

    public static class SentryRandomThreadLocal extends java.lang.ThreadLocal<io.sentry.util.Random> {
        private SentryRandomThreadLocal() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public io.sentry.util.Random initialValue() {
            return new io.sentry.util.Random();
        }
    }

    public static io.sentry.util.Random current() {
        return instance.get();
    }
}
