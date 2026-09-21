package androidx.media3.exoplayer.video;

import V7.n0;
import android.content.res.Configuration;
import android.os.SystemClock;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import p085j5.K;
import p194x6.m;

public final class j implements Runnable {

    public final int f16833h;

    public final long f16834i;
    public final Object j;

    public final Object f16835k;

    public j(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j, Configuration configuration) {
        this.f16833h = 1;
        this.j = appComponentsBreadcrumbsIntegration;
        this.f16834i = j;
        this.f16835k = configuration;
    }

    @Override
    public final void run() {
        long jElapsedRealtime;
        int i3;
        switch (this.f16833h) {
            case 0:
                ((VideoRendererEventListener.EventDispatcher) this.j).lambda$renderedFirstFrame$6(this.f16835k, this.f16834i);
                break;
            case 1:
                ((AppComponentsBreadcrumbsIntegration) this.j).lambda$onConfigurationChanged$0(this.f16834i, (Configuration) this.f16835k);
                break;
            case 2:
                BufferCaptureStrategy.onScreenshotRecorded$lambda$2((BufferCaptureStrategy) this.j, (m) this.f16835k, this.f16834i);
                break;
            default:
                K k9 = (K) this.j;
                String str = (String) this.f16835k;
                long j = this.f16834i;
                k9.getClass();
                switch (str.hashCode()) {
                    case -1318925342:
                        if (!str.equals("dwidth")) {
                        }
                        i3 = k9.f23993f0;
                        int i9 = k9.f23994g0;
                        if (i3 <= 0 && i9 > 0) {
                            n0 n0Var = k9.f24006n;
                            p070h6.k kVar = new p070h6.k(Integer.valueOf(i3), Integer.valueOf(i9));
                            n0Var.getClass();
                            n0Var.i(null, kVar);
                            break;
                        }
                        break;
                    case -1184769158:
                        if (!str.equals("decoder-frame-drop-count")) {
                        }
                        if (j <= 0) {
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                            if (jElapsedRealtime - k9.f23960A < 30000) {
                                k9.f23960A = jElapsedRealtime;
                                K.w("mpv_dropped_frames", "vo=" + k9.f24005m0 + " decoder=" + k9.f24018v + " position=" + k9.f23991e0 + "ms");
                                break;
                            }
                        }
                        break;
                    case 820506897:
                        if (!str.equals("frame-drop-count")) {
                        }
                        if (j <= 0) {
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                            if (jElapsedRealtime - k9.f23960A < 30000) {
                                k9.f23960A = jElapsedRealtime;
                                K.w("mpv_dropped_frames", "vo=" + k9.f24005m0 + " decoder=" + k9.f24018v + " position=" + k9.f23991e0 + "ms");
                                break;
                            }
                        }
                        break;
                    case 1629992587:
                        if (!str.equals("dheight")) {
                        }
                        i3 = k9.f23993f0;
                        int i10 = k9.f23994g0;
                        if (i3 <= 0) {
                        }
                        break;
                }
                break;
        }
    }

    public j(Object obj, Object obj2, long j, int i3) {
        this.f16833h = i3;
        this.j = obj;
        this.f16835k = obj2;
        this.f16834i = j;
    }
}
