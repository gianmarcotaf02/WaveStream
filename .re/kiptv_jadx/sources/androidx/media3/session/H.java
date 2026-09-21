package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H implements androidx.media3.common.util.ListenerSet.Event, androidx.media3.session.MediaSessionImpl.RemoteControllerTask, androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.MediaMetadata f16895i;

    public /* synthetic */ H(int i3, androidx.media3.common.MediaMetadata mediaMetadata) {
        this.f16894h = i3;
        this.f16895i = mediaMetadata;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        ((androidx.media3.session.PlayerWrapper) obj).setPlaylistMetadata(this.f16895i);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        ((androidx.media3.common.Player.Listener) obj).onPlaylistMetadataChanged(this.f16895i);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        switch (this.f16894h) {
            case 1:
                controllerCb.onPlaylistMetadataChanged(i3, this.f16895i);
                break;
            default:
                controllerCb.onMediaMetadataChanged(i3, this.f16895i);
                break;
        }
    }
}
