package io.sentry.transport;

import io.sentry.Hint;
import io.sentry.SentryEnvelope;

public final class NoOpTransport implements ITransport {
    private static final NoOpTransport instance = new NoOpTransport();

    private NoOpTransport() {
    }

    public static NoOpTransport getInstance() {
        return instance;
    }

    @Override
    public void close() {
    }

    @Override
    public void flush(long j) {
    }

    @Override
    public RateLimiter getRateLimiter() {
        return null;
    }

    @Override
    public void send(SentryEnvelope sentryEnvelope, Hint hint) {
    }

    @Override
    public void close(boolean z6) {
    }
}
