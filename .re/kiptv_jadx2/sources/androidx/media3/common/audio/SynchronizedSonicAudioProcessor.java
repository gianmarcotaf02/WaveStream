package androidx.media3.common.audio;

import java.nio.ByteBuffer;

class SynchronizedSonicAudioProcessor implements AudioProcessor {
    private final Object lock;
    private final SonicAudioProcessor sonicAudioProcessor;

    public SynchronizedSonicAudioProcessor(Object obj, boolean z6) {
        this.lock = obj;
        this.sonicAudioProcessor = new SonicAudioProcessor(z6);
    }

    @Override
    public final AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) {
        AudioProcessor.AudioFormat audioFormatConfigure;
        synchronized (this.lock) {
            audioFormatConfigure = this.sonicAudioProcessor.configure(audioFormat);
        }
        return audioFormatConfigure;
    }

    @Override
    public final void flush(AudioProcessor.StreamMetadata streamMetadata) {
        synchronized (this.lock) {
            this.sonicAudioProcessor.flush(streamMetadata);
        }
    }

    @Override
    public long getDurationAfterProcessorApplied(long j) {
        return getPlayoutDuration(j);
    }

    public final long getMediaDuration(long j) {
        long mediaDuration;
        synchronized (this.lock) {
            mediaDuration = this.sonicAudioProcessor.getMediaDuration(j);
        }
        return mediaDuration;
    }

    @Override
    public final ByteBuffer getOutput() {
        ByteBuffer output;
        synchronized (this.lock) {
            output = this.sonicAudioProcessor.getOutput();
        }
        return output;
    }

    public final long getPlayoutDuration(long j) {
        long playoutDuration;
        synchronized (this.lock) {
            playoutDuration = this.sonicAudioProcessor.getPlayoutDuration(j);
        }
        return playoutDuration;
    }

    public final long getProcessedInputBytes() {
        long processedInputBytes;
        synchronized (this.lock) {
            processedInputBytes = this.sonicAudioProcessor.getProcessedInputBytes();
        }
        return processedInputBytes;
    }

    @Override
    public final boolean isActive() {
        boolean zIsActive;
        synchronized (this.lock) {
            zIsActive = this.sonicAudioProcessor.isActive();
        }
        return zIsActive;
    }

    @Override
    public final boolean isEnded() {
        boolean zIsEnded;
        synchronized (this.lock) {
            zIsEnded = this.sonicAudioProcessor.isEnded();
        }
        return zIsEnded;
    }

    @Override
    public final void queueEndOfStream() {
        synchronized (this.lock) {
            this.sonicAudioProcessor.queueEndOfStream();
        }
    }

    @Override
    public final void queueInput(ByteBuffer byteBuffer) {
        synchronized (this.lock) {
            this.sonicAudioProcessor.queueInput(byteBuffer);
        }
    }

    @Override
    public final void reset() {
        synchronized (this.lock) {
            this.sonicAudioProcessor.reset();
        }
    }

    public final void setOutputSampleRateHz(int i3) {
        synchronized (this.lock) {
            this.sonicAudioProcessor.setOutputSampleRateHz(i3);
        }
    }

    public final void setPitch(float f9) {
        synchronized (this.lock) {
            this.sonicAudioProcessor.setPitch(f9);
        }
    }

    public final void setSpeed(float f9) {
        synchronized (this.lock) {
            this.sonicAudioProcessor.setSpeed(f9);
        }
    }
}
