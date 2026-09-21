package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface IConnectionStatusProvider {

    public enum ConnectionStatus {
        UNKNOWN,
        CONNECTED,
        DISCONNECTED,
        NO_PERMISSION
    }

    public interface IConnectionStatusObserver {
        void onConnectionStatusChanged(io.sentry.IConnectionStatusProvider.ConnectionStatus connectionStatus);
    }

    boolean addConnectionStatusObserver(io.sentry.IConnectionStatusProvider.IConnectionStatusObserver iConnectionStatusObserver);

    io.sentry.IConnectionStatusProvider.ConnectionStatus getConnectionStatus();

    java.lang.String getConnectionType();

    void removeConnectionStatusObserver(io.sentry.IConnectionStatusProvider.IConnectionStatusObserver iConnectionStatusObserver);
}
