package androidx.media3.exoplayer.source.ads;

public final class a implements Runnable {

    public final int f16720h;

    public final AdsMediaSource f16721i;
    public final AdsMediaSource.ComponentListener j;

    public a(AdsMediaSource adsMediaSource, AdsMediaSource.ComponentListener componentListener, int i3) {
        this.f16720h = i3;
        this.f16721i = adsMediaSource;
        this.j = componentListener;
    }

    @Override
    public final void run() {
        switch (this.f16720h) {
            case 0:
                this.f16721i.lambda$prepareSourceInternal$0(this.j);
                break;
            default:
                this.f16721i.lambda$releaseSourceInternal$1(this.j);
                break;
        }
    }
}
