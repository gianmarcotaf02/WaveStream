package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher f16596i;
    public final /* synthetic */ java.lang.Exception j;

    public /* synthetic */ h(androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher eventDispatcher, java.lang.Exception exc, int i3) {
        this.f16595h = i3;
        this.f16596i = eventDispatcher;
        this.j = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16595h) {
            case 0:
                this.f16596i.lambda$audioCodecError$9(this.j);
                break;
            default:
                this.f16596i.lambda$audioSinkError$8(this.j);
                break;
        }
    }
}
