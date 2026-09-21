package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;
    public static final int OFFLOAD_MODE_DISABLED = 0;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_NOT_REQUIRED = 2;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_REQUIRED = 1;
    public static final int SINK_FORMAT_SUPPORTED_DIRECTLY = 2;
    public static final int SINK_FORMAT_SUPPORTED_WITH_TRANSCODING = 1;
    public static final int SINK_FORMAT_UNSUPPORTED = 0;

    public static final class AudioTrackConfig {
        public final int bufferSize;
        public final int channelConfig;
        public final int encoding;
        public final boolean offload;
        public final int sampleRate;
        public final boolean tunneling;

        public AudioTrackConfig(int i3, int i9, int i10, boolean z6, boolean z9, int i11) {
            this.encoding = i3;
            this.sampleRate = i9;
            this.channelConfig = i10;
            this.tunneling = z6;
            this.offload = z9;
            this.bufferSize = i11;
        }
    }

    public interface Listener {
        default void onAudioCapabilitiesChanged() {
        }

        default void onAudioSessionIdChanged(int i3) {
        }

        default void onAudioSinkError(java.lang.Exception exc) {
        }

        default void onAudioTrackInitialized(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
        }

        default void onAudioTrackReleased(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
        }

        default void onOffloadBufferEmptying() {
        }

        default void onOffloadBufferFull() {
        }

        default void onPositionAdvancing(long j) {
        }

        void onPositionDiscontinuity();

        default void onSilenceSkipped() {
        }

        void onSkipSilenceEnabledChanged(boolean z6);

        void onUnderrun(int i3, long j, long j9);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SinkFormatSupport {
    }

    public static final class UnexpectedDiscontinuityException extends java.lang.Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        /* JADX WARN: Illegal instructions before constructor call */
        public UnexpectedDiscontinuityException(long j, long j9) {
            java.lang.StringBuilder sbU = p121o0.p.u(j9, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
            sbU.append(j);
            super(sbU.toString());
            this.actualPresentationTimeUs = j;
            this.expectedPresentationTimeUs = j9;
        }
    }

    public static final class WriteException extends java.lang.Exception {
        public final int errorCode;
        public final androidx.media3.common.Format format;
        public final boolean isRecoverable;

        public WriteException(int i3, androidx.media3.common.Format format, boolean z6) {
            super(com.google.android.gms.internal.play_billing.M0.l(i3, "AudioTrack write failed: "));
            this.isRecoverable = z6;
            this.errorCode = i3;
            this.format = format;
        }
    }

    void configure(androidx.media3.common.Format format, int i3, int[] iArr);

    void disableTunneling();

    void enableTunnelingV21();

    void flush();

    androidx.media3.common.AudioAttributes getAudioAttributes();

    default androidx.media3.exoplayer.audio.AudioCapabilities getAudioCapabilities() {
        return null;
    }

    long getAudioTrackBufferSizeUs();

    long getCurrentPositionUs(boolean z6);

    default androidx.media3.exoplayer.audio.AudioOffloadSupport getFormatOffloadSupport(androidx.media3.common.Format format) {
        return androidx.media3.exoplayer.audio.AudioOffloadSupport.DEFAULT_UNSUPPORTED;
    }

    int getFormatSupport(androidx.media3.common.Format format);

    androidx.media3.common.PlaybackParameters getPlaybackParameters();

    boolean getSkipSilenceEnabled();

    boolean handleBuffer(java.nio.ByteBuffer byteBuffer, long j, int i3);

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream();

    default void release() {
    }

    void reset();

    void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes);

    default void setAudioOutputProvider(androidx.media3.exoplayer.audio.AudioOutputProvider audioOutputProvider) {
        throw new java.lang.UnsupportedOperationException("AudioSink doesn't support setAudioOutputProvider");
    }

    void setAudioSessionId(int i3);

    void setAuxEffectInfo(androidx.media3.common.AuxEffectInfo auxEffectInfo);

    default void setClock(androidx.media3.common.util.Clock clock) {
    }

    void setListener(androidx.media3.exoplayer.audio.AudioSink.Listener listener);

    default void setOffloadDelayPadding(int i3, int i9) {
    }

    default void setOffloadMode(int i3) {
    }

    default void setOutputStreamOffsetUs(long j) {
    }

    void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters);

    default void setPlayerId(androidx.media3.exoplayer.analytics.PlayerId playerId) {
    }

    default void setPreferredDevice(android.media.AudioDeviceInfo audioDeviceInfo) {
    }

    void setSkipSilenceEnabled(boolean z6);

    default void setVirtualDeviceId(int i3) {
    }

    void setVolume(float f9);

    boolean supportsFormat(androidx.media3.common.Format format);

    public static final class ConfigurationException extends java.lang.Exception {
        public final androidx.media3.common.Format format;

        public ConfigurationException(java.lang.Throwable th, androidx.media3.common.Format format) {
            super(th);
            this.format = format;
        }

        public ConfigurationException(java.lang.String str, androidx.media3.common.Format format) {
            super(str);
            this.format = format;
        }
    }

    public static final class InitializationException extends java.lang.Exception {
        public final int audioTrackState;
        public final androidx.media3.common.Format format;
        public final boolean isRecoverable;

        public InitializationException(java.lang.String str, int i3, androidx.media3.common.Format format, boolean z6, java.lang.Throwable th) {
            super(str, th);
            this.audioTrackState = i3;
            this.isRecoverable = z6;
            this.format = format;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public InitializationException(int i3, int i9, int i10, int i11, int i12, androidx.media3.common.Format format, boolean z6, java.lang.Exception exc) {
            java.lang.StringBuilder sbS = p121o0.p.s(i3, i9, "AudioTrack init failed ", " Config(", ", ");
            Y6.f.w(sbS, i10, ", ", i11, ", ");
            sbS.append(i12);
            sbS.append(") ");
            sbS.append(format);
            sbS.append(z6 ? " (recoverable)" : "");
            this(sbS.toString(), i3, format, z6, exc);
        }
    }
}
