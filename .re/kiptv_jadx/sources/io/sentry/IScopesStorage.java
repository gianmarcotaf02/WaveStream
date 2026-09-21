package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface IScopesStorage {
    void close();

    io.sentry.IScopes get();

    void init();

    io.sentry.ISentryLifecycleToken set(io.sentry.IScopes iScopes);
}
