package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L implements androidx.media3.common.util.ListenerSet.Event, androidx.media3.session.MediaSessionImpl.RemoteControllerTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.PlaybackException f16909i;

    public /* synthetic */ L(int i3, androidx.media3.common.PlaybackException playbackException) {
        this.f16908h = i3;
        this.f16909i = playbackException;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        switch (this.f16908h) {
            case 0:
                ((androidx.media3.common.Player.Listener) obj).onPlayerErrorChanged(this.f16909i);
                break;
            case 1:
                ((androidx.media3.common.Player.Listener) obj).onPlayerError(this.f16909i);
                break;
            case 2:
                ((androidx.media3.common.Player.Listener) obj).onPlayerErrorChanged(this.f16909i);
                break;
            default:
                ((androidx.media3.common.Player.Listener) obj).onPlayerError(this.f16909i);
                break;
        }
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        controllerCb.onPlayerError(i3, this.f16909i);
    }
}
