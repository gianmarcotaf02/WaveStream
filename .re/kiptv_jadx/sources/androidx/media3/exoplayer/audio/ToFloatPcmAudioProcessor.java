package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class ToFloatPcmAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    private static final int FLOAT_NAN_AS_INT = java.lang.Float.floatToIntBits(Float.NaN);
    private static final double PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR = 4.656612875245797E-10d;

    private static void writePcm32BitFloat(int i3, java.nio.ByteBuffer byteBuffer) {
        int iFloatToIntBits = java.lang.Float.floatToIntBits((float) (((double) i3) * PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR));
        if (iFloatToIntBits == FLOAT_NAN_AS_INT) {
            iFloatToIntBits = java.lang.Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public androidx.media3.common.audio.AudioProcessor.AudioFormat onConfigure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        int i3 = audioFormat.encoding;
        if (androidx.media3.common.util.Util.isEncodingHighResolutionPcm(i3) || i3 == 2) {
            return i3 != 4 ? new androidx.media3.common.audio.AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 4) : androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBufferReplaceOutputBuffer;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i3 = iLimit - iPosition;
        int i9 = this.inputAudioFormat.encoding;
        if (i9 == 2) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i3 * 2);
            while (iPosition < iLimit) {
                writePcm32BitFloat(((byteBuffer.get(iPosition) & 255) << 16) | ((byteBuffer.get(iPosition + 1) & 255) << 24), byteBufferReplaceOutputBuffer);
                iPosition += 2;
            }
        } else if (i9 == 1342177280) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer((i3 / 3) * 4);
            while (iPosition < iLimit) {
                writePcm32BitFloat(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferReplaceOutputBuffer);
                iPosition += 3;
            }
        } else if (i9 == 1610612736) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i3);
            while (iPosition < iLimit) {
                writePcm32BitFloat((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferReplaceOutputBuffer);
                iPosition += 4;
            }
        } else if (i9 == 1879048192) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i3 / 2);
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.putFloat((float) byteBuffer.getDouble(iPosition));
                iPosition += 8;
            }
        } else if (i9 == 21) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer((i3 / 3) * 4);
            while (iPosition < iLimit) {
                writePcm32BitFloat(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferReplaceOutputBuffer);
                iPosition += 3;
            }
        } else {
            if (i9 != 22) {
                throw new java.lang.IllegalStateException();
            }
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i3);
            while (iPosition < iLimit) {
                writePcm32BitFloat((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferReplaceOutputBuffer);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferReplaceOutputBuffer.flip();
    }
}
