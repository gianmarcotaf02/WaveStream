package io.sentry.util;

public final class SentryRandom {
    private static final SentryRandomThreadLocal instance = new SentryRandomThreadLocal();

    public static class SentryRandomThreadLocal extends ThreadLocal<Random> {
        private SentryRandomThreadLocal() {
        }

        @Override
        public Random initialValue() {
            return new Random();
        }
    }

    public static Random current() {
        return instance.get();
    }
}
