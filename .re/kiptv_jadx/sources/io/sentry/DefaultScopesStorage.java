package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultScopesStorage implements io.sentry.IScopesStorage {
    private static final java.lang.ThreadLocal<io.sentry.IScopes> currentScopes = new java.lang.ThreadLocal<>();

    public static final class DefaultScopesLifecycleToken implements io.sentry.ISentryLifecycleToken {
        private final io.sentry.IScopes oldValue;

        public DefaultScopesLifecycleToken(io.sentry.IScopes iScopes) {
            this.oldValue = iScopes;
        }

        @Override // io.sentry.ISentryLifecycleToken, java.lang.AutoCloseable
        public void close() {
            io.sentry.DefaultScopesStorage.currentScopes.set(this.oldValue);
        }
    }

    @Override // io.sentry.IScopesStorage
    public void close() {
        currentScopes.remove();
    }

    @Override // io.sentry.IScopesStorage
    public io.sentry.IScopes get() {
        return currentScopes.get();
    }

    @Override // io.sentry.IScopesStorage
    public void init() {
    }

    @Override // io.sentry.IScopesStorage
    public io.sentry.ISentryLifecycleToken set(io.sentry.IScopes iScopes) {
        io.sentry.IScopes iScopes2 = get();
        currentScopes.set(iScopes);
        return new io.sentry.DefaultScopesStorage.DefaultScopesLifecycleToken(iScopes2);
    }
}
