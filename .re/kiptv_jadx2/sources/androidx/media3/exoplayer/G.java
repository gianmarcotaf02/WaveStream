package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.source.MediaSource;
import p076i4.Y;

public final class G implements Runnable {

    public final int f16485h;

    public final Object f16486i;
    public final Object j;

    public final Object f16487k;

    public G(Object obj, Object obj2, Object obj3, int i3) {
        this.f16485h = i3;
        this.f16486i = obj;
        this.j = obj2;
        this.f16487k = obj3;
    }

    @Override
    public final void run() {
        switch (this.f16485h) {
            case 0:
                ((MediaPeriodQueue) this.f16486i).lambda$notifyQueueUpdate$0((Y) this.j, (MediaSource.MediaPeriodId) this.f16487k);
                break;
            case 1:
                ((MediaSourceList.ForwardingEventListener) this.f16486i).lambda$onDrmKeysLoaded$7((Pair) this.j, (KeyRequestInfo) this.f16487k);
                break;
            default:
                ((MediaSourceList.ForwardingEventListener) this.f16486i).lambda$onDrmSessionManagerError$8((Pair) this.j, (Exception) this.f16487k);
                break;
        }
    }
}
