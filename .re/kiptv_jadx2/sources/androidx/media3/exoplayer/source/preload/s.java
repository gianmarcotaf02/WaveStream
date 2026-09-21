package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;

public final class s implements Runnable {

    public final int f16786h;

    public final Object f16787i;
    public final Object j;

    public final Object f16788k;

    public s(Object obj, Object obj2, Object obj3, int i3) {
        this.f16786h = i3;
        this.f16787i = obj;
        this.j = obj2;
        this.f16788k = obj3;
    }

    @Override
    public final void run() {
        switch (this.f16786h) {
            case 0:
                ((PreloadMediaSource.PreloadMediaPeriodCallback) this.f16787i).lambda$maybeContinueLoading$2((MediaPeriod) this.j, (MediaSource.MediaPeriodId) this.f16788k);
                break;
            case 1:
                ((BasePreloadManager) this.f16787i).lambda$onMediaSourceUpdated$9((MediaItem) this.j, (MediaSource) this.f16788k);
                break;
            default:
                ((BasePreloadManager) this.f16787i).lambda$onCompleted$3((MediaItem) this.j, (p068h4.l) this.f16788k);
                break;
        }
    }
}
