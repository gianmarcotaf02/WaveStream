package androidx.media3.session;

public final class RunnableC1608u0 implements Runnable {

    public final int f17115h;

    public final MediaLibrarySessionImpl f17116i;
    public final com.google.common.util.concurrent.J j;

    public final MediaSession.ControllerInfo f17117k;

    public final int f17118l;

    public RunnableC1608u0(MediaLibrarySessionImpl mediaLibrarySessionImpl, com.google.common.util.concurrent.J j, MediaSession.ControllerInfo controllerInfo, int i3, int i9) {
        this.f17115h = i9;
        this.f17116i = mediaLibrarySessionImpl;
        this.j = j;
        this.f17117k = controllerInfo;
        this.f17118l = i3;
    }

    @Override
    public final void run() {
        switch (this.f17115h) {
            case 0:
                this.f17116i.lambda$onGetChildrenOnHandler$0(this.j, this.f17117k, this.f17118l);
                break;
            default:
                this.f17116i.lambda$onGetSearchResultOnHandler$6(this.j, this.f17117k, this.f17118l);
                break;
        }
    }
}
