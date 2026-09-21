package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class S0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.PlayerWrapper f16945i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16946k;

    public /* synthetic */ S0(int i3, int i9, int i10, androidx.media3.session.PlayerWrapper playerWrapper) {
        this.f16944h = i10;
        this.f16945i = playerWrapper;
        this.j = i3;
        this.f16946k = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16944h) {
            case 0:
                androidx.media3.session.MediaSessionLegacyStub.AnonymousClass3.lambda$onSetVolumeTo$0(this.f16945i, this.j, this.f16946k);
                break;
            default:
                androidx.media3.session.MediaSessionLegacyStub.AnonymousClass3.lambda$onAdjustVolume$1(this.f16945i, this.j, this.f16946k);
                break;
        }
    }
}
