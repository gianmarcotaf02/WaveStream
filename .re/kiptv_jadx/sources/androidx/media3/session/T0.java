package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class T0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaSessionService f16950i;
    public final /* synthetic */ androidx.media3.session.MediaSession j;

    public /* synthetic */ T0(androidx.media3.session.MediaSessionService mediaSessionService, androidx.media3.session.MediaSession mediaSession, int i3) {
        this.f16949h = i3;
        this.f16950i = mediaSessionService;
        this.j = mediaSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16949h) {
            case 0:
                this.f16950i.lambda$removeSession$1(this.j);
                break;
            default:
                this.f16950i.lambda$addSession$0(this.j);
                break;
        }
    }
}
