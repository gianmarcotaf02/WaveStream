package androidx.media3.session;

public final class RunnableC1574d0 implements Runnable {

    public final int f17004h;

    public final MediaControllerImplLegacy f17005i;

    public RunnableC1574d0(MediaControllerImplLegacy mediaControllerImplLegacy, int i3) {
        this.f17004h = i3;
        this.f17005i = mediaControllerImplLegacy;
    }

    @Override
    public final void run() {
        switch (this.f17004h) {
            case 0:
                this.f17005i.lambda$connectToSession$2();
                break;
            default:
                this.f17005i.lambda$connectToService$3();
                break;
        }
    }
}
