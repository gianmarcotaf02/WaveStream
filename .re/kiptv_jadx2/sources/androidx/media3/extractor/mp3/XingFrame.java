package androidx.media3.extractor.mp3;

import androidx.media3.common.C;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;

final class XingFrame {
    public final long dataSize;
    public final int encoderDelay;
    public final int encoderPadding;
    public final long frameCount;
    public final MpegAudioUtil.Header header;
    public final Mp3InfoReplayGain replayGain;
    public final long[] tableOfContents;

    private XingFrame(MpegAudioUtil.Header header, long j, long j9, long[] jArr, Mp3InfoReplayGain mp3InfoReplayGain, int i3, int i9) {
        this.header = new MpegAudioUtil.Header(header);
        this.frameCount = j;
        this.dataSize = j9;
        this.tableOfContents = jArr;
        this.replayGain = mp3InfoReplayGain;
        this.encoderDelay = i3;
        this.encoderPadding = i9;
    }

    public static XingFrame parse(MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        long[] jArr;
        int i3;
        int i9;
        int i10 = parsableByteArray.readInt();
        int unsignedIntToInt = (i10 & 1) != 0 ? parsableByteArray.readUnsignedIntToInt() : -1;
        long unsignedInt = (i10 & 2) != 0 ? parsableByteArray.readUnsignedInt() : -1L;
        Mp3InfoReplayGain mp3InfoReplayGain = null;
        if ((i10 & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i11 = 0; i11 < 100; i11++) {
                jArr2[i11] = parsableByteArray.readUnsignedByte();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((i10 & 8) != 0) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.bytesLeft() >= 24) {
            parsableByteArray.skipBytes(11);
            mp3InfoReplayGain = Mp3InfoReplayGain.parse(parsableByteArray.readFloat(), parsableByteArray.readUnsignedShort(), parsableByteArray.readUnsignedShort());
            parsableByteArray.skipBytes(2);
            int unsignedInt24 = parsableByteArray.readUnsignedInt24();
            i9 = unsignedInt24 & 4095;
            i3 = (16773120 & unsignedInt24) >> 12;
        } else {
            i3 = -1;
            i9 = -1;
        }
        return new XingFrame(header, unsignedIntToInt, unsignedInt, jArr, mp3InfoReplayGain, i3, i9);
    }

    public long computeDurationUs() {
        long j = this.frameCount;
        if (j == -1 || j == 0) {
            return C.TIME_UNSET;
        }
        MpegAudioUtil.Header header = this.header;
        return Util.sampleCountToDurationUs((j * ((long) header.samplesPerFrame)) - 1, header.sampleRate);
    }

    public Metadata getMetadata() {
        Mp3InfoReplayGain mp3InfoReplayGain = this.replayGain;
        if (mp3InfoReplayGain != null) {
            return new Metadata(mp3InfoReplayGain);
        }
        return null;
    }
}
