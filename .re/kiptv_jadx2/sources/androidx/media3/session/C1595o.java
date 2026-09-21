package androidx.media3.session;

import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;

public final class C1595o implements Consumer, ListenerSet.Event, MediaControllerImplBase.RemoteSessionTask, ListenerSet.IterationFinishedEvent {

    public final int f17085h;

    public final MediaControllerImplBase f17086i;

    public C1595o(MediaControllerImplBase mediaControllerImplBase, int i3) {
        this.f17085h = i3;
        this.f17086i = mediaControllerImplBase;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f17085h) {
            case 0:
                this.f17086i.lambda$onAvailableCommandsChangedFromSession$118((MediaController.Listener) obj);
                break;
            case 1:
                this.f17086i.lambda$onAvailableCommandsChangedFromSession$119((MediaController.Listener) obj);
                break;
            case 2:
            default:
                this.f17086i.lambda$onAvailableCommandsChangedFromPlayer$122((MediaController.Listener) obj);
                break;
            case 3:
                this.f17086i.lambda$onAvailableCommandsChangedFromPlayer$121((MediaController.Listener) obj);
                break;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f17085h) {
            case 2:
                this.f17086i.lambda$onAvailableCommandsChangedFromPlayer$120((Player.Listener) obj);
                break;
            default:
                this.f17086i.lambda$onAvailableCommandsChangedFromSession$116((Player.Listener) obj);
                break;
        }
    }

    @Override
    public void run(IMediaSession iMediaSession, int i3) {
        switch (this.f17085h) {
            case 5:
                this.f17086i.lambda$mute$58(0.0f, iMediaSession, i3);
                break;
            case 6:
                this.f17086i.lambda$seekToNextMediaItem$49(iMediaSession, i3);
                break;
            case 7:
                this.f17086i.lambda$decreaseDeviceVolume$70(iMediaSession, i3);
                break;
            case 8:
                this.f17086i.lambda$seekForward$13(iMediaSession, i3);
                break;
            case 9:
                this.f17086i.lambda$seekToDefaultPosition$8(iMediaSession, i3);
                break;
            case 10:
                this.f17086i.lambda$seekToPreviousMediaItem$48(iMediaSession, i3);
                break;
            case 11:
                this.f17086i.lambda$seekToPrevious$50(iMediaSession, i3);
                break;
            case 12:
                this.f17086i.lambda$seekToNext$51(iMediaSession, i3);
                break;
            case 13:
                this.f17086i.lambda$clearMediaItems$42(iMediaSession, i3);
                break;
            case 14:
                this.f17086i.lambda$seekBack$12(iMediaSession, i3);
                break;
            case 15:
                this.f17086i.lambda$pause$6(iMediaSession, i3);
                break;
            case 16:
                this.f17086i.lambda$increaseDeviceVolume$66(iMediaSession, i3);
                break;
            case 17:
            default:
                this.f17086i.lambda$prepare$7(iMediaSession, i3);
                break;
            case 18:
                this.f17086i.lambda$play$5(iMediaSession, i3);
                break;
            case 19:
                this.f17086i.lambda$stop$2(iMediaSession, i3);
                break;
        }
    }

    @Override
    public void invoke(Object obj, FlagSet flagSet) {
        this.f17086i.lambda$new$0((Player.Listener) obj, flagSet);
    }
}
