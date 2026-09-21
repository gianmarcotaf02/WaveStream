package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpTransportGate implements io.sentry.transport.ITransportGate {
    private static final io.sentry.transport.NoOpTransportGate instance = new io.sentry.transport.NoOpTransportGate();

    private NoOpTransportGate() {
    }

    public static io.sentry.transport.NoOpTransportGate getInstance() {
        return instance;
    }

    @Override // io.sentry.transport.ITransportGate
    public boolean isConnected() {
        return true;
    }
}
