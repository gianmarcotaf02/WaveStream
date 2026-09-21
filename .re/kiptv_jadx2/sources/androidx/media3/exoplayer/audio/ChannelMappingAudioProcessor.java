package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class ChannelMappingAudioProcessor extends BaseAudioProcessor {
    private int[] outputChannels;
    private int[] pendingOutputChannels;

    @Override
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.pendingOutputChannels;
        if (iArr == null) {
            return AudioProcessor.AudioFormat.NOT_SET;
        }
        if (!Util.isEncodingLinearPcm(audioFormat.encoding)) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        boolean z6 = audioFormat.channelCount != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i9 = iArr[i3];
            if (i9 >= audioFormat.channelCount) {
                throw new AudioProcessor.UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", audioFormat);
            }
            z6 |= i9 != i3;
            i3++;
        }
        return z6 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, iArr.length, audioFormat.encoding) : AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override
    public void onFlush(AudioProcessor.StreamMetadata streamMetadata) {
        this.outputChannels = this.pendingOutputChannels;
    }

    @Override
    public void onReset() {
        this.outputChannels = null;
        this.pendingOutputChannels = null;
    }

    @Override
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = this.outputChannels;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(((iLimit - iPosition) / this.inputAudioFormat.bytesPerFrame) * this.outputAudioFormat.bytesPerFrame);
        while (iPosition < iLimit) {
            for (int i3 : iArr) {
                int byteDepth = (Util.getByteDepth(this.inputAudioFormat.encoding) * i3) + iPosition;
                int i9 = this.inputAudioFormat.encoding;
                if (i9 == 2) {
                    byteBufferReplaceOutputBuffer.putShort(byteBuffer.getShort(byteDepth));
                } else if (i9 == 3) {
                    byteBufferReplaceOutputBuffer.put(byteBuffer.get(byteDepth));
                } else if (i9 == 4) {
                    byteBufferReplaceOutputBuffer.putFloat(byteBuffer.getFloat(byteDepth));
                } else if (i9 == 21) {
                    Util.putInt24(byteBufferReplaceOutputBuffer, Util.getInt24(byteBuffer, byteDepth));
                } else if (i9 == 22) {
                    byteBufferReplaceOutputBuffer.putInt(byteBuffer.getInt(byteDepth));
                } else if (i9 == 268435456) {
                    byteBufferReplaceOutputBuffer.putShort(byteBuffer.getShort(byteDepth));
                } else if (i9 == 1342177280) {
                    Util.putInt24(byteBufferReplaceOutputBuffer, Util.getInt24(byteBuffer, byteDepth));
                } else if (i9 == 1610612736) {
                    byteBufferReplaceOutputBuffer.putInt(byteBuffer.getInt(byteDepth));
                } else {
                    if (i9 != 1879048192) {
                        throw new IllegalStateException("Unexpected encoding: " + this.inputAudioFormat.encoding);
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
