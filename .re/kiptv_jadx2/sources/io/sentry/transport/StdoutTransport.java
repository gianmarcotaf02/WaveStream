package io.sentry.transport;

import io.sentry.Hint;
import io.sentry.ISerializer;
import io.sentry.SentryEnvelope;
import io.sentry.util.Objects;

public final class StdoutTransport implements ITransport {
    private final ISerializer serializer;

    public StdoutTransport(ISerializer iSerializer) {
        this.serializer = (ISerializer) Objects.requireNonNull(iSerializer, "Serializer is required");
    }

    @Override
    public void close() {
    }

    @Override
    public void flush(long j) {
        System.out.println("Flushing");
    }

    @Override
    public RateLimiter getRateLimiter() {
        return null;
    }

    @Override
    public void send(SentryEnvelope sentryEnvelope, Hint hint) {
        Objects.requireNonNull(sentryEnvelope, "SentryEnvelope is required");
        try {
            this.serializer.serialize(sentryEnvelope, System.out);
        } catch (Throwable unused) {
        }
    }

    @Override
    public void close(boolean z6) {
    }
}
