package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import java.nio.ByteBuffer;

public class ForwardingAudioOutput implements AudioOutput {
    private final AudioOutput audioOutput;

    public ForwardingAudioOutput(AudioOutput audioOutput) {
        this.audioOutput = audioOutput;
    }

    @Override
    public void addListener(AudioOutput.Listener listener) {
        this.audioOutput.addListener(listener);
    }

    @Override
    public void attachAuxEffect(int i3) {
        this.audioOutput.attachAuxEffect(i3);
    }

    @Override
    public boolean canReuseAudioOutput(AudioOutputProvider.OutputConfig outputConfig, AudioOutputProvider.FormatConfig formatConfig, AudioOutputProvider.OutputConfig outputConfig2) {
        return this.audioOutput.canReuseAudioOutput(outputConfig, formatConfig, outputConfig2);
    }

    @Override
    public void flush() {
        this.audioOutput.flush();
    }

    @Override
    public int getAudioSessionId() {
        return this.audioOutput.getAudioSessionId();
    }

    @Override
    public long getBufferSizeInFrames() {
        return this.audioOutput.getBufferSizeInFrames();
    }

    @Override
    public PlaybackParameters getPlaybackParameters() {
        return this.audioOutput.getPlaybackParameters();
    }

    @Override
    public long getPositionUs() {
        return this.audioOutput.getPositionUs();
    }

    @Override
    public int getSampleRate() {
        return this.audioOutput.getSampleRate();
    }

    @Override
    public boolean isOffloadedPlayback() {
        return this.audioOutput.isOffloadedPlayback();
    }

    @Override
    public boolean isStalled() {
        return this.audioOutput.isStalled();
    }

    @Override
    public void pause() {
        this.audioOutput.pause();
    }

    @Override
    public void play() {
        this.audioOutput.play();
    }

    @Override
    public void release() {
        this.audioOutput.release();
    }

    @Override
    public void removeListener(AudioOutput.Listener listener) {
        this.audioOutput.removeListener(listener);
    }

    @Override
    public void setAuxEffectSendLevel(float f9) {
        this.audioOutput.setAuxEffectSendLevel(f9);
    }

    @Override
    public void setOffloadDelayPadding(int i3, int i9) {
        this.audioOutput.setOffloadDelayPadding(i3, i9);
    }

    @Override
    public void setOffloadEndOfStream() {
        this.audioOutput.setOffloadEndOfStream();
    }

    @Override
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.audioOutput.setPlaybackParameters(playbackParameters);
    }

    @Override
    public void setPlayerId(PlayerId playerId) {
        this.audioOutput.setPlayerId(playerId);
    }

    @Override
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.audioOutput.setPreferredDevice(audioDeviceInfo);
    }

    @Override
    public void setVolume(float f9) {
        this.audioOutput.setVolume(f9);
    }

    @Override
    public void stop() {
        this.audioOutput.stop();
    }

    @Override
    public boolean write(ByteBuffer byteBuffer, int i3, long j) {
        return this.audioOutput.write(byteBuffer, i3, j);
    }
}
