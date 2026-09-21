package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class U0 implements androidx.media3.session.MediaSessionStub.ControllerPlayerTask, androidx.media3.session.MediaSessionStub.MediaItemPlayerTask, androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaSessionStub f16954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16955i;
    public final /* synthetic */ int j;

    public /* synthetic */ U0(androidx.media3.session.MediaSessionStub mediaSessionStub, int i3, int i9) {
        this.f16954h = mediaSessionStub;
        this.f16955i = i3;
        this.j = i9;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        this.f16954h.lambda$onSurfaceSizeChanged$62(this.f16955i, this.j, (androidx.media3.session.PlayerWrapper) obj);
    }

    @Override // androidx.media3.session.MediaSessionStub.ControllerPlayerTask
    public void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        this.f16954h.lambda$removeMediaItems$50(this.f16955i, this.j, playerWrapper, controllerInfo);
    }

    @Override // androidx.media3.session.MediaSessionStub.MediaItemPlayerTask
    public void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List list) {
        this.f16954h.lambda$replaceMediaItems$57(this.f16955i, this.j, playerWrapper, controllerInfo, list);
    }
}
