package androidx.media3.session;

public final class C1597p implements MediaControllerImplBase.RemoteSessionTask, MediaSessionLegacyStub.SessionTask {

    public final int f17089h;

    public final Object f17090i;
    public final float j;

    public C1597p(Object obj, float f9, int i3) {
        this.f17089h = i3;
        this.f17090i = obj;
        this.j = f9;
    }

    @Override
    public void run(IMediaSession iMediaSession, int i3) {
        switch (this.f17089h) {
            case 0:
                ((MediaControllerImplBase) this.f17090i).lambda$unmute$60(this.j, iMediaSession, i3);
                break;
            case 1:
                ((MediaControllerImplBase) this.f17090i).lambda$setPlaybackSpeed$17(this.j, iMediaSession, i3);
                break;
            default:
                ((MediaControllerImplBase) this.f17090i).lambda$setVolume$56(this.j, iMediaSession, i3);
                break;
        }
    }

    @Override
    public void run(MediaSession.ControllerInfo controllerInfo) {
        ((MediaSessionLegacyStub) this.f17090i).lambda$onSetPlaybackSpeed$11(this.j, controllerInfo);
    }
}
