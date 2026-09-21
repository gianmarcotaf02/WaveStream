package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.MediaPeriod;

public final class t implements Runnable {

    public final int f16789h;

    public final PreloadMediaSource.PreloadMediaPeriodCallback f16790i;
    public final MediaPeriod j;

    public t(PreloadMediaSource.PreloadMediaPeriodCallback preloadMediaPeriodCallback, MediaPeriod mediaPeriod, int i3) {
        this.f16789h = i3;
        this.f16790i = preloadMediaPeriodCallback;
        this.j = mediaPeriod;
    }

    @Override
    public final void run() {
        switch (this.f16789h) {
            case 0:
                this.f16790i.lambda$onPrepared$0(this.j);
                break;
            default:
                this.f16790i.lambda$onContinueLoadingRequested$1(this.j);
                break;
        }
    }
}
