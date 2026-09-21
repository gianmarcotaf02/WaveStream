package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpTransportFactory implements io.sentry.ITransportFactory {
    private static final io.sentry.NoOpTransportFactory instance = new io.sentry.NoOpTransportFactory();

    private NoOpTransportFactory() {
    }

    public static io.sentry.NoOpTransportFactory getInstance() {
        return instance;
    }

    @Override // io.sentry.ITransportFactory
    public io.sentry.transport.ITransport create(io.sentry.SentryOptions sentryOptions, io.sentry.RequestDetails requestDetails) {
        return io.sentry.transport.NoOpTransport.getInstance();
    }
}
