package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpTransport implements io.sentry.transport.ITransport {
    private static final io.sentry.transport.NoOpTransport instance = new io.sentry.transport.NoOpTransport();

    private NoOpTransport() {
    }

    public static io.sentry.transport.NoOpTransport getInstance() {
        return instance;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.sentry.transport.ITransport
    public void flush(long j) {
    }

    @Override // io.sentry.transport.ITransport
    public io.sentry.transport.RateLimiter getRateLimiter() {
        return null;
    }

    @Override // io.sentry.transport.ITransport
    public void send(io.sentry.SentryEnvelope sentryEnvelope, io.sentry.Hint hint) {
    }

    @Override // io.sentry.transport.ITransport
    public void close(boolean z6) {
    }
}
