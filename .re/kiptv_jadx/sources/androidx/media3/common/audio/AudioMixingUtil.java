package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
public final class AudioMixingUtil {
    private static final float FLOAT_PCM_MAX_VALUE = 1.0f;
    private static final float FLOAT_PCM_MIN_VALUE = -1.0f;

    private AudioMixingUtil() {
    }

    public static boolean canMix(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
        if (audioFormat.sampleRate == -1 || audioFormat.channelCount == -1) {
            return false;
        }
        int i3 = audioFormat.encoding;
        return i3 == 2 || i3 == 4;
    }

    private static float floatSampleToInt16Pcm(float f9) {
        return androidx.media3.common.util.Util.constrainValue(f9 * (f9 < 0.0f ? 32768 : 32767), -32768.0f, 32767.0f);
    }

    private static float getPcmSample(java.nio.ByteBuffer byteBuffer, boolean z6, boolean z9) {
        if (z9) {
            return z6 ? byteBuffer.getShort() : floatSampleToInt16Pcm(byteBuffer.getFloat());
        }
        return z6 ? int16SampleToFloatPcm(byteBuffer.getShort()) : byteBuffer.getFloat();
    }

    private static float int16SampleToFloatPcm(short s9) {
        return s9 / (s9 < 0 ? 32768 : 32767);
    }

    public static java.nio.ByteBuffer mix(java.nio.ByteBuffer byteBuffer, androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat, java.nio.ByteBuffer byteBuffer2, androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat2, androidx.media3.common.audio.ChannelMixingMatrix channelMixingMatrix, int i3, boolean z6, boolean z9) {
        boolean z10 = audioFormat.encoding == 2;
        boolean z11 = audioFormat2.encoding == 2;
        int inputChannelCount = channelMixingMatrix.getInputChannelCount();
        int outputChannelCount = channelMixingMatrix.getOutputChannelCount();
        float[] fArr = new float[inputChannelCount];
        float[] fArr2 = new float[outputChannelCount];
        for (int i9 = 0; i9 < i3; i9++) {
            if (z6) {
                int iPosition = byteBuffer2.position();
                for (int i10 = 0; i10 < outputChannelCount; i10++) {
                    fArr2[i10] = getPcmSample(byteBuffer2, z11, z11);
                }
                byteBuffer2.position(iPosition);
            }
            for (int i11 = 0; i11 < inputChannelCount; i11++) {
                fArr[i11] = getPcmSample(byteBuffer, z10, z11);
            }
            for (int i12 = 0; i12 < outputChannelCount; i12++) {
                for (int i13 = 0; i13 < inputChannelCount; i13++) {
                    fArr2[i12] = (channelMixingMatrix.getMixingCoefficient(i13, i12) * fArr[i13]) + fArr2[i12];
                }
                if (z11) {
                    byteBuffer2.putShort((short) androidx.media3.common.util.Util.constrainValue(fArr2[i12], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(z9 ? androidx.media3.common.util.Util.constrainValue(fArr2[i12], FLOAT_PCM_MIN_VALUE, 1.0f) : fArr2[i12]);
                }
                fArr2[i12] = 0.0f;
            }
        }
        return byteBuffer2;
    }

    public static boolean canMix(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat, androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat2) {
        return audioFormat.sampleRate == audioFormat2.sampleRate && canMix(audioFormat) && canMix(audioFormat2);
    }
}
