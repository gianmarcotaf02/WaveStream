package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpConnectionStatusProvider implements io.sentry.IConnectionStatusProvider {
    @Override // io.sentry.IConnectionStatusProvider
    public boolean addConnectionStatusObserver(io.sentry.IConnectionStatusProvider.IConnectionStatusObserver iConnectionStatusObserver) {
        return false;
    }

    @Override // io.sentry.IConnectionStatusProvider
    public io.sentry.IConnectionStatusProvider.ConnectionStatus getConnectionStatus() {
        return io.sentry.IConnectionStatusProvider.ConnectionStatus.UNKNOWN;
    }

    @Override // io.sentry.IConnectionStatusProvider
    public java.lang.String getConnectionType() {
        return null;
    }

    @Override // io.sentry.IConnectionStatusProvider
    public void removeConnectionStatusObserver(io.sentry.IConnectionStatusProvider.IConnectionStatusObserver iConnectionStatusObserver) {
    }
}
