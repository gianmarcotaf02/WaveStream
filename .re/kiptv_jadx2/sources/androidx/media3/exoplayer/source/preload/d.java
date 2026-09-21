package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.util.ListenerSet;

public final class d implements ListenerSet.Event {

    public final int f16760h;

    public final BasePreloadManager.MediaSourceHolder f16761i;

    public d(BasePreloadManager.MediaSourceHolder mediaSourceHolder, int i3) {
        this.f16760h = i3;
        this.f16761i = mediaSourceHolder;
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.f16760h) {
            case 0:
                BasePreloadManager.lambda$onCompleted$0(this.f16761i, (PreloadManagerListener) obj);
                break;
            default:
                BasePreloadManager.lambda$onCompleted$2(this.f16761i, (PreloadManagerListener) obj);
                break;
        }
    }
}
