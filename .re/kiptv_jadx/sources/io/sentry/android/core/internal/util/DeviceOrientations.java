package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public final class DeviceOrientations {
    private DeviceOrientations() {
    }

    public static io.sentry.protocol.Device.DeviceOrientation getOrientation(int i3) {
        if (i3 == 1) {
            return io.sentry.protocol.Device.DeviceOrientation.PORTRAIT;
        }
        if (i3 != 2) {
            return null;
        }
        return io.sentry.protocol.Device.DeviceOrientation.LANDSCAPE;
    }
}
