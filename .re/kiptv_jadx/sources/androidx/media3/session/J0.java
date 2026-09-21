package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J0 implements androidx.media3.session.MediaSessionImpl.RemoteControllerTask, androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f16903i;

    public /* synthetic */ J0(long j, int i3) {
        this.f16902h = i3;
        this.f16903i = j;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        ((androidx.media3.session.PlayerWrapper) obj).seekTo(this.f16903i);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        switch (this.f16902h) {
            case 0:
                controllerCb.onSeekForwardIncrementChanged(i3, this.f16903i);
                break;
            default:
                controllerCb.onSeekBackIncrementChanged(i3, this.f16903i);
                break;
        }
    }
}
