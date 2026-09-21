package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
public final class StdoutTransport implements io.sentry.transport.ITransport {
    private final io.sentry.ISerializer serializer;

    public StdoutTransport(io.sentry.ISerializer iSerializer) {
        this.serializer = (io.sentry.ISerializer) io.sentry.util.Objects.requireNonNull(iSerializer, "Serializer is required");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.sentry.transport.ITransport
    public void flush(long j) {
        java.lang.System.out.println("Flushing");
    }

    @Override // io.sentry.transport.ITransport
    public io.sentry.transport.RateLimiter getRateLimiter() {
        return null;
    }

    @Override // io.sentry.transport.ITransport
    public void send(io.sentry.SentryEnvelope sentryEnvelope, io.sentry.Hint hint) {
        io.sentry.util.Objects.requireNonNull(sentryEnvelope, "SentryEnvelope is required");
        try {
            this.serializer.serialize(sentryEnvelope, java.lang.System.out);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // io.sentry.transport.ITransport
    public void close(boolean z6) {
    }
}
