package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher f16587i;
    public final /* synthetic */ androidx.media3.exoplayer.DecoderCounters j;

    public /* synthetic */ d(androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.DecoderCounters decoderCounters, int i3) {
        this.f16586h = i3;
        this.f16587i = eventDispatcher;
        this.j = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16586h) {
            case 0:
                this.f16587i.lambda$enabled$0(this.j);
                break;
            default:
                this.f16587i.lambda$disabled$6(this.j);
                break;
        }
    }
}
