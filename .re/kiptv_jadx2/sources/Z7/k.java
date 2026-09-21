package Z7;

import X7.s;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.util.concurrent.TimeUnit;

public abstract class k {

    public static final String f13049a;

    public static final long f13050b;

    public static final int f13051c;

    public static final int f13052d;

    public static final long f13053e;

    public static final g f13054f;

    static {
        String property;
        int i3 = s.f10935a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f13049a = property;
        f13050b = X7.a.k("kotlinx.coroutines.scheduler.resolution.ns", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1L, Long.MAX_VALUE);
        int i9 = s.f10935a;
        if (i9 < 2) {
            i9 = 2;
        }
        f13051c = X7.a.l(i9, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f13052d = X7.a.l(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f13053e = TimeUnit.SECONDS.toNanos(X7.a.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f13054f = g.f13045a;
    }
}
