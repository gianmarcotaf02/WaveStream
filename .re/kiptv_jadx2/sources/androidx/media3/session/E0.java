package androidx.media3.session;

import android.os.Bundle;

public final class E0 implements MediaSessionImpl.RemoteControllerTask {

    public final int f16881h;

    public final SessionCommand f16882i;
    public final Bundle j;

    public E0(int i3, SessionCommand sessionCommand, Bundle bundle) {
        this.f16881h = i3;
        this.f16882i = sessionCommand;
        this.j = bundle;
    }

    @Override
    public final void run(MediaSession.ControllerCb controllerCb, int i3) {
        switch (this.f16881h) {
            case 0:
                controllerCb.sendCustomCommand(i3, this.f16882i, this.j);
                break;
            default:
                controllerCb.sendCustomCommand(i3, this.f16882i, this.j);
                break;
        }
    }
}
