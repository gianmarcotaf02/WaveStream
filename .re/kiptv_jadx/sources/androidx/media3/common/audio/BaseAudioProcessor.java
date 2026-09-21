package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAudioProcessor implements androidx.media3.common.audio.AudioProcessor {
    private java.nio.ByteBuffer buffer;
    protected androidx.media3.common.audio.AudioProcessor.AudioFormat inputAudioFormat;
    private boolean inputEnded;
    protected androidx.media3.common.audio.AudioProcessor.AudioFormat outputAudioFormat;
    private java.nio.ByteBuffer outputBuffer;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat pendingInputAudioFormat;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat pendingOutputAudioFormat;

    public BaseAudioProcessor() {
        java.nio.ByteBuffer byteBuffer = androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.outputBuffer = byteBuffer;
        androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final androidx.media3.common.audio.AudioProcessor.AudioFormat configure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = onConfigure(audioFormat);
        return isActive() ? this.pendingOutputAudioFormat : androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    @java.lang.Deprecated
    public final void flush() {
        flush(androidx.media3.common.audio.AudioProcessor.StreamMetadata.DEFAULT);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public java.nio.ByteBuffer getOutput() {
        java.nio.ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        return byteBuffer;
    }

    public final boolean hasPendingOutput() {
        return this.outputBuffer.hasRemaining();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.pendingOutputAudioFormat != androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return this.inputEnded && this.outputBuffer == androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
    }

    public androidx.media3.common.audio.AudioProcessor.AudioFormat onConfigure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
        return androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    }

    @java.lang.Deprecated
    public void onFlush() {
    }

    public void onQueueEndOfStream() {
    }

    public void onReset() {
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.inputEnded = true;
        onQueueEndOfStream();
    }

    public final java.nio.ByteBuffer replaceOutputBuffer(int i3) {
        if (this.buffer.capacity() < i3) {
            this.buffer = java.nio.ByteBuffer.allocateDirect(i3).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.buffer.clear();
        }
        java.nio.ByteBuffer byteBuffer = this.buffer;
        this.outputBuffer = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        java.nio.ByteBuffer byteBuffer = androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        this.outputBuffer = byteBuffer;
        this.inputEnded = false;
        this.buffer = byteBuffer;
        androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
        onReset();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush(androidx.media3.common.audio.AudioProcessor.StreamMetadata streamMetadata) {
        this.outputBuffer = androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        this.inputEnded = false;
        this.inputAudioFormat = this.pendingInputAudioFormat;
        this.outputAudioFormat = this.pendingOutputAudioFormat;
        onFlush(streamMetadata);
    }

    public void onFlush(androidx.media3.common.audio.AudioProcessor.StreamMetadata streamMetadata) {
        onFlush();
    }
}
