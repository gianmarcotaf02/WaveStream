package androidx.media3.session;

public final class C implements Runnable {

    public final int f16871h;

    public final MediaControllerImplBase f16872i;

    public C(MediaControllerImplBase mediaControllerImplBase, int i3) {
        this.f16871h = i3;
        this.f16872i = mediaControllerImplBase;
    }

    @Override
    public final void run() {
        switch (this.f16871h) {
            case 0:
                this.f16872i.lambda$setFutureResult$112();
                break;
            default:
                this.f16872i.lambda$release$4();
                break;
        }
    }
}
