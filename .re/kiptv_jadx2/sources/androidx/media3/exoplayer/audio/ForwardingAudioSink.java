package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.analytics.PlayerId;
import java.nio.ByteBuffer;

public class ForwardingAudioSink implements AudioSink {
    private final AudioSink sink;

    public ForwardingAudioSink(AudioSink audioSink) {
        this.sink = audioSink;
    }

    @Override
    public void configure(Format format, int i3, int[] iArr) {
        this.sink.configure(format, i3, iArr);
    }

    @Override
    public void disableTunneling() {
        this.sink.disableTunneling();
    }

    @Override
    public void enableTunnelingV21() {
        this.sink.enableTunnelingV21();
    }

    @Override
    public void flush() {
        this.sink.flush();
    }

    @Override
    public AudioAttributes getAudioAttributes() {
        return this.sink.getAudioAttributes();
    }

    @Override
    public AudioCapabilities getAudioCapabilities() {
        return this.sink.getAudioCapabilities();
    }

    @Override
    public long getAudioTrackBufferSizeUs() {
        return this.sink.getAudioTrackBufferSizeUs();
    }

    @Override
    public long getCurrentPositionUs(boolean z6) {
        return this.sink.getCurrentPositionUs(z6);
    }

    @Override
    public AudioOffloadSupport getFormatOffloadSupport(Format format) {
        return this.sink.getFormatOffloadSupport(format);
    }

    @Override
    public int getFormatSupport(Format format) {
        return this.sink.getFormatSupport(format);
    }

    @Override
    public PlaybackParameters getPlaybackParameters() {
        return this.sink.getPlaybackParameters();
    }

    @Override
    public boolean getSkipSilenceEnabled() {
        return this.sink.getSkipSilenceEnabled();
    }

    @Override
    public boolean handleBuffer(ByteBuffer byteBuffer, long j, int i3) {
        return this.sink.handleBuffer(byteBuffer, j, i3);
    }

    @Override
    public void handleDiscontinuity() {
        this.sink.handleDiscontinuity();
    }

    @Override
    public boolean hasPendingData() {
        return this.sink.hasPendingData();
    }

    @Override
    public boolean isEnded() {
        return this.sink.isEnded();
    }

    @Override
    public void pause() {
        this.sink.pause();
    }

    @Override
    public void play() {
        this.sink.play();
    }

    @Override
    public void playToEndOfStream() {
        this.sink.playToEndOfStream();
    }

    @Override
    public void release() {
        this.sink.release();
    }

    @Override
    public void reset() {
        this.sink.reset();
    }

    @Override
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        this.sink.setAudioAttributes(audioAttributes);
    }

    @Override
    public void setAudioOutputProvider(AudioOutputProvider audioOutputProvider) {
        this.sink.setAudioOutputProvider(audioOutputProvider);
    }

    @Override
    public void setAudioSessionId(int i3) {
        this.sink.setAudioSessionId(i3);
    }

    @Override
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        this.sink.setAuxEffectInfo(auxEffectInfo);
    }

    @Override
    public void setClock(Clock clock) {
        this.sink.setClock(clock);
    }

    @Override
    public void setListener(AudioSink.Listener listener) {
        this.sink.setListener(listener);
    }

    @Override
    public void setOffloadDelayPadding(int i3, int i9) {
        this.sink.setOffloadDelayPadding(i3, i9);
    }

    @Override
    public void setOffloadMode(int i3) {
        this.sink.setOffloadMode(i3);
    }

    @Override
    public void setOutputStreamOffsetUs(long j) {
        this.sink.setOutputStreamOffsetUs(j);
    }

    @Override
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.sink.setPlaybackParameters(playbackParameters);
    }

    @Override
    public void setPlayerId(PlayerId playerId) {
        this.sink.setPlayerId(playerId);
    }

    @Override
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.sink.setPreferredDevice(audioDeviceInfo);
    }

    @Override
    public void setSkipSilenceEnabled(boolean z6) {
        this.sink.setSkipSilenceEnabled(z6);
    }

    @Override
    public void setVirtualDeviceId(int i3) {
        this.sink.setVirtualDeviceId(i3);
    }

    @Override
    public void setVolume(float f9) {
        this.sink.setVolume(f9);
    }

    @Override
    public boolean supportsFormat(Format format) {
        return this.sink.supportsFormat(format);
    }
}
