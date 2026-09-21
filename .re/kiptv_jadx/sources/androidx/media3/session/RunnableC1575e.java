package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1575e implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaSessionImpl f17008i;
    public final /* synthetic */ androidx.media3.session.MediaSession.ControllerInfo j;

    public /* synthetic */ RunnableC1575e(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i3) {
        this.f17007h = i3;
        this.f17008i = mediaSessionImpl;
        this.j = controllerInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17007h) {
            case 0:
                androidx.media3.session.ConnectedControllersManager.lambda$removeController$0(this.f17008i, this.j);
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
