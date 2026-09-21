package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import com.google.android.gms.internal.play_billing.M0;
import java.nio.ByteBuffer;

public interface AudioOutput {

    public interface Listener {
        void onOffloadDataRequest();

        void onOffloadPresentationEnded();

        void onPositionAdvancing(long j);

        void onReleased();

        void onUnderrun();
    }

    public static final class WriteException extends Exception {
        public final int errorCode;
        public final boolean isRecoverable;

        public WriteException(int i3, boolean z6) {
            super(M0.l(i3, "AudioOutput write failed: "));
            this.isRecoverable = z6;
            this.errorCode = i3;
        }
    }

    void addListener(Listener listener);

    void attachAuxEffect(int i3);

    default boolean canReuseAudioOutput(AudioOutputProvider.OutputConfig outputConfig, AudioOutputProvider.FormatConfig formatConfig, AudioOutputProvider.OutputConfig outputConfig2) {
        return outputConfig2.equals(outputConfig);
    }

    void flush();

    int getAudioSessionId();

    long getBufferSizeInFrames();

    PlaybackParameters getPlaybackParameters();

    long getPositionUs();

    int getSampleRate();

    boolean isOffloadedPlayback();

    boolean isStalled();

    void pause();

    void play();

    void release();

    void removeListener(Listener listener);

    void setAuxEffectSendLevel(float f9);

    void setOffloadDelayPadding(int i3, int i9);

    void setOffloadEndOfStream();

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    default void setPlayerId(PlayerId playerId) {
    }

    void setPreferredDevice(AudioDeviceInfo audioDeviceInfo);

    void setVolume(float f9);

    void stop();

    boolean write(ByteBuffer byteBuffer, int i3, long j);
}
