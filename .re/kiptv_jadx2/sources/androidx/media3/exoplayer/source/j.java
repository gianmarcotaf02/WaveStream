package androidx.media3.exoplayer.source;

public final class j implements Runnable {

    public final int f16743h;

    public final ProgressiveMediaPeriod f16744i;

    public j(ProgressiveMediaPeriod progressiveMediaPeriod, int i3) {
        this.f16743h = i3;
        this.f16744i = progressiveMediaPeriod;
    }

    @Override
    public final void run() {
        switch (this.f16743h) {
            case 0:
                this.f16744i.lambda$onLengthKnown$2();
                break;
            case 1:
                this.f16744i.maybeFinishPrepare();
                break;
            default:
                this.f16744i.lambda$new$0();
                break;
        }
    }
}
