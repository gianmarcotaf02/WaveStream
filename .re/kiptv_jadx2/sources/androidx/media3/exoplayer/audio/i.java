package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.source.preload.PreCacheHelper;

public final class i implements Runnable {

    public final int f16597h;

    public final boolean f16598i;
    public final Object j;

    public i(int i3, Object obj, boolean z6) {
        this.f16597h = i3;
        this.j = obj;
        this.f16598i = z6;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f16597h) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.j).lambda$skipSilenceEnabledChanged$7(this.f16598i);
                break;
            case 1:
                ((DownloadHelper) this.j).lambda$onMediaPrepared$2(this.f16598i);
                break;
            default:
                ((PreCacheHelper) this.j).lambda$release$2(this.f16598i);
                break;
        }
    }
}
