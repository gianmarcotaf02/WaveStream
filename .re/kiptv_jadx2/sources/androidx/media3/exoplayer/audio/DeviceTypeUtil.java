package androidx.media3.exoplayer.audio;

import android.os.Build;

final class DeviceTypeUtil {
    private DeviceTypeUtil() {
    }

    public static boolean isBluetoothDevice(int i3) {
        if (i3 == 8 || i3 == 7) {
            return true;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 31 || !(i3 == 26 || i3 == 27)) {
            return i9 >= 33 && i3 == 30;
        }
        return true;
    }

    public static boolean isBuiltInEarpiece(int i3) {
        return i3 == 1;
    }

    public static boolean isBuiltInSpeaker(int i3) {
        return i3 == 2;
    }

    public static boolean isHdmiArc(int i3) {
        return i3 == 10;
    }

    public static boolean isHdmiEarc(int i3) {
        return Build.VERSION.SDK_INT >= 31 && i3 == 29;
    }

    public static boolean isUsbDevice(int i3) {
        if (i3 == 11 || i3 == 12) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 31 && i3 == 22;
    }
}
