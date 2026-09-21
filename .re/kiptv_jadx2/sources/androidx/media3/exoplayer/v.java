package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

public final class v implements ListenerSet.Event {

    public final int f16815h;

    public final long f16816i;

    public v(long j, int i3) {
        this.f16815h = i3;
        this.f16816i = j;
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.f16815h) {
            case 0:
                ((Player.Listener) obj).onSeekBackIncrementChanged(this.f16816i);
                break;
            case 1:
                ((Player.Listener) obj).onMaxSeekToPreviousPositionChanged(this.f16816i);
                break;
            default:
                ((Player.Listener) obj).onSeekForwardIncrementChanged(this.f16816i);
                break;
        }
    }
}
