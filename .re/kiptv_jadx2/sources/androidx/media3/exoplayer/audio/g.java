package androidx.media3.exoplayer.audio;

public final class g implements Runnable {

    public final int f16593h;

    public final AudioRendererEventListener.EventDispatcher f16594i;
    public final AudioSink.AudioTrackConfig j;

    public g(AudioRendererEventListener.EventDispatcher eventDispatcher, AudioSink.AudioTrackConfig audioTrackConfig, int i3) {
        this.f16593h = i3;
        this.f16594i = eventDispatcher;
        this.j = audioTrackConfig;
    }

    @Override
    public final void run() {
        switch (this.f16593h) {
            case 0:
                this.f16594i.lambda$audioTrackInitialized$10(this.j);
                break;
            default:
                this.f16594i.lambda$audioTrackReleased$11(this.j);
                break;
        }
    }
}
