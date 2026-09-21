package androidx.media3.session;

public final class RunnableC1589l implements Runnable {

    public final int f17066h;

    public final MediaControllerHolder f17067i;
    public final MediaController j;

    public RunnableC1589l(MediaControllerHolder mediaControllerHolder, MediaController mediaController, int i3) {
        this.f17066h = i3;
        this.f17067i = mediaControllerHolder;
        this.j = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f17066h) {
            case 0:
                this.f17067i.setController(this.j);
                break;
            default:
                this.f17067i.lambda$setController$0(this.j);
                break;
        }
    }
}
