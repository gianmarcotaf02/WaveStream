package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.source.MediaSource;

public final class c implements Runnable {

    public final int f16725h;

    public final Object f16726i;
    public final Object j;

    public c(Object obj, Object obj2, int i3) {
        this.f16725h = i3;
        this.f16726i = obj;
        this.j = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16725h) {
            case 0:
                ((AdsMediaSource.AdPrepareListener) this.f16726i).lambda$onPrepareComplete$0((MediaSource.MediaPeriodId) this.j);
                break;
            case 1:
                ((AdsMediaSource.ComponentListener) this.f16726i).lambda$onAdPlaybackState$0((AdPlaybackState) this.j);
                break;
            default:
                ((AdsMediaSource) this.f16726i).lambda$onChildSourceInfoRefreshed$2((Timeline) this.j);
                break;
        }
    }
}
