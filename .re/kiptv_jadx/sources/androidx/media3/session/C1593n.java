package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1593n implements androidx.media3.session.MediaControllerImplBase.RemoteSessionTask, androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaControllerImplBase f17081i;
    public final /* synthetic */ int j;

    public /* synthetic */ C1593n(int i3, int i9, androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
        this.f17080h = i9;
        this.f17081i = mediaControllerImplBase;
        this.j = i3;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        androidx.media3.common.Player.Listener listener = (androidx.media3.common.Player.Listener) obj;
        switch (this.f17080h) {
            case 3:
                this.f17081i.lambda$setDeviceVolume$63(this.j, listener);
                break;
            case 4:
                this.f17081i.lambda$decreaseDeviceVolume$71(this.j, listener);
                break;
            case 5:
            case 8:
            default:
                this.f17081i.lambda$increaseDeviceVolume$69(this.j, listener);
                break;
            case 6:
                this.f17081i.lambda$decreaseDeviceVolume$73(this.j, listener);
                break;
            case 7:
                this.f17081i.lambda$setDeviceVolume$65(this.j, listener);
                break;
            case 9:
                this.f17081i.lambda$increaseDeviceVolume$67(this.j, listener);
                break;
        }
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        switch (this.f17080h) {
            case 0:
                this.f17081i.lambda$seekToDefaultPosition$9(this.j, iMediaSession, i3);
                break;
            case 1:
                this.f17081i.lambda$setRepeatMode$52(this.j, iMediaSession, i3);
                break;
            case 2:
                this.f17081i.lambda$setDeviceVolume$62(this.j, iMediaSession, i3);
                break;
            case 3:
            case 4:
            case 6:
            case 7:
            default:
                this.f17081i.lambda$increaseDeviceVolume$68(this.j, iMediaSession, i3);
                break;
            case 5:
                this.f17081i.lambda$decreaseDeviceVolume$72(this.j, iMediaSession, i3);
                break;
            case 8:
                this.f17081i.lambda$removeMediaItem$40(this.j, iMediaSession, i3);
                break;
        }
    }
}
