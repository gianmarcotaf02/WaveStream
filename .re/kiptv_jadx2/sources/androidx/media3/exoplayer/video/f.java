package androidx.media3.exoplayer.video;

import androidx.media3.common.Format;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

public final class f implements Runnable {

    public final int f16825h;

    public final Object f16826i;
    public final Object j;

    public final Object f16827k;

    public f(Object obj, Object obj2, Object obj3, int i3) {
        this.f16825h = i3;
        this.f16826i = obj;
        this.j = obj2;
        this.f16827k = obj3;
    }

    @Override
    public final void run() {
        switch (this.f16825h) {
            case 0:
                ((PlaybackVideoGraphWrapper.InputVideoSink) this.f16826i).lambda$onError$1((VideoSink.Listener) this.j, (VideoFrameProcessingException) this.f16827k);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.f16826i).lambda$inputFormatChanged$2((Format) this.j, (DecoderReuseEvaluation) this.f16827k);
                break;
        }
    }
}
