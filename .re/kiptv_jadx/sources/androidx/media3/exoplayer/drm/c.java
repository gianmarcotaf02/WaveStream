package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16621i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ c(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f16620h = i3;
        this.f16621i = obj;
        this.j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16620h) {
            case 0:
                ((androidx.media3.exoplayer.drm.DefaultDrmSessionManager.PreacquiredSessionReference) this.f16621i).lambda$acquire$0((androidx.media3.common.Format) this.j);
                break;
            default:
                ((androidx.media3.exoplayer.drm.OfflineLicenseHelper) this.f16621i).lambda$releaseManagerOnHandlerThread$4((com.google.common.util.concurrent.Q) this.j);
                break;
        }
    }
}
