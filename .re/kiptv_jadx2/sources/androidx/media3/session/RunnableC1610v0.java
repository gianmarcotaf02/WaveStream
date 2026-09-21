package androidx.media3.session;

public final class RunnableC1610v0 implements Runnable {

    public final int f17122h;

    public final MediaLibrarySessionImpl f17123i;
    public final com.google.common.util.concurrent.J j;

    public final MediaSession.ControllerInfo f17124k;

    public RunnableC1610v0(MediaLibrarySessionImpl mediaLibrarySessionImpl, com.google.common.util.concurrent.J j, MediaSession.ControllerInfo controllerInfo, int i3) {
        this.f17122h = i3;
        this.f17123i = mediaLibrarySessionImpl;
        this.j = j;
        this.f17124k = controllerInfo;
    }

    @Override
    public final void run() {
        switch (this.f17122h) {
            case 0:
                this.f17123i.lambda$onGetItemOnHandler$1(this.j, this.f17124k);
                break;
            default:
                this.f17123i.lambda$onSearchOnHandler$5(this.j, this.f17124k);
                break;
        }
    }
}
