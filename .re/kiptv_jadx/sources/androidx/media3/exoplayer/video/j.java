package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f16834i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16835k;

    public /* synthetic */ j(io.sentry.android.core.AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j, android.content.res.Configuration configuration) {
        this.f16833h = 1;
        this.j = appComponentsBreadcrumbsIntegration;
        this.f16834i = j;
        this.f16835k = configuration;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x004d, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        long jElapsedRealtime;
        int i3;
        switch (this.f16833h) {
            case 0:
                ((androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher) this.j).lambda$renderedFirstFrame$6(this.f16835k, this.f16834i);
                break;
            case 1:
                ((io.sentry.android.core.AppComponentsBreadcrumbsIntegration) this.j).lambda$onConfigurationChanged$0(this.f16834i, (android.content.res.Configuration) this.f16835k);
                break;
            case 2:
                io.sentry.android.replay.capture.BufferCaptureStrategy.onScreenshotRecorded$lambda$2((io.sentry.android.replay.capture.BufferCaptureStrategy) this.j, (p194x6.m) this.f16835k, this.f16834i);
                break;
            default:
                p085j5.K k9 = (p085j5.K) this.j;
                java.lang.String str = (java.lang.String) this.f16835k;
                long j = this.f16834i;
                k9.getClass();
                switch (str.hashCode()) {
                    case -1318925342:
                        if (!str.equals("dwidth")) {
                        }
                        i3 = k9.f23993f0;
                        int i9 = k9.f23994g0;
                        if (i3 <= 0 && i9 > 0) {
                            V7.n0 n0Var = k9.f24006n;
                            p070h6.k kVar = new p070h6.k(java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i9));
                            n0Var.getClass();
                            n0Var.i(null, kVar);
                            break;
                        }
                        break;
                    case -1184769158:
                        if (!str.equals("decoder-frame-drop-count")) {
                        }
                        if (j <= 0) {
                            jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                            if (jElapsedRealtime - k9.f23960A < 30000) {
                                k9.f23960A = jElapsedRealtime;
                                p085j5.K.w("mpv_dropped_frames", "vo=" + k9.f24005m0 + " decoder=" + k9.f24018v + " position=" + k9.f23991e0 + "ms");
                                break;
                            }
                        }
                        break;
                    case 820506897:
                        if (!str.equals("frame-drop-count")) {
                        }
                        if (j <= 0) {
                            jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                            if (jElapsedRealtime - k9.f23960A < 30000) {
                                k9.f23960A = jElapsedRealtime;
                                p085j5.K.w("mpv_dropped_frames", "vo=" + k9.f24005m0 + " decoder=" + k9.f24018v + " position=" + k9.f23991e0 + "ms");
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

    public /* synthetic */ j(java.lang.Object obj, java.lang.Object obj2, long j, int i3) {
        this.f16833h = i3;
        this.j = obj;
        this.f16835k = obj2;
        this.f16834i = j;
    }
}
