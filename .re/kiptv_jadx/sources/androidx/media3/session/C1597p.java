package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1597p implements androidx.media3.session.MediaControllerImplBase.RemoteSessionTask, androidx.media3.session.MediaSessionLegacyStub.SessionTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17090i;
    public final /* synthetic */ float j;

    public /* synthetic */ C1597p(java.lang.Object obj, float f9, int i3) {
        this.f17089h = i3;
        this.f17090i = obj;
        this.j = f9;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        switch (this.f17089h) {
            case 0:
                ((androidx.media3.session.MediaControllerImplBase) this.f17090i).lambda$unmute$60(this.j, iMediaSession, i3);
                break;
            case 1:
                ((androidx.media3.session.MediaControllerImplBase) this.f17090i).lambda$setPlaybackSpeed$17(this.j, iMediaSession, i3);
                break;
            default:
                ((androidx.media3.session.MediaControllerImplBase) this.f17090i).lambda$setVolume$56(this.j, iMediaSession, i3);
                break;
        }
    }

    @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
    public void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        ((androidx.media3.session.MediaSessionLegacyStub) this.f17090i).lambda$onSetPlaybackSpeed$11(this.j, controllerInfo);
    }
}
