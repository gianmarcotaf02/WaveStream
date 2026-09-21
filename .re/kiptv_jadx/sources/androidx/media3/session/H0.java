package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H0 implements p155s1.i, androidx.media3.session.MediaSessionImpl.RemoteControllerTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaSessionImpl f16896h;

    public /* synthetic */ H0(androidx.media3.session.MediaSessionImpl mediaSessionImpl) {
        this.f16896h = mediaSessionImpl;
    }

    @Override // p155s1.i
    public java.lang.Object f(p155s1.h hVar) {
        return this.f16896h.lambda$onPlayRequested$22(hVar);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        this.f16896h.lambda$handleAvailablePlayerCommandsChanged$25(controllerCb, i3);
    }
}
