package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.ListenerSet;

public final class k implements ListenerSet.Event {

    public final int f16603h;

    public k(int i3) {
        this.f16603h = i3;
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.f16603h) {
            case 0:
                ((AudioOutput.Listener) obj).onUnderrun();
                break;
            case 1:
                ((AudioOutput.Listener) obj).onReleased();
                break;
            case 2:
                ((AudioOutput.Listener) obj).onOffloadDataRequest();
                break;
            case 3:
                ((AudioOutput.Listener) obj).onOffloadPresentationEnded();
                break;
            default:
                ((AudioOutputProvider.Listener) obj).onFormatSupportChanged();
                break;
        }
    }
}
