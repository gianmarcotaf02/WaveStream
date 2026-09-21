package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingAudioSink implements androidx.media3.exoplayer.audio.AudioSink {
    private final androidx.media3.exoplayer.audio.AudioSink sink;

    public ForwardingAudioSink(androidx.media3.exoplayer.audio.AudioSink audioSink) {
        this.sink = audioSink;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void configure(androidx.media3.common.Format format, int i3, int[] iArr) {
        this.sink.configure(format, i3, iArr);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void disableTunneling() {
        this.sink.disableTunneling();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void enableTunnelingV21() {
        this.sink.enableTunnelingV21();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() {
        this.sink.flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.common.AudioAttributes getAudioAttributes() {
        return this.sink.getAudioAttributes();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.exoplayer.audio.AudioCapabilities getAudioCapabilities() {
        return this.sink.getAudioCapabilities();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getAudioTrackBufferSizeUs() {
        return this.sink.getAudioTrackBufferSizeUs();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getCurrentPositionUs(boolean z6) {
        return this.sink.getCurrentPositionUs(z6);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.exoplayer.audio.AudioOffloadSupport getFormatOffloadSupport(androidx.media3.common.Format format) {
        return this.sink.getFormatOffloadSupport(format);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int getFormatSupport(androidx.media3.common.Format format) {
        return this.sink.getFormatSupport(format);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        return this.sink.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return this.sink.getSkipSilenceEnabled();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean handleBuffer(java.nio.ByteBuffer byteBuffer, long j, int i3) {
        return this.sink.handleBuffer(byteBuffer, j, i3);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void handleDiscontinuity() {
        this.sink.handleDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean hasPendingData() {
        return this.sink.hasPendingData();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean isEnded() {
        return this.sink.isEnded();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.sink.pause();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void play() {
        this.sink.play();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void playToEndOfStream() {
        this.sink.playToEndOfStream();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        this.sink.release();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void reset() {
        this.sink.reset();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
        this.sink.setAudioAttributes(audioAttributes);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioOutputProvider(androidx.media3.exoplayer.audio.AudioOutputProvider audioOutputProvider) {
        this.sink.setAudioOutputProvider(audioOutputProvider);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioSessionId(int i3) {
        this.sink.setAudioSessionId(i3);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAuxEffectInfo(androidx.media3.common.AuxEffectInfo auxEffectInfo) {
        this.sink.setAuxEffectInfo(auxEffectInfo);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setClock(androidx.media3.common.util.Clock clock) {
        this.sink.setClock(clock);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setListener(androidx.media3.exoplayer.audio.AudioSink.Listener listener) {
        this.sink.setListener(listener);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOffloadDelayPadding(int i3, int i9) {
        this.sink.setOffloadDelayPadding(i3, i9);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOffloadMode(int i3) {
        this.sink.setOffloadMode(i3);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOutputStreamOffsetUs(long j) {
        this.sink.setOutputStreamOffsetUs(j);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        this.sink.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlayerId(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        this.sink.setPlayerId(playerId);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPreferredDevice(android.media.AudioDeviceInfo audioDeviceInfo) {
        this.sink.setPreferredDevice(audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z6) {
        this.sink.setSkipSilenceEnabled(z6);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVirtualDeviceId(int i3) {
        this.sink.setVirtualDeviceId(i3);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVolume(float f9) {
        this.sink.setVolume(f9);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean supportsFormat(androidx.media3.common.Format format) {
        return this.sink.supportsFormat(format);
    }
}
