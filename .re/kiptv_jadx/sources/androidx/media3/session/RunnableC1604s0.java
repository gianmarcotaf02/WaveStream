package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1604s0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17108i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17109k;

    public /* synthetic */ RunnableC1604s0(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i3) {
        this.f17107h = i3;
        this.f17108i = obj;
        this.j = obj2;
        this.f17109k = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17107h) {
            case 0:
                ((androidx.media3.session.MediaLibraryServiceLegacyStub) this.f17108i).lambda$onUnsubscribe$2((androidx.media3.session.MediaSession.ControllerInfo) this.j, (java.lang.String) this.f17109k);
                break;
            case 1:
                androidx.media3.session.MediaLibraryServiceLegacyStub.lambda$createMediaItemToBrowserItemAsyncFunction$14((com.google.common.util.concurrent.J) this.f17108i, (com.google.common.util.concurrent.Q) this.j, (androidx.media3.common.MediaItem) this.f17109k);
                break;
            case 2:
                ((androidx.media3.session.MediaLibrarySessionImpl) this.f17108i).lambda$onUnsubscribeOnHandler$3((androidx.media3.session.MediaSession.ControllerInfo) this.j, (java.lang.String) this.f17109k);
                break;
            case 3:
                ((androidx.media3.session.MediaSessionImpl) this.f17108i).lambda$callWithControllerForCurrentRequestSet$3((androidx.media3.session.MediaSession.ControllerInfo) this.j, (java.lang.Runnable) this.f17109k);
                break;
            case 4:
                ((androidx.media3.session.MediaSessionImpl.MediaPlayPauseKeyHandler) this.f17108i).lambda$setPendingPlayPauseTask$0((androidx.media3.session.MediaSession.ControllerInfo) this.j, (android.view.KeyEvent) this.f17109k);
                break;
            default:
                androidx.media3.session.MediaSessionStub.lambda$handleMediaItemsWithStartPositionWhenReady$7((androidx.media3.session.MediaSessionImpl) this.f17108i, (androidx.media3.session.MediaSessionStub.MediaItemsWithStartPositionPlayerTask) this.j, (androidx.media3.session.MediaSession.MediaItemsWithStartPosition) this.f17109k);
                break;
        }
    }
}
