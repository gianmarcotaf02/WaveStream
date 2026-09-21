package androidx.media3.exoplayer;

import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;

public final class C1552g implements p068h4.j {

    public final int f16643a;

    public final Object f16644b;

    public C1552g(int i3, Object obj) {
        this.f16643a = i3;
        this.f16644b = obj;
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f16643a) {
            case 0:
                return ExoPlayer.Builder.lambda$setAnalyticsCollector$21((AnalyticsCollector) this.f16644b, (Clock) obj);
            case 1:
                return ExoPlayer.Builder.lambda$new$13((AnalyticsCollector) this.f16644b, (Clock) obj);
            default:
                return ((StreamVolumeManager) this.f16644b).lambda$release$12((StreamVolumeManager.StreamVolumeState) obj);
        }
    }
}
