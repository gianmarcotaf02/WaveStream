package androidx.media3.exoplayer.analytics;

import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;

public abstract class y {
    public static MediaMetricsManager a(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static PlaybackMetrics.Builder j(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }
}
