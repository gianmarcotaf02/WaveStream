package io.sentry;

public interface Integration {
    void register(IScopes iScopes, SentryOptions sentryOptions);
}
