package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;

public final class b implements MediaCodec.OnFrameRenderedListener {

    public final int f16687a;

    public final MediaCodecAdapter.OnFrameRenderedListener f16688b;

    public final MediaCodecAdapter f16689c;

    public b(MediaCodecAdapter mediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, int i3) {
        this.f16687a = i3;
        this.f16689c = mediaCodecAdapter;
        this.f16688b = onFrameRenderedListener;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j9) {
        switch (this.f16687a) {
            case 0:
                ((AsynchronousMediaCodecAdapter) this.f16689c).lambda$setOnFrameRenderedListener$1(this.f16688b, mediaCodec, j, j9);
                break;
            default:
                ((SynchronousMediaCodecAdapter) this.f16689c).lambda$setOnFrameRenderedListener$0(this.f16688b, mediaCodec, j, j9);
                break;
        }
    }
}
