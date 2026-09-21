package Z7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String f13049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f13050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f13053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Z7.g f13054f;

    static {
        java.lang.String property;
        int i3 = X7.s.f10935a;
        try {
            property = java.lang.System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (java.lang.SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f13049a = property;
        f13050b = X7.a.k("kotlinx.coroutines.scheduler.resolution.ns", androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1L, Long.MAX_VALUE);
        int i9 = X7.s.f10935a;
        if (i9 < 2) {
            i9 = 2;
        }
        f13051c = X7.a.l(i9, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f13052d = X7.a.l(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f13053e = java.util.concurrent.TimeUnit.SECONDS.toNanos(X7.a.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f13054f = Z7.g.f13045a;
    }
}
