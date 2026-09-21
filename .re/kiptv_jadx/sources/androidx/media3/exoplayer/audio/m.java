package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16606i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ m(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f16605h = i3;
        this.f16606i = obj;
        this.j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16605h) {
            case 0:
                ((androidx.media3.exoplayer.audio.AudioTrackAudioOutput.OnRoutingChangedListenerApi24) this.f16606i).lambda$onRoutingChanged$0((android.media.AudioDeviceInfo) this.j);
                break;
            case 1:
                ((androidx.media3.exoplayer.audio.AudioTrackAudioOutput.OnRoutingChangedListenerApi24) this.f16606i).lambda$onRoutingChanged$1((android.media.AudioRouting) this.j);
                break;
            case 2:
                ((androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher) this.f16606i).lambda$audioCodecParametersChanged$13((androidx.media3.exoplayer.CodecParameters) this.j);
                break;
            default:
                ((androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher) this.f16606i).lambda$decoderReleased$5((java.lang.String) this.j);
                break;
        }
    }
}
