package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E implements androidx.media3.common.util.ListenerSet.Event, androidx.media3.session.MediaSessionImpl.RemoteControllerTask, androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.PlaybackParameters f16880i;

    public /* synthetic */ E(int i3, androidx.media3.common.PlaybackParameters playbackParameters) {
        this.f16879h = i3;
        this.f16880i = playbackParameters;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        ((androidx.media3.session.PlayerWrapper) obj).setPlaybackParameters(this.f16880i);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        switch (this.f16879h) {
            case 0:
                ((androidx.media3.common.Player.Listener) obj).onPlaybackParametersChanged(this.f16880i);
                break;
            default:
                ((androidx.media3.common.Player.Listener) obj).onPlaybackParametersChanged(this.f16880i);
                break;
        }
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        controllerCb.onPlaybackParametersChanged(i3, this.f16880i);
    }
}
