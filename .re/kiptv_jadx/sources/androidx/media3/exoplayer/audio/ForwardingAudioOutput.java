package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingAudioOutput implements androidx.media3.exoplayer.audio.AudioOutput {
    private final androidx.media3.exoplayer.audio.AudioOutput audioOutput;

    public ForwardingAudioOutput(androidx.media3.exoplayer.audio.AudioOutput audioOutput) {
        this.audioOutput = audioOutput;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void addListener(androidx.media3.exoplayer.audio.AudioOutput.Listener listener) {
        this.audioOutput.addListener(listener);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void attachAuxEffect(int i3) {
        this.audioOutput.attachAuxEffect(i3);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public boolean canReuseAudioOutput(androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig, androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig formatConfig, androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig2) {
        return this.audioOutput.canReuseAudioOutput(outputConfig, formatConfig, outputConfig2);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void flush() {
        this.audioOutput.flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public int getAudioSessionId() {
        return this.audioOutput.getAudioSessionId();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public long getBufferSizeInFrames() {
        return this.audioOutput.getBufferSizeInFrames();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        return this.audioOutput.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public long getPositionUs() {
        return this.audioOutput.getPositionUs();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public int getSampleRate() {
        return this.audioOutput.getSampleRate();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public boolean isOffloadedPlayback() {
        return this.audioOutput.isOffloadedPlayback();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public boolean isStalled() {
        return this.audioOutput.isStalled();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void pause() {
        this.audioOutput.pause();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void play() {
        this.audioOutput.play();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void release() {
        this.audioOutput.release();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void removeListener(androidx.media3.exoplayer.audio.AudioOutput.Listener listener) {
        this.audioOutput.removeListener(listener);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setAuxEffectSendLevel(float f9) {
        this.audioOutput.setAuxEffectSendLevel(f9);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setOffloadDelayPadding(int i3, int i9) {
        this.audioOutput.setOffloadDelayPadding(i3, i9);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setOffloadEndOfStream() {
        this.audioOutput.setOffloadEndOfStream();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        this.audioOutput.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setPlayerId(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        this.audioOutput.setPlayerId(playerId);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setPreferredDevice(android.media.AudioDeviceInfo audioDeviceInfo) {
        this.audioOutput.setPreferredDevice(audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setVolume(float f9) {
        this.audioOutput.setVolume(f9);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void stop() {
        this.audioOutput.stop();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public boolean write(java.nio.ByteBuffer byteBuffer, int i3, long j) {
        return this.audioOutput.write(byteBuffer, i3, j);
    }
}
