package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1607u implements androidx.media3.session.MediaControllerImplBase.RemoteSessionTask, androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaControllerImplBase f17114i;
    public final /* synthetic */ boolean j;

    public /* synthetic */ C1607u(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase, boolean z6, int i3) {
        this.f17113h = i3;
        this.f17114i = mediaControllerImplBase;
        this.j = z6;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        androidx.media3.common.Player.Listener listener = (androidx.media3.common.Player.Listener) obj;
        switch (this.f17113h) {
            case 1:
                this.f17114i.lambda$setDeviceMuted$77(this.j, listener);
                break;
            default:
                this.f17114i.lambda$setDeviceMuted$75(this.j, listener);
                break;
        }
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        switch (this.f17113h) {
            case 0:
                this.f17114i.lambda$setPlayWhenReady$14(this.j, iMediaSession, i3);
                break;
            case 1:
            default:
                this.f17114i.lambda$setDeviceMuted$74(this.j, iMediaSession, i3);
                break;
            case 2:
                this.f17114i.lambda$setShuffleModeEnabled$54(this.j, iMediaSession, i3);
                break;
        }
    }
}
