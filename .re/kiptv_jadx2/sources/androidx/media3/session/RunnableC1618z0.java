package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.session.legacy.MediaSessionManager;

public final class RunnableC1618z0 implements Runnable {

    public final int f17144h = 0;

    public final boolean f17145i;
    public final Object j;

    public final Object f17146k;

    public final Object f17147l;

    public final Object f17148m;

    public RunnableC1618z0(MediaNotificationManager mediaNotificationManager, MediaSession mediaSession, MediaNotification mediaNotification, boolean z6, p155s1.h hVar) {
        this.j = mediaNotificationManager;
        this.f17146k = mediaSession;
        this.f17147l = mediaNotification;
        this.f17145i = z6;
        this.f17148m = hVar;
    }

    @Override
    public final void run() {
        switch (this.f17144h) {
            case 0:
                ((MediaNotificationManager) this.j).lambda$updateNotification$6((MediaSession) this.f17146k, (MediaNotification) this.f17147l, this.f17145i, (p155s1.h) this.f17148m);
                break;
            case 1:
                ((MediaSessionImpl.AnonymousClass1) this.j).lambda$onSuccess$0((MediaSession.MediaItemsWithStartPosition) this.f17146k, this.f17145i, (MediaSession.ControllerInfo) this.f17147l, (Player.Commands) this.f17148m);
                break;
            default:
                ((MediaSessionService.MediaSessionServiceStub) this.j).lambda$connect$0((IMediaController) this.f17146k, (MediaSessionManager.RemoteUserInfo) this.f17147l, (ConnectionRequest) this.f17148m, this.f17145i);
                break;
        }
    }

    public RunnableC1618z0(MediaSessionImpl.AnonymousClass1 anonymousClass1, MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition, boolean z6, MediaSession.ControllerInfo controllerInfo, Player.Commands commands) {
        this.j = anonymousClass1;
        this.f17146k = mediaItemsWithStartPosition;
        this.f17145i = z6;
        this.f17147l = controllerInfo;
        this.f17148m = commands;
    }

    public RunnableC1618z0(MediaSessionService.MediaSessionServiceStub mediaSessionServiceStub, IMediaController iMediaController, MediaSessionManager.RemoteUserInfo remoteUserInfo, ConnectionRequest connectionRequest, boolean z6) {
        this.j = mediaSessionServiceStub;
        this.f17146k = iMediaController;
        this.f17147l = remoteUserInfo;
        this.f17148m = connectionRequest;
        this.f17145i = z6;
    }
}
