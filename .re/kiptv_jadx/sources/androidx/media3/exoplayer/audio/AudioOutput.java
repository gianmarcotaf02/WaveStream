package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public interface AudioOutput {

    public interface Listener {
        void onOffloadDataRequest();

        void onOffloadPresentationEnded();

        void onPositionAdvancing(long j);

        void onReleased();

        void onUnderrun();
    }

    public static final class WriteException extends java.lang.Exception {
        public final int errorCode;
        public final boolean isRecoverable;

        public WriteException(int i3, boolean z6) {
            super(com.google.android.gms.internal.play_billing.M0.l(i3, "AudioOutput write failed: "));
            this.isRecoverable = z6;
            this.errorCode = i3;
        }
    }

    void addListener(androidx.media3.exoplayer.audio.AudioOutput.Listener listener);

    void attachAuxEffect(int i3);

    default boolean canReuseAudioOutput(androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig, androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig formatConfig, androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig2) {
        return outputConfig2.equals(outputConfig);
    }

    void flush();

    int getAudioSessionId();

    long getBufferSizeInFrames();

    androidx.media3.common.PlaybackParameters getPlaybackParameters();

    long getPositionUs();

    int getSampleRate();

    boolean isOffloadedPlayback();

    boolean isStalled();

    void pause();

    void play();

    void release();

    void removeListener(androidx.media3.exoplayer.audio.AudioOutput.Listener listener);

    void setAuxEffectSendLevel(float f9);

    void setOffloadDelayPadding(int i3, int i9);

    void setOffloadEndOfStream();

    void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters);

    default void setPlayerId(androidx.media3.exoplayer.analytics.PlayerId playerId) {
    }

    void setPreferredDevice(android.media.AudioDeviceInfo audioDeviceInfo);

    void setVolume(float f9);

    void stop();

    boolean write(java.nio.ByteBuffer byteBuffer, int i3, long j);
}
