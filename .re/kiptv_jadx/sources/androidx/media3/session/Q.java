package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Q implements androidx.media3.common.util.ListenerSet.Event, androidx.media3.session.MediaSessionImpl.RemoteControllerTask, androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f16933i;

    public /* synthetic */ Q(boolean z6, int i3) {
        this.f16932h = i3;
        this.f16933i = z6;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        switch (this.f16932h) {
            case 4:
                ((androidx.media3.session.PlayerWrapper) obj).setPlayWhenReady(this.f16933i);
                break;
            case 5:
                ((androidx.media3.session.PlayerWrapper) obj).setDeviceMuted(this.f16933i);
                break;
            default:
                ((androidx.media3.session.PlayerWrapper) obj).setShuffleModeEnabled(this.f16933i);
                break;
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        ((androidx.media3.common.Player.Listener) obj).onShuffleModeEnabledChanged(this.f16933i);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        switch (this.f16932h) {
            case 1:
                controllerCb.onIsLoadingChanged(i3, this.f16933i);
                break;
            case 2:
                controllerCb.onShuffleModeEnabledChanged(i3, this.f16933i);
                break;
            default:
                controllerCb.onIsPlayingChanged(i3, this.f16933i);
                break;
        }
    }
}
