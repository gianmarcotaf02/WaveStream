package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

public final class C1593n implements MediaControllerImplBase.RemoteSessionTask, ListenerSet.Event {

    public final int f17080h;

    public final MediaControllerImplBase f17081i;
    public final int j;

    public C1593n(int i3, int i9, MediaControllerImplBase mediaControllerImplBase) {
        this.f17080h = i9;
        this.f17081i = mediaControllerImplBase;
        this.j = i3;
    }

    @Override
    public void invoke(Object obj) {
        Player.Listener listener = (Player.Listener) obj;
        switch (this.f17080h) {
            case 3:
                this.f17081i.lambda$setDeviceVolume$63(this.j, listener);
                break;
            case 4:
                this.f17081i.lambda$decreaseDeviceVolume$71(this.j, listener);
                break;
            case 5:
            case 8:
            default:
                this.f17081i.lambda$increaseDeviceVolume$69(this.j, listener);
                break;
            case 6:
                this.f17081i.lambda$decreaseDeviceVolume$73(this.j, listener);
                break;
            case 7:
                this.f17081i.lambda$setDeviceVolume$65(this.j, listener);
                break;
            case 9:
                this.f17081i.lambda$increaseDeviceVolume$67(this.j, listener);
                break;
        }
    }

    @Override
    public void run(IMediaSession iMediaSession, int i3) {
        switch (this.f17080h) {
            case 0:
                this.f17081i.lambda$seekToDefaultPosition$9(this.j, iMediaSession, i3);
                break;
            case 1:
                this.f17081i.lambda$setRepeatMode$52(this.j, iMediaSession, i3);
                break;
            case 2:
                this.f17081i.lambda$setDeviceVolume$62(this.j, iMediaSession, i3);
                break;
            case 3:
            case 4:
            case 6:
            case 7:
            default:
                this.f17081i.lambda$increaseDeviceVolume$68(this.j, iMediaSession, i3);
                break;
            case 5:
                this.f17081i.lambda$decreaseDeviceVolume$72(this.j, iMediaSession, i3);
                break;
            case 8:
                this.f17081i.lambda$removeMediaItem$40(this.j, iMediaSession, i3);
                break;
        }
    }
}
