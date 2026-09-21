package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.drm.OfflineLicenseHelper f16633i;
    public final /* synthetic */ androidx.media3.exoplayer.drm.DrmSession j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.Q f16634k;

    public /* synthetic */ i(androidx.media3.exoplayer.drm.DrmSession drmSession, androidx.media3.exoplayer.drm.OfflineLicenseHelper offlineLicenseHelper, com.google.common.util.concurrent.Q q9) {
        this.f16632h = 1;
        this.f16633i = offlineLicenseHelper;
        this.j = drmSession;
        this.f16634k = q9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16632h) {
            case 0:
                this.f16633i.lambda$getLicenseDurationRemainingSec$0(this.f16634k, this.j);
                break;
            case 1:
                this.f16633i.lambda$acquireFirstSessionOnHandlerThread$3(this.j, this.f16634k);
                break;
            default:
                this.f16633i.lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1(this.f16634k, this.j);
                break;
        }
    }

    public /* synthetic */ i(androidx.media3.exoplayer.drm.OfflineLicenseHelper offlineLicenseHelper, com.google.common.util.concurrent.Q q9, androidx.media3.exoplayer.drm.DrmSession drmSession, int i3) {
        this.f16632h = i3;
        this.f16633i = offlineLicenseHelper;
        this.f16634k = q9;
        this.j = drmSession;
    }
}
