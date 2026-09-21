package androidx.media3.exoplayer.hls;

public final class k implements Runnable {

    public final int f16671h;

    public final Object f16672i;

    public k(int i3, Object obj) {
        this.f16671h = i3;
        this.f16672i = obj;
    }

    @Override
    public final void run() {
        switch (this.f16671h) {
            case 0:
                ((HlsSampleStreamWrapper) this.f16672i).maybeFinishPrepare();
                break;
            case 1:
                ((HlsSampleStreamWrapper) this.f16672i).onTracksEnded();
                break;
            default:
                ((HlsSampleStreamWrapper.Callback) this.f16672i).onPrepared();
                break;
        }
    }
}
