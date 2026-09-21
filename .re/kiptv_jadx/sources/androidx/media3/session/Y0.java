package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Y0 implements androidx.media3.session.MediaSessionStub.ControllerPlayerTask, androidx.media3.session.MediaSessionStub.MediaItemPlayerTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaSessionStub f16972i;
    public final /* synthetic */ int j;

    public /* synthetic */ Y0(androidx.media3.session.MediaSessionStub mediaSessionStub, int i3, int i9) {
        this.f16971h = i9;
        this.f16972i = mediaSessionStub;
        this.j = i3;
    }

    @Override // androidx.media3.session.MediaSessionStub.ControllerPlayerTask
    public void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        switch (this.f16971h) {
            case 0:
                this.f16972i.lambda$seekToDefaultPositionWithMediaItemIndex$21(this.j, playerWrapper, controllerInfo);
                break;
            default:
                this.f16972i.lambda$removeMediaItem$49(this.j, playerWrapper, controllerInfo);
                break;
        }
    }

    @Override // androidx.media3.session.MediaSessionStub.MediaItemPlayerTask
    public void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List list) {
        switch (this.f16971h) {
            case 1:
                this.f16972i.lambda$addMediaItemWithIndex$42(this.j, playerWrapper, controllerInfo, list);
                break;
            case 2:
                this.f16972i.lambda$replaceMediaItem$54(this.j, playerWrapper, controllerInfo, list);
                break;
            default:
                this.f16972i.lambda$addMediaItemsWithIndex$48(this.j, playerWrapper, controllerInfo, list);
                break;
        }
    }
}
