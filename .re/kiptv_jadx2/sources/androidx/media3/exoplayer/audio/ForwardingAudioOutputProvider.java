package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Clock;

public class ForwardingAudioOutputProvider implements AudioOutputProvider {
    private final AudioOutputProvider audioOutputProvider;

    public ForwardingAudioOutputProvider(AudioOutputProvider audioOutputProvider) {
        this.audioOutputProvider = audioOutputProvider;
    }

    @Override
    public void addListener(AudioOutputProvider.Listener listener) {
        this.audioOutputProvider.addListener(listener);
    }

    @Override
    public AudioOutput getAudioOutput(AudioOutputProvider.OutputConfig outputConfig) {
        return this.audioOutputProvider.getAudioOutput(outputConfig);
    }

    @Override
    public AudioOutputProvider.FormatSupport getFormatSupport(AudioOutputProvider.FormatConfig formatConfig) {
        return this.audioOutputProvider.getFormatSupport(formatConfig);
    }

    @Override
    public AudioOutputProvider.OutputConfig getOutputConfig(AudioOutputProvider.FormatConfig formatConfig) {
        return this.audioOutputProvider.getOutputConfig(formatConfig);
    }

    @Override
    public void release() {
        this.audioOutputProvider.release();
    }

    @Override
    public void removeListener(AudioOutputProvider.Listener listener) {
        this.audioOutputProvider.removeListener(listener);
    }

    @Override
    public void setClock(Clock clock) {
        this.audioOutputProvider.setClock(clock);
    }
}
