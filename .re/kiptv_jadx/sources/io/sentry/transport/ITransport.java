package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
public interface ITransport extends java.io.Closeable {
    void close(boolean z6);

    void flush(long j);

    io.sentry.transport.RateLimiter getRateLimiter();

    default boolean isHealthy() {
        return true;
    }

    default void send(io.sentry.SentryEnvelope sentryEnvelope) {
        send(sentryEnvelope, new io.sentry.Hint());
    }

    void send(io.sentry.SentryEnvelope sentryEnvelope, io.sentry.Hint hint);
}
