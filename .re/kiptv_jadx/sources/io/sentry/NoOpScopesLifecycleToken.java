package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpScopesLifecycleToken implements io.sentry.ISentryLifecycleToken {
    private static final io.sentry.NoOpScopesLifecycleToken instance = new io.sentry.NoOpScopesLifecycleToken();

    private NoOpScopesLifecycleToken() {
    }

    public static io.sentry.NoOpScopesLifecycleToken getInstance() {
        return instance;
    }

    @Override // io.sentry.ISentryLifecycleToken, java.lang.AutoCloseable
    public void close() {
    }
}
