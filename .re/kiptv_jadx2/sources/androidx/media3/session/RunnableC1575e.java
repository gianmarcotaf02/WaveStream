package androidx.media3.session;

public final class RunnableC1575e implements Runnable {

    public final int f17007h;

    public final MediaSessionImpl f17008i;
    public final MediaSession.ControllerInfo j;

    public RunnableC1575e(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i3) {
        this.f17007h = i3;
        this.f17008i = mediaSessionImpl;
        this.j = controllerInfo;
    }

    @Override
    public final void run() {
        switch (this.f17007h) {
            case 0:
                ConnectedControllersManager.lambda$removeController$0(this.f17008i, this.j);
                break;
            case 1:
                this.f17008i.lambda$applyMediaButtonKeyEvent$26(this.j);
                break;
            case 2:
                this.f17008i.lambda$applyMediaButtonKeyEvent$27(this.j);
                break;
            case 3:
                this.f17008i.lambda$applyMediaButtonKeyEvent$28(this.j);
                break;
            case 4:
                this.f17008i.lambda$applyMediaButtonKeyEvent$29(this.j);
                break;
            case 5:
                this.f17008i.lambda$applyMediaButtonKeyEvent$30(this.j);
                break;
            case 6:
                this.f17008i.lambda$applyMediaButtonKeyEvent$31(this.j);
                break;
            case 7:
                this.f17008i.lambda$applyMediaButtonKeyEvent$32(this.j);
                break;
            case 8:
                this.f17008i.lambda$applyMediaButtonKeyEvent$33(this.j);
                break;
            default:
                this.f17008i.lambda$applyMediaButtonKeyEvent$34(this.j);
                break;
        }
    }
}
