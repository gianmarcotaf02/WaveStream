package androidx.media3.common;

import android.media.MediaCodecInfo;
import org.videolan.libvlc.MediaDiscoverer;

public abstract class a {
    public static MediaCodecInfo.VideoCapabilities.PerformancePoint d() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(MediaDiscoverer.Event.Started, 720, 60);
    }

    public static MediaCodecInfo.VideoCapabilities.PerformancePoint e(int i3, int i9, int i10) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i3, i9, i10);
    }

    public static MediaCodecInfo.VideoCapabilities.PerformancePoint f(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static void i() {
    }
}
