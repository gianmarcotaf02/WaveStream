package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import java.util.List;

public final class V implements MediaControllerImplBase.RemoteSessionTask, MediaControllerStub.ControllerTask, MediaNotification.Provider.Callback, MediaSessionImpl.RemoteControllerTask, MediaSessionLegacyStub.SessionTask, Consumer {

    public final int f16956h;

    public final Object f16957i;
    public final Object j;

    public V(int i3, SessionCommand sessionCommand, Bundle bundle) {
        this.f16956h = i3;
        this.f16957i = sessionCommand;
        this.j = bundle;
    }

    @Override
    public void accept(Object obj) {
        MediaSessionStub.lambda$sendSessionResultWhenReady$2((MediaSessionImpl) this.f16957i, (MediaSession.ControllerInfo) this.j, this.f16956h, (com.google.common.util.concurrent.J) obj);
    }

    @Override
    public void onNotificationChanged(MediaNotification mediaNotification) {
        ((MediaNotificationManager) this.f16957i).lambda$updateNotification$5(this.f16956h, (MediaSession) this.j, mediaNotification);
    }

    @Override
    public void run(IMediaSession iMediaSession, int i3) {
        ((MediaControllerImplBase) this.f16957i).lambda$addMediaItems$39(this.f16956h, (List) this.j, iMediaSession, i3);
    }

    public V(Object obj, int i3, Object obj2) {
        this.f16957i = obj;
        this.f16956h = i3;
        this.j = obj2;
    }

    @Override
    public void run(MediaControllerImplBase mediaControllerImplBase) {
        mediaControllerImplBase.onCustomCommand(this.f16956h, (SessionCommand) this.f16957i, (Bundle) this.j);
    }

    public V(Object obj, Object obj2, int i3) {
        this.f16957i = obj;
        this.j = obj2;
        this.f16956h = i3;
    }

    @Override
    public void run(MediaSession.ControllerCb controllerCb, int i3) {
        controllerCb.onPositionDiscontinuity(i3, (Player.PositionInfo) this.f16957i, (Player.PositionInfo) this.j, this.f16956h);
    }

    @Override
    public void run(MediaSession.ControllerInfo controllerInfo) {
        ((MediaSessionLegacyStub) this.f16957i).lambda$handleOnAddQueueItem$27((MediaDescriptionCompat) this.j, this.f16956h, controllerInfo);
    }
}
