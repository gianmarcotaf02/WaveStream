package androidx.media3.exoplayer.video;

public final class g implements Runnable {

    public final int f16828h;

    public final VideoSink.Listener f16829i;

    public g(VideoSink.Listener listener, int i3) {
        this.f16828h = i3;
        this.f16829i = listener;
    }

    @Override
    public final void run() {
        switch (this.f16828h) {
            case 0:
                this.f16829i.onFrameDropped();
                break;
            case 1:
                this.f16829i.onFirstFrameRendered();
                break;
            default:
                this.f16829i.onFrameAvailableForRendering();
                break;
        }
    }
}
