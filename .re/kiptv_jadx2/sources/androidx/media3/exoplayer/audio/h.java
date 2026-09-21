package androidx.media3.exoplayer.audio;

public final class h implements Runnable {

    public final int f16595h;

    public final AudioRendererEventListener.EventDispatcher f16596i;
    public final Exception j;

    public h(AudioRendererEventListener.EventDispatcher eventDispatcher, Exception exc, int i3) {
        this.f16595h = i3;
        this.f16596i = eventDispatcher;
        this.j = exc;
    }

    @Override
    public final void run() {
        switch (this.f16595h) {
            case 0:
                this.f16596i.lambda$audioCodecError$9(this.j);
                break;
            default:
                this.f16596i.lambda$audioSinkError$8(this.j);
                break;
        }
    }
}
