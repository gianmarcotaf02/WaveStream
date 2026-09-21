package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16623i;

    public /* synthetic */ d(int i3, java.lang.Object obj) {
        this.f16622h = i3;
        this.f16623i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16622h) {
            case 0:
                ((androidx.media3.exoplayer.drm.DefaultDrmSessionManager.PreacquiredSessionReference) this.f16623i).lambda$release$1();
                break;
            default:
                ((androidx.media3.exoplayer.drm.DefaultDrmSession) this.f16623i).release(null);
                break;
        }
    }
}
