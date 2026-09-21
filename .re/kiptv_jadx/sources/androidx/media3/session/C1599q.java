package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1599q implements androidx.media3.common.util.ListenerSet.Event, androidx.media3.session.MediaSessionImpl.RemoteControllerTask, androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f17094i;

    public /* synthetic */ C1599q(float f9, int i3) {
        this.f17093h = i3;
        this.f17094i = f9;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        switch (this.f17093h) {
            case 3:
                ((androidx.media3.session.PlayerWrapper) obj).setPlaybackSpeed(this.f17094i);
                break;
            default:
                ((androidx.media3.session.PlayerWrapper) obj).setVolume(this.f17094i);
                break;
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        switch (this.f17093h) {
            case 0:
                ((androidx.media3.common.Player.Listener) obj).onVolumeChanged(this.f17094i);
                break;
            default:
                ((androidx.media3.common.Player.Listener) obj).onVolumeChanged(this.f17094i);
                break;
        }
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        controllerCb.onVolumeChanged(i3, this.f17094i);
    }
}
