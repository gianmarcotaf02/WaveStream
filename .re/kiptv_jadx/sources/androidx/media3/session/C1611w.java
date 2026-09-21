package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1611w implements androidx.media3.common.util.ListenerSet.Event, androidx.media3.session.MediaSessionImpl.RemoteControllerTask, androidx.media3.common.util.Consumer, androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17126i;

    public /* synthetic */ C1611w(int i3, int i9) {
        this.f17125h = i9;
        this.f17126i = i3;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        switch (this.f17125h) {
            case 4:
                ((androidx.media3.session.PlayerWrapper) obj).decreaseDeviceVolume(this.f17126i);
                break;
            case 5:
                ((androidx.media3.session.PlayerWrapper) obj).increaseDeviceVolume(this.f17126i);
                break;
            case 6:
                ((androidx.media3.session.PlayerWrapper) obj).setRepeatMode(this.f17126i);
                break;
            default:
                ((androidx.media3.session.PlayerWrapper) obj).setDeviceVolume(this.f17126i);
                break;
        }
    }

    @Override // androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider
    public int getNotificationId(androidx.media3.session.MediaSession mediaSession) {
        return androidx.media3.session.DefaultMediaNotificationProvider.Builder.lambda$setNotificationId$1(this.f17126i, mediaSession);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        ((androidx.media3.common.Player.Listener) obj).onRepeatModeChanged(this.f17126i);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        switch (this.f17125h) {
            case 1:
                controllerCb.onPlaybackSuppressionReasonChanged(i3, this.f17126i);
                break;
            case 2:
                controllerCb.onRepeatModeChanged(i3, this.f17126i);
                break;
            default:
                controllerCb.onAudioSessionIdChanged(i3, this.f17126i);
                break;
        }
    }
}
