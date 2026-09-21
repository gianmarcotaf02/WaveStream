package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher f16625i;
    public final /* synthetic */ androidx.media3.exoplayer.drm.DrmSessionEventListener j;

    public /* synthetic */ e(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener, int i3) {
        this.f16624h = i3;
        this.f16625i = eventDispatcher;
        this.j = drmSessionEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16624h) {
            case 0:
                this.f16625i.lambda$drmKeysRemoved$4(this.j);
                break;
            case 1:
                this.f16625i.lambda$drmKeysRestored$3(this.j);
                break;
            default:
                this.f16625i.lambda$drmSessionReleased$5(this.j);
                break;
        }
    }
}
