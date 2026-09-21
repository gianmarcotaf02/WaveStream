package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class ChannelMappingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    private int[] outputChannels;
    private int[] pendingOutputChannels;

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public androidx.media3.common.audio.AudioProcessor.AudioFormat onConfigure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.pendingOutputChannels;
        if (iArr == null) {
            return androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        }
        if (!androidx.media3.common.util.Util.isEncodingLinearPcm(audioFormat.encoding)) {
            throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        boolean z6 = audioFormat.channelCount != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i9 = iArr[i3];
            if (i9 >= audioFormat.channelCount) {
                throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException("Channel map (" + java.util.Arrays.toString(iArr) + ") trying to access non-existent input channel.", audioFormat);
            }
            z6 |= i9 != i3;
            i3++;
        }
        return z6 ? new androidx.media3.common.audio.AudioProcessor.AudioFormat(audioFormat.sampleRate, iArr.length, audioFormat.encoding) : androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush(androidx.media3.common.audio.AudioProcessor.StreamMetadata streamMetadata) {
        this.outputChannels = this.pendingOutputChannels;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        this.outputChannels = null;
        this.pendingOutputChannels = null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer byteBuffer) {
        int[] iArr = this.outputChannels;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        java.nio.ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(((iLimit - iPosition) / this.inputAudioFormat.bytesPerFrame) * this.outputAudioFormat.bytesPerFrame);
        while (iPosition < iLimit) {
            for (int i3 : iArr) {
                int byteDepth = (androidx.media3.common.util.Util.getByteDepth(this.inputAudioFormat.encoding) * i3) + iPosition;
                int i9 = this.inputAudioFormat.encoding;
                if (i9 == 2) {
                    byteBufferReplaceOutputBuffer.putShort(byteBuffer.getShort(byteDepth));
                } else if (i9 == 3) {
                    byteBufferReplaceOutputBuffer.put(byteBuffer.get(byteDepth));
                } else if (i9 == 4) {
                    byteBufferReplaceOutputBuffer.putFloat(byteBuffer.getFloat(byteDepth));
                } else if (i9 == 21) {
                    androidx.media3.common.util.Util.putInt24(byteBufferReplaceOutputBuffer, androidx.media3.common.util.Util.getInt24(byteBuffer, byteDepth));
                } else if (i9 == 22) {
                    byteBufferReplaceOutputBuffer.putInt(byteBuffer.getInt(byteDepth));
                } else if (i9 == 268435456) {
                    byteBufferReplaceOutputBuffer.putShort(byteBuffer.getShort(byteDepth));
                } else if (i9 == 1342177280) {
                    androidx.media3.common.util.Util.putInt24(byteBufferReplaceOutputBuffer, androidx.media3.common.util.Util.getInt24(byteBuffer, byteDepth));
                } else if (i9 == 1610612736) {
                    byteBufferReplaceOutputBuffer.putInt(byteBuffer.getInt(byteDepth));
                } else {
                    if (i9 != 1879048192) {
                        throw new java.lang.IllegalStateException("Unexpected encoding: " + this.inputAudioFormat.encoding);
                    }
                    byteBufferReplaceOutputBuffer.putDouble(byteBuffer.getDouble(byteDepth));
                }
            }
            iPosition += this.inputAudioFormat.bytesPerFrame;
        }
        byteBuffer.position(iLimit);
        byteBufferReplaceOutputBuffer.flip();
    }

    public void setChannelMap(int[] iArr) {
        this.pendingOutputChannels = iArr;
    }
}
