package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f16600i;
    public final /* synthetic */ long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f16601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16602l;

    public /* synthetic */ j(java.lang.Object obj, java.lang.String str, long j, long j9, int i3) {
        this.f16599h = i3;
        this.f16602l = obj;
        this.f16600i = str;
        this.j = j;
        this.f16601k = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16599h) {
            case 0:
                ((androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher) this.f16602l).lambda$decoderInitialized$1(this.f16600i, this.j, this.f16601k);
                break;
            default:
                ((androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher) this.f16602l).lambda$decoderInitialized$1(this.f16600i, this.j, this.f16601k);
                break;
        }
    }
}
