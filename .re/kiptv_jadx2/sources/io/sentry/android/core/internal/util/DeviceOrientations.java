package io.sentry.android.core.internal.util;

import io.sentry.protocol.Device;

public final class DeviceOrientations {
    private DeviceOrientations() {
    }

    public static Device.DeviceOrientation getOrientation(int i3) {
        if (i3 == 1) {
            return Device.DeviceOrientation.PORTRAIT;
        }
        if (i3 != 2) {
            return null;
        }
        return Device.DeviceOrientation.LANDSCAPE;
    }
}
