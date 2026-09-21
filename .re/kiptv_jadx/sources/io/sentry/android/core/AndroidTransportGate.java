package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
final class AndroidTransportGate implements io.sentry.transport.ITransportGate {
    private final io.sentry.SentryOptions options;

    /* JADX INFO: renamed from: io.sentry.android.core.AndroidTransportGate$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus;

        static {
            int[] iArr = new int[io.sentry.IConnectionStatusProvider.ConnectionStatus.values().length];
            $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus = iArr;
            try {
                iArr[io.sentry.IConnectionStatusProvider.ConnectionStatus.CONNECTED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[io.sentry.IConnectionStatusProvider.ConnectionStatus.UNKNOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[io.sentry.IConnectionStatusProvider.ConnectionStatus.NO_PERMISSION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public AndroidTransportGate(io.sentry.SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // io.sentry.transport.ITransportGate
    public boolean isConnected() {
        return isConnected(this.options.getConnectionStatusProvider().getConnectionStatus());
    }

    public boolean isConnected(io.sentry.IConnectionStatusProvider.ConnectionStatus connectionStatus) {
        int i3 = io.sentry.android.core.AndroidTransportGate.AnonymousClass1.$SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[connectionStatus.ordinal()];
        return i3 == 1 || i3 == 2 || i3 == 3;
    }
}
