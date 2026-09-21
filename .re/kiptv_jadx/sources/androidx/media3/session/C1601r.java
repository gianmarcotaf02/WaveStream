package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1601r implements androidx.media3.common.util.ListenerSet.Event, androidx.media3.session.MediaControllerStub.ControllerTask, androidx.media3.session.MediaSessionImpl.RemoteControllerTask, androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17098i;
    public final /* synthetic */ int j;

    public /* synthetic */ C1601r(int i3, int i9, int i10) {
        this.f17097h = i10;
        this.f17098i = i3;
        this.j = i9;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        androidx.media3.session.PlayerWrapper playerWrapper = (androidx.media3.session.PlayerWrapper) obj;
        switch (this.f17097h) {
            case 3:
                playerWrapper.setDeviceVolume(this.f17098i, this.j);
                break;
            default:
                playerWrapper.moveMediaItem(this.f17098i, this.j);
                break;
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        ((androidx.media3.common.Player.Listener) obj).onSurfaceSizeChanged(this.f17098i, this.j);
    }

    @Override // androidx.media3.session.MediaControllerStub.ControllerTask
    public void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
        mediaControllerImplBase.onSurfaceSizeChanged(this.f17098i, this.j);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        controllerCb.onSurfaceSizeChanged(i3, this.f17098i, this.j);
    }
}
