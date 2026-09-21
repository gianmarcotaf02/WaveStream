package androidx.media3.session;

import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

public final class C1576e0 implements ListenerSet.Event, ListenerSet.IterationFinishedEvent {

    public final MediaControllerImplLegacy f17009h;

    public C1576e0(MediaControllerImplLegacy mediaControllerImplLegacy) {
        this.f17009h = mediaControllerImplLegacy;
    }

    @Override
    public void invoke(Object obj) {
        this.f17009h.lambda$updateControllerInfo$14((Player.Listener) obj);
    }

    @Override
    public void invoke(Object obj, FlagSet flagSet) {
        this.f17009h.lambda$new$0((Player.Listener) obj, flagSet);
    }
}
