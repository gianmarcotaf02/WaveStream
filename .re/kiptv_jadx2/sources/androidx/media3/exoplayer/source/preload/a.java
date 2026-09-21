package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.MediaSource;

public final class a implements Runnable {

    public final int f16751h;

    public final BasePreloadManager f16752i;
    public final MediaSource j;

    public final p068h4.l f16753k;

    public a(BasePreloadManager basePreloadManager, MediaSource mediaSource, p068h4.l lVar, int i3) {
        this.f16751h = i3;
        this.f16752i = basePreloadManager;
        this.j = mediaSource;
        this.f16753k = lVar;
    }

    @Override
    public final void run() {
        switch (this.f16751h) {
            case 0:
                this.f16752i.lambda$onSkipped$8(this.j, this.f16753k);
                break;
            default:
                this.f16752i.lambda$onCompleted$1(this.j, this.f16753k);
                break;
        }
    }
}
