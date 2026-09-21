package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
interface UncaughtExceptionHandler {

    public static final class Adapter implements io.sentry.UncaughtExceptionHandler {
        private static final io.sentry.UncaughtExceptionHandler.Adapter INSTANCE = new io.sentry.UncaughtExceptionHandler.Adapter();

        private Adapter() {
        }

        public static io.sentry.UncaughtExceptionHandler getInstance() {
            return INSTANCE;
        }

        @Override // io.sentry.UncaughtExceptionHandler
        public java.lang.Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler() {
            return java.lang.Thread.getDefaultUncaughtExceptionHandler();
        }

        @Override // io.sentry.UncaughtExceptionHandler
        public void setDefaultUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            java.lang.Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    java.lang.Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler();

    void setDefaultUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler);
}
