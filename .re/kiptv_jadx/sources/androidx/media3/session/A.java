package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements androidx.media3.common.util.ListenerSet.Event, androidx.media3.session.MediaSessionImpl.RemoteControllerTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.AudioAttributes f16863h;

    public /* synthetic */ A(androidx.media3.common.AudioAttributes audioAttributes) {
        this.f16863h = audioAttributes;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        ((androidx.media3.common.Player.Listener) obj).onAudioAttributesChanged(this.f16863h);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        controllerCb.onAudioAttributesChanged(i3, this.f16863h);
    }
}
