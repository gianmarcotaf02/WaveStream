package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

public final class TrimmingAudioProcessor extends BaseAudioProcessor {
    private byte[] endBuffer = Util.EMPTY_BYTE_ARRAY;
    private int endBufferSize;
    private int pendingTrimStartBytes;
    private boolean reconfigurationPending;
    private int trimEndFrames;
    private int trimStartFrames;
    private long trimmedFrameCount;

    @Override
    public long getDurationAfterProcessorApplied(long j) {
        return Math.max(0L, j - Util.sampleCountToDurationUs(this.trimEndFrames + this.trimStartFrames, this.inputAudioFormat.sampleRate));
    }

    @Override
    public ByteBuffer getOutput() {
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

    @Override
    public boolean isEnded() {
        return super.isEnded() && this.endBufferSize == 0;
    }

    @Override
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (!Util.isEncodingLinearPcm(audioFormat.encoding)) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        this.reconfigurationPending = true;
        return (this.trimStartFrames == 0 && this.trimEndFrames == 0) ? AudioProcessor.AudioFormat.NOT_SET : audioFormat;
    }

    @Override
    public void onFlush(AudioProcessor.StreamMetadata streamMetadata) {
        if (this.reconfigurationPending) {
            this.reconfigurationPending = false;
            int i3 = this.trimEndFrames;
            int i9 = this.inputAudioFormat.bytesPerFrame;
            this.endBuffer = new byte[i3 * i9];
            this.pendingTrimStartBytes = this.trimStartFrames * i9;
        }
        this.endBufferSize = 0;
    }

    @Override
    public void onQueueEndOfStream() {
        if (this.reconfigurationPending) {
            int i3 = this.endBufferSize;
            if (i3 > 0) {
                this.trimmedFrameCount += (long) (i3 / this.inputAudioFormat.bytesPerFrame);
            }
            this.endBufferSize = 0;
        }
    }

    @Override
    public void onReset() {
        this.endBuffer = Util.EMPTY_BYTE_ARRAY;
    }

    @Override
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i3 = iLimit - iPosition;
        if (i3 == 0) {
            return;
        }
        int iMin = Math.min(i3, this.pendingTrimStartBytes);
        this.trimmedFrameCount += (long) (iMin / this.inputAudioFormat.bytesPerFrame);
        this.pendingTrimStartBytes -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.pendingTrimStartBytes > 0) {
            return;
        }
        int i9 = i3 - iMin;
        int length = (this.endBufferSize + i9) - this.endBuffer.length;
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(length);
        int iConstrainValue = Util.constrainValue(length, 0, this.endBufferSize);
        byteBufferReplaceOutputBuffer.put(this.endBuffer, 0, iConstrainValue);
        int iConstrainValue2 = Util.constrainValue(length - iConstrainValue, 0, i9);
        byteBuffer.limit(byteBuffer.position() + iConstrainValue2);
        byteBufferReplaceOutputBuffer.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i10 = i9 - iConstrainValue2;
        int i11 = this.endBufferSize - iConstrainValue;
        this.endBufferSize = i11;
        byte[] bArr = this.endBuffer;
        System.arraycopy(bArr, iConstrainValue, bArr, 0, i11);
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
