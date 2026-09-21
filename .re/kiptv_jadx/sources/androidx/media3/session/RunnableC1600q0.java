package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1600q0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.J f17096i;
    public final /* synthetic */ androidx.media3.session.legacy.MediaBrowserServiceCompat.Result j;

    public /* synthetic */ RunnableC1600q0(com.google.common.util.concurrent.J j, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result result, int i3) {
        this.f17095h = i3;
        this.f17096i = j;
        this.j = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17095h) {
            case 0:
                androidx.media3.session.MediaLibraryServiceLegacyStub.lambda$sendLibraryResultWithMediaItemWhenReady$8(this.f17096i, this.j);
                break;
            case 1:
                androidx.media3.session.MediaLibraryServiceLegacyStub.lambda$sendCustomActionResultWhenReady$7(this.f17096i, this.j);
                break;
            default:
                androidx.media3.session.MediaLibraryServiceLegacyStub.lambda$sendLibraryResultWithMediaItemsWhenReady$9(this.f17096i, this.j);
                break;
        }
    }
}
