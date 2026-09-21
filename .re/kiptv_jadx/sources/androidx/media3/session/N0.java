package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N0 implements androidx.media3.session.MediaSessionLegacyStub.SessionTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaSessionLegacyStub f16922i;
    public final /* synthetic */ long j;

    public /* synthetic */ N0(androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub, long j, int i3) {
        this.f16921h = i3;
        this.f16922i = mediaSessionLegacyStub;
        this.j = j;
    }

    @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
    public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        switch (this.f16921h) {
            case 0:
                this.f16922i.lambda$onSkipToQueueItem$12(this.j, controllerInfo);
                break;
            default:
                this.f16922i.lambda$onSeekTo$6(this.j, controllerInfo);
                break;
        }
    }
}
