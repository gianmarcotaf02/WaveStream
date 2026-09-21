package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1617z implements androidx.media3.common.util.ListenerSet.Event, androidx.media3.session.MediaSessionImpl.RemoteControllerTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.TrackSelectionParameters f17143h;

    public /* synthetic */ C1617z(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        this.f17143h = trackSelectionParameters;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        ((androidx.media3.common.Player.Listener) obj).onTrackSelectionParametersChanged(this.f17143h);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        controllerCb.onTrackSelectionParametersChanged(i3, this.f17143h);
    }
}
