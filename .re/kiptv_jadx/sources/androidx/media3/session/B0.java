package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B0 implements androidx.media3.session.MediaSessionImpl.RemoteControllerTask, androidx.media3.session.MediaSessionStub.SessionTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p076i4.AbstractC2186b0 f16870i;

    public /* synthetic */ B0(int i3, p076i4.AbstractC2186b0 abstractC2186b0) {
        this.f16869h = i3;
        this.f16870i = abstractC2186b0;
    }

    @Override // androidx.media3.session.MediaSessionStub.SessionTask
    public java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i3) {
        switch (this.f16869h) {
            case 4:
                return androidx.media3.session.MediaSessionStub.lambda$replaceMediaItems$56(this.f16870i, mediaSessionImpl, controllerInfo, i3);
            case 5:
                return androidx.media3.session.MediaSessionStub.lambda$addMediaItemsWithIndex$47(this.f16870i, mediaSessionImpl, controllerInfo, i3);
            default:
                return androidx.media3.session.MediaSessionStub.lambda$addMediaItems$44(this.f16870i, mediaSessionImpl, controllerInfo, i3);
        }
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        switch (this.f16869h) {
            case 0:
                controllerCb.setMediaButtonPreferences(i3, this.f16870i);
                break;
            case 1:
                controllerCb.setMediaButtonPreferences(i3, this.f16870i);
                break;
            case 2:
                controllerCb.setCustomLayout(i3, this.f16870i);
                break;
            default:
                controllerCb.setCustomLayout(i3, this.f16870i);
                break;
        }
    }
}
