package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

public final class C1562q implements ListenerSet.Event {

    public final int f16711h;

    public final boolean f16712i;

    public C1562q(boolean z6, int i3) {
        this.f16711h = i3;
        this.f16712i = z6;
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.f16711h) {
            case 0:
                ((Player.Listener) obj).onSkipSilenceEnabledChanged(this.f16712i);
                break;
            case 1:
                ((Player.Listener) obj).onShuffleModeEnabledChanged(this.f16712i);
                break;
            default:
                ((Player.Listener) obj).onSkipSilenceEnabledChanged(this.f16712i);
                break;
        }
    }
}
