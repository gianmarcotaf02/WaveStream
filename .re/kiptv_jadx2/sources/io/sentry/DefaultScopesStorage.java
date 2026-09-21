package io.sentry;

public final class DefaultScopesStorage implements IScopesStorage {
    private static final ThreadLocal<IScopes> currentScopes = new ThreadLocal<>();

    public static final class DefaultScopesLifecycleToken implements ISentryLifecycleToken {
        private final IScopes oldValue;

        public DefaultScopesLifecycleToken(IScopes iScopes) {
            this.oldValue = iScopes;
        }

        @Override
        public void close() {
            DefaultScopesStorage.currentScopes.set(this.oldValue);
        }
    }

    @Override
    public void close() {
        currentScopes.remove();
    }

    @Override
    public IScopes get() {
        return currentScopes.get();
    }

    @Override
    public void init() {
    }

    @Override
    public ISentryLifecycleToken set(IScopes iScopes) {
        IScopes iScopes2 = get();
        currentScopes.set(iScopes);
        return new DefaultScopesLifecycleToken(iScopes2);
    }
}
