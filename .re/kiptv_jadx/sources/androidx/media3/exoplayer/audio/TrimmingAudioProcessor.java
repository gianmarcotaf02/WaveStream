package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class TrimmingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    private byte[] endBuffer = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
    private int endBufferSize;
    private int pendingTrimStartBytes;
    private boolean reconfigurationPending;
    private int trimEndFrames;
    private int trimStartFrames;
    private long trimmedFrameCount;

    @Override // androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j) {
        return java.lang.Math.max(0L, j - androidx.media3.common.util.Util.sampleCountToDurationUs(this.trimEndFrames + this.trimStartFrames, this.inputAudioFormat.sampleRate));
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public java.nio.ByteBuffer getOutput() {
        int i3;
        if (super.isEnded() && (i3 = this.endBufferSize) > 0) {
            replaceOutputBuffer(i3).put(this.endBuffer, 0, this.endBufferSize).flip();
            this.endBufferSize = 0;
        }
        return super.getOutput();
    }

    public long getTrimmedFrameCount() {
        return this.trimmedFrameCount;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return super.isEnded() && this.endBufferSize == 0;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public androidx.media3.common.audio.AudioProcessor.AudioFormat onConfigure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        if (!androidx.media3.common.util.Util.isEncodingLinearPcm(audioFormat.encoding)) {
            throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        this.reconfigurationPending = true;
        return (this.trimStartFrames == 0 && this.trimEndFrames == 0) ? androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET : audioFormat;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush(androidx.media3.common.audio.AudioProcessor.StreamMetadata streamMetadata) {
        if (this.reconfigurationPending) {
            this.reconfigurationPending = false;
            int i3 = this.trimEndFrames;
            int i9 = this.inputAudioFormat.bytesPerFrame;
            this.endBuffer = new byte[i3 * i9];
            this.pendingTrimStartBytes = this.trimStartFrames * i9;
        }
        this.endBufferSize = 0;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onQueueEndOfStream() {
        if (this.reconfigurationPending) {
            int i3 = this.endBufferSize;
            if (i3 > 0) {
                this.trimmedFrameCount += (long) (i3 / this.inputAudioFormat.bytesPerFrame);
            }
            this.endBufferSize = 0;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        this.endBuffer = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i3 = iLimit - iPosition;
        if (i3 == 0) {
            return;
        }
        int iMin = java.lang.Math.min(i3, this.pendingTrimStartBytes);
        this.trimmedFrameCount += (long) (iMin / this.inputAudioFormat.bytesPerFrame);
        this.pendingTrimStartBytes -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.pendingTrimStartBytes > 0) {
            return;
        }
        int i9 = i3 - iMin;
        int length = (this.endBufferSize + i9) - this.endBuffer.length;
        java.nio.ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(length);
        int iConstrainValue = androidx.media3.common.util.Util.constrainValue(length, 0, this.endBufferSize);
        byteBufferReplaceOutputBuffer.put(this.endBuffer, 0, iConstrainValue);
        int iConstrainValue2 = androidx.media3.common.util.Util.constrainValue(length - iConstrainValue, 0, i9);
        byteBuffer.limit(byteBuffer.position() + iConstrainValue2);
        byteBufferReplaceOutputBuffer.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i10 = i9 - iConstrainValue2;
        int i11 = this.endBufferSize - iConstrainValue;
        this.endBufferSize = i11;
        byte[] bArr = this.endBuffer;
        java.lang.System.arraycopy(bArr, iConstrainValue, bArr, 0, i11);
        byteBuffer.get(this.endBuffer, this.endBufferSize, i10);
        this.endBufferSize += i10;
        byteBufferReplaceOutputBuffer.flip();
    }

    public void resetTrimmedFrameCount() {
        this.trimmedFrameCount = 0L;
    }

    public void setTrimFrameCount(int i3, int i9) {
        this.trimStartFrames = i3;
        this.trimEndFrames = i9;
    }
}
