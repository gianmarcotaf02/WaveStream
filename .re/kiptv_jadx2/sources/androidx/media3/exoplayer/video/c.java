package androidx.media3.exoplayer.video;

public final class c implements Runnable {

    public final int f16819h;

    public final Object f16820i;

    public c(int i3, Object obj) {
        this.f16819h = i3;
        this.f16820i = obj;
    }

    @Override
    public final void run() {
        switch (this.f16819h) {
            case 0:
                ((DefaultVideoSink) this.f16820i).lambda$handleInputFrame$2();
                break;
            case 1:
                ((VideoFrameReleaseHelper.VSyncSamplerV33) this.f16820i).lambda$onVsync$0();
                break;
            default:
                ((PlaybackVideoGraphWrapper) this.f16820i).lambda$flush$1();
                break;
        }
    }
}
