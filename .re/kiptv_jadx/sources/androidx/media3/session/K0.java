package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K0 implements androidx.media3.session.MediaSessionImpl.RemoteControllerTask, androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f16907i;
    public final /* synthetic */ int j;

    public /* synthetic */ K0(int i3, boolean z6) {
        this.f16906h = 0;
        this.j = i3;
        this.f16907i = z6;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        ((androidx.media3.session.PlayerWrapper) obj).setDeviceMuted(this.f16907i, this.j);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        switch (this.f16906h) {
            case 0:
                controllerCb.onDeviceVolumeChanged(i3, this.j, this.f16907i);
                break;
            default:
                controllerCb.onPlayWhenReadyChanged(i3, this.f16907i, this.j);
                break;
        }
    }

    public /* synthetic */ K0(boolean z6, int i3, int i9) {
        this.f16906h = i9;
        this.f16907i = z6;
        this.j = i3;
    }
}
