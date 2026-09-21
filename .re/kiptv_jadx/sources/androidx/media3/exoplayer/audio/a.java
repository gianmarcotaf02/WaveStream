package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16585i;

    public /* synthetic */ a(int i3, java.lang.Object obj) {
        this.f16584h = i3;
        this.f16585i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16584h) {
            case 0:
                ((androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver) this.f16585i).updateCurrentAudioCapabilities();
                break;
            case 1:
                androidx.media3.exoplayer.audio.AudioTrackAudioOutput.lambda$releaseAudioTrackAsync$0((androidx.media3.common.util.ListenerSet) this.f16585i);
                break;
            default:
                ((androidx.media3.exoplayer.audio.DefaultAudioSink) this.f16585i).maybeReportSkippedSilence();
                break;
        }
    }
}
