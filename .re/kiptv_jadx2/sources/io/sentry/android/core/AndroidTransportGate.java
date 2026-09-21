package io.sentry.android.core;

import io.sentry.IConnectionStatusProvider;
import io.sentry.SentryOptions;
import io.sentry.transport.ITransportGate;

final class AndroidTransportGate implements ITransportGate {
    private final SentryOptions options;

    public static class AnonymousClass1 {
        static final int[] $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus;

        static {
            int[] iArr = new int[IConnectionStatusProvider.ConnectionStatus.values().length];
            $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus = iArr;
            try {
                iArr[IConnectionStatusProvider.ConnectionStatus.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[IConnectionStatusProvider.ConnectionStatus.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[IConnectionStatusProvider.ConnectionStatus.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AndroidTransportGate(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override
    public boolean isConnected() {
        return isConnected(this.options.getConnectionStatusProvider().getConnectionStatus());
    }

    public boolean isConnected(IConnectionStatusProvider.ConnectionStatus connectionStatus) {
        int i3 = AnonymousClass1.$SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[connectionStatus.ordinal()];
        return i3 == 1 || i3 == 2 || i3 == 3;
    }
}
