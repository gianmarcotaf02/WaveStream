package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.source.preload.PreloadMediaSource;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;

public final class e implements Runnable {

    public final int f16588h;

    public final long f16589i;
    public final Object j;

    public e(Object obj, long j, int i3) {
        this.f16588h = i3;
        this.j = obj;
        this.f16589i = j;
    }

    @Override
    public final void run() {
        switch (this.f16588h) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.j).lambda$positionAdvancing$3(this.f16589i);
                break;
            case 1:
                ((PreloadMediaSource) this.j).lambda$preload$0(this.f16589i);
                break;
            default:
                ((AppComponentsBreadcrumbsIntegration) this.j).lambda$onLowMemory$1(this.f16589i);
                break;
        }
    }
}
