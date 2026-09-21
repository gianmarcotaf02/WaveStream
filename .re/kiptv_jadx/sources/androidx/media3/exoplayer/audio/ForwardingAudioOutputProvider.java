package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingAudioOutputProvider implements androidx.media3.exoplayer.audio.AudioOutputProvider {
    private final androidx.media3.exoplayer.audio.AudioOutputProvider audioOutputProvider;

    public ForwardingAudioOutputProvider(androidx.media3.exoplayer.audio.AudioOutputProvider audioOutputProvider) {
        this.audioOutputProvider = audioOutputProvider;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void addListener(androidx.media3.exoplayer.audio.AudioOutputProvider.Listener listener) {
        this.audioOutputProvider.addListener(listener);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public androidx.media3.exoplayer.audio.AudioOutput getAudioOutput(androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig) {
        return this.audioOutputProvider.getAudioOutput(outputConfig);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatSupport getFormatSupport(androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig formatConfig) {
        return this.audioOutputProvider.getFormatSupport(formatConfig);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig getOutputConfig(androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig formatConfig) {
        return this.audioOutputProvider.getOutputConfig(formatConfig);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void release() {
        this.audioOutputProvider.release();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void removeListener(androidx.media3.exoplayer.audio.AudioOutputProvider.Listener listener) {
        this.audioOutputProvider.removeListener(listener);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void setClock(androidx.media3.common.util.Clock clock) {
        this.audioOutputProvider.setClock(clock);
    }
}
