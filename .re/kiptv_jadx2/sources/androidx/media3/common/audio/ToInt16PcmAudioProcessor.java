package androidx.media3.common.audio;

import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

public final class ToInt16PcmAudioProcessor extends BaseAudioProcessor {
    @Override
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i3 = audioFormat.encoding;
        if (i3 == 3 || i3 == 2 || i3 == 268435456 || i3 == 21 || i3 == 1342177280 || i3 == 22 || i3 == 1610612736 || i3 == 4 || i3 == 1879048192) {
            return i3 != 2 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 2) : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i3 = iLimit - iPosition;
        int i9 = this.inputAudioFormat.encoding;
        if (i9 == 3) {
            i3 *= 2;
        } else if (i9 == 4) {
            i3 /= 2;
        } else {
            if (i9 != 21) {
                if (i9 == 22) {
                    i3 /= 2;
                } else if (i9 != 268435456) {
                    if (i9 != 1342177280) {
                        if (i9 == 1610612736) {
                            i3 /= 2;
                        } else {
                            if (i9 != 1879048192) {
                                throw new IllegalStateException();
                            }
                            i3 /= 4;
                        }
                    }
                }
            }
            i3 /= 3;
            i3 *= 2;
        }
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(i3);
        int i10 = this.inputAudioFormat.encoding;
        if (i10 == 3) {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put((byte) 0);
                byteBufferReplaceOutputBuffer.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i10 == 4) {
            while (iPosition < iLimit) {
                short sConstrainValue = (short) (Util.constrainValue(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferReplaceOutputBuffer.put((byte) (sConstrainValue & 255));
                byteBufferReplaceOutputBuffer.put((byte) ((sConstrainValue >> 8) & 255));
                iPosition += 4;
            }
        } else if (i10 == 21) {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i10 == 22) {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 2));
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i10 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i10 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else if (i10 == 1610612736) {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        } else {
            if (i10 != 1879048192) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                short sConstrainValue2 = (short) (Util.constrainValue(byteBuffer.getDouble(iPosition), -1.0d, 1.0d) * 32767.0d);
                byteBufferReplaceOutputBuffer.put((byte) (sConstrainValue2 & 255));
                byteBufferReplaceOutputBuffer.put((byte) ((sConstrainValue2 >> 8) & 255));
                iPosition += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferReplaceOutputBuffer.flip();
    }
}
