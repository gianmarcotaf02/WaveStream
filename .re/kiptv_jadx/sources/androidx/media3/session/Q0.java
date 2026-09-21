package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Q0 implements androidx.media3.session.MediaSessionLegacyStub.SessionTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaSessionLegacyStub f16935i;
    public final /* synthetic */ int j;

    public /* synthetic */ Q0(androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub, int i3, int i9) {
        this.f16934h = i9;
        this.f16935i = mediaSessionLegacyStub;
        this.j = i3;
    }

    @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
    public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        switch (this.f16934h) {
            case 0:
                this.f16935i.lambda$onSetRepeatMode$15(this.j, controllerInfo);
                break;
            default:
                this.f16935i.lambda$onSetShuffleMode$16(this.j, controllerInfo);
                break;
        }
    }
}
