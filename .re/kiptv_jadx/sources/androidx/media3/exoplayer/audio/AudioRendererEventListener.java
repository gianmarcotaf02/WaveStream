package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public interface AudioRendererEventListener {

    public static final class EventDispatcher {
        private final android.os.Handler handler;
        private final androidx.media3.exoplayer.audio.AudioRendererEventListener listener;

        public EventDispatcher(android.os.Handler handler, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener) {
            if (audioRendererEventListener != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.handler = handler;
            this.listener = audioRendererEventListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioCodecError$9(java.lang.Exception exc) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioCodecError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioCodecParametersChanged$13(androidx.media3.exoplayer.CodecParameters codecParameters) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioCodecParametersChanged(codecParameters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioSessionIdChanged$12(int i3) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioSessionIdChanged(i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioSinkError$8(java.lang.Exception exc) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioSinkError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioTrackInitialized$10(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioTrackInitialized(audioTrackConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioTrackReleased$11(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioTrackReleased(audioTrackConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderInitialized$1(java.lang.String str, long j, long j9) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioDecoderInitialized(str, j, j9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderReleased$5(java.lang.String str) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioDecoderReleased(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$disabled$6(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioDisabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$enabled$0(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioEnabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$inputFormatChanged$2(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$positionAdvancing$3(long j) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioPositionAdvancing(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$skipSilenceEnabledChanged$7(boolean z6) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onSkipSilenceEnabledChanged(z6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$underrun$4(int i3, long j, long j9) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioUnderrun(i3, j, j9);
        }

        public void audioCodecError(java.lang.Exception exc) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.h(this, exc, 0));
            }
        }

        public void audioCodecParametersChanged(androidx.media3.exoplayer.CodecParameters codecParameters) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.m(this, codecParameters, 2));
            }
        }

        public void audioSessionIdChanged(int i3) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new S.e(this, i3, 1));
            }
        }

        public void audioSinkError(java.lang.Exception exc) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.h(this, exc, 1));
            }
        }

        public void audioTrackInitialized(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.g(this, audioTrackConfig, 0));
            }
        }

        public void audioTrackReleased(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.g(this, audioTrackConfig, 1));
            }
        }

        public void decoderInitialized(java.lang.String str, long j, long j9) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.j(this, str, j, j9, 0));
            }
        }

        public void decoderReleased(java.lang.String str) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.m(this, str, 3));
            }
        }

        public void disabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.d(this, decoderCounters, 1));
            }
        }

        public void enabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.d(this, decoderCounters, 0));
            }
        }

        public void inputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O.g(this, format, decoderReuseEvaluation, 4));
            }
        }

        public void positionAdvancing(long j) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.e(this, j, 0));
            }
        }

        public void skipSilenceEnabledChanged(boolean z6) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.i(0, this, z6));
            }
        }

        public void underrun(final int i3, final long j, final long j9) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16590h.lambda$underrun$4(i3, j, j9);
                    }
                });
            }
        }
    }

    default void onAudioCodecError(java.lang.Exception exc) {
    }

    default void onAudioCodecParametersChanged(androidx.media3.exoplayer.CodecParameters codecParameters) {
    }

    default void onAudioDecoderInitialized(java.lang.String str, long j, long j9) {
    }

    default void onAudioDecoderReleased(java.lang.String str) {
    }

    default void onAudioDisabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
    }

    default void onAudioEnabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
    }

    default void onAudioInputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onAudioPositionAdvancing(long j) {
    }

    default void onAudioSessionIdChanged(int i3) {
    }

    default void onAudioSinkError(java.lang.Exception exc) {
    }

    default void onAudioTrackInitialized(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void onAudioTrackReleased(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void onAudioUnderrun(int i3, long j, long j9) {
    }

    default void onSkipSilenceEnabledChanged(boolean z6) {
    }
}
