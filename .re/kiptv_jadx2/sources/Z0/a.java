package Z0;

import androidx.media3.exoplayer.analytics.AnalyticsListener;

public abstract class a {

    public static final long f12600a = (((long) AnalyticsListener.EVENT_DRM_KEYS_LOADED) << 50) ^ (-1);

    public static final long f12601b = (-1) ^ (((long) 33554431) << 25);

    public static final long f12602c;

    static {
        long j = 33554431;
        f12602c = j | (((long) Math.min(0, AnalyticsListener.EVENT_DRM_KEYS_LOADED)) << 50) | (j << 25);
    }
}
