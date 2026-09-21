package androidx.media3.exoplayer.video;

public final class d implements Runnable {

    public final int f16821h;

    public final DefaultVideoSink.FrameRendererImpl f16822i;

    public d(DefaultVideoSink.FrameRendererImpl frameRendererImpl, int i3) {
        this.f16821h = i3;
        this.f16822i = frameRendererImpl;
    }

    @Override
    public final void run() {
        switch (this.f16821h) {
            case 0:
                this.f16822i.lambda$renderFrame$1();
                break;
            default:
                this.f16822i.lambda$dropFrame$2();
                break;
        }
    }
}
