package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements android.media.MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener f16688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.mediacodec.MediaCodecAdapter f16689c;

    public /* synthetic */ b(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, int i3) {
        this.f16687a = i3;
        this.f16689c = mediaCodecAdapter;
        this.f16688b = onFrameRenderedListener;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(android.media.MediaCodec mediaCodec, long j, long j9) {
        switch (this.f16687a) {
            case 0:
                ((androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter) this.f16689c).lambda$setOnFrameRenderedListener$1(this.f16688b, mediaCodec, j, j9);
                break;
            default:
                ((androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter) this.f16689c).lambda$setOnFrameRenderedListener$0(this.f16688b, mediaCodec, j, j9);
                break;
        }
    }
}
