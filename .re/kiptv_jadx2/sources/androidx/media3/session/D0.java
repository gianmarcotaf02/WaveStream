package androidx.media3.session;

public final class D0 implements MediaSessionImpl.RemoteControllerTask {

    public final int f16877h;

    public final SessionError f16878i;

    public D0(int i3, SessionError sessionError) {
        this.f16877h = i3;
        this.f16878i = sessionError;
    }

    @Override
    public final void run(MediaSession.ControllerCb controllerCb, int i3) {
        switch (this.f16877h) {
            case 0:
                controllerCb.onError(i3, this.f16878i);
                break;
            case 1:
                controllerCb.onError(i3, this.f16878i);
                break;
            default:
                controllerCb.onError(i3, this.f16878i);
                break;
        }
    }
}
