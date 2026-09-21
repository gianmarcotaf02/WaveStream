package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1618z0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17144h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f17145i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17148m;

    public /* synthetic */ RunnableC1618z0(androidx.media3.session.MediaNotificationManager mediaNotificationManager, androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaNotification mediaNotification, boolean z6, p155s1.h hVar) {
        this.j = mediaNotificationManager;
        this.f17146k = mediaSession;
        this.f17147l = mediaNotification;
        this.f17145i = z6;
        this.f17148m = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17144h) {
            case 0:
                ((androidx.media3.session.MediaNotificationManager) this.j).lambda$updateNotification$6((androidx.media3.session.MediaSession) this.f17146k, (androidx.media3.session.MediaNotification) this.f17147l, this.f17145i, (p155s1.h) this.f17148m);
                break;
            case 1:
                ((androidx.media3.session.MediaSessionImpl.AnonymousClass1) this.j).lambda$onSuccess$0((androidx.media3.session.MediaSession.MediaItemsWithStartPosition) this.f17146k, this.f17145i, (androidx.media3.session.MediaSession.ControllerInfo) this.f17147l, (androidx.media3.common.Player.Commands) this.f17148m);
                break;
            default:
                ((androidx.media3.session.MediaSessionService.MediaSessionServiceStub) this.j).lambda$connect$0((androidx.media3.session.IMediaController) this.f17146k, (androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo) this.f17147l, (androidx.media3.session.ConnectionRequest) this.f17148m, this.f17145i);
                break;
        }
    }

    public /* synthetic */ RunnableC1618z0(androidx.media3.session.MediaSessionImpl.AnonymousClass1 anonymousClass1, androidx.media3.session.MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition, boolean z6, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.common.Player.Commands commands) {
        this.j = anonymousClass1;
        this.f17146k = mediaItemsWithStartPosition;
        this.f17145i = z6;
        this.f17147l = controllerInfo;
        this.f17148m = commands;
    }

    public /* synthetic */ RunnableC1618z0(androidx.media3.session.MediaSessionService.MediaSessionServiceStub mediaSessionServiceStub, androidx.media3.session.IMediaController iMediaController, androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo, androidx.media3.session.ConnectionRequest connectionRequest, boolean z6) {
        this.j = mediaSessionServiceStub;
        this.f17146k = iMediaController;
        this.f17147l = remoteUserInfo;
        this.f17148m = connectionRequest;
        this.f17145i = z6;
    }
}
