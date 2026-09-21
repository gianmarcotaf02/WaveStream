package androidx.media3.exoplayer.video;

import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.CodecParameters;

public final class e implements Runnable {

    public final int f16823h;

    public final Object f16824i;
    public final Object j;

    public e(Object obj, Object obj2, int i3) {
        this.f16823h = i3;
        this.j = obj;
        this.f16824i = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16823h) {
            case 0:
                ((DefaultVideoSink.FrameRendererImpl) this.j).lambda$onVideoSizeChanged$0((VideoSize) this.f16824i);
                break;
            case 1:
                ((VideoSink.Listener) this.j).onVideoSizeChanged((VideoSize) this.f16824i);
                break;
            case 2:
                ((VideoRendererEventListener.EventDispatcher) this.j).lambda$decoderReleased$7((String) this.f16824i);
                break;
            case 3:
                ((VideoRendererEventListener.EventDispatcher) this.j).lambda$videoSizeChanged$5((VideoSize) this.f16824i);
                break;
            case 4:
                ((VideoRendererEventListener.EventDispatcher) this.j).lambda$videoCodecError$9((Exception) this.f16824i);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.j).lambda$videoCodecParametersChanged$10((CodecParameters) this.f16824i);
                break;
        }
    }
}
