package androidx.media3.exoplayer.video;

import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;

public final class i implements Runnable {

    public final int f16830h;

    public final Object f16831i;
    public final long j;

    public final int f16832k;

    public i(int i3, long j, VideoRendererEventListener.EventDispatcher eventDispatcher) {
        this.f16830h = 0;
        this.f16831i = eventDispatcher;
        this.f16832k = i3;
        this.j = j;
    }

    @Override
    public final void run() {
        switch (this.f16830h) {
            case 0:
                ((VideoRendererEventListener.EventDispatcher) this.f16831i).lambda$droppedFrames$3(this.f16832k, this.j);
                break;
            case 1:
                ((VideoRendererEventListener.EventDispatcher) this.f16831i).lambda$reportVideoFrameProcessingOffset$4(this.j, this.f16832k);
                break;
            default:
                ((AppComponentsBreadcrumbsIntegration) this.f16831i).lambda$onTrimMemory$2(this.j, this.f16832k);
                break;
        }
    }

    public i(Object obj, int i3, int i9, long j) {
        this.f16830h = i9;
        this.f16831i = obj;
        this.j = j;
        this.f16832k = i3;
    }
}
