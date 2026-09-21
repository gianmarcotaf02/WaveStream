package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
class SynchronizedSonicAudioProcessor implements androidx.media3.common.audio.AudioProcessor {
    private final java.lang.Object lock;
    private final androidx.media3.common.audio.SonicAudioProcessor sonicAudioProcessor;

    public SynchronizedSonicAudioProcessor(java.lang.Object obj, boolean z6) {
        this.lock = obj;
        this.sonicAudioProcessor = new androidx.media3.common.audio.SonicAudioProcessor(z6);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final androidx.media3.common.audio.AudioProcessor.AudioFormat configure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
        androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormatConfigure;
        synchronized (this.lock) {
            audioFormatConfigure = this.sonicAudioProcessor.configure(audioFormat);
        }
        return audioFormatConfigure;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush(androidx.media3.common.audio.AudioProcessor.StreamMetadata streamMetadata) {
        synchronized (this.lock) {
            this.sonicAudioProcessor.flush(streamMetadata);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
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

    @Override // androidx.media3.common.audio.AudioProcessor
    public final java.nio.ByteBuffer getOutput() {
        java.nio.ByteBuffer output;
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

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        boolean zIsActive;
        synchronized (this.lock) {
            zIsActive = this.sonicAudioProcessor.isActive();
        }
        return zIsActive;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        boolean zIsEnded;
        synchronized (this.lock) {
            zIsEnded = this.sonicAudioProcessor.isEnded();
        }
        return zIsEnded;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        synchronized (this.lock) {
            this.sonicAudioProcessor.queueEndOfStream();
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(java.nio.ByteBuffer byteBuffer) {
        synchronized (this.lock) {
            this.sonicAudioProcessor.queueInput(byteBuffer);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
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
