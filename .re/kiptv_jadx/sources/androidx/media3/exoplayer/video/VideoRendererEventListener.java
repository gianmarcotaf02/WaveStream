package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public interface VideoRendererEventListener {

    public static final class EventDispatcher {
        private final android.os.Handler handler;
        private final androidx.media3.exoplayer.video.VideoRendererEventListener listener;

        public EventDispatcher(android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener) {
            if (videoRendererEventListener != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.handler = handler;
            this.listener = videoRendererEventListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderInitialized$1(java.lang.String str, long j, long j9) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoDecoderInitialized(str, j, j9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderReleased$7(java.lang.String str) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoDecoderReleased(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$disabled$8(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoDisabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$droppedFrames$3(int i3, long j) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onDroppedFrames(i3, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$enabled$0(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoEnabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$inputFormatChanged$2(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$renderedFirstFrame$6(java.lang.Object obj, long j) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onRenderedFirstFrame(obj, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reportVideoFrameProcessingOffset$4(long j, int i3) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoFrameProcessingOffset(j, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$videoCodecError$9(java.lang.Exception exc) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoCodecError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$videoCodecParametersChanged$10(androidx.media3.exoplayer.CodecParameters codecParameters) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoCodecParametersChanged(codecParameters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$videoSizeChanged$5(androidx.media3.common.VideoSize videoSize) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoSizeChanged(videoSize);
        }

        public void decoderInitialized(java.lang.String str, long j, long j9) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.j(this, str, j, j9, 1));
            }
        }

        public void decoderReleased(java.lang.String str) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.video.e(this, str, 2));
            }
        }

        public void disabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.video.k(this, decoderCounters, 1));
            }
        }

        public void droppedFrames(int i3, long j) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.video.i(i3, j, this));
            }
        }

        public void enabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.video.k(this, decoderCounters, 0));
            }
        }

        public void inputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.video.f(this, format, decoderReuseEvaluation, 1));
            }
        }

        public void renderedFirstFrame(java.lang.Object obj) {
            if (this.handler != null) {
                this.handler.post(new androidx.media3.exoplayer.video.j(this, obj, android.os.SystemClock.elapsedRealtime(), 0));
            }
        }

        public void reportVideoFrameProcessingOffset(long j, int i3) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.video.i(this, i3, 1, j));
            }
        }

        public void videoCodecError(java.lang.Exception exc) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.video.e(this, exc, 4));
            }
        }

        public void videoCodecParametersChanged(androidx.media3.exoplayer.CodecParameters codecParameters) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.video.e(this, codecParameters, 5));
            }
        }

        public void videoSizeChanged(androidx.media3.common.VideoSize videoSize) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.video.e(this, videoSize, 3));
            }
        }
    }

    default void onDroppedFrames(int i3, long j) {
    }

    default void onRenderedFirstFrame(java.lang.Object obj, long j) {
    }

    default void onVideoCodecError(java.lang.Exception exc) {
    }

    default void onVideoCodecParametersChanged(androidx.media3.exoplayer.CodecParameters codecParameters) {
    }

    default void onVideoDecoderInitialized(java.lang.String str, long j, long j9) {
    }

    default void onVideoDecoderReleased(java.lang.String str) {
    }

    default void onVideoDisabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
    }

    default void onVideoEnabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
    }

    default void onVideoFrameProcessingOffset(long j, int i3) {
    }

    default void onVideoInputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
    }
}
