package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.util.Consumer;
import java.io.IOException;

public final class m implements Consumer {

    public final int f16774h;

    public final PreCacheHelper.DownloadCallback f16775i;
    public final IOException j;

    public m(PreCacheHelper.DownloadCallback downloadCallback, IOException iOException, int i3) {
        this.f16774h = i3;
        this.f16775i = downloadCallback;
        this.j = iOException;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f16774h) {
            case 0:
                this.f16775i.lambda$onDownloadStopped$2(this.j, (PreCacheHelper.Listener) obj);
                break;
            default:
                this.f16775i.lambda$onPrepareError$1(this.j, (PreCacheHelper.Listener) obj);
                break;
        }
    }
}
