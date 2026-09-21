package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher f16837i;
    public final /* synthetic */ androidx.media3.exoplayer.DecoderCounters j;

    public /* synthetic */ k(androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.DecoderCounters decoderCounters, int i3) {
        this.f16836h = i3;
        this.f16837i = eventDispatcher;
        this.j = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16836h) {
            case 0:
                this.f16837i.lambda$enabled$0(this.j);
                break;
            default:
                this.f16837i.lambda$disabled$8(this.j);
                break;
        }
    }
}
