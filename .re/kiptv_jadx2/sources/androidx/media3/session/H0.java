package androidx.media3.session;

public final class H0 implements p155s1.i, MediaSessionImpl.RemoteControllerTask {

    public final MediaSessionImpl f16896h;

    public H0(MediaSessionImpl mediaSessionImpl) {
        this.f16896h = mediaSessionImpl;
    }

    @Override
    public Object f(p155s1.h hVar) {
        return this.f16896h.lambda$onPlayRequested$22(hVar);
    }

    @Override
    public void run(MediaSession.ControllerCb controllerCb, int i3) {
        this.f16896h.lambda$handleAvailablePlayerCommandsChanged$25(controllerCb, i3);
    }
}
