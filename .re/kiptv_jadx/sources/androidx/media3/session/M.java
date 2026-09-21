package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class M implements androidx.media3.common.util.Consumer, androidx.media3.session.MediaSessionImpl.RemoteControllerTask, androidx.media3.session.MediaSessionLegacyStub.SessionTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f16914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f16915i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16916k;

    public /* synthetic */ M(androidx.media3.session.SessionPositionInfo sessionPositionInfo, boolean z6, boolean z9, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        this.j = sessionPositionInfo;
        this.f16914h = z6;
        this.f16915i = z9;
        this.f16916k = controllerInfo;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        ((androidx.media3.session.MediaControllerImplBase) this.j).lambda$onExtrasChanged$125((android.os.Bundle) this.f16916k, this.f16914h, this.f16915i, (androidx.media3.session.MediaController.Listener) obj);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        androidx.media3.session.MediaSessionImpl.lambda$dispatchOnPeriodicSessionPositionInfoChanged$23((androidx.media3.session.SessionPositionInfo) this.j, this.f16914h, this.f16915i, (androidx.media3.session.MediaSession.ControllerInfo) this.f16916k, controllerCb, i3);
    }

    public /* synthetic */ M(java.lang.Object obj, boolean z6, java.lang.Object obj2, boolean z9) {
        this.j = obj;
        this.f16916k = obj2;
        this.f16914h = z6;
        this.f16915i = z9;
    }

    @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
    public void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        ((androidx.media3.session.MediaSessionLegacyStub) this.j).lambda$handleMediaRequest$26((androidx.media3.common.MediaItem) this.f16916k, this.f16914h, this.f16915i, controllerInfo);
    }
}
