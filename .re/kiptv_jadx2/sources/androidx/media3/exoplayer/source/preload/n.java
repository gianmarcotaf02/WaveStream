package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Consumer;

public final class n implements Consumer {

    public final int f16776h;

    public final PreCacheHelper.DownloadCallback f16777i;
    public final Object j;

    public n(PreCacheHelper.DownloadCallback downloadCallback, Object obj, int i3) {
        this.f16776h = i3;
        this.f16777i = downloadCallback;
        this.j = obj;
    }

    @Override
    public final void accept(Object obj) {
        PreCacheHelper.Listener listener = (PreCacheHelper.Listener) obj;
        switch (this.f16776h) {
            case 0:
                this.f16777i.lambda$onPrepared$0((MediaItem) this.j, listener);
                break;
            default:
                this.f16777i.lambda$onDownloadProgress$4((PreCacheHelper.Task) this.j, listener);
                break;
        }
    }
}
