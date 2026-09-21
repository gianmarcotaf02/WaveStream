package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpScopesStorage implements io.sentry.IScopesStorage {
    private static final io.sentry.NoOpScopesStorage instance = new io.sentry.NoOpScopesStorage();

    private NoOpScopesStorage() {
    }

    public static io.sentry.NoOpScopesStorage getInstance() {
        return instance;
    }

    @Override // io.sentry.IScopesStorage
    public void close() {
    }

    @Override // io.sentry.IScopesStorage
    public io.sentry.IScopes get() {
        return io.sentry.NoOpScopes.getInstance();
    }

    @Override // io.sentry.IScopesStorage
    public void init() {
    }

    @Override // io.sentry.IScopesStorage
    public io.sentry.ISentryLifecycleToken set(io.sentry.IScopes iScopes) {
        return io.sentry.NoOpScopesLifecycleToken.getInstance();
    }
}
