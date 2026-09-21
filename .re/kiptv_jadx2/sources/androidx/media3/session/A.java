package androidx.media3.session;

import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

public final class A implements ListenerSet.Event, MediaSessionImpl.RemoteControllerTask {

    public final AudioAttributes f16863h;

    public A(AudioAttributes audioAttributes) {
        this.f16863h = audioAttributes;
    }

    @Override
    public void invoke(Object obj) {
        ((Player.Listener) obj).onAudioAttributesChanged(this.f16863h);
    }

    @Override
    public void run(MediaSession.ControllerCb controllerCb, int i3) {
        controllerCb.onAudioAttributesChanged(i3, this.f16863h);
    }
}
