package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.analytics.PlayerId;
import com.google.android.gms.internal.play_billing.M0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

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

        default void onAudioSinkError(Exception exc) {
        }

        default void onAudioTrackInitialized(AudioTrackConfig audioTrackConfig) {
        }

        default void onAudioTrackReleased(AudioTrackConfig audioTrackConfig) {
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

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SinkFormatSupport {
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public UnexpectedDiscontinuityException(long j, long j9) {
            StringBuilder sbU = p121o0.p.u(j9, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
            sbU.append(j);
            super(sbU.toString());
            this.actualPresentationTimeUs = j;
            this.expectedPresentationTimeUs = j9;
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;
        public final Format format;
        public final boolean isRecoverable;

        public WriteException(int i3, Format format, boolean z6) {
            super(M0.l(i3, "AudioTrack write failed: "));
            this.isRecoverable = z6;
            this.errorCode = i3;
            this.format = format;
        }
    }

    void configure(Format format, int i3, int[] iArr);

    void disableTunneling();

    void enableTunnelingV21();

    void flush();

    AudioAttributes getAudioAttributes();

    default AudioCapabilities getAudioCapabilities() {
        return null;
    }

    long getAudioTrackBufferSizeUs();

    long getCurrentPositionUs(boolean z6);

    default AudioOffloadSupport getFormatOffloadSupport(Format format) {
        return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
    }

    int getFormatSupport(Format format);

    PlaybackParameters getPlaybackParameters();

    boolean getSkipSilenceEnabled();

    boolean handleBuffer(ByteBuffer byteBuffer, long j, int i3);

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream();

    default void release() {
    }

    void reset();

    void setAudioAttributes(AudioAttributes audioAttributes);

    default void setAudioOutputProvider(AudioOutputProvider audioOutputProvider) {
        throw new UnsupportedOperationException("AudioSink doesn't support setAudioOutputProvider");
    }

    void setAudioSessionId(int i3);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    default void setClock(Clock clock) {
    }

    void setListener(Listener listener);

    default void setOffloadDelayPadding(int i3, int i9) {
    }

    default void setOffloadMode(int i3) {
    }

    default void setOutputStreamOffsetUs(long j) {
    }

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    default void setPlayerId(PlayerId playerId) {
    }

    default void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
    }

    void setSkipSilenceEnabled(boolean z6);

    default void setVirtualDeviceId(int i3) {
    }

    void setVolume(float f9);

    boolean supportsFormat(Format format);

    public static final class ConfigurationException extends Exception {
        public final Format format;

        public ConfigurationException(Throwable th, Format format) {
            super(th);
            this.format = format;
        }

        public ConfigurationException(String str, Format format) {
            super(str);
            this.format = format;
        }
    }

    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final Format format;
        public final boolean isRecoverable;

        public InitializationException(String str, int i3, Format format, boolean z6, Throwable th) {
            super(str, th);
            this.audioTrackState = i3;
            this.isRecoverable = z6;
            this.format = format;
        }

        public InitializationException(int i3, int i9, int i10, int i11, int i12, Format format, boolean z6, Exception exc) {
            StringBuilder sbS = p121o0.p.s(i3, i9, "AudioTrack init failed ", " Config(", ", ");
            Y6.f.w(sbS, i10, ", ", i11, ", ");
            sbS.append(i12);
            sbS.append(") ");
            sbS.append(format);
            sbS.append(z6 ? " (recoverable)" : "");
            this(sbS.toString(), i3, format, z6, exc);
        }
    }
}
