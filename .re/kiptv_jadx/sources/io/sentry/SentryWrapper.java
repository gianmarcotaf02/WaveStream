package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryWrapper {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object lambda$wrapCallable$0(io.sentry.IScopes iScopes, java.util.concurrent.Callable callable) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = iScopes.makeCurrent();
        try {
            java.lang.Object objCall = callable.call();
            if (iSentryLifecycleTokenMakeCurrent != null) {
                iSentryLifecycleTokenMakeCurrent.close();
            }
            return objCall;
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenMakeCurrent != null) {
                try {
                    iSentryLifecycleTokenMakeCurrent.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object lambda$wrapSupplier$1(io.sentry.IScopes iScopes, java.util.function.Supplier supplier) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = iScopes.makeCurrent();
        try {
            java.lang.Object obj = supplier.get();
            if (iSentryLifecycleTokenMakeCurrent != null) {
                iSentryLifecycleTokenMakeCurrent.close();
            }
            return obj;
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenMakeCurrent != null) {
                try {
                    iSentryLifecycleTokenMakeCurrent.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static <U> java.util.concurrent.Callable<U> wrapCallable(java.util.concurrent.Callable<U> callable) {
        return new io.sentry.q(io.sentry.Sentry.getCurrentScopes().forkedScopes("SentryWrapper.wrapCallable"), callable, 5);
    }

    public static <U> java.util.function.Supplier<U> wrapSupplier(final java.util.function.Supplier<U> supplier) {
        final io.sentry.IScopes iScopesForkedScopes = io.sentry.Sentry.forkedScopes("SentryWrapper.wrapSupplier");
        return new java.util.function.Supplier() { // from class: io.sentry.u
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return io.sentry.SentryWrapper.lambda$wrapSupplier$1(iScopesForkedScopes, supplier);
            }
        };
    }
}
