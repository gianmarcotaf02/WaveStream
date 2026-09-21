package androidx.media3.extractor.mp3;

/* JADX INFO: loaded from: classes.dex */
final class XingFrame {
    public final long dataSize;
    public final int encoderDelay;
    public final int encoderPadding;
    public final long frameCount;
    public final androidx.media3.extractor.MpegAudioUtil.Header header;
    public final androidx.media3.extractor.mp3.Mp3InfoReplayGain replayGain;
    public final long[] tableOfContents;

    private XingFrame(androidx.media3.extractor.MpegAudioUtil.Header header, long j, long j9, long[] jArr, androidx.media3.extractor.mp3.Mp3InfoReplayGain mp3InfoReplayGain, int i3, int i9) {
        this.header = new androidx.media3.extractor.MpegAudioUtil.Header(header);
        this.frameCount = j;
        this.dataSize = j9;
        this.tableOfContents = jArr;
        this.replayGain = mp3InfoReplayGain;
        this.encoderDelay = i3;
        this.encoderPadding = i9;
    }

    public static androidx.media3.extractor.mp3.XingFrame parse(androidx.media3.extractor.MpegAudioUtil.Header header, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        long[] jArr;
        int i3;
        int i9;
        int i10 = parsableByteArray.readInt();
        int unsignedIntToInt = (i10 & 1) != 0 ? parsableByteArray.readUnsignedIntToInt() : -1;
        long unsignedInt = (i10 & 2) != 0 ? parsableByteArray.readUnsignedInt() : -1L;
        androidx.media3.extractor.mp3.Mp3InfoReplayGain mp3InfoReplayGain = null;
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
            mp3InfoReplayGain = androidx.media3.extractor.mp3.Mp3InfoReplayGain.parse(parsableByteArray.readFloat(), parsableByteArray.readUnsignedShort(), parsableByteArray.readUnsignedShort());
            parsableByteArray.skipBytes(2);
            int unsignedInt24 = parsableByteArray.readUnsignedInt24();
            i9 = unsignedInt24 & 4095;
            i3 = (16773120 & unsignedInt24) >> 12;
        } else {
            i3 = -1;
            i9 = -1;
        }
        return new androidx.media3.extractor.mp3.XingFrame(header, unsignedIntToInt, unsignedInt, jArr, mp3InfoReplayGain, i3, i9);
    }

    public long computeDurationUs() {
        long j = this.frameCount;
        if (j == -1 || j == 0) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        androidx.media3.extractor.MpegAudioUtil.Header header = this.header;
        return androidx.media3.common.util.Util.sampleCountToDurationUs((j * ((long) header.samplesPerFrame)) - 1, header.sampleRate);
    }

    public androidx.media3.common.Metadata getMetadata() {
        androidx.media3.extractor.mp3.Mp3InfoReplayGain mp3InfoReplayGain = this.replayGain;
        if (mp3InfoReplayGain != null) {
            return new androidx.media3.common.Metadata(mp3InfoReplayGain);
        }
        return null;
    }
}
