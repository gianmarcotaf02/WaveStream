package androidx.media3.exoplayer;

import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

public final class P implements p068h4.j {

    public final int f16510a;

    public P(int i3) {
        this.f16510a = i3;
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f16510a) {
            case 0:
                return StreamVolumeManager.lambda$release$11((StreamVolumeManager.StreamVolumeState) obj);
            case 1:
                return StreamVolumeManager.lambda$increaseVolume$5((StreamVolumeManager.StreamVolumeState) obj);
            case 2:
                return StreamVolumeManager.lambda$decreaseVolume$7((StreamVolumeManager.StreamVolumeState) obj);
            default:
                return new DefaultAnalyticsCollector((Clock) obj);
        }
    }
}
