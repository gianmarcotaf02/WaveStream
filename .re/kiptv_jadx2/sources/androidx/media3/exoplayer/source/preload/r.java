package androidx.media3.exoplayer.source.preload;

public final class r implements Runnable {

    public final int f16784h;

    public final PreloadMediaSource f16785i;

    public r(PreloadMediaSource preloadMediaSource, int i3) {
        this.f16784h = i3;
        this.f16785i = preloadMediaSource;
    }

    @Override
    public final void run() {
        switch (this.f16784h) {
            case 0:
                this.f16785i.lambda$releasePreloadMediaSource$3();
                break;
            case 1:
                this.f16785i.lambda$clear$1();
                break;
            default:
                this.f16785i.checkForPreloadError();
                break;
        }
    }
}
