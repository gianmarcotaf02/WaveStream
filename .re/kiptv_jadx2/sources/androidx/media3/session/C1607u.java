package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

public final class C1607u implements MediaControllerImplBase.RemoteSessionTask, ListenerSet.Event {

    public final int f17113h;

    public final MediaControllerImplBase f17114i;
    public final boolean j;

    public C1607u(MediaControllerImplBase mediaControllerImplBase, boolean z6, int i3) {
        this.f17113h = i3;
        this.f17114i = mediaControllerImplBase;
        this.j = z6;
    }

    @Override
    public void invoke(Object obj) {
        Player.Listener listener = (Player.Listener) obj;
        switch (this.f17113h) {
            case 1:
                this.f17114i.lambda$setDeviceMuted$77(this.j, listener);
                break;
            default:
                this.f17114i.lambda$setDeviceMuted$75(this.j, listener);
                break;
        }
    }

    @Override
    public void run(IMediaSession iMediaSession, int i3) {
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
