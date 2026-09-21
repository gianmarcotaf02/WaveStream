package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.Consumer;

public final class o implements Runnable {

    public final int f16778h;

    public final Object f16779i;
    public final Object j;

    public o(Object obj, Object obj2, int i3) {
        this.f16778h = i3;
        this.f16779i = obj;
        this.j = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16778h) {
            case 0:
                ((PreCacheHelper.DownloadCallback) this.f16779i).lambda$notifyListeners$6((Consumer) this.j);
                break;
            default:
                ((PreloadMediaSource) this.f16779i).lambda$onChildSourceInfoRefreshed$2((Timeline) this.j);
                break;
        }
    }
}
