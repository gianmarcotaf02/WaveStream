package io.sentry.transport;

import io.sentry.Hint;
import io.sentry.SentryEnvelope;
import java.io.Closeable;

public interface ITransport extends Closeable {
    void close(boolean z6);

    void flush(long j);

    RateLimiter getRateLimiter();

    default boolean isHealthy() {
        return true;
    }

    default void send(SentryEnvelope sentryEnvelope) {
        send(sentryEnvelope, new Hint());
    }

    void send(SentryEnvelope sentryEnvelope, Hint hint);
}
