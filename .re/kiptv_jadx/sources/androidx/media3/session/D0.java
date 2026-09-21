package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D0 implements androidx.media3.session.MediaSessionImpl.RemoteControllerTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.SessionError f16878i;

    public /* synthetic */ D0(int i3, androidx.media3.session.SessionError sessionError) {
        this.f16877h = i3;
        this.f16878i = sessionError;
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        switch (this.f16877h) {
            case 0:
                controllerCb.onError(i3, this.f16878i);
                break;
            case 1:
                controllerCb.onError(i3, this.f16878i);
                break;
            default:
                controllerCb.onError(i3, this.f16878i);
                break;
        }
    }
}
