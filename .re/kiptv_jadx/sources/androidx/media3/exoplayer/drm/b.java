package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16619i;

    public /* synthetic */ b(int i3, java.lang.Object obj) {
        this.f16618h = i3;
        this.f16619i = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.f16618h) {
            case 0:
                ((androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher) obj).drmKeysLoaded((androidx.media3.exoplayer.drm.KeyRequestInfo) this.f16619i);
                break;
            default:
                androidx.media3.exoplayer.drm.DefaultDrmSession.lambda$onError$2((java.lang.Exception) this.f16619i, (androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher) obj);
                break;
        }
    }
}
