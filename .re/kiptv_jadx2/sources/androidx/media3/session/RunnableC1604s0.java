package androidx.media3.session;

import android.view.KeyEvent;
import androidx.media3.common.MediaItem;

public final class RunnableC1604s0 implements Runnable {

    public final int f17107h;

    public final Object f17108i;
    public final Object j;

    public final Object f17109k;

    public RunnableC1604s0(Object obj, Object obj2, Object obj3, int i3) {
        this.f17107h = i3;
        this.f17108i = obj;
        this.j = obj2;
        this.f17109k = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17107h) {
            case 0:
                ((MediaLibraryServiceLegacyStub) this.f17108i).lambda$onUnsubscribe$2((MediaSession.ControllerInfo) this.j, (String) this.f17109k);
                break;
            case 1:
                MediaLibraryServiceLegacyStub.lambda$createMediaItemToBrowserItemAsyncFunction$14((com.google.common.util.concurrent.J) this.f17108i, (com.google.common.util.concurrent.Q) this.j, (MediaItem) this.f17109k);
                break;
            case 2:
                ((MediaLibrarySessionImpl) this.f17108i).lambda$onUnsubscribeOnHandler$3((MediaSession.ControllerInfo) this.j, (String) this.f17109k);
                break;
            case 3:
                ((MediaSessionImpl) this.f17108i).lambda$callWithControllerForCurrentRequestSet$3((MediaSession.ControllerInfo) this.j, (Runnable) this.f17109k);
                break;
            case 4:
                ((MediaSessionImpl.MediaPlayPauseKeyHandler) this.f17108i).lambda$setPendingPlayPauseTask$0((MediaSession.ControllerInfo) this.j, (KeyEvent) this.f17109k);
                break;
            default:
                MediaSessionStub.lambda$handleMediaItemsWithStartPositionWhenReady$7((MediaSessionImpl) this.f17108i, (MediaSessionStub.MediaItemsWithStartPositionPlayerTask) this.j, (MediaSession.MediaItemsWithStartPosition) this.f17109k);
                break;
        }
    }
}
