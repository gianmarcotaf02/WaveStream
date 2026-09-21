package androidx.media3.session;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

public final class L implements ListenerSet.Event, MediaSessionImpl.RemoteControllerTask {

    public final int f16908h;

    public final PlaybackException f16909i;

    public L(int i3, PlaybackException playbackException) {
        this.f16908h = i3;
        this.f16909i = playbackException;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f16908h) {
            case 0:
                ((Player.Listener) obj).onPlayerErrorChanged(this.f16909i);
                break;
            case 1:
                ((Player.Listener) obj).onPlayerError(this.f16909i);
                break;
            case 2:
                ((Player.Listener) obj).onPlayerErrorChanged(this.f16909i);
                break;
            default:
                ((Player.Listener) obj).onPlayerError(this.f16909i);
                break;
        }
    }

    @Override
    public void run(MediaSession.ControllerCb controllerCb, int i3) {
        controllerCb.onPlayerError(i3, this.f16909i);
    }
}
