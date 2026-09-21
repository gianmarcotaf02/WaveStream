package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

public final class w implements ListenerSet.Event {

    public final int f16841h;

    public final int f16842i;

    public w(int i3, int i9) {
        this.f16841h = i9;
        this.f16842i = i3;
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.f16841h) {
            case 0:
                ((Player.Listener) obj).onRepeatModeChanged(this.f16842i);
                break;
            default:
                ((Player.Listener) obj).onAudioSessionIdChanged(this.f16842i);
                break;
        }
    }
}
