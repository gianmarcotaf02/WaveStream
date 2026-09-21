package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaSessionLegacyStub f16926i;
    public final /* synthetic */ androidx.media3.session.PlayerWrapper j;

    public /* synthetic */ O0(androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub, androidx.media3.session.PlayerWrapper playerWrapper, int i3) {
        this.f16925h = i3;
        this.f16926i = mediaSessionLegacyStub;
        this.j = playerWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16925h) {
            case 0:
                this.f16926i.lambda$updateLegacySessionPlaybackStateAndQueue$25(this.j);
                break;
            default:
                this.f16926i.lambda$updateLegacySessionPlaybackState$24(this.j);
                break;
        }
    }
}
