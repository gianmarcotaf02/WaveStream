package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V implements androidx.media3.session.MediaControllerImplBase.RemoteSessionTask, androidx.media3.session.MediaControllerStub.ControllerTask, androidx.media3.session.MediaNotification.Provider.Callback, androidx.media3.session.MediaSessionImpl.RemoteControllerTask, androidx.media3.session.MediaSessionLegacyStub.SessionTask, androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16957i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ V(int i3, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
        this.f16956h = i3;
        this.f16957i = sessionCommand;
        this.j = bundle;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        androidx.media3.session.MediaSessionStub.lambda$sendSessionResultWhenReady$2((androidx.media3.session.MediaSessionImpl) this.f16957i, (androidx.media3.session.MediaSession.ControllerInfo) this.j, this.f16956h, (com.google.common.util.concurrent.J) obj);
    }

    @Override // androidx.media3.session.MediaNotification.Provider.Callback
    public void onNotificationChanged(androidx.media3.session.MediaNotification mediaNotification) {
        ((androidx.media3.session.MediaNotificationManager) this.f16957i).lambda$updateNotification$5(this.f16956h, (androidx.media3.session.MediaSession) this.j, mediaNotification);
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        ((androidx.media3.session.MediaControllerImplBase) this.f16957i).lambda$addMediaItems$39(this.f16956h, (java.util.List) this.j, iMediaSession, i3);
    }

    public /* synthetic */ V(java.lang.Object obj, int i3, java.lang.Object obj2) {
        this.f16957i = obj;
        this.f16956h = i3;
        this.j = obj2;
    }

    @Override // androidx.media3.session.MediaControllerStub.ControllerTask
    public void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
        mediaControllerImplBase.onCustomCommand(this.f16956h, (androidx.media3.session.SessionCommand) this.f16957i, (android.os.Bundle) this.j);
    }

    public /* synthetic */ V(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f16957i = obj;
        this.j = obj2;
        this.f16956h = i3;
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        controllerCb.onPositionDiscontinuity(i3, (androidx.media3.common.Player.PositionInfo) this.f16957i, (androidx.media3.common.Player.PositionInfo) this.j, this.f16956h);
    }

    @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
    public void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        ((androidx.media3.session.MediaSessionLegacyStub) this.f16957i).lambda$handleOnAddQueueItem$27((androidx.media3.session.legacy.MediaDescriptionCompat) this.j, this.f16956h, controllerInfo);
    }
}
