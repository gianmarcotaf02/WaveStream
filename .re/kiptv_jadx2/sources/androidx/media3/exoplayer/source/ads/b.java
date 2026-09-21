package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.source.MediaSource;
import java.io.IOException;
import p076i4.AbstractC2194f0;

public final class b implements Runnable {

    public final int f16722h;

    public final Object f16723i;
    public final Object j;

    public final Object f16724k;

    public b(Object obj, Object obj2, Object obj3, int i3) {
        this.f16722h = i3;
        this.f16723i = obj;
        this.j = obj2;
        this.f16724k = obj3;
    }

    @Override
    public final void run() {
        switch (this.f16722h) {
            case 0:
                ((AdsMediaSource.AdPrepareListener) this.f16723i).lambda$onPrepareError$1((MediaSource.MediaPeriodId) this.j, (IOException) this.f16724k);
                break;
            default:
                ((ServerSideAdInsertionMediaSource) this.f16723i).lambda$setAdPlaybackStates$0((AbstractC2194f0) this.j, (Timeline) this.f16724k);
                break;
        }
    }
}
