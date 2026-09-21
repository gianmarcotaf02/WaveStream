package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
public final class SonicAudioProcessor implements androidx.media3.common.audio.AudioProcessor {
    private static final float CLOSE_THRESHOLD = 1.0E-4f;
    private static final int MIN_BYTES_FOR_DURATION_SCALING_CALCULATION = 1024;
    public static final int SAMPLE_RATE_NO_CHANGE = -1;
    private java.nio.ByteBuffer buffer;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat inputAudioFormat;
    private long inputBytes;
    private boolean inputEnded;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat outputAudioFormat;
    private java.nio.ByteBuffer outputBuffer;
    private long outputBytes;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat pendingInputAudioFormat;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat pendingOutputAudioFormat;
    private int pendingOutputSampleRate;
    private boolean pendingSonicRecreation;
    private float pitch;
    private final boolean shouldBeActiveWithDefaultParameters;
    private androidx.media3.common.audio.Sonic sonic;
    private float speed;

    public SonicAudioProcessor() {
        this(false);
    }

    private boolean areParametersSetToDefaultValues() {
        return java.lang.Math.abs(this.speed - 1.0f) < CLOSE_THRESHOLD && java.lang.Math.abs(this.pitch - 1.0f) < CLOSE_THRESHOLD && this.pendingOutputAudioFormat.sampleRate == this.pendingInputAudioFormat.sampleRate;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public androidx.media3.common.audio.AudioProcessor.AudioFormat configure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        int i3 = audioFormat.encoding;
        if (i3 != 2 && i3 != 4) {
            throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i9 = this.pendingOutputSampleRate;
        if (i9 == -1) {
            i9 = audioFormat.sampleRate;
        }
        this.pendingInputAudioFormat = audioFormat;
        androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat2 = new androidx.media3.common.audio.AudioProcessor.AudioFormat(i9, audioFormat.channelCount, audioFormat.encoding);
        this.pendingOutputAudioFormat = audioFormat2;
        this.pendingSonicRecreation = true;
        return audioFormat2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void flush(androidx.media3.common.audio.AudioProcessor.StreamMetadata streamMetadata) {
        if (isActive()) {
            androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat = this.pendingInputAudioFormat;
            this.inputAudioFormat = audioFormat;
            androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat2 = this.pendingOutputAudioFormat;
            this.outputAudioFormat = audioFormat2;
            if (this.pendingSonicRecreation) {
                this.sonic = new androidx.media3.common.audio.Sonic(audioFormat.sampleRate, audioFormat.channelCount, this.speed, this.pitch, audioFormat2.sampleRate, audioFormat.encoding == 4);
            } else {
                androidx.media3.common.audio.Sonic sonic = this.sonic;
                if (sonic != null) {
                    sonic.flush();
                }
            }
        }
        this.outputBuffer = androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j) {
        return getPlayoutDuration(j);
    }

    public long getMediaDuration(long j) {
        if (this.outputBytes < androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return (long) (((double) this.speed) * j);
        }
        long j9 = this.inputBytes;
        androidx.media3.common.audio.Sonic sonic = this.sonic;
        sonic.getClass();
        long pendingInputBytes = j9 - ((long) sonic.getPendingInputBytes());
        int i3 = this.outputAudioFormat.sampleRate;
        int i9 = this.inputAudioFormat.sampleRate;
        return i3 == i9 ? androidx.media3.common.util.Util.scaleLargeTimestamp(j, pendingInputBytes, this.outputBytes) : androidx.media3.common.util.Util.scaleLargeTimestamp(j, pendingInputBytes * ((long) i3), this.outputBytes * ((long) i9));
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public java.nio.ByteBuffer getOutput() {
        int outputSize;
        androidx.media3.common.audio.Sonic sonic = this.sonic;
        if (sonic != null && (outputSize = sonic.getOutputSize()) > 0) {
            if (this.buffer.capacity() < outputSize) {
                this.buffer = java.nio.ByteBuffer.allocateDirect(outputSize).order(java.nio.ByteOrder.nativeOrder());
            } else {
                this.buffer.clear();
            }
            sonic.getOutput(this.buffer);
            this.buffer.flip();
            this.outputBytes += (long) outputSize;
            this.outputBuffer = this.buffer;
        }
        java.nio.ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        return byteBuffer;
    }

    public long getPlayoutDuration(long j) {
        if (this.outputBytes < androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return (long) (j / ((double) this.speed));
        }
        long j9 = this.inputBytes;
        androidx.media3.common.audio.Sonic sonic = this.sonic;
        sonic.getClass();
        long pendingInputBytes = j9 - ((long) sonic.getPendingInputBytes());
        int i3 = this.outputAudioFormat.sampleRate;
        int i9 = this.inputAudioFormat.sampleRate;
        return i3 == i9 ? androidx.media3.common.util.Util.scaleLargeTimestamp(j, this.outputBytes, pendingInputBytes) : androidx.media3.common.util.Util.scaleLargeTimestamp(j, this.outputBytes * ((long) i9), pendingInputBytes * ((long) i3));
    }

    public long getProcessedInputBytes() {
        long j = this.inputBytes;
        androidx.media3.common.audio.Sonic sonic = this.sonic;
        sonic.getClass();
        return j - ((long) sonic.getPendingInputBytes());
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        if (this.pendingOutputAudioFormat.sampleRate != -1) {
            return this.shouldBeActiveWithDefaultParameters || !areParametersSetToDefaultValues();
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        if (!this.inputEnded) {
            return false;
        }
        androidx.media3.common.audio.Sonic sonic = this.sonic;
        return sonic == null || sonic.getOutputSize() == 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueEndOfStream() {
        androidx.media3.common.audio.Sonic sonic = this.sonic;
        if (sonic != null) {
            sonic.queueEndOfStream();
        }
        this.inputEnded = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            androidx.media3.common.audio.Sonic sonic = this.sonic;
            sonic.getClass();
            this.inputBytes += (long) byteBuffer.remaining();
            sonic.queueInput(byteBuffer);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void reset() {
        this.speed = 1.0f;
        this.pitch = 1.0f;
        androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
        java.nio.ByteBuffer byteBuffer = androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.outputBuffer = byteBuffer;
        this.pendingOutputSampleRate = -1;
        this.pendingSonicRecreation = false;
        this.sonic = null;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }

    public void setOutputSampleRateHz(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 == -1 || i3 > 0);
        this.pendingOutputSampleRate = i3;
    }

    public void setPitch(float f9) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(f9 > 0.0f);
        if (this.pitch != f9) {
            this.pitch = f9;
            this.pendingSonicRecreation = true;
        }
    }

    public void setSpeed(float f9) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(f9 > 0.0f);
        if (this.speed != f9) {
            this.speed = f9;
            this.pendingSonicRecreation = true;
        }
    }

    public SonicAudioProcessor(boolean z6) {
        this.speed = 1.0f;
        this.pitch = 1.0f;
        androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
        java.nio.ByteBuffer byteBuffer = androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.outputBuffer = byteBuffer;
        this.pendingOutputSampleRate = -1;
        this.shouldBeActiveWithDefaultParameters = z6;
    }
}
