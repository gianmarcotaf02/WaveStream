package Z0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f12600a = (((long) androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_KEYS_LOADED) << 50) ^ (-1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f12601b = (-1) ^ (((long) 33554431) << 25);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f12602c;

    static {
        long j = 33554431;
        f12602c = j | (((long) java.lang.Math.min(0, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_KEYS_LOADED)) << 50) | (j << 25);
    }
}
