package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher f16594i;
    public final /* synthetic */ androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig j;

    public /* synthetic */ g(androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig, int i3) {
        this.f16593h = i3;
        this.f16594i = eventDispatcher;
        this.j = audioTrackConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16593h) {
            case 0:
                this.f16594i.lambda$audioTrackInitialized$10(this.j);
                break;
            default:
                this.f16594i.lambda$audioTrackReleased$11(this.j);
                break;
        }
    }
}
