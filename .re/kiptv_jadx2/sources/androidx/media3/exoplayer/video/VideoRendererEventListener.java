package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

public interface VideoRendererEventListener {

    public static final class EventDispatcher {
        private final Handler handler;
        private final VideoRendererEventListener listener;

        public EventDispatcher(Handler handler, VideoRendererEventListener videoRendererEventListener) {
            if (videoRendererEventListener != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.handler = handler;
            this.listener = videoRendererEventListener;
        }

        public void lambda$decoderInitialized$1(String str, long j, long j9) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoDecoderInitialized(str, j, j9);
        }

        public void lambda$decoderReleased$7(String str) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoDecoderReleased(str);
        }

        public void lambda$disabled$8(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoDisabled(decoderCounters);
        }

        public void lambda$droppedFrames$3(int i3, long j) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onDroppedFrames(i3, j);
        }

        public void lambda$enabled$0(DecoderCounters decoderCounters) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoEnabled(decoderCounters);
        }

        public void lambda$inputFormatChanged$2(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        public void lambda$renderedFirstFrame$6(Object obj, long j) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onRenderedFirstFrame(obj, j);
        }

        public void lambda$reportVideoFrameProcessingOffset$4(long j, int i3) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoFrameProcessingOffset(j, i3);
        }

        public void lambda$videoCodecError$9(Exception exc) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoCodecError(exc);
        }

        public void lambda$videoCodecParametersChanged$10(CodecParameters codecParameters) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoCodecParametersChanged(codecParameters);
        }

        public void lambda$videoSizeChanged$5(VideoSize videoSize) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoSizeChanged(videoSize);
        }

        public void decoderInitialized(String str, long j, long j9) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.j(this, str, j, j9, 1));
            }
        }

        public void decoderReleased(String str) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new e(this, str, 2));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new k(this, decoderCounters, 1));
            }
        }

        public void droppedFrames(int i3, long j) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new i(i3, j, this));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new k(this, decoderCounters, 0));
            }
        }

        public void inputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new f(this, format, decoderReuseEvaluation, 1));
            }
        }

        public void renderedFirstFrame(Object obj) {
            if (this.handler != null) {
                this.handler.post(new j(this, obj, SystemClock.elapsedRealtime(), 0));
            }
        }

        public void reportVideoFrameProcessingOffset(long j, int i3) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new i(this, i3, 1, j));
            }
        }

        public void videoCodecError(Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new e(this, exc, 4));
            }
        }

        public void videoCodecParametersChanged(CodecParameters codecParameters) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new e(this, codecParameters, 5));
            }
        }

        public void videoSizeChanged(VideoSize videoSize) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new e(this, videoSize, 3));
            }
        }
    }

    default void onDroppedFrames(int i3, long j) {
    }

    default void onRenderedFirstFrame(Object obj, long j) {
    }

    default void onVideoCodecError(Exception exc) {
    }

    default void onVideoCodecParametersChanged(CodecParameters codecParameters) {
    }

    default void onVideoDecoderInitialized(String str, long j, long j9) {
    }

    default void onVideoDecoderReleased(String str) {
    }

    default void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    default void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    default void onVideoFrameProcessingOffset(long j, int i3) {
    }

    default void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onVideoSizeChanged(VideoSize videoSize) {
    }
}
